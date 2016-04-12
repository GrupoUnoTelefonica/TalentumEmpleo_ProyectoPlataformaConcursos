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
 * The base model interface for the Usuario service. Represents a row in the &quot;usuario&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.telefonica.plataformaconcursos.model.impl.UsuarioModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.telefonica.plataformaconcursos.model.impl.UsuarioImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Usuario
 * @see com.telefonica.plataformaconcursos.model.impl.UsuarioImpl
 * @see com.telefonica.plataformaconcursos.model.impl.UsuarioModelImpl
 * @generated
 */
public interface UsuarioModel extends BaseModel<Usuario> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a usuario model instance should use the {@link Usuario} interface instead.
     */

    /**
     * Returns the primary key of this usuario.
     *
     * @return the primary key of this usuario
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this usuario.
     *
     * @param primaryKey the primary key of this usuario
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the usuario ID of this usuario.
     *
     * @return the usuario ID of this usuario
     */
    public long getUsuarioId();

    /**
     * Sets the usuario ID of this usuario.
     *
     * @param usuarioId the usuario ID of this usuario
     */
    public void setUsuarioId(long usuarioId);

    /**
     * Returns the group ID of this usuario.
     *
     * @return the group ID of this usuario
     */
    public long getGroupId();

    /**
     * Sets the group ID of this usuario.
     *
     * @param groupId the group ID of this usuario
     */
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this usuario.
     *
     * @return the company ID of this usuario
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this usuario.
     *
     * @param companyId the company ID of this usuario
     */
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this usuario.
     *
     * @return the user ID of this usuario
     */
    public long getUserId();

    /**
     * Sets the user ID of this usuario.
     *
     * @param userId the user ID of this usuario
     */
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this usuario.
     *
     * @return the user uuid of this usuario
     * @throws SystemException if a system exception occurred
     */
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this usuario.
     *
     * @param userUuid the user uuid of this usuario
     */
    public void setUserUuid(String userUuid);

    /**
     * Returns the nombre of this usuario.
     *
     * @return the nombre of this usuario
     */
    @AutoEscape
    public String getNombre();

    /**
     * Sets the nombre of this usuario.
     *
     * @param nombre the nombre of this usuario
     */
    public void setNombre(String nombre);

    /**
     * Returns the create date of this usuario.
     *
     * @return the create date of this usuario
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this usuario.
     *
     * @param createDate the create date of this usuario
     */
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this usuario.
     *
     * @return the modified date of this usuario
     */
    public Date getModifiedDate();

    /**
     * Sets the modified date of this usuario.
     *
     * @param modifiedDate the modified date of this usuario
     */
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the apellidos of this usuario.
     *
     * @return the apellidos of this usuario
     */
    @AutoEscape
    public String getApellidos();

    /**
     * Sets the apellidos of this usuario.
     *
     * @param apellidos the apellidos of this usuario
     */
    public void setApellidos(String apellidos);

    /**
     * Returns the correo electronico of this usuario.
     *
     * @return the correo electronico of this usuario
     */
    @AutoEscape
    public String getCorreoElectronico();

    /**
     * Sets the correo electronico of this usuario.
     *
     * @param correoElectronico the correo electronico of this usuario
     */
    public void setCorreoElectronico(String correoElectronico);

    /**
     * Returns the password1 of this usuario.
     *
     * @return the password1 of this usuario
     */
    @AutoEscape
    public String getPassword1();

    /**
     * Sets the password1 of this usuario.
     *
     * @param password1 the password1 of this usuario
     */
    public void setPassword1(String password1);

    /**
     * Returns the password2 of this usuario.
     *
     * @return the password2 of this usuario
     */
    @AutoEscape
    public String getPassword2();

    /**
     * Sets the password2 of this usuario.
     *
     * @param password2 the password2 of this usuario
     */
    public void setPassword2(String password2);

    /**
     * Returns the documento of this usuario.
     *
     * @return the documento of this usuario
     */
    @AutoEscape
    public String getDocumento();

    /**
     * Sets the documento of this usuario.
     *
     * @param documento the documento of this usuario
     */
    public void setDocumento(String documento);

    /**
     * Returns the puntuacion obtenida of this usuario.
     *
     * @return the puntuacion obtenida of this usuario
     */
    @AutoEscape
    public String getPuntuacionObtenida();

    /**
     * Sets the puntuacion obtenida of this usuario.
     *
     * @param puntuacionObtenida the puntuacion obtenida of this usuario
     */
    public void setPuntuacionObtenida(String puntuacionObtenida);

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
        com.telefonica.plataformaconcursos.model.Usuario usuario);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.telefonica.plataformaconcursos.model.Usuario> toCacheModel();

    @Override
    public com.telefonica.plataformaconcursos.model.Usuario toEscapedModel();

    @Override
    public com.telefonica.plataformaconcursos.model.Usuario toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}