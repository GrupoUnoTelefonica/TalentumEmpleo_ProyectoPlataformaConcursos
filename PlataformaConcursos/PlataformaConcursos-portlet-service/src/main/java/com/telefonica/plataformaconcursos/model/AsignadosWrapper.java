package com.telefonica.plataformaconcursos.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Asignados}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Asignados
 * @generated
 */
public class AsignadosWrapper implements Asignados, ModelWrapper<Asignados> {
    private Asignados _asignados;

    public AsignadosWrapper(Asignados asignados) {
        _asignados = asignados;
    }

    @Override
    public Class<?> getModelClass() {
        return Asignados.class;
    }

    @Override
    public String getModelClassName() {
        return Asignados.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("asignadosId", getAsignadosId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("userName", getUserName());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("usuarioId", getUsuarioId());
        attributes.put("concursoId", getConcursoId());
        attributes.put("documento", getDocumento());
        attributes.put("puntuacionObtenida", getPuntuacionObtenida());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String asignadosId = (String) attributes.get("asignadosId");

        if (asignadosId != null) {
            setAsignadosId(asignadosId);
        }

        Long groupId = (Long) attributes.get("groupId");

        if (groupId != null) {
            setGroupId(groupId);
        }

        Long companyId = (Long) attributes.get("companyId");

        if (companyId != null) {
            setCompanyId(companyId);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        String userName = (String) attributes.get("userName");

        if (userName != null) {
            setUserName(userName);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        Long usuarioId = (Long) attributes.get("usuarioId");

        if (usuarioId != null) {
            setUsuarioId(usuarioId);
        }

        Long concursoId = (Long) attributes.get("concursoId");

        if (concursoId != null) {
            setConcursoId(concursoId);
        }

        String documento = (String) attributes.get("documento");

        if (documento != null) {
            setDocumento(documento);
        }

        String puntuacionObtenida = (String) attributes.get(
                "puntuacionObtenida");

        if (puntuacionObtenida != null) {
            setPuntuacionObtenida(puntuacionObtenida);
        }
    }

    /**
    * Returns the primary key of this asignados.
    *
    * @return the primary key of this asignados
    */
    @Override
    public java.lang.String getPrimaryKey() {
        return _asignados.getPrimaryKey();
    }

    /**
    * Sets the primary key of this asignados.
    *
    * @param primaryKey the primary key of this asignados
    */
    @Override
    public void setPrimaryKey(java.lang.String primaryKey) {
        _asignados.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the asignados ID of this asignados.
    *
    * @return the asignados ID of this asignados
    */
    @Override
    public java.lang.String getAsignadosId() {
        return _asignados.getAsignadosId();
    }

    /**
    * Sets the asignados ID of this asignados.
    *
    * @param asignadosId the asignados ID of this asignados
    */
    @Override
    public void setAsignadosId(java.lang.String asignadosId) {
        _asignados.setAsignadosId(asignadosId);
    }

    /**
    * Returns the group ID of this asignados.
    *
    * @return the group ID of this asignados
    */
    @Override
    public long getGroupId() {
        return _asignados.getGroupId();
    }

    /**
    * Sets the group ID of this asignados.
    *
    * @param groupId the group ID of this asignados
    */
    @Override
    public void setGroupId(long groupId) {
        _asignados.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this asignados.
    *
    * @return the company ID of this asignados
    */
    @Override
    public long getCompanyId() {
        return _asignados.getCompanyId();
    }

    /**
    * Sets the company ID of this asignados.
    *
    * @param companyId the company ID of this asignados
    */
    @Override
    public void setCompanyId(long companyId) {
        _asignados.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this asignados.
    *
    * @return the user ID of this asignados
    */
    @Override
    public long getUserId() {
        return _asignados.getUserId();
    }

    /**
    * Sets the user ID of this asignados.
    *
    * @param userId the user ID of this asignados
    */
    @Override
    public void setUserId(long userId) {
        _asignados.setUserId(userId);
    }

    /**
    * Returns the user uuid of this asignados.
    *
    * @return the user uuid of this asignados
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _asignados.getUserUuid();
    }

    /**
    * Sets the user uuid of this asignados.
    *
    * @param userUuid the user uuid of this asignados
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _asignados.setUserUuid(userUuid);
    }

    /**
    * Returns the user name of this asignados.
    *
    * @return the user name of this asignados
    */
    @Override
    public java.lang.String getUserName() {
        return _asignados.getUserName();
    }

    /**
    * Sets the user name of this asignados.
    *
    * @param userName the user name of this asignados
    */
    @Override
    public void setUserName(java.lang.String userName) {
        _asignados.setUserName(userName);
    }

    /**
    * Returns the create date of this asignados.
    *
    * @return the create date of this asignados
    */
    @Override
    public java.util.Date getCreateDate() {
        return _asignados.getCreateDate();
    }

    /**
    * Sets the create date of this asignados.
    *
    * @param createDate the create date of this asignados
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _asignados.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this asignados.
    *
    * @return the modified date of this asignados
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _asignados.getModifiedDate();
    }

    /**
    * Sets the modified date of this asignados.
    *
    * @param modifiedDate the modified date of this asignados
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _asignados.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the usuario ID of this asignados.
    *
    * @return the usuario ID of this asignados
    */
    @Override
    public long getUsuarioId() {
        return _asignados.getUsuarioId();
    }

    /**
    * Sets the usuario ID of this asignados.
    *
    * @param usuarioId the usuario ID of this asignados
    */
    @Override
    public void setUsuarioId(long usuarioId) {
        _asignados.setUsuarioId(usuarioId);
    }

    /**
    * Returns the concurso ID of this asignados.
    *
    * @return the concurso ID of this asignados
    */
    @Override
    public long getConcursoId() {
        return _asignados.getConcursoId();
    }

    /**
    * Sets the concurso ID of this asignados.
    *
    * @param concursoId the concurso ID of this asignados
    */
    @Override
    public void setConcursoId(long concursoId) {
        _asignados.setConcursoId(concursoId);
    }

    /**
    * Returns the documento of this asignados.
    *
    * @return the documento of this asignados
    */
    @Override
    public java.lang.String getDocumento() {
        return _asignados.getDocumento();
    }

    /**
    * Sets the documento of this asignados.
    *
    * @param documento the documento of this asignados
    */
    @Override
    public void setDocumento(java.lang.String documento) {
        _asignados.setDocumento(documento);
    }

    /**
    * Returns the puntuacion obtenida of this asignados.
    *
    * @return the puntuacion obtenida of this asignados
    */
    @Override
    public java.lang.String getPuntuacionObtenida() {
        return _asignados.getPuntuacionObtenida();
    }

    /**
    * Sets the puntuacion obtenida of this asignados.
    *
    * @param puntuacionObtenida the puntuacion obtenida of this asignados
    */
    @Override
    public void setPuntuacionObtenida(java.lang.String puntuacionObtenida) {
        _asignados.setPuntuacionObtenida(puntuacionObtenida);
    }

    @Override
    public boolean isNew() {
        return _asignados.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _asignados.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _asignados.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _asignados.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _asignados.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _asignados.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _asignados.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _asignados.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _asignados.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _asignados.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _asignados.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new AsignadosWrapper((Asignados) _asignados.clone());
    }

    @Override
    public int compareTo(
        com.telefonica.plataformaconcursos.model.Asignados asignados) {
        return _asignados.compareTo(asignados);
    }

    @Override
    public int hashCode() {
        return _asignados.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.telefonica.plataformaconcursos.model.Asignados> toCacheModel() {
        return _asignados.toCacheModel();
    }

    @Override
    public com.telefonica.plataformaconcursos.model.Asignados toEscapedModel() {
        return new AsignadosWrapper(_asignados.toEscapedModel());
    }

    @Override
    public com.telefonica.plataformaconcursos.model.Asignados toUnescapedModel() {
        return new AsignadosWrapper(_asignados.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _asignados.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _asignados.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _asignados.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AsignadosWrapper)) {
            return false;
        }

        AsignadosWrapper asignadosWrapper = (AsignadosWrapper) obj;

        if (Validator.equals(_asignados, asignadosWrapper._asignados)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Asignados getWrappedAsignados() {
        return _asignados;
    }

    @Override
    public Asignados getWrappedModel() {
        return _asignados;
    }

    @Override
    public void resetOriginalValues() {
        _asignados.resetOriginalValues();
    }
}
