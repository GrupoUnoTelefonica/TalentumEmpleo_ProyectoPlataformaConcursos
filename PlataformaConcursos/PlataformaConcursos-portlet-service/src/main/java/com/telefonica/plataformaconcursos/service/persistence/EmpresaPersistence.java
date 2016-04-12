package com.telefonica.plataformaconcursos.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.telefonica.plataformaconcursos.model.Empresa;

/**
 * The persistence interface for the empresa service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmpresaPersistenceImpl
 * @see EmpresaUtil
 * @generated
 */
public interface EmpresaPersistence extends BasePersistence<Empresa> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link EmpresaUtil} to access the empresa persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the empresa in the entity cache if it is enabled.
    *
    * @param empresa the empresa
    */
    public void cacheResult(
        com.telefonica.plataformaconcursos.model.Empresa empresa);

    /**
    * Caches the empresas in the entity cache if it is enabled.
    *
    * @param empresas the empresas
    */
    public void cacheResult(
        java.util.List<com.telefonica.plataformaconcursos.model.Empresa> empresas);

    /**
    * Creates a new empresa with the primary key. Does not add the empresa to the database.
    *
    * @param empresaId the primary key for the new empresa
    * @return the new empresa
    */
    public com.telefonica.plataformaconcursos.model.Empresa create(
        long empresaId);

    /**
    * Removes the empresa with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param empresaId the primary key of the empresa
    * @return the empresa that was removed
    * @throws com.telefonica.plataformaconcursos.NoSuchEmpresaException if a empresa with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Empresa remove(
        long empresaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchEmpresaException;

    public com.telefonica.plataformaconcursos.model.Empresa updateImpl(
        com.telefonica.plataformaconcursos.model.Empresa empresa)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the empresa with the primary key or throws a {@link com.telefonica.plataformaconcursos.NoSuchEmpresaException} if it could not be found.
    *
    * @param empresaId the primary key of the empresa
    * @return the empresa
    * @throws com.telefonica.plataformaconcursos.NoSuchEmpresaException if a empresa with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Empresa findByPrimaryKey(
        long empresaId)
        throws com.liferay.portal.kernel.exception.SystemException,
            com.telefonica.plataformaconcursos.NoSuchEmpresaException;

    /**
    * Returns the empresa with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param empresaId the primary key of the empresa
    * @return the empresa, or <code>null</code> if a empresa with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.telefonica.plataformaconcursos.model.Empresa fetchByPrimaryKey(
        long empresaId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the empresas.
    *
    * @return the empresas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.telefonica.plataformaconcursos.model.Empresa> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.plataformaconcursos.model.Empresa> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<com.telefonica.plataformaconcursos.model.Empresa> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the empresas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of empresas.
    *
    * @return the number of empresas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
