package com.telefonica.plataformaconcursos.listadoconcursosempresa;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.LiferayPortletURL;
import com.liferay.portal.kernel.servlet.ServletResponseUtil;
import com.liferay.portal.kernel.upload.FileItem;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.PortletURLFactoryUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.telefonica.plataformaconcursos.model.Asignados;
import com.telefonica.plataformaconcursos.model.Concurso;
import com.telefonica.plataformaconcursos.model.Usuario;
import com.telefonica.plataformaconcursos.service.AsignadosLocalServiceUtil;
import com.telefonica.plataformaconcursos.service.ConcursoLocalServiceUtil;
import com.telefonica.plataformaconcursos.service.UsuarioLocalServiceUtil;

/**
 * Portlet implementation class ListadoConcursosEmpresa
 */
public class ListadoConcursosEmpresa extends MVCPortlet {

	// Aplicar finder empresa
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		if (renderRequest.getAttribute("concurso") == null) {
			try {
				// 1-Recoger los parametros que me envian desde LA SESION EN
				// ESTE CASO
				// long id = (long)
				// actionRequest.getPortletSession().getAttribute("idEmpresa");
				long empresaId = Long.parseLong(renderRequest.getRemoteUser());

				List<Concurso> concursos = ConcursoLocalServiceUtil.findByEmpresaId(empresaId);
				// List<Concurso> concursos =
				// ConcursoLocalServiceUtil.getConcursos(0,
				// ConcursoLocalServiceUtil.getConcursosCount());

				renderRequest.setAttribute("listaConcursos", concursos);

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

			super.doView(renderRequest, renderResponse);
		} else {
			renderRequest.setAttribute("usuariosInscritoAlConcurso",
					renderRequest.getAttribute("usuariosInscritoAlConcurso"));
			include("/html/listadoconcursosempresa/listadoDeUsuariosInscritosAlConcurso.jsp", renderRequest,
					renderResponse);

		}

	}

	public void usuariosInscritosAConcurso(ActionRequest actionRequest, ActionResponse actionResponse) {
		Concurso concurso = null;
		try {

			concurso = ConcursoLocalServiceUtil
					.getConcurso(Long.parseLong(actionRequest.getParameter("concursoId").toString()));

			System.out.println(concurso);

			long concursoId = concurso.getConcursoId();
			System.out.println(concursoId);

			List<Asignados> asignadosAUnConcurso = AsignadosLocalServiceUtil.findByConcursoId(concursoId);
			System.out.println(asignadosAUnConcurso);

			List<Usuario> usuariosInscritos = new ArrayList<>();

			for (Asignados asignado : asignadosAUnConcurso) {
				long usuarioId = asignado.getUsuarioId();
				System.out.println(usuarioId);
				Usuario usuario = UsuarioLocalServiceUtil.getUsuario(usuarioId);
				usuario.setDocumento(generarUrlDeRecurso(actionRequest,asignado.getDocumento()));
				usuario.setPuntuacionObtenida(asignado.getPuntuacionObtenida());
				usuariosInscritos.add(usuario);
				actionRequest.setAttribute("usuariosInscritoAlConcurso", usuariosInscritos);
				System.out.println(usuariosInscritos);
			}

		} catch (NumberFormatException | PortalException |

		SystemException e)

		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		actionRequest.setAttribute("concurso", concurso);

	}
	private String generarUrlDeRecurso(ActionRequest request, String sourceFileName) {
		// Generamos la url para enviarla como mensaje al chat

		ThemeDisplay themeDisplay = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		LiferayPortletURL liferayPortletURL = PortletURLFactoryUtil.create(request, themeDisplay.getPpid(),
				themeDisplay.getPlid(), PortletRequest.RESOURCE_PHASE);

		liferayPortletURL.setParameter("filename", sourceFileName);

		return liferayPortletURL.toString();
	}
	public void puntuar(ActionRequest actionRequest, ActionResponse actionResponse) {

		//Concurso concurso = null;
		try {

			//concurso = ConcursoLocalServiceUtil
				//	.getConcurso(Long.parseLong(actionRequest.getParameter("concursoId").toString()));

			String concursoId = actionRequest.getParameter("concursoId").toString();
			String usuarioId = actionRequest.getParameter("usuarioId");
			String asignadoId = usuarioId+concursoId;
			Asignados asignado = AsignadosLocalServiceUtil.getAsignados(asignadoId);
			System.out.println(asignado);
			asignado.setPuntuacionObtenida(actionRequest.getParameter("puntuacion"));
			AsignadosLocalServiceUtil.updateAsignados(asignado);
			usuariosInscritosAConcurso(actionRequest, actionResponse);

		} catch (NumberFormatException | PortalException |

		SystemException e)

		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void serveResource(ResourceRequest request, ResourceResponse response) throws IOException, PortletException {
		try {

			System.out.println(request.getParameter("filename"));

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
