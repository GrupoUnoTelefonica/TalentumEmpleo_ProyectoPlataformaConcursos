<%@page import="com.telefonica.plataformaconcursos.service.EmpresaLocalServiceUtil"%>
<%@page import="com.telefonica.plataformaconcursos.model.Empresa"%>
<%@page import="com.telefonica.plataformaconcursos.model.impl.EmpresaImpl"%>
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri= "http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />
<portlet:actionURL var="urlRegistroUsuario" name="registroUsuario"/>

<h1>Formulario de Registro de Usuario</h1>

<aui:form action="<%=urlRegistroUsuario%>" method="post" name="name">
	<div><aui:input id="inputNombre" type="text" name="nombre" label="Nombre" placeholder="Nombre">
	<aui:validator name="required" errorMessage="Debe introducir un nombre"></aui:validator></aui:input>
	</div>
	<div><aui:input id="Apellidos" type="text" name="apellidos" label="Apellidos" placeholder="Apellidos">
	<aui:validator name="required" errorMessage="Es necesario introducir apellidos"></aui:validator></aui:input>
	</div>
	<div><aui:input id="Correo Electronico" type="text" pattern="^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$"  name="correo" label="correo" placeholder="correo@ejemplo.com">
	<aui:validator name="required" errorMessage="Se requiere introducir un correo electronico"></aui:validator></aui:input>
	</div>
	<div><aui:input id="password1" type="password" name="password1" label="password">
	<aui:validator name="required" errorMessage="Introduce una contraseña"></aui:validator>
	<aui:validator name="minLength">8</aui:validator></aui:input>
	</div>
	<div><aui:input name="password2" value='' label="Repite Password" type="password">
	 <aui:validator name="equalTo">'#<portlet:namespace />password1'</aui:validator>
	 <aui:validator name="required" ></aui:validator></aui:input>
	</div>
	<input type="submit" name="Registrarse" value="Registrar"> 
	<div> Ya soy <a href="http://localhost:8080/web/usuarios/login-oculto-">usuario</a></div>
</aui:form>
