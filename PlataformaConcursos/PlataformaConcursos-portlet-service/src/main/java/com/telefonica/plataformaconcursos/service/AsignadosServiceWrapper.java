package com.telefonica.plataformaconcursos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AsignadosService}.
 *
 * @author Brian Wing Shun Chan
 * @see AsignadosService
 * @generated
 */
public class AsignadosServiceWrapper implements AsignadosService,
    ServiceWrapper<AsignadosService> {
    private AsignadosService _asignadosService;

    public AsignadosServiceWrapper(AsignadosService asignadosService) {
        _asignadosService = asignadosService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _asignadosService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _asignadosService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _asignadosService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AsignadosService getWrappedAsignadosService() {
        return _asignadosService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAsignadosService(AsignadosService asignadosService) {
        _asignadosService = asignadosService;
    }

    @Override
    public AsignadosService getWrappedService() {
        return _asignadosService;
    }

    @Override
    public void setWrappedService(AsignadosService asignadosService) {
        _asignadosService = asignadosService;
    }
}
