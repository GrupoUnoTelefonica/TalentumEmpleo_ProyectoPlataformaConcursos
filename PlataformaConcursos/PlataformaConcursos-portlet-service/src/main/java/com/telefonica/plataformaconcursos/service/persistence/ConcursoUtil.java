package com.telefonica.plataformaconcursos.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.telefonica.plataformaconcursos.model.Concurso;

import java.util.List;

/**
 * The persistence utility for the concurso service. This utility wraps {@link ConcursoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConcursoPersistence
 * @see ConcursoPersistenceImpl
 * @generated
 */
public class ConcursoUtil {
    private static ConcursoPersistence _persistence;

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
    public static void clearCache(Concurso concurso) {
        getPersistence().clearCache(concurso);
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
    public static List<Concurso> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Concurso> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Concurso> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Concurso update(Concurso concurso) throws SystemException {
        return getPersistence().update(concurso);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Concurso update(Concurso concurso,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(concurso, serviceContext);
    }

    /**
    * Returns all the concursos where empresaId = &#63;.
    *
    * @param empresaId the empresa ID
    * @return the matching concursos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.plataformaconcursos.model.Concurso> findByEmpresaId(
        long empresaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmpresaId(empresaId);
    }

    /**
    * Returns a range of all the concursos where empresaId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.plataformaconcursos.model.impl.ConcursoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param empresaId the empresa ID
    * @param start the lower bound of the range of concursos
    * @param end the upper bound of the range of concursos (not inclusive)
    * @return the range of matching concursos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.plataformaconcursos.model.Concurso> findByEmpresaId(
        long empresaId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByEmpresaId(empresaId, start, end);
    }

    /**
    * Returns an ordered range of all the concursos where empresaId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.plataformaconcursos.model.impl.ConcursoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param empresaId the empresa ID
    * @param start the lower bound of the range of concursos
    * @param end the upper bound of the range of concursos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching concursos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.plataformaconcursos.model.Concurso> findByEmpresaId(
        long empresaId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByEmpresaId(empresaId, start, end, orderByComparator);
    }

    /**
    * Returns the first concurso in the ordered set where empresaId = &#63;.
    *
    * @param empresaId the empresa ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching concurso
    * @throws com.telefonica.plataformaconcursos.NoSuchConcursoException if a matching concurso could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Concurso findByEmpresaId_First(
        long empresaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchConcursoException {
        return getPersistence()
                   .findByEmpresaId_First(empresaId, orderByComparator);
    }

    /**
    * Returns the first concurso in the ordered set where empresaId = &#63;.
    *
    * @param empresaId the empresa ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching concurso, or <code>null</code> if a matching concurso could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Concurso fetchByEmpresaId_First(
        long empresaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByEmpresaId_First(empresaId, orderByComparator);
    }

    /**
    * Returns the last concurso in the ordered set where empresaId = &#63;.
    *
    * @param empresaId the empresa ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching concurso
    * @throws com.telefonica.plataformaconcursos.NoSuchConcursoException if a matching concurso could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Concurso findByEmpresaId_Last(
        long empresaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchConcursoException {
        return getPersistence()
                   .findByEmpresaId_Last(empresaId, orderByComparator);
    }

    /**
    * Returns the last concurso in the ordered set where empresaId = &#63;.
    *
    * @param empresaId the empresa ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching concurso, or <code>null</code> if a matching concurso could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Concurso fetchByEmpresaId_Last(
        long empresaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByEmpresaId_Last(empresaId, orderByComparator);
    }

    /**
    * Returns the concursos before and after the current concurso in the ordered set where empresaId = &#63;.
    *
    * @param concursoId the primary key of the current concurso
    * @param empresaId the empresa ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next concurso
    * @throws com.telefonica.plataformaconcursos.NoSuchConcursoException if a concurso with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Concurso[] findByEmpresaId_PrevAndNext(
        long concursoId, long empresaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchConcursoException {
        return getPersistence()
                   .findByEmpresaId_PrevAndNext(concursoId, empresaId,
            orderByComparator);
    }

    /**
    * Removes all the concursos where empresaId = &#63; from the database.
    *
    * @param empresaId the empresa ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByEmpresaId(long empresaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByEmpresaId(empresaId);
    }

    /**
    * Returns the number of concursos where empresaId = &#63;.
    *
    * @param empresaId the empresa ID
    * @return the number of matching concursos
    * @throws SystemException if a system exception occurred
    */
    public static int countByEmpresaId(long empresaId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByEmpresaId(empresaId);
    }

    /**
    * Caches the concurso in the entity cache if it is enabled.
    *
    * @param concurso the concurso
    */
    public static void cacheResult(
        com.telefonica.plataformaconcursos.model.Concurso concurso) {
        getPersistence().cacheResult(concurso);
    }

    /**
    * Caches the concursos in the entity cache if it is enabled.
    *
    * @param concursos the concursos
    */
    public static void cacheResult(
        java.util.List<com.telefonica.plataformaconcursos.model.Concurso> concursos) {
        getPersistence().cacheResult(concursos);
    }

    /**
    * Creates a new concurso with the primary key. Does not add the concurso to the database.
    *
    * @param concursoId the primary key for the new concurso
    * @return the new concurso
    */
    public static com.telefonica.plataformaconcursos.model.Concurso create(
        long concursoId) {
        return getPersistence().create(concursoId);
    }

    /**
    * Removes the concurso with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param concursoId the primary key of the concurso
    * @return the concurso that was removed
    * @throws com.telefonica.plataformaconcursos.NoSuchConcursoException if a concurso with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Concurso remove(
        long concursoId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchConcursoException {
        return getPersistence().remove(concursoId);
    }

    public static com.telefonica.plataformaconcursos.model.Concurso updateImpl(
        com.telefonica.plataformaconcursos.model.Concurso concurso)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(concurso);
    }

    /**
    * Returns the concurso with the primary key or throws a {@link com.telefonica.plataformaconcursos.NoSuchConcursoException} if it could not be found.
    *
    * @param concursoId the primary key of the concurso
    * @return the concurso
    * @throws com.telefonica.plataformaconcursos.NoSuchConcursoException if a concurso with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Concurso findByPrimaryKey(
        long concursoId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchConcursoException {
        return getPersistence().findByPrimaryKey(concursoId);
    }

    /**
    * Returns the concurso with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param concursoId the primary key of the concurso
    * @return the concurso, or <code>null</code> if a concurso with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Concurso fetchByPrimaryKey(
        long concursoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(concursoId);
    }

    /**
    * Returns all the concursos.
    *
    * @return the concursos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.plataformaconcursos.model.Concurso> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.telefonica.plataformaconcursos.model.Concurso> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the concursos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.plataformaconcursos.model.impl.ConcursoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of concursos
    * @param end the upper bound of the range of concursos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of concursos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.plataformaconcursos.model.Concurso> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the concursos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of concursos.
    *
    * @return the number of concursos
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static ConcursoPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (ConcursoPersistence) PortletBeanLocatorUtil.locate(com.telefonica.plataformaconcursos.service.ClpSerializer.getServletContextName(),
                    ConcursoPersistence.class.getName());

            ReferenceRegistry.registerReference(ConcursoUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(ConcursoPersistence persistence) {
    }
}
