package com.telefonica.plataformaconcursos.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.telefonica.plataformaconcursos.model.Asignados;
import com.telefonica.plataformaconcursos.service.AsignadosLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class AsignadosActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AsignadosActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AsignadosLocalServiceUtil.getService());
        setClass(Asignados.class);

        setClassLoader(com.telefonica.plataformaconcursos.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("asignadosId");
    }
}
