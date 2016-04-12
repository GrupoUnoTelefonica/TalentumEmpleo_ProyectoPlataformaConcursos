<%@page import="com.telefonica.plataformaconcursos.service.EmpresaLocalServiceUtil"%>
<%@page import="com.telefonica.plataformaconcursos.model.Empresa"%>
<%@page import="com.telefonica.plataformaconcursos.model.impl.EmpresaImpl"%>
<%@page import="com.telefonica.plataformaconcursos.altaempresa.RegistroEmpresa"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri= "http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />



<portlet:actionURL var="urlRegistroEmpresa" name="registroEmpresa"/>

<h1>Formulario de Registro de Empresa</h1>

<aui:form action="<%=urlRegistroEmpresa%>" method="post" name="name">
	
	<div><aui:input id="inputNombre" type="text" name="nombre" label="Nombre Empresa">
	<aui:validator name="required" errorMessage="Es necesario introducir nombre de empresa"></aui:validator>
	</aui:input></div>
	
	
	<div> <aui:select required="true" name="sector" label="Sector Empresa">
				 <aui:option > Selecciona Sector </aui:option>
		 		 <aui:option name="sector" value="Tecnologia">Tecnologia</aui:option>
		  		 <aui:option name="sector" value="Comunicación">Comunicación</aui:option>
		 		 <aui:option name="sector" value="Automovilismo">Automovilismo</aui:option>
		  		 <aui:option name="sector" value="Turismo">Turismo</aui:option>
			</aui:select></div>
			
			
	<div><aui:input id="cif" type="text" name="cif" label="CIF" placeholder="C45896521">
	<aui:validator name="required" errorMessage="Introduce un formato valido"> </aui:validator><aui:validator name="maxLength">9</aui:validator>
	<aui:validator name="minLength">9</aui:validator></aui:input></div>
	
		<div><aui:select required="true" name="pais" label="País">
				<aui:option> Selecciona País </aui:option>
		 		 <aui:option name="pais" value="España">España</aui:option>
		  		 <aui:option name="pais" value="Portugal">Portugal</aui:option>
		 		 <aui:option name="pais" value="Francia">Francia</aui:option>
		  		 <aui:option name="pais" value="Alemania">Alemania</aui:option>
		  		  <aui:option name="pais" value="Estados Unidos">Estados Unidos</aui:option>
		  		   <aui:option name="pais" value="Rusia">Rusia</aui:option>
			</aui:select></div>
				
	<div><aui:input id="correoElectronico" type="text" name="correoElectronico" pattern="^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$" label="Correo Electrónico" placeholder="correo@ejemplo.com">
	<aui:validator name="required" errorMessage="Es necesario introducir un correo electrónico válido"></aui:validator>
	</aui:input></div>
	
	<div><aui:input id="password1" type="password" name="password1" label="Password"><aui:validator name="required"></aui:validator>
	<aui:validator name="minLength">8</aui:validator></aui:input></div>
	
	<div><aui:input type="password" name="password2" value='' label="Repite Password">
 		<aui:validator name="equalTo">'#<portlet:namespace />password1'</aui:validator>
 		<aui:validator name="required"></aui:validator>
	</aui:input></div>
	
	<input type="submit" name="Darse de alta"> 
	<div> Ya soy <a href="http://localhost:8080/web/empresas/login-oculto-">usuario</a></div>
</aui:form>
