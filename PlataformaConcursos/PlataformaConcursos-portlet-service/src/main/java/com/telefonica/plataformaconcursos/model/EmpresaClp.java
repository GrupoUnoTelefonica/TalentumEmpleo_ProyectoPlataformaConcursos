package com.telefonica.plataformaconcursos.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.telefonica.plataformaconcursos.service.ClpSerializer;
import com.telefonica.plataformaconcursos.service.EmpresaLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class EmpresaClp extends BaseModelImpl<Empresa> implements Empresa {
    private long _empresaId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _nombre;
    private Date _createDate;
    private Date _modifiedDate;
    private String _sectorEmpresa;
    private String _cif;
    private String _pais;
    private String _password1;
    private String _password2;
    private String _correoElectronico;
    private BaseModel<?> _empresaRemoteModel;
    private Class<?> _clpSerializerClass = com.telefonica.plataformaconcursos.service.ClpSerializer.class;

    public EmpresaClp() {
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
    public long getPrimaryKey() {
        return _empresaId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEmpresaId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _empresaId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getEmpresaId() {
        return _empresaId;
    }

    @Override
    public void setEmpresaId(long empresaId) {
        _empresaId = empresaId;

        if (_empresaRemoteModel != null) {
            try {
                Class<?> clazz = _empresaRemoteModel.getClass();

                Method method = clazz.getMethod("setEmpresaId", long.class);

                method.invoke(_empresaRemoteModel, empresaId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;

        if (_empresaRemoteModel != null) {
            try {
                Class<?> clazz = _empresaRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_empresaRemoteModel, groupId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;

        if (_empresaRemoteModel != null) {
            try {
                Class<?> clazz = _empresaRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_empresaRemoteModel, companyId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;

        if (_empresaRemoteModel != null) {
            try {
                Class<?> clazz = _empresaRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_empresaRemoteModel, userId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @Override
    public String getNombre() {
        return _nombre;
    }

    @Override
    public void setNombre(String nombre) {
        _nombre = nombre;

        if (_empresaRemoteModel != null) {
            try {
                Class<?> clazz = _empresaRemoteModel.getClass();

                Method method = clazz.getMethod("setNombre", String.class);

                method.invoke(_empresaRemoteModel, nombre);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;

        if (_empresaRemoteModel != null) {
            try {
                Class<?> clazz = _empresaRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_empresaRemoteModel, createDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;

        if (_empresaRemoteModel != null) {
            try {
                Class<?> clazz = _empresaRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_empresaRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSectorEmpresa() {
        return _sectorEmpresa;
    }

    @Override
    public void setSectorEmpresa(String sectorEmpresa) {
        _sectorEmpresa = sectorEmpresa;

        if (_empresaRemoteModel != null) {
            try {
                Class<?> clazz = _empresaRemoteModel.getClass();

                Method method = clazz.getMethod("setSectorEmpresa", String.class);

                method.invoke(_empresaRemoteModel, sectorEmpresa);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCif() {
        return _cif;
    }

    @Override
    public void setCif(String cif) {
        _cif = cif;

        if (_empresaRemoteModel != null) {
            try {
                Class<?> clazz = _empresaRemoteModel.getClass();

                Method method = clazz.getMethod("setCif", String.class);

                method.invoke(_empresaRemoteModel, cif);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPais() {
        return _pais;
    }

    @Override
    public void setPais(String pais) {
        _pais = pais;

        if (_empresaRemoteModel != null) {
            try {
                Class<?> clazz = _empresaRemoteModel.getClass();

                Method method = clazz.getMethod("setPais", String.class);

                method.invoke(_empresaRemoteModel, pais);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPassword1() {
        return _password1;
    }

    @Override
    public void setPassword1(String password1) {
        _password1 = password1;

        if (_empresaRemoteModel != null) {
            try {
                Class<?> clazz = _empresaRemoteModel.getClass();

                Method method = clazz.getMethod("setPassword1", String.class);

                method.invoke(_empresaRemoteModel, password1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPassword2() {
        return _password2;
    }

    @Override
    public void setPassword2(String password2) {
        _password2 = password2;

        if (_empresaRemoteModel != null) {
            try {
                Class<?> clazz = _empresaRemoteModel.getClass();

                Method method = clazz.getMethod("setPassword2", String.class);

                method.invoke(_empresaRemoteModel, password2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getCorreoElectronico() {
        return _correoElectronico;
    }

    @Override
    public void setCorreoElectronico(String correoElectronico) {
        _correoElectronico = correoElectronico;

        if (_empresaRemoteModel != null) {
            try {
                Class<?> clazz = _empresaRemoteModel.getClass();

                Method method = clazz.getMethod("setCorreoElectronico",
                        String.class);

                method.invoke(_empresaRemoteModel, correoElectronico);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEmpresaRemoteModel() {
        return _empresaRemoteModel;
    }

    public void setEmpresaRemoteModel(BaseModel<?> empresaRemoteModel) {
        _empresaRemoteModel = empresaRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _empresaRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_empresaRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EmpresaLocalServiceUtil.addEmpresa(this);
        } else {
            EmpresaLocalServiceUtil.updateEmpresa(this);
        }
    }

    @Override
    public Empresa toEscapedModel() {
        return (Empresa) ProxyUtil.newProxyInstance(Empresa.class.getClassLoader(),
            new Class[] { Empresa.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EmpresaClp clone = new EmpresaClp();

        clone.setEmpresaId(getEmpresaId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setNombre(getNombre());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setSectorEmpresa(getSectorEmpresa());
        clone.setCif(getCif());
        clone.setPais(getPais());
        clone.setPassword1(getPassword1());
        clone.setPassword2(getPassword2());
        clone.setCorreoElectronico(getCorreoElectronico());

        return clone;
    }

    @Override
    public int compareTo(Empresa empresa) {
        long primaryKey = empresa.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmpresaClp)) {
            return false;
        }

        EmpresaClp empresa = (EmpresaClp) obj;

        long primaryKey = empresa.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{empresaId=");
        sb.append(getEmpresaId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", nombre=");
        sb.append(getNombre());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", sectorEmpresa=");
        sb.append(getSectorEmpresa());
        sb.append(", cif=");
        sb.append(getCif());
        sb.append(", pais=");
        sb.append(getPais());
        sb.append(", password1=");
        sb.append(getPassword1());
        sb.append(", password2=");
        sb.append(getPassword2());
        sb.append(", correoElectronico=");
        sb.append(getCorreoElectronico());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("com.telefonica.plataformaconcursos.model.Empresa");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>empresaId</column-name><column-value><![CDATA[");
        sb.append(getEmpresaId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>groupId</column-name><column-value><![CDATA[");
        sb.append(getGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>companyId</column-name><column-value><![CDATA[");
        sb.append(getCompanyId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nombre</column-name><column-value><![CDATA[");
        sb.append(getNombre());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sectorEmpresa</column-name><column-value><![CDATA[");
        sb.append(getSectorEmpresa());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>cif</column-name><column-value><![CDATA[");
        sb.append(getCif());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>pais</column-name><column-value><![CDATA[");
        sb.append(getPais());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>password1</column-name><column-value><![CDATA[");
        sb.append(getPassword1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>password2</column-name><column-value><![CDATA[");
        sb.append(getPassword2());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>correoElectronico</column-name><column-value><![CDATA[");
        sb.append(getCorreoElectronico());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
