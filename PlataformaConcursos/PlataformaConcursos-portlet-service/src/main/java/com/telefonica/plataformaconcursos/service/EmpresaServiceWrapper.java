package com.telefonica.plataformaconcursos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmpresaService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmpresaService
 * @generated
 */
public class EmpresaServiceWrapper implements EmpresaService,
    ServiceWrapper<EmpresaService> {
    private EmpresaService _empresaService;

    public EmpresaServiceWrapper(EmpresaService empresaService) {
        _empresaService = empresaService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _empresaService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _empresaService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _empresaService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EmpresaService getWrappedEmpresaService() {
        return _empresaService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEmpresaService(EmpresaService empresaService) {
        _empresaService = empresaService;
    }

    @Override
    public EmpresaService getWrappedService() {
        return _empresaService;
    }

    @Override
    public void setWrappedService(EmpresaService empresaService) {
        _empresaService = empresaService;
    }
}
