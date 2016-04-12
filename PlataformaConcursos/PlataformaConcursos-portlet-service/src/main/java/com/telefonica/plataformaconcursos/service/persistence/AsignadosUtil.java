package com.telefonica.plataformaconcursos.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.telefonica.plataformaconcursos.model.Asignados;

import java.util.List;

/**
 * The persistence utility for the asignados service. This utility wraps {@link AsignadosPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AsignadosPersistence
 * @see AsignadosPersistenceImpl
 * @generated
 */
public class AsignadosUtil {
    private static AsignadosPersistence _persistence;

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
    public static void clearCache(Asignados asignados) {
        getPersistence().clearCache(asignados);
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
    public static List<Asignados> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Asignados> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Asignados> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Asignados update(Asignados asignados)
        throws SystemException {
        return getPersistence().update(asignados);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Asignados update(Asignados asignados,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(asignados, serviceContext);
    }

    /**
    * Returns all the asignadoses where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @return the matching asignadoses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findByUsuarioId(
        long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUsuarioId(usuarioId);
    }

    /**
    * Returns a range of all the asignadoses where usuarioId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.plataformaconcursos.model.impl.AsignadosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param usuarioId the usuario ID
    * @param start the lower bound of the range of asignadoses
    * @param end the upper bound of the range of asignadoses (not inclusive)
    * @return the range of matching asignadoses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findByUsuarioId(
        long usuarioId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByUsuarioId(usuarioId, start, end);
    }

    /**
    * Returns an ordered range of all the asignadoses where usuarioId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.plataformaconcursos.model.impl.AsignadosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param usuarioId the usuario ID
    * @param start the lower bound of the range of asignadoses
    * @param end the upper bound of the range of asignadoses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching asignadoses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findByUsuarioId(
        long usuarioId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByUsuarioId(usuarioId, start, end, orderByComparator);
    }

    /**
    * Returns the first asignados in the ordered set where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching asignados
    * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a matching asignados could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Asignados findByUsuarioId_First(
        long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchAsignadosException {
        return getPersistence()
                   .findByUsuarioId_First(usuarioId, orderByComparator);
    }

    /**
    * Returns the first asignados in the ordered set where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching asignados, or <code>null</code> if a matching asignados could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Asignados fetchByUsuarioId_First(
        long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUsuarioId_First(usuarioId, orderByComparator);
    }

    /**
    * Returns the last asignados in the ordered set where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching asignados
    * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a matching asignados could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Asignados findByUsuarioId_Last(
        long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchAsignadosException {
        return getPersistence()
                   .findByUsuarioId_Last(usuarioId, orderByComparator);
    }

    /**
    * Returns the last asignados in the ordered set where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching asignados, or <code>null</code> if a matching asignados could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Asignados fetchByUsuarioId_Last(
        long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByUsuarioId_Last(usuarioId, orderByComparator);
    }

    /**
    * Returns the asignadoses before and after the current asignados in the ordered set where usuarioId = &#63;.
    *
    * @param asignadosId the primary key of the current asignados
    * @param usuarioId the usuario ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next asignados
    * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a asignados with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Asignados[] findByUsuarioId_PrevAndNext(
        java.lang.String asignadosId, long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchAsignadosException {
        return getPersistence()
                   .findByUsuarioId_PrevAndNext(asignadosId, usuarioId,
            orderByComparator);
    }

    /**
    * Removes all the asignadoses where usuarioId = &#63; from the database.
    *
    * @param usuarioId the usuario ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByUsuarioId(long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByUsuarioId(usuarioId);
    }

    /**
    * Returns the number of asignadoses where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @return the number of matching asignadoses
    * @throws SystemException if a system exception occurred
    */
    public static int countByUsuarioId(long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByUsuarioId(usuarioId);
    }

    /**
    * Returns all the asignadoses where concursoId = &#63;.
    *
    * @param concursoId the concurso ID
    * @return the matching asignadoses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findByConcursoId(
        long concursoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByConcursoId(concursoId);
    }

    /**
    * Returns a range of all the asignadoses where concursoId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.plataformaconcursos.model.impl.AsignadosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param concursoId the concurso ID
    * @param start the lower bound of the range of asignadoses
    * @param end the upper bound of the range of asignadoses (not inclusive)
    * @return the range of matching asignadoses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findByConcursoId(
        long concursoId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByConcursoId(concursoId, start, end);
    }

    /**
    * Returns an ordered range of all the asignadoses where concursoId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.plataformaconcursos.model.impl.AsignadosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param concursoId the concurso ID
    * @param start the lower bound of the range of asignadoses
    * @param end the upper bound of the range of asignadoses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching asignadoses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findByConcursoId(
        long concursoId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByConcursoId(concursoId, start, end, orderByComparator);
    }

    /**
    * Returns the first asignados in the ordered set where concursoId = &#63;.
    *
    * @param concursoId the concurso ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching asignados
    * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a matching asignados could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Asignados findByConcursoId_First(
        long concursoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchAsignadosException {
        return getPersistence()
                   .findByConcursoId_First(concursoId, orderByComparator);
    }

    /**
    * Returns the first asignados in the ordered set where concursoId = &#63;.
    *
    * @param concursoId the concurso ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching asignados, or <code>null</code> if a matching asignados could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Asignados fetchByConcursoId_First(
        long concursoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByConcursoId_First(concursoId, orderByComparator);
    }

    /**
    * Returns the last asignados in the ordered set where concursoId = &#63;.
    *
    * @param concursoId the concurso ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching asignados
    * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a matching asignados could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Asignados findByConcursoId_Last(
        long concursoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchAsignadosException {
        return getPersistence()
                   .findByConcursoId_Last(concursoId, orderByComparator);
    }

    /**
    * Returns the last asignados in the ordered set where concursoId = &#63;.
    *
    * @param concursoId the concurso ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching asignados, or <code>null</code> if a matching asignados could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Asignados fetchByConcursoId_Last(
        long concursoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByConcursoId_Last(concursoId, orderByComparator);
    }

    /**
    * Returns the asignadoses before and after the current asignados in the ordered set where concursoId = &#63;.
    *
    * @param asignadosId the primary key of the current asignados
    * @param concursoId the concurso ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next asignados
    * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a asignados with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Asignados[] findByConcursoId_PrevAndNext(
        java.lang.String asignadosId, long concursoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchAsignadosException {
        return getPersistence()
                   .findByConcursoId_PrevAndNext(asignadosId, concursoId,
            orderByComparator);
    }

    /**
    * Removes all the asignadoses where concursoId = &#63; from the database.
    *
    * @param concursoId the concurso ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByConcursoId(long concursoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByConcursoId(concursoId);
    }

    /**
    * Returns the number of asignadoses where concursoId = &#63;.
    *
    * @param concursoId the concurso ID
    * @return the number of matching asignadoses
    * @throws SystemException if a system exception occurred
    */
    public static int countByConcursoId(long concursoId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByConcursoId(concursoId);
    }

    /**
    * Caches the asignados in the entity cache if it is enabled.
    *
    * @param asignados the asignados
    */
    public static void cacheResult(
        com.telefonica.plataformaconcursos.model.Asignados asignados) {
        getPersistence().cacheResult(asignados);
    }

    /**
    * Caches the asignadoses in the entity cache if it is enabled.
    *
    * @param asignadoses the asignadoses
    */
    public static void cacheResult(
        java.util.List<com.telefonica.plataformaconcursos.model.Asignados> asignadoses) {
        getPersistence().cacheResult(asignadoses);
    }

    /**
    * Creates a new asignados with the primary key. Does not add the asignados to the database.
    *
    * @param asignadosId the primary key for the new asignados
    * @return the new asignados
    */
    public static com.telefonica.plataformaconcursos.model.Asignados create(
        java.lang.String asignadosId) {
        return getPersistence().create(asignadosId);
    }

    /**
    * Removes the asignados with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param asignadosId the primary key of the asignados
    * @return the asignados that was removed
    * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a asignados with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Asignados remove(
        java.lang.String asignadosId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchAsignadosException {
        return getPersistence().remove(asignadosId);
    }

    public static com.telefonica.plataformaconcursos.model.Asignados updateImpl(
        com.telefonica.plataformaconcursos.model.Asignados asignados)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(asignados);
    }

    /**
    * Returns the asignados with the primary key or throws a {@link com.telefonica.plataformaconcursos.NoSuchAsignadosException} if it could not be found.
    *
    * @param asignadosId the primary key of the asignados
    * @return the asignados
    * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a asignados with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Asignados findByPrimaryKey(
        java.lang.String asignadosId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchAsignadosException {
        return getPersistence().findByPrimaryKey(asignadosId);
    }

    /**
    * Returns the asignados with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param asignadosId the primary key of the asignados
    * @return the asignados, or <code>null</code> if a asignados with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.telefonica.plataformaconcursos.model.Asignados fetchByPrimaryKey(
        java.lang.String asignadosId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(asignadosId);
    }

    /**
    * Returns all the asignadoses.
    *
    * @return the asignadoses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the asignadoses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.telefonica.plataformaconcursos.model.impl.AsignadosModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of asignadoses
    * @param end the upper bound of the range of asignadoses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of asignadoses
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the asignadoses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of asignadoses.
    *
    * @return the number of asignadoses
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static AsignadosPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (AsignadosPersistence) PortletBeanLocatorUtil.locate(com.telefonica.plataformaconcursos.service.ClpSerializer.getServletContextName(),
                    AsignadosPersistence.class.getName());

            ReferenceRegistry.registerReference(AsignadosUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(AsignadosPersistence persistence) {
    }
}
