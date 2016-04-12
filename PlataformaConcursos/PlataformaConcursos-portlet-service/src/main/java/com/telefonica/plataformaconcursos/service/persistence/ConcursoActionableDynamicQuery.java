package com.telefonica.plataformaconcursos.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.telefonica.plataformaconcursos.model.Concurso;
import com.telefonica.plataformaconcursos.service.ConcursoLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class ConcursoActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public ConcursoActionableDynamicQuery() throws SystemException {
        setBaseLocalService(ConcursoLocalServiceUtil.getService());
        setClass(Concurso.class);

        setClassLoader(com.telefonica.plataformaconcursos.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("concursoId");
    }
}
