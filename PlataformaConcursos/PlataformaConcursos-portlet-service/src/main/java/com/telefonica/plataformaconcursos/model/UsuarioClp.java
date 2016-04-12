package com.telefonica.plataformaconcursos.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.telefonica.plataformaconcursos.service.ClpSerializer;
import com.telefonica.plataformaconcursos.service.UsuarioLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class UsuarioClp extends BaseModelImpl<Usuario> implements Usuario {
    private long _usuarioId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _nombre;
    private Date _createDate;
    private Date _modifiedDate;
    private String _apellidos;
    private String _correoElectronico;
    private String _password1;
    private String _password2;
    private String _documento;
    private String _puntuacionObtenida;
    private BaseModel<?> _usuarioRemoteModel;
    private Class<?> _clpSerializerClass = com.telefonica.plataformaconcursos.service.ClpSerializer.class;

    public UsuarioClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Usuario.class;
    }

    @Override
    public String getModelClassName() {
        return Usuario.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _usuarioId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setUsuarioId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _usuarioId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("usuarioId", getUsuarioId());
        attributes.put("groupId", getGroupId());
        attributes.put("companyId", getCompanyId());
        attributes.put("userId", getUserId());
        attributes.put("nombre", getNombre());
        attributes.put("createDate", getCreateDate());
        attributes.put("modifiedDate", getModifiedDate());
        attributes.put("apellidos", getApellidos());
        attributes.put("correoElectronico", getCorreoElectronico());
        attributes.put("password1", getPassword1());
        attributes.put("password2", getPassword2());
        attributes.put("documento", getDocumento());
        attributes.put("puntuacionObtenida", getPuntuacionObtenida());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long usuarioId = (Long) attributes.get("usuarioId");

        if (usuarioId != null) {
            setUsuarioId(usuarioId);
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

        String apellidos = (String) attributes.get("apellidos");

        if (apellidos != null) {
            setApellidos(apellidos);
        }

        String correoElectronico = (String) attributes.get("correoElectronico");

        if (correoElectronico != null) {
            setCorreoElectronico(correoElectronico);
        }

        String password1 = (String) attributes.get("password1");

        if (password1 != null) {
            setPassword1(password1);
        }

        String password2 = (String) attributes.get("password2");

        if (password2 != null) {
            setPassword2(password2);
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

    @Override
    public long getUsuarioId() {
        return _usuarioId;
    }

    @Override
    public void setUsuarioId(long usuarioId) {
        _usuarioId = usuarioId;

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setUsuarioId", long.class);

                method.invoke(_usuarioRemoteModel, usuarioId);
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

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_usuarioRemoteModel, groupId);
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

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_usuarioRemoteModel, companyId);
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

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_usuarioRemoteModel, userId);
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

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setNombre", String.class);

                method.invoke(_usuarioRemoteModel, nombre);
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

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_usuarioRemoteModel, createDate);
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

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_usuarioRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getApellidos() {
        return _apellidos;
    }

    @Override
    public void setApellidos(String apellidos) {
        _apellidos = apellidos;

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setApellidos", String.class);

                method.invoke(_usuarioRemoteModel, apellidos);
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

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setCorreoElectronico",
                        String.class);

                method.invoke(_usuarioRemoteModel, correoElectronico);
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

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setPassword1", String.class);

                method.invoke(_usuarioRemoteModel, password1);
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

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setPassword2", String.class);

                method.invoke(_usuarioRemoteModel, password2);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDocumento() {
        return _documento;
    }

    @Override
    public void setDocumento(String documento) {
        _documento = documento;

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setDocumento", String.class);

                method.invoke(_usuarioRemoteModel, documento);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPuntuacionObtenida() {
        return _puntuacionObtenida;
    }

    @Override
    public void setPuntuacionObtenida(String puntuacionObtenida) {
        _puntuacionObtenida = puntuacionObtenida;

        if (_usuarioRemoteModel != null) {
            try {
                Class<?> clazz = _usuarioRemoteModel.getClass();

                Method method = clazz.getMethod("setPuntuacionObtenida",
                        String.class);

                method.invoke(_usuarioRemoteModel, puntuacionObtenida);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getUsuarioRemoteModel() {
        return _usuarioRemoteModel;
    }

    public void setUsuarioRemoteModel(BaseModel<?> usuarioRemoteModel) {
        _usuarioRemoteModel = usuarioRemoteModel;
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

        Class<?> remoteModelClass = _usuarioRemoteModel.getClass();

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

        Object returnValue = method.invoke(_usuarioRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            UsuarioLocalServiceUtil.addUsuario(this);
        } else {
            UsuarioLocalServiceUtil.updateUsuario(this);
        }
    }

    @Override
    public Usuario toEscapedModel() {
        return (Usuario) ProxyUtil.newProxyInstance(Usuario.class.getClassLoader(),
            new Class[] { Usuario.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        UsuarioClp clone = new UsuarioClp();

        clone.setUsuarioId(getUsuarioId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setNombre(getNombre());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setApellidos(getApellidos());
        clone.setCorreoElectronico(getCorreoElectronico());
        clone.setPassword1(getPassword1());
        clone.setPassword2(getPassword2());
        clone.setDocumento(getDocumento());
        clone.setPuntuacionObtenida(getPuntuacionObtenida());

        return clone;
    }

    @Override
    public int compareTo(Usuario usuario) {
        long primaryKey = usuario.getPrimaryKey();

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

        if (!(obj instanceof UsuarioClp)) {
            return false;
        }

        UsuarioClp usuario = (UsuarioClp) obj;

        long primaryKey = usuario.getPrimaryKey();

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

        sb.append("{usuarioId=");
        sb.append(getUsuarioId());
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
        sb.append(", apellidos=");
        sb.append(getApellidos());
        sb.append(", correoElectronico=");
        sb.append(getCorreoElectronico());
        sb.append(", password1=");
        sb.append(getPassword1());
        sb.append(", password2=");
        sb.append(getPassword2());
        sb.append(", documento=");
        sb.append(getDocumento());
        sb.append(", puntuacionObtenida=");
        sb.append(getPuntuacionObtenida());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("com.telefonica.plataformaconcursos.model.Usuario");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>usuarioId</column-name><column-value><![CDATA[");
        sb.append(getUsuarioId());
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
            "<column><column-name>apellidos</column-name><column-value><![CDATA[");
        sb.append(getApellidos());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>correoElectronico</column-name><column-value><![CDATA[");
        sb.append(getCorreoElectronico());
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
            "<column><column-name>documento</column-name><column-value><![CDATA[");
        sb.append(getDocumento());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>puntuacionObtenida</column-name><column-value><![CDATA[");
        sb.append(getPuntuacionObtenida());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
