package com.telefonica.plataformaconcursos.altaempresa;

import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.User;
import com.liferay.portal.service.CompanyLocalServiceUtil;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.telefonica.plataformaconcursos.model.Empresa;
import com.telefonica.plataformaconcursos.model.impl.EmpresaImpl;
import com.telefonica.plataformaconcursos.service.EmpresaLocalServiceUtil;

/**
 * Portlet implementation class registroEmpresa
 */
public class RegistroEmpresa extends MVCPortlet {

	
	 
	 public static final String VISTA_LOGIN = "/group/empresas/home"; 
	
	// @ProcessAction(name = "registroEmpresa")
	public void registroEmpresa(ActionRequest actionRequest, ActionResponse actionResponse)
			throws SystemException, PortalException {
		

		String nombre = actionRequest.getParameter("nombre");
		String sectorEmpresa = actionRequest.getParameter("sector");
		String cif = actionRequest.getParameter("cif");
		String pais = actionRequest.getParameter("pais");
		String passwordPrimero = actionRequest.getParameter("password1");
		String passwordSegundo= actionRequest.getParameter("password2");
		String correoElectronico = actionRequest.getParameter("correoElectronico");

	
		Empresa empresa = new EmpresaImpl();
		System.out.println("Aqui se ejecuta la accion");
		User liferayEmpresa = null;
		try{
			liferayEmpresa =crearUsuarioLiferay(nombre, sectorEmpresa, cif, pais, correoElectronico, passwordPrimero, passwordSegundo);
		}catch(Exception e){
			e.printStackTrace();
			
			throw new PortalException("No se ha podido crear el usuario");
		}
			
		
		empresa.setNombre(nombre);
		empresa.setSectorEmpresa(sectorEmpresa);
		empresa.setCif(cif);
		empresa.setPais(pais);
		empresa.setCorreoElectronico(correoElectronico);
		empresa.setPassword1(passwordPrimero);
		empresa.setPassword2(passwordSegundo);
		empresa.setEmpresaId(liferayEmpresa.getUserId());

		// Invocar el negocio
		EmpresaLocalServiceUtil.addEmpresa(empresa);
		
		UserLocalServiceUtil.addOrganizationUser(Long.parseLong(getInitParameter("organization")), liferayEmpresa.getUserId());
				
		// Pintar en la consola el registro metido

		Empresa empresa1 = EmpresaLocalServiceUtil.getEmpresa(liferayEmpresa.getUserId());
		User liferarayEmpresa1 = UserLocalServiceUtil.getUser(liferayEmpresa.getUserId());
		
		System.out.println(liferarayEmpresa1);
		System.out.println(empresa1);
		
		// vista la que quiero ir
		try {
			actionResponse.sendRedirect(VISTA_LOGIN);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private User crearUsuarioLiferay(String nombre, String sectorEmpresa, String cif, String pais,String correoElectronico, String passwordPrimero,
			String passwordSegundo) throws SystemException, PortalException {

		long creatorUserId = 0;
		boolean autoPassword = false;
		String password1 = passwordPrimero;
		String password2 = passwordSegundo;
		boolean autoScreenName = false;
		String screenName = nombre;
		String emailAddress = correoElectronico;
		long facebookId = -1;
		String openId = StringPool.BLANK;
		Locale locale = LocaleUtil.getDefault();
		String firstName = screenName;
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
			autoScreenName, screenName, emailAddress, facebookId, openId,
			locale, firstName, middleName, lastName, prefixId, suffixId, male,
			birthdayMonth, birthdayDay, birthdayYear, jobTitle, groupIds,
			organizationIds, roleIds, userGroupIds, sendEmail, serviceContext);

		return userToCreate;
	}

}

