package com.telefonica.plataformaconcursos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmpresaLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see EmpresaLocalService
 * @generated
 */
public class EmpresaLocalServiceWrapper implements EmpresaLocalService,
    ServiceWrapper<EmpresaLocalService> {
    private EmpresaLocalService _empresaLocalService;

    public EmpresaLocalServiceWrapper(EmpresaLocalService empresaLocalService) {
        _empresaLocalService = empresaLocalService;
    }

    /**
    * Adds the empresa to the database. Also notifies the appropriate model listeners.
    *
    * @param empresa the empresa
    * @return the empresa that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.plataformaconcursos.model.Empresa addEmpresa(
        com.telefonica.plataformaconcursos.model.Empresa empresa)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _empresaLocalService.addEmpresa(empresa);
    }

    /**
    * Creates a new empresa with the primary key. Does not add the empresa to the database.
    *
    * @param empresaId the primary key for the new empresa
    * @return the new empresa
    */
    @Override
    public com.telefonica.plataformaconcursos.model.Empresa createEmpresa(
        long empresaId) {
        return _empresaLocalService.createEmpresa(empresaId);
    }

    /**
    * Deletes the empresa with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param empresaId the primary key of the empresa
    * @return the empresa that was removed
    * @throws PortalException if a empresa with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.plataformaconcursos.model.Empresa deleteEmpresa(
        long empresaId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _empresaLocalService.deleteEmpresa(empresaId);
    }

    /**
    * Deletes the empresa from the database. Also notifies the appropriate model listeners.
    *
    * @param empresa the empresa
    * @return the empresa that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.plataformaconcursos.model.Empresa deleteEmpresa(
        com.telefonica.plataformaconcursos.model.Empresa empresa)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _empresaLocalService.deleteEmpresa(empresa);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _empresaLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _empresaLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.plataformaconcursos.model.impl.EmpresaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _empresaLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.plataformaconcursos.model.impl.EmpresaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _empresaLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _empresaLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _empresaLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.telefonica.plataformaconcursos.model.Empresa fetchEmpresa(
        long empresaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _empresaLocalService.fetchEmpresa(empresaId);
    }

    /**
    * Returns the empresa with the primary key.
    *
    * @param empresaId the primary key of the empresa
    * @return the empresa
    * @throws PortalException if a empresa with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.plataformaconcursos.model.Empresa getEmpresa(
        long empresaId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _empresaLocalService.getEmpresa(empresaId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _empresaLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the empresas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.plataformaconcursos.model.impl.EmpresaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of empresas
    * @param end the upper bound of the range of empresas (not inclusive)
    * @return the range of empresas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.telefonica.plataformaconcursos.model.Empresa> getEmpresas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _empresaLocalService.getEmpresas(start, end);
    }

    /**
    * Returns the number of empresas.
    *
    * @return the number of empresas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getEmpresasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _empresaLocalService.getEmpresasCount();
    }

    /**
    * Updates the empresa in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param empresa the empresa
    * @return the empresa that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.plataformaconcursos.model.Empresa updateEmpresa(
        com.telefonica.plataformaconcursos.model.Empresa empresa)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _empresaLocalService.updateEmpresa(empresa);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _empresaLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _empresaLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _empresaLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public EmpresaLocalService getWrappedEmpresaLocalService() {
        return _empresaLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedEmpresaLocalService(
        EmpresaLocalService empresaLocalService) {
        _empresaLocalService = empresaLocalService;
    }

    @Override
    public EmpresaLocalService getWrappedService() {
        return _empresaLocalService;
    }

    @Override
    public void setWrappedService(EmpresaLocalService empresaLocalService) {
        _empresaLocalService = empresaLocalService;
    }
}
