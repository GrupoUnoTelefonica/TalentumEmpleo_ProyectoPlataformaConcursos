package com.telefonica.plataformaconcursos.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Empresa}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Empresa
 * @generated
 */
public class EmpresaWrapper implements Empresa, ModelWrapper<Empresa> {
    private Empresa _empresa;

    public EmpresaWrapper(Empresa empresa) {
        _empresa = empresa;
    }

    @Override
    public Class<?> getModelClass() {
        return Empresa.class;
    }

    @Override
    public String getModelClassName() {
        return Empresa.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("empresaId", getEmpresaId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("nombre", getNombre());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("sectorEmpresa", getSectorEmpresa());
        attributes.put("cif", getCif());
        attributes.put("pais", getPais());
        attributes.put("password1", getPassword1());
        attributes.put("password2", getPassword2());
        attributes.put("correoElectronico", getCorreoElectronico());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long empresaId = (Long) attributes.get("empresaId");

        if (empresaId != null) {
            setEmpresaId(empresaId);
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

        String nombre = (String) attributes.get("nombre");

        if (nombre != null) {
            setNombre(nombre);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String sectorEmpresa = (String) attributes.get("sectorEmpresa");

        if (sectorEmpresa != null) {
            setSectorEmpresa(sectorEmpresa);
        }

        String cif = (String) attributes.get("cif");

        if (cif != null) {
            setCif(cif);
        }

        String pais = (String) attributes.get("pais");

        if (pais != null) {
            setPais(pais);
        }

        String password1 = (String) attributes.get("password1");

        if (password1 != null) {
            setPassword1(password1);
        }

        String password2 = (String) attributes.get("password2");

        if (password2 != null) {
            setPassword2(password2);
        }

        String correoElectronico = (String) attributes.get("correoElectronico");

        if (correoElectronico != null) {
            setCorreoElectronico(correoElectronico);
        }
    }

    /**
    * Returns the primary key of this empresa.
    *
    * @return the primary key of this empresa
    */
    @Override
    public long getPrimaryKey() {
        return _empresa.getPrimaryKey();
    }

    /**
    * Sets the primary key of this empresa.
    *
    * @param primaryKey the primary key of this empresa
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _empresa.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the empresa ID of this empresa.
    *
    * @return the empresa ID of this empresa
    */
    @Override
    public long getEmpresaId() {
        return _empresa.getEmpresaId();
    }

    /**
    * Sets the empresa ID of this empresa.
    *
    * @param empresaId the empresa ID of this empresa
    */
    @Override
    public void setEmpresaId(long empresaId) {
        _empresa.setEmpresaId(empresaId);
    }

    /**
    * Returns the group ID of this empresa.
    *
    * @return the group ID of this empresa
    */
    @Override
    public long getGroupId() {
        return _empresa.getGroupId();
    }

    /**
    * Sets the group ID of this empresa.
    *
    * @param groupId the group ID of this empresa
    */
    @Override
    public void setGroupId(long groupId) {
        _empresa.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this empresa.
    *
    * @return the company ID of this empresa
    */
    @Override
    public long getCompanyId() {
        return _empresa.getCompanyId();
    }

    /**
    * Sets the company ID of this empresa.
    *
    * @param companyId the company ID of this empresa
    */
    @Override
    public void setCompanyId(long companyId) {
        _empresa.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this empresa.
    *
    * @return the user ID of this empresa
    */
    @Override
    public long getUserId() {
        return _empresa.getUserId();
    }

    /**
    * Sets the user ID of this empresa.
    *
    * @param userId the user ID of this empresa
    */
    @Override
    public void setUserId(long userId) {
        _empresa.setUserId(userId);
    }

    /**
    * Returns the user uuid of this empresa.
    *
    * @return the user uuid of this empresa
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _empresa.getUserUuid();
    }

    /**
    * Sets the user uuid of this empresa.
    *
    * @param userUuid the user uuid of this empresa
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _empresa.setUserUuid(userUuid);
    }

    /**
    * Returns the nombre of this empresa.
    *
    * @return the nombre of this empresa
    */
    @Override
    public java.lang.String getNombre() {
        return _empresa.getNombre();
    }

    /**
    * Sets the nombre of this empresa.
    *
    * @param nombre the nombre of this empresa
    */
    @Override
    public void setNombre(java.lang.String nombre) {
        _empresa.setNombre(nombre);
    }

    /**
    * Returns the create date of this empresa.
    *
    * @return the create date of this empresa
    */
    @Override
    public java.util.Date getCreateDate() {
        return _empresa.getCreateDate();
    }

    /**
    * Sets the create date of this empresa.
    *
    * @param createDate the create date of this empresa
    */
    @Override
    public void setCreateDate(java.util.Date createDate) {
        _empresa.setCreateDate(createDate);
    }

    /**
    * Returns the modified date of this empresa.
    *
    * @return the modified date of this empresa
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _empresa.getModifiedDate();
    }

    /**
    * Sets the modified date of this empresa.
    *
    * @param modifiedDate the modified date of this empresa
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _empresa.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the sector empresa of this empresa.
    *
    * @return the sector empresa of this empresa
    */
    @Override
    public java.lang.String getSectorEmpresa() {
        return _empresa.getSectorEmpresa();
    }

    /**
    * Sets the sector empresa of this empresa.
    *
    * @param sectorEmpresa the sector empresa of this empresa
    */
    @Override
    public void setSectorEmpresa(java.lang.String sectorEmpresa) {
        _empresa.setSectorEmpresa(sectorEmpresa);
    }

    /**
    * Returns the cif of this empresa.
    *
    * @return the cif of this empresa
    */
    @Override
    public java.lang.String getCif() {
        return _empresa.getCif();
    }

    /**
    * Sets the cif of this empresa.
    *
    * @param cif the cif of this empresa
    */
    @Override
    public void setCif(java.lang.String cif) {
        _empresa.setCif(cif);
    }

    /**
    * Returns the pais of this empresa.
    *
    * @return the pais of this empresa
    */
    @Override
    public java.lang.String getPais() {
        return _empresa.getPais();
    }

    /**
    * Sets the pais of this empresa.
    *
    * @param pais the pais of this empresa
    */
    @Override
    public void setPais(java.lang.String pais) {
        _empresa.setPais(pais);
    }

    /**
    * Returns the password1 of this empresa.
    *
    * @return the password1 of this empresa
    */
    @Override
    public java.lang.String getPassword1() {
        return _empresa.getPassword1();
    }

    /**
    * Sets the password1 of this empresa.
    *
    * @param password1 the password1 of this empresa
    */
    @Override
    public void setPassword1(java.lang.String password1) {
        _empresa.setPassword1(password1);
    }

    /**
    * Returns the password2 of this empresa.
    *
    * @return the password2 of this empresa
    */
    @Override
    public java.lang.String getPassword2() {
        return _empresa.getPassword2();
    }

    /**
    * Sets the password2 of this empresa.
    *
    * @param password2 the password2 of this empresa
    */
    @Override
    public void setPassword2(java.lang.String password2) {
        _empresa.setPassword2(password2);
    }

    /**
    * Returns the correo electronico of this empresa.
    *
    * @return the correo electronico of this empresa
    */
    @Override
    public java.lang.String getCorreoElectronico() {
        return _empresa.getCorreoElectronico();
    }

    /**
    * Sets the correo electronico of this empresa.
    *
    * @param correoElectronico the correo electronico of this empresa
    */
    @Override
    public void setCorreoElectronico(java.lang.String correoElectronico) {
        _empresa.setCorreoElectronico(correoElectronico);
    }

    @Override
    public boolean isNew() {
        return _empresa.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _empresa.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _empresa.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _empresa.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _empresa.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _empresa.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _empresa.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _empresa.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _empresa.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _empresa.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _empresa.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EmpresaWrapper((Empresa) _empresa.clone());
    }

    @Override
    public int compareTo(
        com.telefonica.plataformaconcursos.model.Empresa empresa) {
        return _empresa.compareTo(empresa);
    }

    @Override
    public int hashCode() {
        return _empresa.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.telefonica.plataformaconcursos.model.Empresa> toCacheModel() {
        return _empresa.toCacheModel();
    }

    @Override
    public com.telefonica.plataformaconcursos.model.Empresa toEscapedModel() {
        return new EmpresaWrapper(_empresa.toEscapedModel());
    }

    @Override
    public com.telefonica.plataformaconcursos.model.Empresa toUnescapedModel() {
        return new EmpresaWrapper(_empresa.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _empresa.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _empresa.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _empresa.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmpresaWrapper)) {
            return false;
        }

        EmpresaWrapper empresaWrapper = (EmpresaWrapper) obj;

        if (Validator.equals(_empresa, empresaWrapper._empresa)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Empresa getWrappedEmpresa() {
        return _empresa;
    }

    @Override
    public Empresa getWrappedModel() {
        return _empresa;
    }

    @Override
    public void resetOriginalValues() {
        _empresa.resetOriginalValues();
    }
}
