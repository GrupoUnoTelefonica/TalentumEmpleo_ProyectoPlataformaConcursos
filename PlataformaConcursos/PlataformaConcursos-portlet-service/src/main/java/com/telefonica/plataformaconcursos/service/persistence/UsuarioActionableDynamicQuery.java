package com.telefonica.plataformaconcursos.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import com.telefonica.plataformaconcursos.model.Usuario;
import com.telefonica.plataformaconcursos.service.UsuarioLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class UsuarioActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public UsuarioActionableDynamicQuery() throws SystemException {
        setBaseLocalService(UsuarioLocalServiceUtil.getService());
        setClass(Usuario.class);

        setClassLoader(com.telefonica.plataformaconcursos.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("usuarioId");
    }
}
