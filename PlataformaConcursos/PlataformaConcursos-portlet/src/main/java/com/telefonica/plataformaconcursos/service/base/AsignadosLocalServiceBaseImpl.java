package com.telefonica.plataformaconcursos.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import com.telefonica.plataformaconcursos.model.Asignados;
import com.telefonica.plataformaconcursos.service.AsignadosLocalService;
import com.telefonica.plataformaconcursos.service.persistence.AsignadosPersistence;
import com.telefonica.plataformaconcursos.service.persistence.ConcursoPersistence;
import com.telefonica.plataformaconcursos.service.persistence.EmpresaPersistence;
import com.telefonica.plataformaconcursos.service.persistence.UsuarioPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the asignados local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.telefonica.plataformaconcursos.service.impl.AsignadosLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.telefonica.plataformaconcursos.service.impl.AsignadosLocalServiceImpl
 * @see com.telefonica.plataformaconcursos.service.AsignadosLocalServiceUtil
 * @generated
 */
public abstract class AsignadosLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements AsignadosLocalService, IdentifiableBean {
    @BeanReference(type = com.telefonica.plataformaconcursos.service.AsignadosLocalService.class)
    protected com.telefonica.plataformaconcursos.service.AsignadosLocalService asignadosLocalService;
    @BeanReference(type = com.telefonica.plataformaconcursos.service.AsignadosService.class)
    protected com.telefonica.plataformaconcursos.service.AsignadosService asignadosService;
    @BeanReference(type = AsignadosPersistence.class)
    protected AsignadosPersistence asignadosPersistence;
    @BeanReference(type = com.telefonica.plataformaconcursos.service.ConcursoLocalService.class)
    protected com.telefonica.plataformaconcursos.service.ConcursoLocalService concursoLocalService;
    @BeanReference(type = com.telefonica.plataformaconcursos.service.ConcursoService.class)
    protected com.telefonica.plataformaconcursos.service.ConcursoService concursoService;
    @BeanReference(type = ConcursoPersistence.class)
    protected ConcursoPersistence concursoPersistence;
    @BeanReference(type = com.telefonica.plataformaconcursos.service.EmpresaLocalService.class)
    protected com.telefonica.plataformaconcursos.service.EmpresaLocalService empresaLocalService;
    @BeanReference(type = com.telefonica.plataformaconcursos.service.EmpresaService.class)
    protected com.telefonica.plataformaconcursos.service.EmpresaService empresaService;
    @BeanReference(type = EmpresaPersistence.class)
    protected EmpresaPersistence empresaPersistence;
    @BeanReference(type = com.telefonica.plataformaconcursos.service.UsuarioLocalService.class)
    protected com.telefonica.plataformaconcursos.service.UsuarioLocalService usuarioLocalService;
    @BeanReference(type = com.telefonica.plataformaconcursos.service.UsuarioService.class)
    protected com.telefonica.plataformaconcursos.service.UsuarioService usuarioService;
    @BeanReference(type = UsuarioPersistence.class)
    protected UsuarioPersistence usuarioPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private AsignadosLocalServiceClpInvoker _clpInvoker = new AsignadosLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.telefonica.plataformaconcursos.service.AsignadosLocalServiceUtil} to access the asignados local service.
     */

    /**
     * Adds the asignados to the database. Also notifies the appropriate model listeners.
     *
     * @param asignados the asignados
     * @return the asignados that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Asignados addAsignados(Asignados asignados)
        throws SystemException {
        asignados.setNew(true);

        return asignadosPersistence.update(asignados);
    }

    /**
     * Creates a new asignados with the primary key. Does not add the asignados to the database.
     *
     * @param asignadosId the primary key for the new asignados
     * @return the new asignados
     */
    @Override
    public Asignados createAsignados(String asignadosId) {
        return asignadosPersistence.create(asignadosId);
    }

    /**
     * Deletes the asignados with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param asignadosId the primary key of the asignados
     * @return the asignados that was removed
     * @throws PortalException if a asignados with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Asignados deleteAsignados(String asignadosId)
        throws PortalException, SystemException {
        return asignadosPersistence.remove(asignadosId);
    }

    /**
     * Deletes the asignados from the database. Also notifies the appropriate model listeners.
     *
     * @param asignados the asignados
     * @return the asignados that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Asignados deleteAsignados(Asignados asignados)
        throws SystemException {
        return asignadosPersistence.remove(asignados);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Asignados.class,
            clazz.getClassLoader());
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
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return asignadosPersistence.findWithDynamicQuery(dynamicQuery);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return asignadosPersistence.findWithDynamicQuery(dynamicQuery, start,
            end);
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
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return asignadosPersistence.findWithDynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return asignadosPersistence.countWithDynamicQuery(dynamicQuery);
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
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return asignadosPersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public Asignados fetchAsignados(String asignadosId)
        throws SystemException {
        return asignadosPersistence.fetchByPrimaryKey(asignadosId);
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
    public Asignados getAsignados(String asignadosId)
        throws PortalException, SystemException {
        return asignadosPersistence.findByPrimaryKey(asignadosId);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return asignadosPersistence.findByPrimaryKey(primaryKeyObj);
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
    public List<Asignados> getAsignadoses(int start, int end)
        throws SystemException {
        return asignadosPersistence.findAll(start, end);
    }

    /**
     * Returns the number of asignadoses.
     *
     * @return the number of asignadoses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getAsignadosesCount() throws SystemException {
        return asignadosPersistence.countAll();
    }

    /**
     * Updates the asignados in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param asignados the asignados
     * @return the asignados that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Asignados updateAsignados(Asignados asignados)
        throws SystemException {
        return asignadosPersistence.update(asignados);
    }

    /**
     * Returns the asignados local service.
     *
     * @return the asignados local service
     */
    public com.telefonica.plataformaconcursos.service.AsignadosLocalService getAsignadosLocalService() {
        return asignadosLocalService;
    }

    /**
     * Sets the asignados local service.
     *
     * @param asignadosLocalService the asignados local service
     */
    public void setAsignadosLocalService(
        com.telefonica.plataformaconcursos.service.AsignadosLocalService asignadosLocalService) {
        this.asignadosLocalService = asignadosLocalService;
    }

    /**
     * Returns the asignados remote service.
     *
     * @return the asignados remote service
     */
    public com.telefonica.plataformaconcursos.service.AsignadosService getAsignadosService() {
        return asignadosService;
    }

    /**
     * Sets the asignados remote service.
     *
     * @param asignadosService the asignados remote service
     */
    public void setAsignadosService(
        com.telefonica.plataformaconcursos.service.AsignadosService asignadosService) {
        this.asignadosService = asignadosService;
    }

    /**
     * Returns the asignados persistence.
     *
     * @return the asignados persistence
     */
    public AsignadosPersistence getAsignadosPersistence() {
        return asignadosPersistence;
    }

    /**
     * Sets the asignados persistence.
     *
     * @param asignadosPersistence the asignados persistence
     */
    public void setAsignadosPersistence(
        AsignadosPersistence asignadosPersistence) {
        this.asignadosPersistence = asignadosPersistence;
    }

    /**
     * Returns the concurso local service.
     *
     * @return the concurso local service
     */
    public com.telefonica.plataformaconcursos.service.ConcursoLocalService getConcursoLocalService() {
        return concursoLocalService;
    }

    /**
     * Sets the concurso local service.
     *
     * @param concursoLocalService the concurso local service
     */
    public void setConcursoLocalService(
        com.telefonica.plataformaconcursos.service.ConcursoLocalService concursoLocalService) {
        this.concursoLocalService = concursoLocalService;
    }

    /**
     * Returns the concurso remote service.
     *
     * @return the concurso remote service
     */
    public com.telefonica.plataformaconcursos.service.ConcursoService getConcursoService() {
        return concursoService;
    }

    /**
     * Sets the concurso remote service.
     *
     * @param concursoService the concurso remote service
     */
    public void setConcursoService(
        com.telefonica.plataformaconcursos.service.ConcursoService concursoService) {
        this.concursoService = concursoService;
    }

    /**
     * Returns the concurso persistence.
     *
     * @return the concurso persistence
     */
    public ConcursoPersistence getConcursoPersistence() {
        return concursoPersistence;
    }

    /**
     * Sets the concurso persistence.
     *
     * @param concursoPersistence the concurso persistence
     */
    public void setConcursoPersistence(ConcursoPersistence concursoPersistence) {
        this.concursoPersistence = concursoPersistence;
    }

    /**
     * Returns the empresa local service.
     *
     * @return the empresa local service
     */
    public com.telefonica.plataformaconcursos.service.EmpresaLocalService getEmpresaLocalService() {
        return empresaLocalService;
    }

    /**
     * Sets the empresa local service.
     *
     * @param empresaLocalService the empresa local service
     */
    public void setEmpresaLocalService(
        com.telefonica.plataformaconcursos.service.EmpresaLocalService empresaLocalService) {
        this.empresaLocalService = empresaLocalService;
    }

    /**
     * Returns the empresa remote service.
     *
     * @return the empresa remote service
     */
    public com.telefonica.plataformaconcursos.service.EmpresaService getEmpresaService() {
        return empresaService;
    }

    /**
     * Sets the empresa remote service.
     *
     * @param empresaService the empresa remote service
     */
    public void setEmpresaService(
        com.telefonica.plataformaconcursos.service.EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    /**
     * Returns the empresa persistence.
     *
     * @return the empresa persistence
     */
    public EmpresaPersistence getEmpresaPersistence() {
        return empresaPersistence;
    }

    /**
     * Sets the empresa persistence.
     *
     * @param empresaPersistence the empresa persistence
     */
    public void setEmpresaPersistence(EmpresaPersistence empresaPersistence) {
        this.empresaPersistence = empresaPersistence;
    }

    /**
     * Returns the usuario local service.
     *
     * @return the usuario local service
     */
    public com.telefonica.plataformaconcursos.service.UsuarioLocalService getUsuarioLocalService() {
        return usuarioLocalService;
    }

    /**
     * Sets the usuario local service.
     *
     * @param usuarioLocalService the usuario local service
     */
    public void setUsuarioLocalService(
        com.telefonica.plataformaconcursos.service.UsuarioLocalService usuarioLocalService) {
        this.usuarioLocalService = usuarioLocalService;
    }

    /**
     * Returns the usuario remote service.
     *
     * @return the usuario remote service
     */
    public com.telefonica.plataformaconcursos.service.UsuarioService getUsuarioService() {
        return usuarioService;
    }

    /**
     * Sets the usuario remote service.
     *
     * @param usuarioService the usuario remote service
     */
    public void setUsuarioService(
        com.telefonica.plataformaconcursos.service.UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    /**
     * Returns the usuario persistence.
     *
     * @return the usuario persistence
     */
    public UsuarioPersistence getUsuarioPersistence() {
        return usuarioPersistence;
    }

    /**
     * Sets the usuario persistence.
     *
     * @param usuarioPersistence the usuario persistence
     */
    public void setUsuarioPersistence(UsuarioPersistence usuarioPersistence) {
        this.usuarioPersistence = usuarioPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("com.telefonica.plataformaconcursos.model.Asignados",
            asignadosLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "com.telefonica.plataformaconcursos.model.Asignados");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Asignados.class;
    }

    protected String getModelClassName() {
        return Asignados.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = asignadosPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
