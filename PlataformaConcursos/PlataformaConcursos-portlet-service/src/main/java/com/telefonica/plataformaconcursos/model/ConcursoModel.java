package com.telefonica.plataformaconcursos.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Concurso service. Represents a row in the &quot;concurso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.telefonica.plataformaconcursos.model.impl.ConcursoModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.telefonica.plataformaconcursos.model.impl.ConcursoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Concurso
 * @see com.telefonica.plataformaconcursos.model.impl.ConcursoImpl
 * @see com.telefonica.plataformaconcursos.model.impl.ConcursoModelImpl
 * @generated
 */
public interface ConcursoModel extends BaseModel<Concurso> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a concurso model instance should use the {@link Concurso} interface instead.
     */

    /**
     * Returns the primary key of this concurso.
     *
     * @return the primary key of this concurso
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this concurso.
     *
     * @param primaryKey the primary key of this concurso
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the concurso ID of this concurso.
     *
     * @return the concurso ID of this concurso
     */
    public long getConcursoId();

    /**
     * Sets the concurso ID of this concurso.
     *
     * @param concursoId the concurso ID of this concurso
     */
    public void setConcursoId(long concursoId);

    /**
     * Returns the group ID of this concurso.
     *
     * @return the group ID of this concurso
     */
    public long getGroupId();

    /**
     * Sets the group ID of this concurso.
     *
     * @param groupId the group ID of this concurso
     */
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this concurso.
     *
     * @return the company ID of this concurso
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this concurso.
     *
     * @param companyId the company ID of this concurso
     */
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this concurso.
     *
     * @return the user ID of this concurso
     */
    public long getUserId();

    /**
     * Sets the user ID of this concurso.
     *
     * @param userId the user ID of this concurso
     */
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this concurso.
     *
     * @return the user uuid of this concurso
     * @throws SystemException if a system exception occurred
     */
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this concurso.
     *
     * @param userUuid the user uuid of this concurso
     */
    public void setUserUuid(String userUuid);

    /**
     * Returns the nombre of this concurso.
     *
     * @return the nombre of this concurso
     */
    @AutoEscape
    public String getNombre();

    /**
     * Sets the nombre of this concurso.
     *
     * @param nombre the nombre of this concurso
     */
    public void setNombre(String nombre);

    /**
     * Returns the fecha inicio inscripcion of this concurso.
     *
     * @return the fecha inicio inscripcion of this concurso
     */
    public Date getFechaInicioInscripcion();

    /**
     * Sets the fecha inicio inscripcion of this concurso.
     *
     * @param fechaInicioInscripcion the fecha inicio inscripcion of this concurso
     */
    public void setFechaInicioInscripcion(Date fechaInicioInscripcion);

    /**
     * Returns the modified date of this concurso.
     *
     * @return the modified date of this concurso
     */
    public Date getModifiedDate();

    /**
     * Sets the modified date of this concurso.
     *
     * @param modifiedDate the modified date of this concurso
     */
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the descripcion of this concurso.
     *
     * @return the descripcion of this concurso
     */
    @AutoEscape
    public String getDescripcion();

    /**
     * Sets the descripcion of this concurso.
     *
     * @param descripcion the descripcion of this concurso
     */
    public void setDescripcion(String descripcion);

    /**
     * Returns the premio of this concurso.
     *
     * @return the premio of this concurso
     */
    @AutoEscape
    public String getPremio();

    /**
     * Sets the premio of this concurso.
     *
     * @param premio the premio of this concurso
     */
    public void setPremio(String premio);

    /**
     * Returns the fecha fin inscripcion of this concurso.
     *
     * @return the fecha fin inscripcion of this concurso
     */
    public Date getFechaFinInscripcion();

    /**
     * Sets the fecha fin inscripcion of this concurso.
     *
     * @param fechaFinInscripcion the fecha fin inscripcion of this concurso
     */
    public void setFechaFinInscripcion(Date fechaFinInscripcion);

    /**
     * Returns the fecha publicacion concurso of this concurso.
     *
     * @return the fecha publicacion concurso of this concurso
     */
    public Date getFechaPublicacionConcurso();

    /**
     * Sets the fecha publicacion concurso of this concurso.
     *
     * @param fechaPublicacionConcurso the fecha publicacion concurso of this concurso
     */
    public void setFechaPublicacionConcurso(Date fechaPublicacionConcurso);

    /**
     * Returns the fecha publicacion ganador of this concurso.
     *
     * @return the fecha publicacion ganador of this concurso
     */
    public Date getFechaPublicacionGanador();

    /**
     * Sets the fecha publicacion ganador of this concurso.
     *
     * @param fechaPublicacionGanador the fecha publicacion ganador of this concurso
     */
    public void setFechaPublicacionGanador(Date fechaPublicacionGanador);

    /**
     * Returns the fecha inicio entrega of this concurso.
     *
     * @return the fecha inicio entrega of this concurso
     */
    public Date getFechaInicioEntrega();

    /**
     * Sets the fecha inicio entrega of this concurso.
     *
     * @param fechaInicioEntrega the fecha inicio entrega of this concurso
     */
    public void setFechaInicioEntrega(Date fechaInicioEntrega);

    /**
     * Returns the fecha fin entrega of this concurso.
     *
     * @return the fecha fin entrega of this concurso
     */
    public Date getFechaFinEntrega();

    /**
     * Sets the fecha fin entrega of this concurso.
     *
     * @param fechaFinEntrega the fecha fin entrega of this concurso
     */
    public void setFechaFinEntrega(Date fechaFinEntrega);

    /**
     * Returns the empresa ID of this concurso.
     *
     * @return the empresa ID of this concurso
     */
    public long getEmpresaId();

    /**
     * Sets the empresa ID of this concurso.
     *
     * @param empresaId the empresa ID of this concurso
     */
    public void setEmpresaId(long empresaId);

    /**
     * Returns the documento of this concurso.
     *
     * @return the documento of this concurso
     */
    @AutoEscape
    public String getDocumento();

    /**
     * Sets the documento of this concurso.
     *
     * @param documento the documento of this concurso
     */
    public void setDocumento(String documento);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(
        com.telefonica.plataformaconcursos.model.Concurso concurso);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.telefonica.plataformaconcursos.model.Concurso> toCacheModel();

    @Override
    public com.telefonica.plataformaconcursos.model.Concurso toEscapedModel();

    @Override
    public com.telefonica.plataformaconcursos.model.Concurso toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
