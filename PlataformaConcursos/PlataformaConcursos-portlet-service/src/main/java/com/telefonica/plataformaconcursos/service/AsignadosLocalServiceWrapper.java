package com.telefonica.plataformaconcursos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AsignadosLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see AsignadosLocalService
 * @generated
 */
public class AsignadosLocalServiceWrapper implements AsignadosLocalService,
    ServiceWrapper<AsignadosLocalService> {
    private AsignadosLocalService _asignadosLocalService;

    public AsignadosLocalServiceWrapper(
        AsignadosLocalService asignadosLocalService) {
        _asignadosLocalService = asignadosLocalService;
    }

    /**
    * Adds the asignados to the database. Also notifies the appropriate model listeners.
    *
    * @param asignados the asignados
    * @return the asignados that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.plataformaconcursos.model.Asignados addAsignados(
        com.telefonica.plataformaconcursos.model.Asignados asignados)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _asignadosLocalService.addAsignados(asignados);
    }

    /**
    * Creates a new asignados with the primary key. Does not add the asignados to the database.
    *
    * @param asignadosId the primary key for the new asignados
    * @return the new asignados
    */
    @Override
    public com.telefonica.plataformaconcursos.model.Asignados createAsignados(
        java.lang.String asignadosId) {
        return _asignadosLocalService.createAsignados(asignadosId);
    }

    /**
    * Deletes the asignados with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param asignadosId the primary key of the asignados
    * @return the asignados that was removed
    * @throws PortalException if a asignados with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.plataformaconcursos.model.Asignados deleteAsignados(
        java.lang.String asignadosId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _asignadosLocalService.deleteAsignados(asignadosId);
    }

    /**
    * Deletes the asignados from the database. Also notifies the appropriate model listeners.
    *
    * @param asignados the asignados
    * @return the asignados that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.plataformaconcursos.model.Asignados deleteAsignados(
        com.telefonica.plataformaconcursos.model.Asignados asignados)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _asignadosLocalService.deleteAsignados(asignados);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _asignadosLocalService.dynamicQuery();
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
        return _asignadosLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.plataformaconcursos.model.impl.AsignadosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _asignadosLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.plataformaconcursos.model.impl.AsignadosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _asignadosLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _asignadosLocalService.dynamicQueryCount(dynamicQuery);
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
        return _asignadosLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.telefonica.plataformaconcursos.model.Asignados fetchAsignados(
        java.lang.String asignadosId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _asignadosLocalService.fetchAsignados(asignadosId);
    }

    /**
    * Returns the asignados with the primary key.
    *
    * @param asignadosId the primary key of the asignados
    * @return the asignados
    * @throws PortalException if a asignados with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.plataformaconcursos.model.Asignados getAsignados(
        java.lang.String asignadosId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _asignadosLocalService.getAsignados(asignadosId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _asignadosLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the asignadoses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.plataformaconcursos.model.impl.AsignadosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of asignadoses
    * @param end the upper bound of the range of asignadoses (not inclusive)
    * @return the range of asignadoses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.telefonica.plataformaconcursos.model.Asignados> getAsignadoses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _asignadosLocalService.getAsignadoses(start, end);
    }

    /**
    * Returns the number of asignadoses.
    *
    * @return the number of asignadoses
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getAsignadosesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _asignadosLocalService.getAsignadosesCount();
    }

    /**
    * Updates the asignados in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param asignados the asignados
    * @return the asignados that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.plataformaconcursos.model.Asignados updateAsignados(
        com.telefonica.plataformaconcursos.model.Asignados asignados)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _asignadosLocalService.updateAsignados(asignados);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _asignadosLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _asignadosLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _asignadosLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findByUsuarioId(
        long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _asignadosLocalService.findByUsuarioId(usuarioId);
    }

    @Override
    public java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findByConcursoId(
        long concursoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _asignadosLocalService.findByConcursoId(concursoId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AsignadosLocalService getWrappedAsignadosLocalService() {
        return _asignadosLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAsignadosLocalService(
        AsignadosLocalService asignadosLocalService) {
        _asignadosLocalService = asignadosLocalService;
    }

    @Override
    public AsignadosLocalService getWrappedService() {
        return _asignadosLocalService;
    }

    @Override
    public void setWrappedService(AsignadosLocalService asignadosLocalService) {
        _asignadosLocalService = asignadosLocalService;
    }
}
