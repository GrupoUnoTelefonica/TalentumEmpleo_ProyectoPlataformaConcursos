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

import com.telefonica.plataformaconcursos.NoSuchAsignadosException;
import com.telefonica.plataformaconcursos.model.Asignados;
import com.telefonica.plataformaconcursos.model.impl.AsignadosImpl;
import com.telefonica.plataformaconcursos.model.impl.AsignadosModelImpl;
import com.telefonica.plataformaconcursos.service.persistence.AsignadosPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the asignados service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AsignadosPersistence
 * @see AsignadosUtil
 * @generated
 */
public class AsignadosPersistenceImpl extends BasePersistenceImpl<Asignados>
    implements AsignadosPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link AsignadosUtil} to access the asignados persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = AsignadosImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AsignadosModelImpl.ENTITY_CACHE_ENABLED,
            AsignadosModelImpl.FINDER_CACHE_ENABLED, AsignadosImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AsignadosModelImpl.ENTITY_CACHE_ENABLED,
            AsignadosModelImpl.FINDER_CACHE_ENABLED, AsignadosImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AsignadosModelImpl.ENTITY_CACHE_ENABLED,
            AsignadosModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_USUARIOID =
        new FinderPath(AsignadosModelImpl.ENTITY_CACHE_ENABLED,
            AsignadosModelImpl.FINDER_CACHE_ENABLED, AsignadosImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUsuarioId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USUARIOID =
        new FinderPath(AsignadosModelImpl.ENTITY_CACHE_ENABLED,
            AsignadosModelImpl.FINDER_CACHE_ENABLED, AsignadosImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUsuarioId",
            new String[] { Long.class.getName() },
            AsignadosModelImpl.USUARIOID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_USUARIOID = new FinderPath(AsignadosModelImpl.ENTITY_CACHE_ENABLED,
            AsignadosModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUsuarioId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_USUARIOID_USUARIOID_2 = "asignados.usuarioId = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CONCURSOID =
        new FinderPath(AsignadosModelImpl.ENTITY_CACHE_ENABLED,
            AsignadosModelImpl.FINDER_CACHE_ENABLED, AsignadosImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByConcursoId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONCURSOID =
        new FinderPath(AsignadosModelImpl.ENTITY_CACHE_ENABLED,
            AsignadosModelImpl.FINDER_CACHE_ENABLED, AsignadosImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByConcursoId",
            new String[] { Long.class.getName() },
            AsignadosModelImpl.CONCURSOID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CONCURSOID = new FinderPath(AsignadosModelImpl.ENTITY_CACHE_ENABLED,
            AsignadosModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByConcursoId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_CONCURSOID_CONCURSOID_2 = "asignados.concursoId = ?";
    private static final String _SQL_SELECT_ASIGNADOS = "SELECT asignados FROM Asignados asignados";
    private static final String _SQL_SELECT_ASIGNADOS_WHERE = "SELECT asignados FROM Asignados asignados WHERE ";
    private static final String _SQL_COUNT_ASIGNADOS = "SELECT COUNT(asignados) FROM Asignados asignados";
    private static final String _SQL_COUNT_ASIGNADOS_WHERE = "SELECT COUNT(asignados) FROM Asignados asignados WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "asignados.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Asignados exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Asignados exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(AsignadosPersistenceImpl.class);
    private static Asignados _nullAsignados = new AsignadosImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Asignados> toCacheModel() {
                return _nullAsignadosCacheModel;
            }
        };

    private static CacheModel<Asignados> _nullAsignadosCacheModel = new CacheModel<Asignados>() {
            @Override
            public Asignados toEntityModel() {
                return _nullAsignados;
            }
        };

    public AsignadosPersistenceImpl() {
        setModelClass(Asignados.class);
    }

    /**
     * Returns all the asignadoses where usuarioId = &#63;.
     *
     * @param usuarioId the usuario ID
     * @return the matching asignadoses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Asignados> findByUsuarioId(long usuarioId)
        throws SystemException {
        return findByUsuarioId(usuarioId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
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
    @Override
    public List<Asignados> findByUsuarioId(long usuarioId, int start, int end)
        throws SystemException {
        return findByUsuarioId(usuarioId, start, end, null);
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
    @Override
    public List<Asignados> findByUsuarioId(long usuarioId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USUARIOID;
            finderArgs = new Object[] { usuarioId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_USUARIOID;
            finderArgs = new Object[] { usuarioId, start, end, orderByComparator };
        }

        List<Asignados> list = (List<Asignados>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Asignados asignados : list) {
                if ((usuarioId != asignados.getUsuarioId())) {
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

            query.append(_SQL_SELECT_ASIGNADOS_WHERE);

            query.append(_FINDER_COLUMN_USUARIOID_USUARIOID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AsignadosModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(usuarioId);

                if (!pagination) {
                    list = (List<Asignados>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Asignados>(list);
                } else {
                    list = (List<Asignados>) QueryUtil.list(q, getDialect(),
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
     * Returns the first asignados in the ordered set where usuarioId = &#63;.
     *
     * @param usuarioId the usuario ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching asignados
     * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a matching asignados could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Asignados findByUsuarioId_First(long usuarioId,
        OrderByComparator orderByComparator)
        throws NoSuchAsignadosException, SystemException {
        Asignados asignados = fetchByUsuarioId_First(usuarioId,
                orderByComparator);

        if (asignados != null) {
            return asignados;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("usuarioId=");
        msg.append(usuarioId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAsignadosException(msg.toString());
    }

    /**
     * Returns the first asignados in the ordered set where usuarioId = &#63;.
     *
     * @param usuarioId the usuario ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching asignados, or <code>null</code> if a matching asignados could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Asignados fetchByUsuarioId_First(long usuarioId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Asignados> list = findByUsuarioId(usuarioId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Asignados findByUsuarioId_Last(long usuarioId,
        OrderByComparator orderByComparator)
        throws NoSuchAsignadosException, SystemException {
        Asignados asignados = fetchByUsuarioId_Last(usuarioId, orderByComparator);

        if (asignados != null) {
            return asignados;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("usuarioId=");
        msg.append(usuarioId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAsignadosException(msg.toString());
    }

    /**
     * Returns the last asignados in the ordered set where usuarioId = &#63;.
     *
     * @param usuarioId the usuario ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching asignados, or <code>null</code> if a matching asignados could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Asignados fetchByUsuarioId_Last(long usuarioId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByUsuarioId(usuarioId);

        if (count == 0) {
            return null;
        }

        List<Asignados> list = findByUsuarioId(usuarioId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Asignados[] findByUsuarioId_PrevAndNext(String asignadosId,
        long usuarioId, OrderByComparator orderByComparator)
        throws NoSuchAsignadosException, SystemException {
        Asignados asignados = findByPrimaryKey(asignadosId);

        Session session = null;

        try {
            session = openSession();

            Asignados[] array = new AsignadosImpl[3];

            array[0] = getByUsuarioId_PrevAndNext(session, asignados,
                    usuarioId, orderByComparator, true);

            array[1] = asignados;

            array[2] = getByUsuarioId_PrevAndNext(session, asignados,
                    usuarioId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Asignados getByUsuarioId_PrevAndNext(Session session,
        Asignados asignados, long usuarioId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ASIGNADOS_WHERE);

        query.append(_FINDER_COLUMN_USUARIOID_USUARIOID_2);

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
            query.append(AsignadosModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(usuarioId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(asignados);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Asignados> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the asignadoses where usuarioId = &#63; from the database.
     *
     * @param usuarioId the usuario ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByUsuarioId(long usuarioId) throws SystemException {
        for (Asignados asignados : findByUsuarioId(usuarioId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(asignados);
        }
    }

    /**
     * Returns the number of asignadoses where usuarioId = &#63;.
     *
     * @param usuarioId the usuario ID
     * @return the number of matching asignadoses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByUsuarioId(long usuarioId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_USUARIOID;

        Object[] finderArgs = new Object[] { usuarioId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ASIGNADOS_WHERE);

            query.append(_FINDER_COLUMN_USUARIOID_USUARIOID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(usuarioId);

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
     * Returns all the asignadoses where concursoId = &#63;.
     *
     * @param concursoId the concurso ID
     * @return the matching asignadoses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Asignados> findByConcursoId(long concursoId)
        throws SystemException {
        return findByConcursoId(concursoId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Asignados> findByConcursoId(long concursoId, int start, int end)
        throws SystemException {
        return findByConcursoId(concursoId, start, end, null);
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
    @Override
    public List<Asignados> findByConcursoId(long concursoId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONCURSOID;
            finderArgs = new Object[] { concursoId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CONCURSOID;
            finderArgs = new Object[] { concursoId, start, end, orderByComparator };
        }

        List<Asignados> list = (List<Asignados>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Asignados asignados : list) {
                if ((concursoId != asignados.getConcursoId())) {
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

            query.append(_SQL_SELECT_ASIGNADOS_WHERE);

            query.append(_FINDER_COLUMN_CONCURSOID_CONCURSOID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(AsignadosModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(concursoId);

                if (!pagination) {
                    list = (List<Asignados>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Asignados>(list);
                } else {
                    list = (List<Asignados>) QueryUtil.list(q, getDialect(),
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
     * Returns the first asignados in the ordered set where concursoId = &#63;.
     *
     * @param concursoId the concurso ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching asignados
     * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a matching asignados could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Asignados findByConcursoId_First(long concursoId,
        OrderByComparator orderByComparator)
        throws NoSuchAsignadosException, SystemException {
        Asignados asignados = fetchByConcursoId_First(concursoId,
                orderByComparator);

        if (asignados != null) {
            return asignados;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("concursoId=");
        msg.append(concursoId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAsignadosException(msg.toString());
    }

    /**
     * Returns the first asignados in the ordered set where concursoId = &#63;.
     *
     * @param concursoId the concurso ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching asignados, or <code>null</code> if a matching asignados could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Asignados fetchByConcursoId_First(long concursoId,
        OrderByComparator orderByComparator) throws SystemException {
        List<Asignados> list = findByConcursoId(concursoId, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Asignados findByConcursoId_Last(long concursoId,
        OrderByComparator orderByComparator)
        throws NoSuchAsignadosException, SystemException {
        Asignados asignados = fetchByConcursoId_Last(concursoId,
                orderByComparator);

        if (asignados != null) {
            return asignados;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("concursoId=");
        msg.append(concursoId);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchAsignadosException(msg.toString());
    }

    /**
     * Returns the last asignados in the ordered set where concursoId = &#63;.
     *
     * @param concursoId the concurso ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching asignados, or <code>null</code> if a matching asignados could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Asignados fetchByConcursoId_Last(long concursoId,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByConcursoId(concursoId);

        if (count == 0) {
            return null;
        }

        List<Asignados> list = findByConcursoId(concursoId, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Asignados[] findByConcursoId_PrevAndNext(String asignadosId,
        long concursoId, OrderByComparator orderByComparator)
        throws NoSuchAsignadosException, SystemException {
        Asignados asignados = findByPrimaryKey(asignadosId);

        Session session = null;

        try {
            session = openSession();

            Asignados[] array = new AsignadosImpl[3];

            array[0] = getByConcursoId_PrevAndNext(session, asignados,
                    concursoId, orderByComparator, true);

            array[1] = asignados;

            array[2] = getByConcursoId_PrevAndNext(session, asignados,
                    concursoId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Asignados getByConcursoId_PrevAndNext(Session session,
        Asignados asignados, long concursoId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_ASIGNADOS_WHERE);

        query.append(_FINDER_COLUMN_CONCURSOID_CONCURSOID_2);

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
            query.append(AsignadosModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(concursoId);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(asignados);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Asignados> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the asignadoses where concursoId = &#63; from the database.
     *
     * @param concursoId the concurso ID
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByConcursoId(long concursoId) throws SystemException {
        for (Asignados asignados : findByConcursoId(concursoId,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(asignados);
        }
    }

    /**
     * Returns the number of asignadoses where concursoId = &#63;.
     *
     * @param concursoId the concurso ID
     * @return the number of matching asignadoses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByConcursoId(long concursoId) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_CONCURSOID;

        Object[] finderArgs = new Object[] { concursoId };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_ASIGNADOS_WHERE);

            query.append(_FINDER_COLUMN_CONCURSOID_CONCURSOID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(concursoId);

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
     * Caches the asignados in the entity cache if it is enabled.
     *
     * @param asignados the asignados
     */
    @Override
    public void cacheResult(Asignados asignados) {
        EntityCacheUtil.putResult(AsignadosModelImpl.ENTITY_CACHE_ENABLED,
            AsignadosImpl.class, asignados.getPrimaryKey(), asignados);

        asignados.resetOriginalValues();
    }

    /**
     * Caches the asignadoses in the entity cache if it is enabled.
     *
     * @param asignadoses the asignadoses
     */
    @Override
    public void cacheResult(List<Asignados> asignadoses) {
        for (Asignados asignados : asignadoses) {
            if (EntityCacheUtil.getResult(
                        AsignadosModelImpl.ENTITY_CACHE_ENABLED,
                        AsignadosImpl.class, asignados.getPrimaryKey()) == null) {
                cacheResult(asignados);
            } else {
                asignados.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all asignadoses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(AsignadosImpl.class.getName());
        }

        EntityCacheUtil.clearCache(AsignadosImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the asignados.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Asignados asignados) {
        EntityCacheUtil.removeResult(AsignadosModelImpl.ENTITY_CACHE_ENABLED,
            AsignadosImpl.class, asignados.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Asignados> asignadoses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Asignados asignados : asignadoses) {
            EntityCacheUtil.removeResult(AsignadosModelImpl.ENTITY_CACHE_ENABLED,
                AsignadosImpl.class, asignados.getPrimaryKey());
        }
    }

    /**
     * Creates a new asignados with the primary key. Does not add the asignados to the database.
     *
     * @param asignadosId the primary key for the new asignados
     * @return the new asignados
     */
    @Override
    public Asignados create(String asignadosId) {
        Asignados asignados = new AsignadosImpl();

        asignados.setNew(true);
        asignados.setPrimaryKey(asignadosId);

        return asignados;
    }

    /**
     * Removes the asignados with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param asignadosId the primary key of the asignados
     * @return the asignados that was removed
     * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a asignados with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Asignados remove(String asignadosId)
        throws NoSuchAsignadosException, SystemException {
        return remove((Serializable) asignadosId);
    }

    /**
     * Removes the asignados with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the asignados
     * @return the asignados that was removed
     * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a asignados with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Asignados remove(Serializable primaryKey)
        throws NoSuchAsignadosException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Asignados asignados = (Asignados) session.get(AsignadosImpl.class,
                    primaryKey);

            if (asignados == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchAsignadosException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(asignados);
        } catch (NoSuchAsignadosException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Asignados removeImpl(Asignados asignados)
        throws SystemException {
        asignados = toUnwrappedModel(asignados);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(asignados)) {
                asignados = (Asignados) session.get(AsignadosImpl.class,
                        asignados.getPrimaryKeyObj());
            }

            if (asignados != null) {
                session.delete(asignados);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (asignados != null) {
            clearCache(asignados);
        }

        return asignados;
    }

    @Override
    public Asignados updateImpl(
        com.telefonica.plataformaconcursos.model.Asignados asignados)
        throws SystemException {
        asignados = toUnwrappedModel(asignados);

        boolean isNew = asignados.isNew();

        AsignadosModelImpl asignadosModelImpl = (AsignadosModelImpl) asignados;

        Session session = null;

        try {
            session = openSession();

            if (asignados.isNew()) {
                session.save(asignados);

                asignados.setNew(false);
            } else {
                session.merge(asignados);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !AsignadosModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((asignadosModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USUARIOID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        asignadosModelImpl.getOriginalUsuarioId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USUARIOID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USUARIOID,
                    args);

                args = new Object[] { asignadosModelImpl.getUsuarioId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_USUARIOID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_USUARIOID,
                    args);
            }

            if ((asignadosModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONCURSOID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        asignadosModelImpl.getOriginalConcursoId()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONCURSOID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONCURSOID,
                    args);

                args = new Object[] { asignadosModelImpl.getConcursoId() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CONCURSOID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CONCURSOID,
                    args);
            }
        }

        EntityCacheUtil.putResult(AsignadosModelImpl.ENTITY_CACHE_ENABLED,
            AsignadosImpl.class, asignados.getPrimaryKey(), asignados);

        return asignados;
    }

    protected Asignados toUnwrappedModel(Asignados asignados) {
        if (asignados instanceof AsignadosImpl) {
            return asignados;
        }

        AsignadosImpl asignadosImpl = new AsignadosImpl();

        asignadosImpl.setNew(asignados.isNew());
        asignadosImpl.setPrimaryKey(asignados.getPrimaryKey());

        asignadosImpl.setAsignadosId(asignados.getAsignadosId());
        asignadosImpl.setGroupId(asignados.getGroupId());
        asignadosImpl.setCompanyId(asignados.getCompanyId());
        asignadosImpl.setUserId(asignados.getUserId());
        asignadosImpl.setUserName(asignados.getUserName());
        asignadosImpl.setCreateDate(asignados.getCreateDate());
        asignadosImpl.setModifiedDate(asignados.getModifiedDate());
        asignadosImpl.setUsuarioId(asignados.getUsuarioId());
        asignadosImpl.setConcursoId(asignados.getConcursoId());
        asignadosImpl.setDocumento(asignados.getDocumento());
        asignadosImpl.setPuntuacionObtenida(asignados.getPuntuacionObtenida());

        return asignadosImpl;
    }

    /**
     * Returns the asignados with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the asignados
     * @return the asignados
     * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a asignados with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Asignados findByPrimaryKey(Serializable primaryKey)
        throws NoSuchAsignadosException, SystemException {
        Asignados asignados = fetchByPrimaryKey(primaryKey);

        if (asignados == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchAsignadosException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return asignados;
    }

    /**
     * Returns the asignados with the primary key or throws a {@link com.telefonica.plataformaconcursos.NoSuchAsignadosException} if it could not be found.
     *
     * @param asignadosId the primary key of the asignados
     * @return the asignados
     * @throws com.telefonica.plataformaconcursos.NoSuchAsignadosException if a asignados with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Asignados findByPrimaryKey(String asignadosId)
        throws NoSuchAsignadosException, SystemException {
        return findByPrimaryKey((Serializable) asignadosId);
    }

    /**
     * Returns the asignados with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the asignados
     * @return the asignados, or <code>null</code> if a asignados with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Asignados fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Asignados asignados = (Asignados) EntityCacheUtil.getResult(AsignadosModelImpl.ENTITY_CACHE_ENABLED,
                AsignadosImpl.class, primaryKey);

        if (asignados == _nullAsignados) {
            return null;
        }

        if (asignados == null) {
            Session session = null;

            try {
                session = openSession();

                asignados = (Asignados) session.get(AsignadosImpl.class,
                        primaryKey);

                if (asignados != null) {
                    cacheResult(asignados);
                } else {
                    EntityCacheUtil.putResult(AsignadosModelImpl.ENTITY_CACHE_ENABLED,
                        AsignadosImpl.class, primaryKey, _nullAsignados);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(AsignadosModelImpl.ENTITY_CACHE_ENABLED,
                    AsignadosImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return asignados;
    }

    /**
     * Returns the asignados with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param asignadosId the primary key of the asignados
     * @return the asignados, or <code>null</code> if a asignados with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Asignados fetchByPrimaryKey(String asignadosId)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) asignadosId);
    }

    /**
     * Returns all the asignadoses.
     *
     * @return the asignadoses
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Asignados> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Asignados> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Asignados> findAll(int start, int end,
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

        List<Asignados> list = (List<Asignados>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ASIGNADOS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ASIGNADOS;

                if (pagination) {
                    sql = sql.concat(AsignadosModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Asignados>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Asignados>(list);
                } else {
                    list = (List<Asignados>) QueryUtil.list(q, getDialect(),
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
     * Removes all the asignadoses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Asignados asignados : findAll()) {
            remove(asignados);
        }
    }

    /**
     * Returns the number of asignadoses.
     *
     * @return the number of asignadoses
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

                Query q = session.createQuery(_SQL_COUNT_ASIGNADOS);

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
     * Initializes the asignados persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.telefonica.plataformaconcursos.model.Asignados")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Asignados>> listenersList = new ArrayList<ModelListener<Asignados>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Asignados>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(AsignadosImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
