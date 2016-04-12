package com.telefonica.plataformaconcursos.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Concurso}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Concurso
 * @generated
 */
public class ConcursoWrapper implements Concurso, ModelWrapper<Concurso> {
    private Concurso _concurso;

    public ConcursoWrapper(Concurso concurso) {
        _concurso = concurso;
    }

    @Override
    public Class<?> getModelClass() {
        return Concurso.class;
    }

    @Override
    public String getModelClassName() {
        return Concurso.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("concursoId", getConcursoId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("nombre", getNombre());
        attributes.put("fechaInicioInscripcion", getFechaInicioInscripcion());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("descripcion", getDescripcion());
        attributes.put("premio", getPremio());
        attributes.put("fechaFinInscripcion", getFechaFinInscripcion());
        attributes.put("fechaPublicacionConcurso", getFechaPublicacionConcurso());
        attributes.put("fechaPublicacionGanador", getFechaPublicacionGanador());
        attributes.put("fechaInicioEntrega", getFechaInicioEntrega());
        attributes.put("fechaFinEntrega", getFechaFinEntrega());
        attributes.put("empresaId", getEmpresaId());
        attributes.put("documento", getDocumento());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long concursoId = (Long) attributes.get("concursoId");

        if (concursoId != null) {
            setConcursoId(concursoId);
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

        Date fechaInicioInscripcion = (Date) attributes.get(
                "fechaInicioInscripcion");

        if (fechaInicioInscripcion != null) {
            setFechaInicioInscripcion(fechaInicioInscripcion);
        }

        Date modifiedDate = (Date) attributes.get("modifiedDate");

        if (modifiedDate != null) {
            setModifiedDate(modifiedDate);
        }

        String descripcion = (String) attributes.get("descripcion");

        if (descripcion != null) {
            setDescripcion(descripcion);
        }

        String premio = (String) attributes.get("premio");

        if (premio != null) {
            setPremio(premio);
        }

        Date fechaFinInscripcion = (Date) attributes.get("fechaFinInscripcion");

        if (fechaFinInscripcion != null) {
            setFechaFinInscripcion(fechaFinInscripcion);
        }

        Date fechaPublicacionConcurso = (Date) attributes.get(
                "fechaPublicacionConcurso");

        if (fechaPublicacionConcurso != null) {
            setFechaPublicacionConcurso(fechaPublicacionConcurso);
        }

        Date fechaPublicacionGanador = (Date) attributes.get(
                "fechaPublicacionGanador");

        if (fechaPublicacionGanador != null) {
            setFechaPublicacionGanador(fechaPublicacionGanador);
        }

        Date fechaInicioEntrega = (Date) attributes.get("fechaInicioEntrega");

        if (fechaInicioEntrega != null) {
            setFechaInicioEntrega(fechaInicioEntrega);
        }

        Date fechaFinEntrega = (Date) attributes.get("fechaFinEntrega");

        if (fechaFinEntrega != null) {
            setFechaFinEntrega(fechaFinEntrega);
        }

        Long empresaId = (Long) attributes.get("empresaId");

        if (empresaId != null) {
            setEmpresaId(empresaId);
        }

        String documento = (String) attributes.get("documento");

        if (documento != null) {
            setDocumento(documento);
        }
    }

    /**
    * Returns the primary key of this concurso.
    *
    * @return the primary key of this concurso
    */
    @Override
    public long getPrimaryKey() {
        return _concurso.getPrimaryKey();
    }

    /**
    * Sets the primary key of this concurso.
    *
    * @param primaryKey the primary key of this concurso
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _concurso.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the concurso ID of this concurso.
    *
    * @return the concurso ID of this concurso
    */
    @Override
    public long getConcursoId() {
        return _concurso.getConcursoId();
    }

    /**
    * Sets the concurso ID of this concurso.
    *
    * @param concursoId the concurso ID of this concurso
    */
    @Override
    public void setConcursoId(long concursoId) {
        _concurso.setConcursoId(concursoId);
    }

    /**
    * Returns the group ID of this concurso.
    *
    * @return the group ID of this concurso
    */
    @Override
    public long getGroupId() {
        return _concurso.getGroupId();
    }

    /**
    * Sets the group ID of this concurso.
    *
    * @param groupId the group ID of this concurso
    */
    @Override
    public void setGroupId(long groupId) {
        _concurso.setGroupId(groupId);
    }

    /**
    * Returns the company ID of this concurso.
    *
    * @return the company ID of this concurso
    */
    @Override
    public long getCompanyId() {
        return _concurso.getCompanyId();
    }

    /**
    * Sets the company ID of this concurso.
    *
    * @param companyId the company ID of this concurso
    */
    @Override
    public void setCompanyId(long companyId) {
        _concurso.setCompanyId(companyId);
    }

    /**
    * Returns the user ID of this concurso.
    *
    * @return the user ID of this concurso
    */
    @Override
    public long getUserId() {
        return _concurso.getUserId();
    }

    /**
    * Sets the user ID of this concurso.
    *
    * @param userId the user ID of this concurso
    */
    @Override
    public void setUserId(long userId) {
        _concurso.setUserId(userId);
    }

    /**
    * Returns the user uuid of this concurso.
    *
    * @return the user uuid of this concurso
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.lang.String getUserUuid()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _concurso.getUserUuid();
    }

    /**
    * Sets the user uuid of this concurso.
    *
    * @param userUuid the user uuid of this concurso
    */
    @Override
    public void setUserUuid(java.lang.String userUuid) {
        _concurso.setUserUuid(userUuid);
    }

    /**
    * Returns the nombre of this concurso.
    *
    * @return the nombre of this concurso
    */
    @Override
    public java.lang.String getNombre() {
        return _concurso.getNombre();
    }

    /**
    * Sets the nombre of this concurso.
    *
    * @param nombre the nombre of this concurso
    */
    @Override
    public void setNombre(java.lang.String nombre) {
        _concurso.setNombre(nombre);
    }

    /**
    * Returns the fecha inicio inscripcion of this concurso.
    *
    * @return the fecha inicio inscripcion of this concurso
    */
    @Override
    public java.util.Date getFechaInicioInscripcion() {
        return _concurso.getFechaInicioInscripcion();
    }

    /**
    * Sets the fecha inicio inscripcion of this concurso.
    *
    * @param fechaInicioInscripcion the fecha inicio inscripcion of this concurso
    */
    @Override
    public void setFechaInicioInscripcion(java.util.Date fechaInicioInscripcion) {
        _concurso.setFechaInicioInscripcion(fechaInicioInscripcion);
    }

    /**
    * Returns the modified date of this concurso.
    *
    * @return the modified date of this concurso
    */
    @Override
    public java.util.Date getModifiedDate() {
        return _concurso.getModifiedDate();
    }

    /**
    * Sets the modified date of this concurso.
    *
    * @param modifiedDate the modified date of this concurso
    */
    @Override
    public void setModifiedDate(java.util.Date modifiedDate) {
        _concurso.setModifiedDate(modifiedDate);
    }

    /**
    * Returns the descripcion of this concurso.
    *
    * @return the descripcion of this concurso
    */
    @Override
    public java.lang.String getDescripcion() {
        return _concurso.getDescripcion();
    }

    /**
    * Sets the descripcion of this concurso.
    *
    * @param descripcion the descripcion of this concurso
    */
    @Override
    public void setDescripcion(java.lang.String descripcion) {
        _concurso.setDescripcion(descripcion);
    }

    /**
    * Returns the premio of this concurso.
    *
    * @return the premio of this concurso
    */
    @Override
    public java.lang.String getPremio() {
        return _concurso.getPremio();
    }

    /**
    * Sets the premio of this concurso.
    *
    * @param premio the premio of this concurso
    */
    @Override
    public void setPremio(java.lang.String premio) {
        _concurso.setPremio(premio);
    }

    /**
    * Returns the fecha fin inscripcion of this concurso.
    *
    * @return the fecha fin inscripcion of this concurso
    */
    @Override
    public java.util.Date getFechaFinInscripcion() {
        return _concurso.getFechaFinInscripcion();
    }

    /**
    * Sets the fecha fin inscripcion of this concurso.
    *
    * @param fechaFinInscripcion the fecha fin inscripcion of this concurso
    */
    @Override
    public void setFechaFinInscripcion(java.util.Date fechaFinInscripcion) {
        _concurso.setFechaFinInscripcion(fechaFinInscripcion);
    }

    /**
    * Returns the fecha publicacion concurso of this concurso.
    *
    * @return the fecha publicacion concurso of this concurso
    */
    @Override
    public java.util.Date getFechaPublicacionConcurso() {
        return _concurso.getFechaPublicacionConcurso();
    }

    /**
    * Sets the fecha publicacion concurso of this concurso.
    *
    * @param fechaPublicacionConcurso the fecha publicacion concurso of this concurso
    */
    @Override
    public void setFechaPublicacionConcurso(
        java.util.Date fechaPublicacionConcurso) {
        _concurso.setFechaPublicacionConcurso(fechaPublicacionConcurso);
    }

    /**
    * Returns the fecha publicacion ganador of this concurso.
    *
    * @return the fecha publicacion ganador of this concurso
    */
    @Override
    public java.util.Date getFechaPublicacionGanador() {
        return _concurso.getFechaPublicacionGanador();
    }

    /**
    * Sets the fecha publicacion ganador of this concurso.
    *
    * @param fechaPublicacionGanador the fecha publicacion ganador of this concurso
    */
    @Override
    public void setFechaPublicacionGanador(
        java.util.Date fechaPublicacionGanador) {
        _concurso.setFechaPublicacionGanador(fechaPublicacionGanador);
    }

    /**
    * Returns the fecha inicio entrega of this concurso.
    *
    * @return the fecha inicio entrega of this concurso
    */
    @Override
    public java.util.Date getFechaInicioEntrega() {
        return _concurso.getFechaInicioEntrega();
    }

    /**
    * Sets the fecha inicio entrega of this concurso.
    *
    * @param fechaInicioEntrega the fecha inicio entrega of this concurso
    */
    @Override
    public void setFechaInicioEntrega(java.util.Date fechaInicioEntrega) {
        _concurso.setFechaInicioEntrega(fechaInicioEntrega);
    }

    /**
    * Returns the fecha fin entrega of this concurso.
    *
    * @return the fecha fin entrega of this concurso
    */
    @Override
    public java.util.Date getFechaFinEntrega() {
        return _concurso.getFechaFinEntrega();
    }

    /**
    * Sets the fecha fin entrega of this concurso.
    *
    * @param fechaFinEntrega the fecha fin entrega of this concurso
    */
    @Override
    public void setFechaFinEntrega(java.util.Date fechaFinEntrega) {
        _concurso.setFechaFinEntrega(fechaFinEntrega);
    }

    /**
    * Returns the empresa ID of this concurso.
    *
    * @return the empresa ID of this concurso
    */
    @Override
    public long getEmpresaId() {
        return _concurso.getEmpresaId();
    }

    /**
    * Sets the empresa ID of this concurso.
    *
    * @param empresaId the empresa ID of this concurso
    */
    @Override
    public void setEmpresaId(long empresaId) {
        _concurso.setEmpresaId(empresaId);
    }

    /**
    * Returns the documento of this concurso.
    *
    * @return the documento of this concurso
    */
    @Override
    public java.lang.String getDocumento() {
        return _concurso.getDocumento();
    }

    /**
    * Sets the documento of this concurso.
    *
    * @param documento the documento of this concurso
    */
    @Override
    public void setDocumento(java.lang.String documento) {
        _concurso.setDocumento(documento);
    }

    @Override
    public boolean isNew() {
        return _concurso.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _concurso.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _concurso.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _concurso.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _concurso.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _concurso.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _concurso.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _concurso.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _concurso.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _concurso.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _concurso.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new ConcursoWrapper((Concurso) _concurso.clone());
    }

    @Override
    public int compareTo(
        com.telefonica.plataformaconcursos.model.Concurso concurso) {
        return _concurso.compareTo(concurso);
    }

    @Override
    public int hashCode() {
        return _concurso.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.telefonica.plataformaconcursos.model.Concurso> toCacheModel() {
        return _concurso.toCacheModel();
    }

    @Override
    public com.telefonica.plataformaconcursos.model.Concurso toEscapedModel() {
        return new ConcursoWrapper(_concurso.toEscapedModel());
    }

    @Override
    public com.telefonica.plataformaconcursos.model.Concurso toUnescapedModel() {
        return new ConcursoWrapper(_concurso.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _concurso.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _concurso.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _concurso.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ConcursoWrapper)) {
            return false;
        }

        ConcursoWrapper concursoWrapper = (ConcursoWrapper) obj;

        if (Validator.equals(_concurso, concursoWrapper._concurso)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Concurso getWrappedConcurso() {
        return _concurso;
    }

    @Override
    public Concurso getWrappedModel() {
        return _concurso;
    }

    @Override
    public void resetOriginalValues() {
        _concurso.resetOriginalValues();
    }
}
