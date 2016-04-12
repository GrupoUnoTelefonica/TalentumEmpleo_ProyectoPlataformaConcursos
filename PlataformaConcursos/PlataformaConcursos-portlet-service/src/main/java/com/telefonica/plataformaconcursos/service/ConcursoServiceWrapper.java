package com.telefonica.plataformaconcursos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ConcursoService}.
 *
 * @author Brian Wing Shun Chan
 * @see ConcursoService
 * @generated
 */
public class ConcursoServiceWrapper implements ConcursoService,
    ServiceWrapper<ConcursoService> {
    private ConcursoService _concursoService;

    public ConcursoServiceWrapper(ConcursoService concursoService) {
        _concursoService = concursoService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _concursoService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _concursoService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _concursoService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ConcursoService getWrappedConcursoService() {
        return _concursoService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedConcursoService(ConcursoService concursoService) {
        _concursoService = concursoService;
    }

    @Override
    public ConcursoService getWrappedService() {
        return _concursoService;
    }

    @Override
    public void setWrappedService(ConcursoService concursoService) {
        _concursoService = concursoService;
    }
}
