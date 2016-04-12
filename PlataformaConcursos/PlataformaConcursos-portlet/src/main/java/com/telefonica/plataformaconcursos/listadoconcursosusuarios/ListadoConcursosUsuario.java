package com.telefonica.plataformaconcursos.listadoconcursosusuarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
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
import com.telefonica.plataformaconcursos.model.Asignados;
import com.telefonica.plataformaconcursos.model.Concurso;
import com.telefonica.plataformaconcursos.model.impl.AsignadosImpl;
import com.telefonica.plataformaconcursos.service.AsignadosLocalServiceUtil;
import com.telefonica.plataformaconcursos.service.ConcursoLocalServiceUtil;

/**
 * Portlet implementation class ListadoConcursosUsuario
 */
public class ListadoConcursosUsuario extends MVCPortlet {
	private static Log _log = LogFactoryUtil.getLog(ListadoConcursosUsuario.class);

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		if (renderRequest.getAttribute("concurso") == null) {
			try {

				List<Concurso> concursos = ConcursoLocalServiceUtil.getConcursos(0,
						ConcursoLocalServiceUtil.getConcursosCount());

				renderRequest.setAttribute("listaConcursosUsuarios", concursos);

			} catch (Exception e) {
				// TODO: Guardar excepcion en el log error!
				e.printStackTrace();
				_log.error("Error al obtener todos los concursos", e);
			}
			super.doView(renderRequest, renderResponse);
		} else {
			renderRequest.setAttribute("concurso", renderRequest.getAttribute("concurso"));

			include("/html/listadoconcursosusuario/detallesConcurso.jsp", renderRequest, renderResponse);

		}

	}

	public void detallesConcurso(ActionRequest actionRequest, ActionResponse actionResponse) {
		Concurso concurso = null;
		try {
			concurso = ConcursoLocalServiceUtil
					.getConcurso(Long.parseLong(actionRequest.getParameter("concursoId").toString()));
			concurso.setDocumento(generarUrlDeRecurso(actionRequest, concurso.getDocumento()));
		} catch (NumberFormatException | PortalException | SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actionRequest.setAttribute("concurso", concurso);
	}

	public void inscripcion(ActionRequest actionRequest, ActionResponse actionResponse)
			throws PortletException, PortalException, Exception {

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
		_log.info(ruta);
		actionRequest.setAttribute("urlFile", ruta);

		try {

			Concurso concurso = ConcursoLocalServiceUtil
					.getConcurso(Long.parseLong(actionRequest.getParameter("concursoId").toString()));
			long concursoId = concurso.getConcursoId();
			long inscritoId = Long.parseLong(actionRequest.getRemoteUser());

			String asignadoId = inscritoId + "" + concursoId;

			Asignados asignado = new AsignadosImpl();
			asignado.setUsuarioId(inscritoId);
			asignado.setConcursoId(concursoId);
			asignado.setAsignadosId(asignadoId);
			
			asignado.setDocumento(sourceFileName);

			
			AsignadosLocalServiceUtil.addAsignados(asignado);

		} catch (Exception e) {
			_log.warn("El curso ya fue asignado", e);
			throw new PortalException();
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
