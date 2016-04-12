package com.telefonica.plataformaconcursos.formularioaltaconcurso;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.telefonica.plataformaconcursos.listadoconcursosusuarios.AcortadorUrl;
import com.telefonica.plataformaconcursos.listadoconcursosusuarios.ListadoConcursosUsuario;
import com.telefonica.plataformaconcursos.model.Concurso;
import com.telefonica.plataformaconcursos.model.impl.ConcursoImpl;
import com.telefonica.plataformaconcursos.service.ConcursoLocalServiceUtil;

public class FormularioAltaConcurso extends MVCPortlet {

	private static Log _log = LogFactoryUtil.getLog(ListadoConcursosUsuario.class);

	public void registroConcurso(ActionRequest actionRequest, ActionResponse actionResponse) {

		System.out.println("Aqui se ejecuta la accion");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

		String nombre = actionRequest.getParameter("nombre");
		String descripcion = actionRequest.getParameter("descripcion");
		String premio = actionRequest.getParameter("premio");
		long empresaId = Long.parseLong(actionRequest.getRemoteUser());

		String realPath = getPortletContext().getRealPath("/");
		String sourceFileName = null;

		try {
			// Obtengo del portal el fichero a partir del parametro (fileupload)
			UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(actionRequest);
			File file = uploadRequest.getFile("fileupload");
			// Obtengo el nombre real del fichero
			sourceFileName = uploadRequest.getFileName("fileupload");
			// Muevo el fichero a mi estructura
			File destino = new File(realPath+"html/uploads/");
			destino = new File(destino,sourceFileName);
			file.renameTo(destino);

		} catch (Exception e) {
			System.out.println("Exception::::" + e.getMessage());
		}

		String ruta = generarUrlDeRecurso(actionRequest, sourceFileName);
		_log.debug(ruta);
		actionRequest.setAttribute("urlFile", ruta);

		try {
			Date fechaInicioInscripcion = sdf.parse(actionRequest.getParameter("fechaInicioInscripcion"));
			Date fechaFinInscripcion = sdf.parse(actionRequest.getParameter("fechaFinInscripcion"));
			Date fechaInicioEntrega = sdf.parse(actionRequest.getParameter("fechaInicioEntrega"));
			Date fechaFinEntrega = sdf.parse(actionRequest.getParameter("fechaFinEntrega"));

			// Adaptar los datos recogidos del formulario, porque son String, a
			// lo que nos pida el Negocio

			Concurso concurso = new ConcursoImpl();
			concurso.setNombre(nombre);
			concurso.setDescripcion(descripcion);
			concurso.setPremio(premio);
			concurso.setFechaInicioInscripcion(fechaInicioInscripcion);
			concurso.setFechaFinInscripcion(fechaFinInscripcion);
			concurso.setFechaInicioEntrega(fechaInicioEntrega);
			concurso.setFechaFinEntrega(fechaFinEntrega);
			concurso.setEmpresaId(empresaId);
			//String urlCorta = AcortadorUrl.urlShortener(ruta);
			concurso.setDocumento(sourceFileName);
			
			//_log.info("URL insertada: "+ urlCorta);

			// Invocar el negocio
			ConcursoLocalServiceUtil.addConcurso(concurso);

			// Recoger el feedback
			Long idConcurso = concurso.getConcursoId();

			Concurso concurso1 = ConcursoLocalServiceUtil.getConcurso(idConcurso);

			System.out.println(concurso1);

		} catch (Exception e) {

			e.printStackTrace();

			// Hacer accesible a la vista el nombre del usuario para pintar un
			// mensaje
			// actionRequest.setAttribute("mensaje", "Revisa los datos
			// enviados");

			// 6-Elegir la vista, en este caso quiero que se pinte la vista menu
			// actionResponse.setRenderParameter("vista a la que quiero ir",
			// "");
		}

	}

	private String generarUrlDeRecurso(ActionRequest request, String sourceFileName) {
		// Generamos la url para enviarla como mensaje al chat

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		LiferayPortletURL liferayPortletURL = PortletURLFactoryUtil.create(request, themeDisplay.getPpid(),
				themeDisplay.getPlid(), PortletRequest.RESOURCE_PHASE);

		liferayPortletURL.setParameter("filename", sourceFileName);

		_log.debug(liferayPortletURL.toString());
		return liferayPortletURL.toString();
	}

	public void serveResource(ResourceRequest request, ResourceResponse response) throws IOException, PortletException {
		try {

			_log.debug(request.getParameter("filename"));

			String realPath = getPortletContext().getRealPath("/");
			File file = new File(realPath + "/html/uploads/" + request.getParameter("filename"));
			InputStream in = new FileInputStream(file);
			HttpServletResponse httpRes = PortalUtil.getHttpServletResponse(response);

			HttpServletRequest httpReq = PortalUtil.getHttpServletRequest(request);

			// PortletResponseUtil.sendFile(httpReq, httpRes, file.getName(),
			// in, "application/force-download");
			ServletResponseUtil.sendFile(httpReq, httpRes, file.getName(), in, "application/force-download");
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
