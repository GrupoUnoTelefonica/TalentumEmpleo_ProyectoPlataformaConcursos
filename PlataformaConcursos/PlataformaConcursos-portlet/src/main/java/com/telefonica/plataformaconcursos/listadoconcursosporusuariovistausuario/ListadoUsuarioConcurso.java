package com.telefonica.plataformaconcursos.listadoconcursosporusuariovistausuario;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.telefonica.plataformaconcursos.model.Asignados;
import com.telefonica.plataformaconcursos.model.Concurso;
import com.telefonica.plataformaconcursos.service.AsignadosLocalServiceUtil;
import com.telefonica.plataformaconcursos.service.ConcursoLocalServiceUtil;

/**
 * Portlet implementation class ListadoConcursosUsuario
 */
public class ListadoUsuarioConcurso extends MVCPortlet {
	private static Log _log = LogFactoryUtil.getLog(ListadoUsuarioConcurso.class);
	//Aplicar finder usuario
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		_log.debug("Entrando en doView");
		try {
			long usuarioId = Long.parseLong(renderRequest.getRemoteUser());
			List<Asignados> asignados = AsignadosLocalServiceUtil.getAsignadoses(0, AsignadosLocalServiceUtil.getAsignadosesCount());
			List<Concurso> concursos = new ArrayList<>();
			
			for (Asignados asignado : asignados) {
				//declarar fuera del for
				long concursoId = asignado.getConcursoId();
				long usuarioId2 = asignado.getUsuarioId();
				
				if (usuarioId==usuarioId2) {
					concursos.add(ConcursoLocalServiceUtil.getConcurso(concursoId));
					
				}
				
				
			}
			renderRequest.setAttribute("listaConcursosUsuarios", concursos);

		} catch (Exception e) {
			_log.error("Error al listar los concursos de usuario",e);
			
		}

		super.doView(renderRequest, renderResponse); 

	}
	





 

}
