package com.telefonica.plataformaconcursos.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.telefonica.plataformaconcursos.model.Concurso;

/**
 * The persistence interface for the concurso service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConcursoPersistenceImpl
 * @see ConcursoUtil
 * @generated
 */
public interface ConcursoPersistence extends BasePersistence<Concurso> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link ConcursoUtil} to access the concurso persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the concursos where empresaId = &#63;.
    *
    * @param empresaId the empresa ID
    * @return the matching concursos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.telefonica.plataformaconcursos.model.Concurso> findByEmpresaId(
        long empresaId)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.plataformaconcursos.model.Concurso> findByEmpresaId(
        long empresaId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.plataformaconcursos.model.Concurso> findByEmpresaId(
        long empresaId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first concurso in the ordered set where empresaId = &#63;.
    *
    * @param empresaId the empresa ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching concurso
    * @throws com.telefonica.plataformaconcursos.NoSuchConcursoException if a matching concurso could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Concurso findByEmpresaId_First(
        long empresaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchConcursoException;

    /**
    * Returns the first concurso in the ordered set where empresaId = &#63;.
    *
    * @param empresaId the empresa ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching concurso, or <code>null</code> if a matching concurso could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Concurso fetchByEmpresaId_First(
        long empresaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last concurso in the ordered set where empresaId = &#63;.
    *
    * @param empresaId the empresa ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching concurso
    * @throws com.telefonica.plataformaconcursos.NoSuchConcursoException if a matching concurso could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Concurso findByEmpresaId_Last(
        long empresaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchConcursoException;

    /**
    * Returns the last concurso in the ordered set where empresaId = &#63;.
    *
    * @param empresaId the empresa ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching concurso, or <code>null</code> if a matching concurso could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Concurso fetchByEmpresaId_Last(
        long empresaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public com.telefonica.plataformaconcursos.model.Concurso[] findByEmpresaId_PrevAndNext(
        long concursoId, long empresaId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchConcursoException;

    /**
    * Removes all the concursos where empresaId = &#63; from the database.
    *
    * @param empresaId the empresa ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByEmpresaId(long empresaId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of concursos where empresaId = &#63;.
    *
    * @param empresaId the empresa ID
    * @return the number of matching concursos
    * @throws SystemException if a system exception occurred
    */
    public int countByEmpresaId(long empresaId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the concurso in the entity cache if it is enabled.
    *
    * @param concurso the concurso
    */
    public void cacheResult(
        com.telefonica.plataformaconcursos.model.Concurso concurso);

    /**
    * Caches the concursos in the entity cache if it is enabled.
    *
    * @param concursos the concursos
    */
    public void cacheResult(
        java.util.List<com.telefonica.plataformaconcursos.model.Concurso> concursos);

    /**
    * Creates a new concurso with the primary key. Does not add the concurso to the database.
    *
    * @param concursoId the primary key for the new concurso
    * @return the new concurso
    */
    public com.telefonica.plataformaconcursos.model.Concurso create(
        long concursoId);

    /**
    * Removes the concurso with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param concursoId the primary key of the concurso
    * @return the concurso that was removed
    * @throws com.telefonica.plataformaconcursos.NoSuchConcursoException if a concurso with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Concurso remove(
        long concursoId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchConcursoException;

    public com.telefonica.plataformaconcursos.model.Concurso updateImpl(
        com.telefonica.plataformaconcursos.model.Concurso concurso)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the concurso with the primary key or throws a {@link com.telefonica.plataformaconcursos.NoSuchConcursoException} if it could not be found.
    *
    * @param concursoId the primary key of the concurso
    * @return the concurso
    * @throws com.telefonica.plataformaconcursos.NoSuchConcursoException if a concurso with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Concurso findByPrimaryKey(
        long concursoId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchConcursoException;

    /**
    * Returns the concurso with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param concursoId the primary key of the concurso
    * @return the concurso, or <code>null</code> if a concurso with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Concurso fetchByPrimaryKey(
        long concursoId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the concursos.
    *
    * @return the concursos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.telefonica.plataformaconcursos.model.Concurso> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.plataformaconcursos.model.Concurso> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.plataformaconcursos.model.Concurso> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the concursos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of concursos.
    *
    * @return the number of concursos
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
