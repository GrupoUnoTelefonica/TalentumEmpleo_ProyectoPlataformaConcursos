package com.telefonica.plataformaconcursos.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.telefonica.plataformaconcursos.model.Asignados;

/**
 * The persistence interface for the asignados service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AsignadosPersistenceImpl
 * @see AsignadosUtil
 * @generated
 */
public interface AsignadosPersistence extends BasePersistence<Asignados> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AsignadosUtil} to access the asignados persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the asignadoses where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @return the matching asignadoses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findByUsuarioId(
        long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findByUsuarioId(
        long usuarioId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findByUsuarioId(
        long usuarioId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first asignados in the ordered set where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching asignados
    * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a matching asignados could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Asignados findByUsuarioId_First(
        long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchAsignadosException;

    /**
    * Returns the first asignados in the ordered set where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching asignados, or <code>null</code> if a matching asignados could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Asignados fetchByUsuarioId_First(
        long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last asignados in the ordered set where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching asignados
    * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a matching asignados could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Asignados findByUsuarioId_Last(
        long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchAsignadosException;

    /**
    * Returns the last asignados in the ordered set where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching asignados, or <code>null</code> if a matching asignados could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Asignados fetchByUsuarioId_Last(
        long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.telefonica.plataformaconcursos.model.Asignados[] findByUsuarioId_PrevAndNext(
        java.lang.String asignadosId, long usuarioId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchAsignadosException;

    /**
    * Removes all the asignadoses where usuarioId = &#63; from the database.
    *
    * @param usuarioId the usuario ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByUsuarioId(long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of asignadoses where usuarioId = &#63;.
    *
    * @param usuarioId the usuario ID
    * @return the number of matching asignadoses
    * @throws SystemException if a system exception occurred
    */
    public int countByUsuarioId(long usuarioId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the asignadoses where concursoId = &#63;.
    *
    * @param concursoId the concurso ID
    * @return the matching asignadoses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findByConcursoId(
        long concursoId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findByConcursoId(
        long concursoId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findByConcursoId(
        long concursoId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first asignados in the ordered set where concursoId = &#63;.
    *
    * @param concursoId the concurso ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching asignados
    * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a matching asignados could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Asignados findByConcursoId_First(
        long concursoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchAsignadosException;

    /**
    * Returns the first asignados in the ordered set where concursoId = &#63;.
    *
    * @param concursoId the concurso ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching asignados, or <code>null</code> if a matching asignados could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Asignados fetchByConcursoId_First(
        long concursoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last asignados in the ordered set where concursoId = &#63;.
    *
    * @param concursoId the concurso ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching asignados
    * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a matching asignados could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Asignados findByConcursoId_Last(
        long concursoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchAsignadosException;

    /**
    * Returns the last asignados in the ordered set where concursoId = &#63;.
    *
    * @param concursoId the concurso ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching asignados, or <code>null</code> if a matching asignados could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Asignados fetchByConcursoId_Last(
        long concursoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.telefonica.plataformaconcursos.model.Asignados[] findByConcursoId_PrevAndNext(
        java.lang.String asignadosId, long concursoId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchAsignadosException;

    /**
    * Removes all the asignadoses where concursoId = &#63; from the database.
    *
    * @param concursoId the concurso ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByConcursoId(long concursoId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of asignadoses where concursoId = &#63;.
    *
    * @param concursoId the concurso ID
    * @return the number of matching asignadoses
    * @throws SystemException if a system exception occurred
    */
    public int countByConcursoId(long concursoId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the asignados in the entity cache if it is enabled.
    *
    * @param asignados the asignados
    */
    public void cacheResult(
        com.telefonica.plataformaconcursos.model.Asignados asignados);

    /**
    * Caches the asignadoses in the entity cache if it is enabled.
    *
    * @param asignadoses the asignadoses
    */
    public void cacheResult(
        java.util.List<com.telefonica.plataformaconcursos.model.Asignados> asignadoses);

    /**
    * Creates a new asignados with the primary key. Does not add the asignados to the database.
    *
    * @param asignadosId the primary key for the new asignados
    * @return the new asignados
    */
    public com.telefonica.plataformaconcursos.model.Asignados create(
        java.lang.String asignadosId);

    /**
    * Removes the asignados with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param asignadosId the primary key of the asignados
    * @return the asignados that was removed
    * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a asignados with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Asignados remove(
        java.lang.String asignadosId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchAsignadosException;

    public com.telefonica.plataformaconcursos.model.Asignados updateImpl(
        com.telefonica.plataformaconcursos.model.Asignados asignados)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the asignados with the primary key or throws a {@link com.telefonica.plataformaconcursos.NoSuchAsignadosException} if it could not be found.
    *
    * @param asignadosId the primary key of the asignados
    * @return the asignados
    * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a asignados with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Asignados findByPrimaryKey(
        java.lang.String asignadosId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchAsignadosException;

    /**
    * Returns the asignados with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param asignadosId the primary key of the asignados
    * @return the asignados, or <code>null</code> if a asignados with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Asignados fetchByPrimaryKey(
        java.lang.String asignadosId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the asignadoses.
    *
    * @return the asignadoses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.plataformaconcursos.model.Asignados> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the asignadoses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of asignadoses.
    *
    * @return the number of asignadoses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
