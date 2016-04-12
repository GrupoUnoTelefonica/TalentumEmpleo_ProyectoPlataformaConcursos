package com.telefonica.plataformaconcursos.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.telefonica.plataformaconcursos.model.Empresa;

import java.util.List;

/**
 * The persistence utility for the empresa service. This utility wraps {@link EmpresaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmpresaPersistence
 * @see EmpresaPersistenceImpl
 * @generated
 */
public class EmpresaUtil {
    private static EmpresaPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Empresa empresa) {
        getPersistence().clearCache(empresa);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Empresa> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Empresa> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Empresa> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Empresa update(Empresa empresa) throws SystemException {
        return getPersistence().update(empresa);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Empresa update(Empresa empresa, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(empresa, serviceContext);
    }

    /**
    * Caches the empresa in the entity cache if it is enabled.
    *
    * @param empresa the empresa
    */
    public static void cacheResult(
        com.telefonica.plataformaconcursos.model.Empresa empresa) {
        getPersistence().cacheResult(empresa);
    }

    /**
    * Caches the empresas in the entity cache if it is enabled.
    *
    * @param empresas the empresas
    */
    public static void cacheResult(
        java.util.List<com.telefonica.plataformaconcursos.model.Empresa> empresas) {
        getPersistence().cacheResult(empresas);
    }

    /**
    * Creates a new empresa with the primary key. Does not add the empresa to the database.
    *
    * @param empresaId the primary key for the new empresa
    * @return the new empresa
    */
    public static com.telefonica.plataformaconcursos.model.Empresa create(
        long empresaId) {
        return getPersistence().create(empresaId);
    }

    /**
    * Removes the empresa with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param empresaId the primary key of the empresa
    * @return the empresa that was removed
    * @throws com.telefonica.plataformaconcursos.NoSuchEmpresaException if a empresa with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Empresa remove(
        long empresaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchEmpresaException {
        return getPersistence().remove(empresaId);
    }

    public static com.telefonica.plataformaconcursos.model.Empresa updateImpl(
        com.telefonica.plataformaconcursos.model.Empresa empresa)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(empresa);
    }

    /**
    * Returns the empresa with the primary key or throws a {@link com.telefonica.plataformaconcursos.NoSuchEmpresaException} if it could not be found.
    *
    * @param empresaId the primary key of the empresa
    * @return the empresa
    * @throws com.telefonica.plataformaconcursos.NoSuchEmpresaException if a empresa with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Empresa findByPrimaryKey(
        long empresaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchEmpresaException {
        return getPersistence().findByPrimaryKey(empresaId);
    }

    /**
    * Returns the empresa with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param empresaId the primary key of the empresa
    * @return the empresa, or <code>null</code> if a empresa with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Empresa fetchByPrimaryKey(
        long empresaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(empresaId);
    }

    /**
    * Returns all the empresas.
    *
    * @return the empresas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.plataformaconcursos.model.Empresa> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.telefonica.plataformaconcursos.model.Empresa> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the empresas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.plataformaconcursos.model.impl.EmpresaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of empresas
    * @param end the upper bound of the range of empresas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of empresas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.plataformaconcursos.model.Empresa> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the empresas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of empresas.
    *
    * @return the number of empresas
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EmpresaPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EmpresaPersistence) PortletBeanLocatorUtil.locate(com.telefonica.plataformaconcursos.service.ClpSerializer.getServletContextName(),
                    EmpresaPersistence.class.getName());

            ReferenceRegistry.registerReference(EmpresaUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EmpresaPersistence persistence) {
    }
}
