package com.telefonica.plataformaconcursos.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ConcursoLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ConcursoLocalService
 * @generated
 */
public class ConcursoLocalServiceWrapper implements ConcursoLocalService,
    ServiceWrapper<ConcursoLocalService> {
    private ConcursoLocalService _concursoLocalService;

    public ConcursoLocalServiceWrapper(
        ConcursoLocalService concursoLocalService) {
        _concursoLocalService = concursoLocalService;
    }

    /**
    * Adds the concurso to the database. Also notifies the appropriate model listeners.
    *
    * @param concurso the concurso
    * @return the concurso that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.plataformaconcursos.model.Concurso addConcurso(
        com.telefonica.plataformaconcursos.model.Concurso concurso)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _concursoLocalService.addConcurso(concurso);
    }

    /**
    * Creates a new concurso with the primary key. Does not add the concurso to the database.
    *
    * @param concursoId the primary key for the new concurso
    * @return the new concurso
    */
    @Override
    public com.telefonica.plataformaconcursos.model.Concurso createConcurso(
        long concursoId) {
        return _concursoLocalService.createConcurso(concursoId);
    }

    /**
    * Deletes the concurso with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param concursoId the primary key of the concurso
    * @return the concurso that was removed
    * @throws PortalException if a concurso with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.plataformaconcursos.model.Concurso deleteConcurso(
        long concursoId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _concursoLocalService.deleteConcurso(concursoId);
    }

    /**
    * Deletes the concurso from the database. Also notifies the appropriate model listeners.
    *
    * @param concurso the concurso
    * @return the concurso that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.plataformaconcursos.model.Concurso deleteConcurso(
        com.telefonica.plataformaconcursos.model.Concurso concurso)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _concursoLocalService.deleteConcurso(concurso);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _concursoLocalService.dynamicQuery();
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
        return _concursoLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.plataformaconcursos.model.impl.ConcursoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _concursoLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.plataformaconcursos.model.impl.ConcursoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _concursoLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _concursoLocalService.dynamicQueryCount(dynamicQuery);
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
        return _concursoLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public com.telefonica.plataformaconcursos.model.Concurso fetchConcurso(
        long concursoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _concursoLocalService.fetchConcurso(concursoId);
    }

    /**
    * Returns the concurso with the primary key.
    *
    * @param concursoId the primary key of the concurso
    * @return the concurso
    * @throws PortalException if a concurso with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.plataformaconcursos.model.Concurso getConcurso(
        long concursoId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _concursoLocalService.getConcurso(concursoId);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _concursoLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the concursos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.plataformaconcursos.model.impl.ConcursoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of concursos
    * @param end the upper bound of the range of concursos (not inclusive)
    * @return the range of concursos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.telefonica.plataformaconcursos.model.Concurso> getConcursos(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _concursoLocalService.getConcursos(start, end);
    }

    /**
    * Returns the number of concursos.
    *
    * @return the number of concursos
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getConcursosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _concursoLocalService.getConcursosCount();
    }

    /**
    * Updates the concurso in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param concurso the concurso
    * @return the concurso that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.telefonica.plataformaconcursos.model.Concurso updateConcurso(
        com.telefonica.plataformaconcursos.model.Concurso concurso)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _concursoLocalService.updateConcurso(concurso);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _concursoLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _concursoLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _concursoLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public java.util.List<com.telefonica.plataformaconcursos.model.Concurso> findByEmpresaId(
        long empresaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _concursoLocalService.findByEmpresaId(empresaId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ConcursoLocalService getWrappedConcursoLocalService() {
        return _concursoLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedConcursoLocalService(
        ConcursoLocalService concursoLocalService) {
        _concursoLocalService = concursoLocalService;
    }

    @Override
    public ConcursoLocalService getWrappedService() {
        return _concursoLocalService;
    }

    @Override
    public void setWrappedService(ConcursoLocalService concursoLocalService) {
        _concursoLocalService = concursoLocalService;
    }
}
