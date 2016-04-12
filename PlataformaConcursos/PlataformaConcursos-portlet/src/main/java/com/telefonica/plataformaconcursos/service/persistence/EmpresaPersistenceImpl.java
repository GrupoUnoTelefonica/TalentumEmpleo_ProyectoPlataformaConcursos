package com.telefonica.plataformaconcursos.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.telefonica.plataformaconcursos.NoSuchEmpresaException;
import com.telefonica.plataformaconcursos.model.Empresa;
import com.telefonica.plataformaconcursos.model.impl.EmpresaImpl;
import com.telefonica.plataformaconcursos.model.impl.EmpresaModelImpl;
import com.telefonica.plataformaconcursos.service.persistence.EmpresaPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the empresa service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmpresaPersistence
 * @see EmpresaUtil
 * @generated
 */
public class EmpresaPersistenceImpl extends BasePersistenceImpl<Empresa>
    implements EmpresaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EmpresaUtil} to access the empresa persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EmpresaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
            EmpresaModelImpl.FINDER_CACHE_ENABLED, EmpresaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
            EmpresaModelImpl.FINDER_CACHE_ENABLED, EmpresaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
            EmpresaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_EMPRESA = "SELECT empresa FROM Empresa empresa";
    private static final String _SQL_COUNT_EMPRESA = "SELECT COUNT(empresa) FROM Empresa empresa";
    private static final String _ORDER_BY_ENTITY_ALIAS = "empresa.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Empresa exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EmpresaPersistenceImpl.class);
    private static Empresa _nullEmpresa = new EmpresaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Empresa> toCacheModel() {
                return _nullEmpresaCacheModel;
            }
        };

    private static CacheModel<Empresa> _nullEmpresaCacheModel = new CacheModel<Empresa>() {
            @Override
            public Empresa toEntityModel() {
                return _nullEmpresa;
            }
        };

    public EmpresaPersistenceImpl() {
        setModelClass(Empresa.class);
    }

    /**
     * Caches the empresa in the entity cache if it is enabled.
     *
     * @param empresa the empresa
     */
    @Override
    public void cacheResult(Empresa empresa) {
        EntityCacheUtil.putResult(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
            EmpresaImpl.class, empresa.getPrimaryKey(), empresa);

        empresa.resetOriginalValues();
    }

    /**
     * Caches the empresas in the entity cache if it is enabled.
     *
     * @param empresas the empresas
     */
    @Override
    public void cacheResult(List<Empresa> empresas) {
        for (Empresa empresa : empresas) {
            if (EntityCacheUtil.getResult(
                        EmpresaModelImpl.ENTITY_CACHE_ENABLED,
                        EmpresaImpl.class, empresa.getPrimaryKey()) == null) {
                cacheResult(empresa);
            } else {
                empresa.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all empresas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EmpresaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EmpresaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the empresa.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Empresa empresa) {
        EntityCacheUtil.removeResult(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
            EmpresaImpl.class, empresa.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Empresa> empresas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Empresa empresa : empresas) {
            EntityCacheUtil.removeResult(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
                EmpresaImpl.class, empresa.getPrimaryKey());
        }
    }

    /**
     * Creates a new empresa with the primary key. Does not add the empresa to the database.
     *
     * @param empresaId the primary key for the new empresa
     * @return the new empresa
     */
    @Override
    public Empresa create(long empresaId) {
        Empresa empresa = new EmpresaImpl();

        empresa.setNew(true);
        empresa.setPrimaryKey(empresaId);

        return empresa;
    }

    /**
     * Removes the empresa with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param empresaId the primary key of the empresa
     * @return the empresa that was removed
     * @throws com.telefonica.plataformaconcursos.NoSuchEmpresaException if a empresa with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Empresa remove(long empresaId)
        throws NoSuchEmpresaException, SystemException {
        return remove((Serializable) empresaId);
    }

    /**
     * Removes the empresa with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the empresa
     * @return the empresa that was removed
     * @throws com.telefonica.plataformaconcursos.NoSuchEmpresaException if a empresa with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Empresa remove(Serializable primaryKey)
        throws NoSuchEmpresaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Empresa empresa = (Empresa) session.get(EmpresaImpl.class,
                    primaryKey);

            if (empresa == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEmpresaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(empresa);
        } catch (NoSuchEmpresaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Empresa removeImpl(Empresa empresa) throws SystemException {
        empresa = toUnwrappedModel(empresa);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(empresa)) {
                empresa = (Empresa) session.get(EmpresaImpl.class,
                        empresa.getPrimaryKeyObj());
            }

            if (empresa != null) {
                session.delete(empresa);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (empresa != null) {
            clearCache(empresa);
        }

        return empresa;
    }

    @Override
    public Empresa updateImpl(
        com.telefonica.plataformaconcursos.model.Empresa empresa)
        throws SystemException {
        empresa = toUnwrappedModel(empresa);

        boolean isNew = empresa.isNew();

        Session session = null;

        try {
            session = openSession();

            if (empresa.isNew()) {
                session.save(empresa);

                empresa.setNew(false);
            } else {
                session.merge(empresa);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
            EmpresaImpl.class, empresa.getPrimaryKey(), empresa);

        return empresa;
    }

    protected Empresa toUnwrappedModel(Empresa empresa) {
        if (empresa instanceof EmpresaImpl) {
            return empresa;
        }

        EmpresaImpl empresaImpl = new EmpresaImpl();

        empresaImpl.setNew(empresa.isNew());
        empresaImpl.setPrimaryKey(empresa.getPrimaryKey());

        empresaImpl.setEmpresaId(empresa.getEmpresaId());
        empresaImpl.setGroupId(empresa.getGroupId());
        empresaImpl.setCompanyId(empresa.getCompanyId());
        empresaImpl.setUserId(empresa.getUserId());
        empresaImpl.setNombre(empresa.getNombre());
        empresaImpl.setCreateDate(empresa.getCreateDate());
        empresaImpl.setModifiedDate(empresa.getModifiedDate());
        empresaImpl.setSectorEmpresa(empresa.getSectorEmpresa());
        empresaImpl.setCif(empresa.getCif());
        empresaImpl.setPais(empresa.getPais());
        empresaImpl.setPassword1(empresa.getPassword1());
        empresaImpl.setPassword2(empresa.getPassword2());
        empresaImpl.setCorreoElectronico(empresa.getCorreoElectronico());

        return empresaImpl;
    }

    /**
     * Returns the empresa with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the empresa
     * @return the empresa
     * @throws com.telefonica.plataformaconcursos.NoSuchEmpresaException if a empresa with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Empresa findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEmpresaException, SystemException {
        Empresa empresa = fetchByPrimaryKey(primaryKey);

        if (empresa == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEmpresaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return empresa;
    }

    /**
     * Returns the empresa with the primary key or throws a {@link com.telefonica.plataformaconcursos.NoSuchEmpresaException} if it could not be found.
     *
     * @param empresaId the primary key of the empresa
     * @return the empresa
     * @throws com.telefonica.plataformaconcursos.NoSuchEmpresaException if a empresa with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Empresa findByPrimaryKey(long empresaId)
        throws NoSuchEmpresaException, SystemException {
        return findByPrimaryKey((Serializable) empresaId);
    }

    /**
     * Returns the empresa with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the empresa
     * @return the empresa, or <code>null</code> if a empresa with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Empresa fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Empresa empresa = (Empresa) EntityCacheUtil.getResult(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
                EmpresaImpl.class, primaryKey);

        if (empresa == _nullEmpresa) {
            return null;
        }

        if (empresa == null) {
            Session session = null;

            try {
                session = openSession();

                empresa = (Empresa) session.get(EmpresaImpl.class, primaryKey);

                if (empresa != null) {
                    cacheResult(empresa);
                } else {
                    EntityCacheUtil.putResult(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
                        EmpresaImpl.class, primaryKey, _nullEmpresa);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EmpresaModelImpl.ENTITY_CACHE_ENABLED,
                    EmpresaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return empresa;
    }

    /**
     * Returns the empresa with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param empresaId the primary key of the empresa
     * @return the empresa, or <code>null</code> if a empresa with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Empresa fetchByPrimaryKey(long empresaId) throws SystemException {
        return fetchByPrimaryKey((Serializable) empresaId);
    }

    /**
     * Returns all the empresas.
     *
     * @return the empresas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Empresa> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Empresa> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Empresa> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Empresa> list = (List<Empresa>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_EMPRESA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_EMPRESA;

                if (pagination) {
                    sql = sql.concat(EmpresaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Empresa>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Empresa>(list);
                } else {
                    list = (List<Empresa>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the empresas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Empresa empresa : findAll()) {
            remove(empresa);
        }
    }

    /**
     * Returns the number of empresas.
     *
     * @return the number of empresas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_EMPRESA);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the empresa persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.telefonica.plataformaconcursos.model.Empresa")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Empresa>> listenersList = new ArrayList<ModelListener<Empresa>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Empresa>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EmpresaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
