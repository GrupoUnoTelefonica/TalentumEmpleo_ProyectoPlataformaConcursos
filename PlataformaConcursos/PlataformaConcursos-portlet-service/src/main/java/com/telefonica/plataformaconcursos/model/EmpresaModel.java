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
 * The base model interface for the Empresa service. Represents a row in the &quot;empresa&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.telefonica.plataformaconcursos.model.impl.EmpresaModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.telefonica.plataformaconcursos.model.impl.EmpresaImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Empresa
 * @see com.telefonica.plataformaconcursos.model.impl.EmpresaImpl
 * @see com.telefonica.plataformaconcursos.model.impl.EmpresaModelImpl
 * @generated
 */
public interface EmpresaModel extends BaseModel<Empresa> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a empresa model instance should use the {@link Empresa} interface instead.
     */

    /**
     * Returns the primary key of this empresa.
     *
     * @return the primary key of this empresa
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this empresa.
     *
     * @param primaryKey the primary key of this empresa
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the empresa ID of this empresa.
     *
     * @return the empresa ID of this empresa
     */
    public long getEmpresaId();

    /**
     * Sets the empresa ID of this empresa.
     *
     * @param empresaId the empresa ID of this empresa
     */
    public void setEmpresaId(long empresaId);

    /**
     * Returns the group ID of this empresa.
     *
     * @return the group ID of this empresa
     */
    public long getGroupId();

    /**
     * Sets the group ID of this empresa.
     *
     * @param groupId the group ID of this empresa
     */
    public void setGroupId(long groupId);

    /**
     * Returns the company ID of this empresa.
     *
     * @return the company ID of this empresa
     */
    public long getCompanyId();

    /**
     * Sets the company ID of this empresa.
     *
     * @param companyId the company ID of this empresa
     */
    public void setCompanyId(long companyId);

    /**
     * Returns the user ID of this empresa.
     *
     * @return the user ID of this empresa
     */
    public long getUserId();

    /**
     * Sets the user ID of this empresa.
     *
     * @param userId the user ID of this empresa
     */
    public void setUserId(long userId);

    /**
     * Returns the user uuid of this empresa.
     *
     * @return the user uuid of this empresa
     * @throws SystemException if a system exception occurred
     */
    public String getUserUuid() throws SystemException;

    /**
     * Sets the user uuid of this empresa.
     *
     * @param userUuid the user uuid of this empresa
     */
    public void setUserUuid(String userUuid);

    /**
     * Returns the nombre of this empresa.
     *
     * @return the nombre of this empresa
     */
    @AutoEscape
    public String getNombre();

    /**
     * Sets the nombre of this empresa.
     *
     * @param nombre the nombre of this empresa
     */
    public void setNombre(String nombre);

    /**
     * Returns the create date of this empresa.
     *
     * @return the create date of this empresa
     */
    public Date getCreateDate();

    /**
     * Sets the create date of this empresa.
     *
     * @param createDate the create date of this empresa
     */
    public void setCreateDate(Date createDate);

    /**
     * Returns the modified date of this empresa.
     *
     * @return the modified date of this empresa
     */
    public Date getModifiedDate();

    /**
     * Sets the modified date of this empresa.
     *
     * @param modifiedDate the modified date of this empresa
     */
    public void setModifiedDate(Date modifiedDate);

    /**
     * Returns the sector empresa of this empresa.
     *
     * @return the sector empresa of this empresa
     */
    @AutoEscape
    public String getSectorEmpresa();

    /**
     * Sets the sector empresa of this empresa.
     *
     * @param sectorEmpresa the sector empresa of this empresa
     */
    public void setSectorEmpresa(String sectorEmpresa);

    /**
     * Returns the cif of this empresa.
     *
     * @return the cif of this empresa
     */
    @AutoEscape
    public String getCif();

    /**
     * Sets the cif of this empresa.
     *
     * @param cif the cif of this empresa
     */
    public void setCif(String cif);

    /**
     * Returns the pais of this empresa.
     *
     * @return the pais of this empresa
     */
    @AutoEscape
    public String getPais();

    /**
     * Sets the pais of this empresa.
     *
     * @param pais the pais of this empresa
     */
    public void setPais(String pais);

    /**
     * Returns the password1 of this empresa.
     *
     * @return the password1 of this empresa
     */
    @AutoEscape
    public String getPassword1();

    /**
     * Sets the password1 of this empresa.
     *
     * @param password1 the password1 of this empresa
     */
    public void setPassword1(String password1);

    /**
     * Returns the password2 of this empresa.
     *
     * @return the password2 of this empresa
     */
    @AutoEscape
    public String getPassword2();

    /**
     * Sets the password2 of this empresa.
     *
     * @param password2 the password2 of this empresa
     */
    public void setPassword2(String password2);

    /**
     * Returns the correo electronico of this empresa.
     *
     * @return the correo electronico of this empresa
     */
    @AutoEscape
    public String getCorreoElectronico();

    /**
     * Sets the correo electronico of this empresa.
     *
     * @param correoElectronico the correo electronico of this empresa
     */
    public void setCorreoElectronico(String correoElectronico);

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
        com.telefonica.plataformaconcursos.model.Empresa empresa);

    @Override
    public int hashCode();

    @Override
    public CacheModel<com.telefonica.plataformaconcursos.model.Empresa> toCacheModel();

    @Override
    public com.telefonica.plataformaconcursos.model.Empresa toEscapedModel();

    @Override
    public com.telefonica.plataformaconcursos.model.Empresa toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
