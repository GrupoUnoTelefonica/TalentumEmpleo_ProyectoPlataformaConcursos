package com.telefonica.plataformaconcursos.registrousuarios;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.User;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.telefonica.plataformaconcursos.model.Usuario;
import com.telefonica.plataformaconcursos.model.impl.UsuarioImpl;
import com.telefonica.plataformaconcursos.service.UsuarioLocalServiceUtil;

/**
 * Portlet implementation class RegistroUsuariosPortlet
 */
public class RegistroUsuarios extends MVCPortlet {

	 public static final String VISTA_LOGIN = "/group/usuarios/home"; 
	 public static final String VISTA_REGISTRO = "/registrousuarios/view.jsp"; 
	
	
	//@ProcessAction(name = "registroUsuario")
	public void registroUsuario(ActionRequest actionRequest, ActionResponse actionResponse)
			throws SystemException, PortalException, IOException, PortletException {
		System.out.println("Aqui se ejecuta la accion");

		String nombre = actionRequest.getParameter("nombre");
		String apellidos = actionRequest.getParameter("apellidos");
		String correoElectronico = actionRequest.getParameter("correo");
		String passwordPrimero = actionRequest.getParameter("password1");
		String passwordSegundo = actionRequest.getParameter("password2");
		borraUsuarios();

		// Adaptar los datos recogidos del formulario, porque son String, a lo
		// que nos pida el Negocio

		Usuario usuario = new UsuarioImpl();
		User liferayUsuario  = null;
		try{
			liferayUsuario =crearUsuarioLiferay(nombre, apellidos, correoElectronico, passwordPrimero, passwordSegundo);
		}catch(Exception e){
			e.printStackTrace();
			
			throw new PortalException("No se ha podido crear el usuario");
				
		}
		
		usuario.setNombre(nombre);
		usuario.setApellidos(apellidos);
		usuario.setCorreoElectronico(correoElectronico);
		usuario.setPassword1(passwordPrimero);
		usuario.setPassword2(passwordSegundo);
		usuario.setUsuarioId(liferayUsuario.getUserId());
		
		// Invocar el negocio
		UsuarioLocalServiceUtil.addUsuario(usuario);
		UserLocalServiceUtil.addOrganizationUser(Long.parseLong(getInitParameter("organization")), liferayUsuario.getUserId());
		
		//Pintar en la consola el registro metido
		
		Usuario usuario1 = UsuarioLocalServiceUtil.getUsuario(liferayUsuario.getUserId());

		System.out.println(usuario1);

		try {
			actionResponse.sendRedirect(VISTA_LOGIN);
		} catch (IOException e) {
			e.printStackTrace();
			
		}
	}
	private void borraUsuarios(){
		try {
			List<User> users = UserLocalServiceUtil.getUsers(0, UserLocalServiceUtil.getUsersCount());
			for (User user: users){
				if(user.getEmailAddress().equals("grupo1_telefonica@liferay.com")){
					System.out.println("Encontrado.........");
				}else{
					try {
						//UserLocalServiceUtil.deleteUser(user);
						System.out.println("Voy a borrar a: " + user.getEmailAddress());
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private User crearUsuarioLiferay(String nombre, String apellidos, String correoElectronico, String passwordPrimero, String passwordSegundo) throws SystemException, PortalException {

		long creatorUserId = 0;
		boolean autoPassword = false;
		String password1 = passwordPrimero;
		String password2 = passwordSegundo;
		boolean autoScreenName = true;
		String screenName = StringPool.BLANK;
		String emailAddress = correoElectronico;
		//long facebookId = jsonObject.getLong("id");
		String openId = StringPool.BLANK;
		Locale locale = LocaleUtil.getDefault();
		String firstName = nombre;
		String middleName = StringPool.BLANK;
		String lastName = StringPool.BLANK;
		int prefixId = 0;
		int suffixId = 0;
		boolean male = true;
		int birthdayMonth = Calendar.JANUARY;
		int birthdayDay = 1;
		int birthdayYear = 1970;
		String jobTitle = StringPool.BLANK;
		long[] groupIds = null;
		long[] organizationIds = null;
		long[] roleIds = null;
		long[] userGroupIds = null;
		boolean sendEmail = false;
		long companyId = CompanyLocalServiceUtil.getCompanies().get(0).getCompanyId();
		ServiceContext serviceContext = new ServiceContext();

		User userToCreate = UserLocalServiceUtil.addUser(
			creatorUserId, companyId, autoPassword, password1, password2,
			autoScreenName, screenName, emailAddress, 0, openId,
			locale, firstName, middleName, lastName, prefixId, suffixId, male,
			birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds,
			organizationIds, roleIds, userGroupIds, sendEmail, serviceContext);

		
		return userToCreate;
	}

}



