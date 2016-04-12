package com.telefonica.plataformaconcursos.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.telefonica.plataformaconcursos.model.Empresa;
import com.telefonica.plataformaconcursos.service.EmpresaLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class EmpresaActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public EmpresaActionableDynamicQuery() throws SystemException {
        setBaseLocalService(EmpresaLocalServiceUtil.getService());
        setClass(Empresa.class);

        setClassLoader(com.telefonica.plataformaconcursos.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("empresaId");
    }
}
