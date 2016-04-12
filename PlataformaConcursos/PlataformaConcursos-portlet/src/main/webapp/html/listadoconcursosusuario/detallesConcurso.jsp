<%@ page import="javax.portlet.PortletPreferences"%>
<%@page import="com.liferay.util.PwdGenerator"%>
<%@page import="com.telefonica.plataformaconcursos.model.impl.ConcursoImpl"%>
<%@page import="com.telefonica.plataformaconcursos.model.Concurso"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri= "http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



<portlet:defineObjects />


<portlet:actionURL var="urlInscrito" name="inscripcion">
	<portlet:param name="concursoId" value="${concurso.concursoId}"/>
</portlet:actionURL>


<%Concurso concursoDetallado = new ConcursoImpl();

 %>

<h1>Concurso seleccionado<h1>


<h4>Nombre: ${concurso.nombre}<h4>
<div><h4>Descripcion</h4></div>
<div><h6>${concurso.descripcion }</h6></div>
<h4>Premio: </h4><h6>${concurso.premio}</h6> 
<h4>Fecha Inicio Inscripción:</h4><h6>${concurso.fechaInicioInscripcion}</h6> 
<h4>Fecha Fin Inscripción:</h4><h6>${concurso.fechaFinInscripcion}</h6>
<h4>Fecha Inicio Entrega:</h4><h6>${concurso.fechaInicioEntrega}</h6>
<h4>Fecha Fin Entrega:</h4> <h6>${concurso.fechaFinEntrega}</h6>
<h4>Bases Legales</h4> <h6><a href="${concurso.documento}">Bases Legales</a></h6>



<p>El documento se adjuntará automaticamente al inscribirte. La inscripción se realizará una única vez</p>
 
<form action="<%=urlInscrito %>" enctype="multipart/form-data" method="post">
<aui:input type="file" name="fileupload">
<aui:validator name="required" errorMessage="Es necesario adjuntar una propuesta"></aui:validator>
</aui:input>
<input type="submit" value="Inscribete"/>
</form>


	
	

		
	



