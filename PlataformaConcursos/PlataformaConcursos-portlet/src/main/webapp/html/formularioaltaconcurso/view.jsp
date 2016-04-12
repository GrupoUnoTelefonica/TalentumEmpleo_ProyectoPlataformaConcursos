<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri= "http://liferay.com/tld/aui" prefix="aui" %>

<portlet:defineObjects />
<portlet:actionURL var="registroConcursoURL" name="registroConcurso"/>

<h1>Registra un concurso</h1>

<aui:form action="<%=registroConcursoURL%>" method="post" name="formularioRegistroConcurso" enctype="multipart/form-data" >

	<!--<aui:column columnWidth="1" > -->
	<div><h4>Datos del concurso</h4></div>
	<div><aui:input id="nombreConcurso" type="text" name="nombre" label="Nombre">
		<aui:validator name="required"  errorMessage="Es necesario darle un nombre al concurso"  />
		</aui:input>
	</div>
	
	<div><aui:input id="descripcionConcurso" type="textarea" name="descripcion" label="Descripcion">
		<aui:validator name="required"  errorMessage="Es necesario añadir una descripcion"  />
		</aui:input>
	</div>
	
	<div><aui:input id="premiosConcurso" type="text" name="premio" label="Premio">
	<aui:validator name="required"  errorMessage="Es necesario añadir un premio"  />
		</aui:input>
	</div>
	
	
	<!--</aui:column>-->
	
	<!--<aui:column columnWidth="255">-->
	<div><h4>Fecha de inscripcion</h4></div>
	<div><aui:input id="fechaInicioInscripcion" type="date" name="fechaInicioInscripcion" label="Fecha de inicio">
		<aui:validator  name="required"  errorMessage="Formato erroneo dd/mm/aaaa" />
		</aui:input>	
	</div>
	
	
	
	<div><aui:input id="fechaFinInscripcion" type="date" name="fechaFinInscripcion" label="Fecha limite">
	<aui:validator name="required"  errorMessage="Formato erroneo dd/mm/aaaa"/>
	</aui:input>
	</div>
	<!--</aui:column>-->
	
	<!--<aui:column columnWidth="3">-->
	<div><h4>Fecha de entrega de dosieres</h4></div>
	<div><aui:input id="fechaInicioEntrega" type="date" name="fechaInicioEntrega" label="Fecha de inicio">
	<aui:validator name="required"  errorMessage="Formato erroneo dd/mm/aaaa"/>
	</aui:input>
	</div>
	
	
	<div><aui:input id="fechaFinEntrega" type="date" name="fechaFinEntrega" label="Fecha limite">
	<aui:validator name="required"  errorMessage="Formato erroneo dd/mm/aaaa"/>
	</aui:input>
	</div>
	
	<aui:input type="file" name="fileupload" value="Adjuntar bases legales">
		<aui:validator name="required" errorMessage="Es necesario adjuntar las bases legales"></aui:validator>
	</aui:input>


	<div><aui:button type="submit" value="Dar de alta"></aui:button></div>
	<!--</aui:column>-->
	
	
</aui:form>
