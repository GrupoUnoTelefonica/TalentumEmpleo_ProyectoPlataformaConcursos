<%@page import="com.telefonica.plataformaconcursos.model.Asignados"%>
<%@page import="com.telefonica.plataformaconcursos.model.impl.UsuarioImpl"%>
<%@page import="com.telefonica.plataformaconcursos.model.Usuario"%>
<%@page import="com.telefonica.plataformaconcursos.model.impl.ConcursoImpl"%>
<%@page import="com.telefonica.plataformaconcursos.model.Concurso"%>
<%@page import="java.util.List"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri= "http://liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<portlet:defineObjects />

<script type="text/javascript">
function fnExcelReport()
{
    var tab_text="<table border='2px'><tr bgcolor='#87AFC6'>";
    var textRange; var j=0;
    tab = document.getElementById('tablaApuntados'); // id of table

    for(j = 0 ; j < tab.rows.length ; j++) 
    {     
        tab_text=tab_text+tab.rows[j].innerHTML+"</tr>";
        //tab_text=tab_text+"</tr>";
    }

    tab_text=tab_text+"</table>";
    tab_text= tab_text.replace(/<A[^>]*>|<\/A>/g, "");//remove if u want links in your table
    tab_text= tab_text.replace(/<img[^>]*>/gi,""); // remove if u want images in your table
    tab_text= tab_text.replace(/<input[^>]*>|<\/input>/gi, ""); // reomves input params

    var ua = window.navigator.userAgent;
    var msie = ua.indexOf("MSIE "); 

    if (msie > 0 || !!navigator.userAgent.match(/Trident.*rv\:11\./))      // If Internet Explorer
    {
        txtArea1.document.open("txt/html","replace");
        txtArea1.document.write(tab_text);
        txtArea1.document.close();
        txtArea1.focus(); 
        sa=txtArea1.document.execCommand("SaveAs",true,"Say Thanks to Sumit.xls");
    }  
    else                 //other browser not tested on IE 11
        sa = window.open('data:application/vnd.ms-excel,' + encodeURIComponent(tab_text));  

    return (sa);
}
</script>







<%
List<Usuario> usuariosInscritos = (List<Usuario>)request.getAttribute("usuariosInscritoAlConcurso");

 %>

<h1>Listado de usuarios inscritos </h1>
<table id="tablaApuntados">
	<thead>
  		<tr>
    		<th><h4>Nombre</h4></th>
    		<th><h4>Apellidos</h4></th>
    		<th><h4>Email</h4></th>
    		<th><h4>Propuesta</h4></th>
    		<th><h4>Puntuacion obtenida</h4></th>
    		<th><h4></h4></th>
    		<th><h4></h4></th>
  		</tr>
 	 </thead>
 	 <tbody>
 	 <c:forEach items="<%=usuariosInscritos %>" var="usuario">
 	 <portlet:actionURL var="puntuarUrl" name="puntuar"/>
 	 	
 	 
 	 <aui:form action="<%=puntuarUrl %>">
 	 	<aui:input name="usuarioId" type="hidden" value="${usuario.usuarioId }"/>
 	 	<aui:input name="concursoId" type="hidden" value="${concurso.concursoId }"/>
 	 <tr>
    	<td><h6>${usuario.nombre}</h6></td>
    	<td><h6>${usuario.apellidos}</h6></td>
    	<td><h6>${usuario.correoElectronico}</h6></td>
    	<td><h6><a href="${usuario.documento}">Descargar</a></h6></td>
    	<td><h6>${usuario.puntuacionObtenida}</h6></td>
    	<td><h6><aui:select required="true"  name="puntuacion">
				 <aui:option > Puntuación</aui:option>
		 		 <aui:option name="puntuacion" value="0">0</aui:option>
		  		 <aui:option name="puntuacion" value="1">1</aui:option>
		 		 <aui:option name="puntuacion" value="2">2</aui:option>
		  		 <aui:option name="puntuacion" value="3">3</aui:option>
		  		 <aui:option name="puntuacion" value="4">4</aui:option>
		  		 <aui:option name="puntuacion" value="5">5</aui:option>
		  		 <aui:option name="puntuacion" value="6">6</aui:option>
		  		 <aui:option name="puntuacion" value="7">7</aui:option>
		  		 <aui:option name="puntuacion" value="8">8</aui:option>
		  		 <aui:option name="puntuacion" value="9">9</aui:option>
		  		 <aui:option name="puntuacion" value="10">10</aui:option>
			</aui:select></h6></td>
			<td><h6> <input type="submit" value="Puntuar"></h6></td>
			

	


 	 </tr>
 	
 	 </aui:form>
 	 </c:forEach>
 	 </tbody>
 
</table>




 <button id="btnExport" onclick="fnExcelReport();"> Exportar tabla en Excel</button>






