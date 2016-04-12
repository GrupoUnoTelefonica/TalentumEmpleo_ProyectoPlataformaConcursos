package com.telefonica.plataformaconcursos.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.telefonica.plataformaconcursos.NoSuchConcursoException;
import com.telefonica.plataformaconcursos.model.Concurso;
import com.telefonica.plataformaconcursos.model.impl.ConcursoImpl;
import com.telefonica.plataformaconcursos.model.impl.ConcursoModelImpl;
import com.telefonica.plataformaconcursos.service.persistence.ConcursoPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the concurso service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConcursoPersistence
 * @see ConcursoUtil
 * @generated
 */
public class ConcursoPersistenceImpl extends BasePersistenceImpl<Concurso>
    implements ConcursoPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link ConcursoUtil} to access the concurso persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = ConcursoImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ConcursoModelImpl.ENTITY_CACHE_ENABLED,
            ConcursoModelImpl.FINDER_CACHE_ENABLED, ConcursoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ConcursoModelImpl.ENTITY_CACHE_ENABLED,
            ConcursoModelImpl.FINDER_CACHE_ENABLED, ConcursoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ConcursoModelImpl.ENTITY_CACHE_ENABLED,
            ConcursoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPRESAID =
        new FinderPath(ConcursoModelImpl.ENTITY_CACHE_ENABLED,
            ConcursoModelImpl.FINDER_CACHE_ENABLED, ConcursoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByEmpresaId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPRESAID =
        new FinderPath(ConcursoModelImpl.ENTITY_CACHE_ENABLED,
            ConcursoModelImpl.FINDER_CACHE_ENABLED, ConcursoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByEmpresaId",
            new String[] { Long.class.getName() },
            ConcursoModelImpl.EMPRESAID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_EMPRESAID = new FinderPath(ConcursoModelImpl.ENTITY_CACHE_ENABLED,
            ConcursoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByEmpresaId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_EMPRESAID_EMPRESAID_2 = "concurso.empresaId = ?";
    private static final String _SQL_SELECT_CONCURSO = "SELECT concurso FROM Concurso concurso";
    private static final String _SQL_SELECT_CONCURSO_WHERE = "SELECT concurso FROM Concurso concurso WHERE ";
    private static final String _SQL_COUNT_CONCURSO = "SELECT COUNT(concurso) FROM Concurso concurso";
    private static final String _SQL_COUNT_CONCURSO_WHERE = "SELECT COUNT(concurso) FROM Concurso concurso WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "concurso.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Concurso exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Concurso exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(ConcursoPersistenceImpl.class);
    private static Concurso _nullConcurso = new ConcursoImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Concurso> toCacheModel() {
                return _nullConcursoCacheModel;
            }
        };

    private static CacheModel<Concurso> _nullConcursoCacheModel = new CacheModel<Concurso>() {
            @Override
            public Concurso toEntityModel() {
                return _nullConcurso;
            }
        };

    public ConcursoPersistenceImpl() {
        setModelClass(Concurso.class);
    }

    /**
     * Returns all the concursos where empresaId = &#63;.
     *
     * @param empresaId the empresa ID
     * @return the matching concursos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Concurso> findByEmpresaId(long empresaId)
        throws SystemException {
        return findByEmpresaId(empresaId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
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
    @Override
    public List<Concurso> findByEmpresaId(long empresaId, int start, int end)
        throws SystemException {
        return findByEmpresaId(empresaId, start, end, null);
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
    @Override
    public List<Concurso> findByEmpresaId(long empresaId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPRESAID;
            finderArgs = new Object[] { empresaId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_EMPRESAID;
            finderArgs = new Object[] { empresaId, start, end, orderByComparator };
        }

        List<Concurso> list = (List<Concurso>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Concurso concurso : list) {
                if ((empresaId != concurso.getEmpresaId())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_CONCURSO_WHERE);

            query.append(_FINDER_COLUMN_EMPRESAID_EMPRESAID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(ConcursoModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(empresaId);

                if (!pagination) {
                    list = (List<Concurso>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Concurso>(list);
                } else {
                    list = (List<Concurso>) QueryUtil.list(q, getDialect(),
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
     * Returns the first concurso in the ordered set where empresaId = &#63;.
     *
     * @param empresaId the empresa ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching concurso
     * @throws com.telefonica.plataformaconcursos.NoSuchConcursoException if a matching concurso could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Concurso findByEmpresaId_First(long empresaId,
        OrderByComparator orderByComparator)
        throws NoSuchConcursoException, SystemException {
        Concurso concurso = fetchByEmpresaId_First(empresaId, orderByComparator);

        if (concurso != null) {
            return concurso;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("empresaId=");
        msg.append(empresaId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchConcursoException(msg.toString());
    }

    /**
     * Returns the first concurso in the ordered set where empresaId = &#63;.
     *
     * @param empresaId the empresa ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching concurso, or <code>null</code> if a matching concurso could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Concurso fetchByEmpresaId_First(long empresaId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Concurso> list = findByEmpresaId(empresaId, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Concurso findByEmpresaId_Last(long empresaId,
        OrderByComparator orderByComparator)
        throws NoSuchConcursoException, SystemException {
        Concurso concurso = fetchByEmpresaId_Last(empresaId, orderByComparator);

        if (concurso != null) {
            return concurso;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("empresaId=");
        msg.append(empresaId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchConcursoException(msg.toString());
    }

    /**
     * Returns the last concurso in the ordered set where empresaId = &#63;.
     *
     * @param empresaId the empresa ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching concurso, or <code>null</code> if a matching concurso could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Concurso fetchByEmpresaId_Last(long empresaId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByEmpresaId(empresaId);

        if (count == 0) {
            return null;
        }

        List<Concurso> list = findByEmpresaId(empresaId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Concurso[] findByEmpresaId_PrevAndNext(long concursoId,
        long empresaId, OrderByComparator orderByComparator)
        throws NoSuchConcursoException, SystemException {
        Concurso concurso = findByPrimaryKey(concursoId);

        Session session = null;

        try {
            session = openSession();

            Concurso[] array = new ConcursoImpl[3];

            array[0] = getByEmpresaId_PrevAndNext(session, concurso, empresaId,
                    orderByComparator, true);

            array[1] = concurso;

            array[2] = getByEmpresaId_PrevAndNext(session, concurso, empresaId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Concurso getByEmpresaId_PrevAndNext(Session session,
        Concurso concurso, long empresaId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_CONCURSO_WHERE);

        query.append(_FINDER_COLUMN_EMPRESAID_EMPRESAID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(ConcursoModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(empresaId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(concurso);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Concurso> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the concursos where empresaId = &#63; from the database.
     *
     * @param empresaId the empresa ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByEmpresaId(long empresaId) throws SystemException {
        for (Concurso concurso : findByEmpresaId(empresaId, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(concurso);
        }
    }

    /**
     * Returns the number of concursos where empresaId = &#63;.
     *
     * @param empresaId the empresa ID
     * @return the number of matching concursos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByEmpresaId(long empresaId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_EMPRESAID;

        Object[] finderArgs = new Object[] { empresaId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_CONCURSO_WHERE);

            query.append(_FINDER_COLUMN_EMPRESAID_EMPRESAID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(empresaId);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the concurso in the entity cache if it is enabled.
     *
     * @param concurso the concurso
     */
    @Override
    public void cacheResult(Concurso concurso) {
        EntityCacheUtil.putResult(ConcursoModelImpl.ENTITY_CACHE_ENABLED,
            ConcursoImpl.class, concurso.getPrimaryKey(), concurso);

        concurso.resetOriginalValues();
    }

    /**
     * Caches the concursos in the entity cache if it is enabled.
     *
     * @param concursos the concursos
     */
    @Override
    public void cacheResult(List<Concurso> concursos) {
        for (Concurso concurso : concursos) {
            if (EntityCacheUtil.getResult(
                        ConcursoModelImpl.ENTITY_CACHE_ENABLED,
                        ConcursoImpl.class, concurso.getPrimaryKey()) == null) {
                cacheResult(concurso);
            } else {
                concurso.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all concursos.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(ConcursoImpl.class.getName());
        }

        EntityCacheUtil.clearCache(ConcursoImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the concurso.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Concurso concurso) {
        EntityCacheUtil.removeResult(ConcursoModelImpl.ENTITY_CACHE_ENABLED,
            ConcursoImpl.class, concurso.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Concurso> concursos) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Concurso concurso : concursos) {
            EntityCacheUtil.removeResult(ConcursoModelImpl.ENTITY_CACHE_ENABLED,
                ConcursoImpl.class, concurso.getPrimaryKey());
        }
    }

    /**
     * Creates a new concurso with the primary key. Does not add the concurso to the database.
     *
     * @param concursoId the primary key for the new concurso
     * @return the new concurso
     */
    @Override
    public Concurso create(long concursoId) {
        Concurso concurso = new ConcursoImpl();

        concurso.setNew(true);
        concurso.setPrimaryKey(concursoId);

        return concurso;
    }

    /**
     * Removes the concurso with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param concursoId the primary key of the concurso
     * @return the concurso that was removed
     * @throws com.telefonica.plataformaconcursos.NoSuchConcursoException if a concurso with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Concurso remove(long concursoId)
        throws NoSuchConcursoException, SystemException {
        return remove((Serializable) concursoId);
    }

    /**
     * Removes the concurso with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the concurso
     * @return the concurso that was removed
     * @throws com.telefonica.plataformaconcursos.NoSuchConcursoException if a concurso with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Concurso remove(Serializable primaryKey)
        throws NoSuchConcursoException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Concurso concurso = (Concurso) session.get(ConcursoImpl.class,
                    primaryKey);

            if (concurso == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchConcursoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(concurso);
        } catch (NoSuchConcursoException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Concurso removeImpl(Concurso concurso) throws SystemException {
        concurso = toUnwrappedModel(concurso);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(concurso)) {
                concurso = (Concurso) session.get(ConcursoImpl.class,
                        concurso.getPrimaryKeyObj());
            }

            if (concurso != null) {
                session.delete(concurso);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (concurso != null) {
            clearCache(concurso);
        }

        return concurso;
    }

    @Override
    public Concurso updateImpl(
        com.telefonica.plataformaconcursos.model.Concurso concurso)
        throws SystemException {
        concurso = toUnwrappedModel(concurso);

        boolean isNew = concurso.isNew();

        ConcursoModelImpl concursoModelImpl = (ConcursoModelImpl) concurso;

        Session session = null;

        try {
            session = openSession();

            if (concurso.isNew()) {
                session.save(concurso);

                concurso.setNew(false);
            } else {
                session.merge(concurso);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !ConcursoModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((concursoModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPRESAID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        concursoModelImpl.getOriginalEmpresaId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPRESAID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPRESAID,
                    args);

                args = new Object[] { concursoModelImpl.getEmpresaId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_EMPRESAID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_EMPRESAID,
                    args);
            }
        }

        EntityCacheUtil.putResult(ConcursoModelImpl.ENTITY_CACHE_ENABLED,
            ConcursoImpl.class, concurso.getPrimaryKey(), concurso);

        return concurso;
    }

    protected Concurso toUnwrappedModel(Concurso concurso) {
        if (concurso instanceof ConcursoImpl) {
            return concurso;
        }

        ConcursoImpl concursoImpl = new ConcursoImpl();

        concursoImpl.setNew(concurso.isNew());
        concursoImpl.setPrimaryKey(concurso.getPrimaryKey());

        concursoImpl.setConcursoId(concurso.getConcursoId());
        concursoImpl.setGroupId(concurso.getGroupId());
        concursoImpl.setCompanyId(concurso.getCompanyId());
        concursoImpl.setUserId(concurso.getUserId());
        concursoImpl.setNombre(concurso.getNombre());
        concursoImpl.setFechaInicioInscripcion(concurso.getFechaInicioInscripcion());
        concursoImpl.setModifiedDate(concurso.getModifiedDate());
        concursoImpl.setDescripcion(concurso.getDescripcion());
        concursoImpl.setPremio(concurso.getPremio());
        concursoImpl.setFechaFinInscripcion(concurso.getFechaFinInscripcion());
        concursoImpl.setFechaPublicacionConcurso(concurso.getFechaPublicacionConcurso());
        concursoImpl.setFechaPublicacionGanador(concurso.getFechaPublicacionGanador());
        concursoImpl.setFechaInicioEntrega(concurso.getFechaInicioEntrega());
        concursoImpl.setFechaFinEntrega(concurso.getFechaFinEntrega());
        concursoImpl.setEmpresaId(concurso.getEmpresaId());
        concursoImpl.setDocumento(concurso.getDocumento());

        return concursoImpl;
    }

    /**
     * Returns the concurso with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the concurso
     * @return the concurso
     * @throws com.telefonica.plataformaconcursos.NoSuchConcursoException if a concurso with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Concurso findByPrimaryKey(Serializable primaryKey)
        throws NoSuchConcursoException, SystemException {
        Concurso concurso = fetchByPrimaryKey(primaryKey);

        if (concurso == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchConcursoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return concurso;
    }

    /**
     * Returns the concurso with the primary key or throws a {@link com.telefonica.plataformaconcursos.NoSuchConcursoException} if it could not be found.
     *
     * @param concursoId the primary key of the concurso
     * @return the concurso
     * @throws com.telefonica.plataformaconcursos.NoSuchConcursoException if a concurso with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Concurso findByPrimaryKey(long concursoId)
        throws NoSuchConcursoException, SystemException {
        return findByPrimaryKey((Serializable) concursoId);
    }

    /**
     * Returns the concurso with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the concurso
     * @return the concurso, or <code>null</code> if a concurso with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Concurso fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Concurso concurso = (Concurso) EntityCacheUtil.getResult(ConcursoModelImpl.ENTITY_CACHE_ENABLED,
                ConcursoImpl.class, primaryKey);

        if (concurso == _nullConcurso) {
            return null;
        }

        if (concurso == null) {
            Session session = null;

            try {
                session = openSession();

                concurso = (Concurso) session.get(ConcursoImpl.class, primaryKey);

                if (concurso != null) {
                    cacheResult(concurso);
                } else {
                    EntityCacheUtil.putResult(ConcursoModelImpl.ENTITY_CACHE_ENABLED,
                        ConcursoImpl.class, primaryKey, _nullConcurso);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(ConcursoModelImpl.ENTITY_CACHE_ENABLED,
                    ConcursoImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return concurso;
    }

    /**
     * Returns the concurso with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param concursoId the primary key of the concurso
     * @return the concurso, or <code>null</code> if a concurso with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Concurso fetchByPrimaryKey(long concursoId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) concursoId);
    }

    /**
     * Returns all the concursos.
     *
     * @return the concursos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Concurso> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Concurso> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Concurso> findAll(int start, int end,
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

        List<Concurso> list = (List<Concurso>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_CONCURSO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_CONCURSO;

                if (pagination) {
                    sql = sql.concat(ConcursoModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Concurso>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Concurso>(list);
                } else {
                    list = (List<Concurso>) QueryUtil.list(q, getDialect(),
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
     * Removes all the concursos from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Concurso concurso : findAll()) {
            remove(concurso);
        }
    }

    /**
     * Returns the number of concursos.
     *
     * @return the number of concursos
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

                Query q = session.createQuery(_SQL_COUNT_CONCURSO);

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
     * Initializes the concurso persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.telefonica.plataformaconcursos.model.Concurso")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Concurso>> listenersList = new ArrayList<ModelListener<Concurso>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Concurso>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(ConcursoImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
