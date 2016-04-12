<%@page import="com.telefonica.plataformaconcursos.model.impl.ConcursoImpl"%>
<%@page import="com.telefonica.plataformaconcursos.model.Concurso"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri= "http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<portlet:defineObjects />

<%
List<Concurso> concursos = (List<Concurso>)request.getAttribute("listaConcursosUsuarios");
 %>

<h1>Concursos publicados<h1>

<table>
	<thead>
  		<tr>
    		<th><h4>Nombre</h4></th>
    		<th><h4>Fecha inicio de inscripcion</h4></th>
    		<th><h4>Fecha fin de inscripcion</h4></th>
    		<th><h4>Más información</h4></th>
  		</tr>
 	 </thead>
 	 <tbody>
 	 
 	 <c:forEach items="<%=concursos %>" var="concurso">
 	 	
			<portlet:actionURL var="detallesConcursoUrl" name="detallesConcurso">
		<portlet:param name="concursoId" value="${concurso.concursoId}"/>
	
</portlet:actionURL>
 	  <tr>
    	<td><h6>${concurso.nombre }</h6></td>
    	<td><h6>${concurso.fechaInicioInscripcion}</h6></td>
    	<td><h6>${concurso.fechaFinInscripcion}</h6></td>
    	<td><h6><a href="<%=detallesConcursoUrl %>" >Más información</a></h6>
 	 </tr>
 	 </c:forEach>
 	 </tbody>
 
</table>
