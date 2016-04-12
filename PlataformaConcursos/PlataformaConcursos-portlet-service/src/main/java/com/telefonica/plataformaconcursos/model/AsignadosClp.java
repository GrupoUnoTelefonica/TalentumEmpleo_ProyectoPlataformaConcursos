package com.telefonica.plataformaconcursos.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.telefonica.plataformaconcursos.service.AsignadosLocalServiceUtil;
import com.telefonica.plataformaconcursos.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class AsignadosClp extends BaseModelImpl<Asignados> implements Asignados {
    private String _asignadosId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _usuarioId;
    private long _concursoId;
    private String _documento;
    private String _puntuacionObtenida;
    private BaseModel<?> _asignadosRemoteModel;
    private Class<?> _clpSerializerClass = com.telefonica.plataformaconcursos.service.ClpSerializer.class;

    public AsignadosClp() {
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
    public String getPrimaryKey() {
        return _asignadosId;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setAsignadosId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _asignadosId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
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

    @Override
    public String getAsignadosId() {
        return _asignadosId;
    }

    @Override
    public void setAsignadosId(String asignadosId) {
        _asignadosId = asignadosId;

        if (_asignadosRemoteModel != null) {
            try {
                Class<?> clazz = _asignadosRemoteModel.getClass();

                Method method = clazz.getMethod("setAsignadosId", String.class);

                method.invoke(_asignadosRemoteModel, asignadosId);
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

        if (_asignadosRemoteModel != null) {
            try {
                Class<?> clazz = _asignadosRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_asignadosRemoteModel, groupId);
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

        if (_asignadosRemoteModel != null) {
            try {
                Class<?> clazz = _asignadosRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_asignadosRemoteModel, companyId);
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

        if (_asignadosRemoteModel != null) {
            try {
                Class<?> clazz = _asignadosRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_asignadosRemoteModel, userId);
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
    public String getUserName() {
        return _userName;
    }

    @Override
    public void setUserName(String userName) {
        _userName = userName;

        if (_asignadosRemoteModel != null) {
            try {
                Class<?> clazz = _asignadosRemoteModel.getClass();

                Method method = clazz.getMethod("setUserName", String.class);

                method.invoke(_asignadosRemoteModel, userName);
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

        if (_asignadosRemoteModel != null) {
            try {
                Class<?> clazz = _asignadosRemoteModel.getClass();

                Method method = clazz.getMethod("setCreateDate", Date.class);

                method.invoke(_asignadosRemoteModel, createDate);
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

        if (_asignadosRemoteModel != null) {
            try {
                Class<?> clazz = _asignadosRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_asignadosRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getUsuarioId() {
        return _usuarioId;
    }

    @Override
    public void setUsuarioId(long usuarioId) {
        _usuarioId = usuarioId;

        if (_asignadosRemoteModel != null) {
            try {
                Class<?> clazz = _asignadosRemoteModel.getClass();

                Method method = clazz.getMethod("setUsuarioId", long.class);

                method.invoke(_asignadosRemoteModel, usuarioId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getConcursoId() {
        return _concursoId;
    }

    @Override
    public void setConcursoId(long concursoId) {
        _concursoId = concursoId;

        if (_asignadosRemoteModel != null) {
            try {
                Class<?> clazz = _asignadosRemoteModel.getClass();

                Method method = clazz.getMethod("setConcursoId", long.class);

                method.invoke(_asignadosRemoteModel, concursoId);
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

        if (_asignadosRemoteModel != null) {
            try {
                Class<?> clazz = _asignadosRemoteModel.getClass();

                Method method = clazz.getMethod("setDocumento", String.class);

                method.invoke(_asignadosRemoteModel, documento);
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

        if (_asignadosRemoteModel != null) {
            try {
                Class<?> clazz = _asignadosRemoteModel.getClass();

                Method method = clazz.getMethod("setPuntuacionObtenida",
                        String.class);

                method.invoke(_asignadosRemoteModel, puntuacionObtenida);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getAsignadosRemoteModel() {
        return _asignadosRemoteModel;
    }

    public void setAsignadosRemoteModel(BaseModel<?> asignadosRemoteModel) {
        _asignadosRemoteModel = asignadosRemoteModel;
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

        Class<?> remoteModelClass = _asignadosRemoteModel.getClass();

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

        Object returnValue = method.invoke(_asignadosRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AsignadosLocalServiceUtil.addAsignados(this);
        } else {
            AsignadosLocalServiceUtil.updateAsignados(this);
        }
    }

    @Override
    public Asignados toEscapedModel() {
        return (Asignados) ProxyUtil.newProxyInstance(Asignados.class.getClassLoader(),
            new Class[] { Asignados.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        AsignadosClp clone = new AsignadosClp();

        clone.setAsignadosId(getAsignadosId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setUserName(getUserName());
        clone.setCreateDate(getCreateDate());
        clone.setModifiedDate(getModifiedDate());
        clone.setUsuarioId(getUsuarioId());
        clone.setConcursoId(getConcursoId());
        clone.setDocumento(getDocumento());
        clone.setPuntuacionObtenida(getPuntuacionObtenida());

        return clone;
    }

    @Override
    public int compareTo(Asignados asignados) {
        String primaryKey = asignados.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AsignadosClp)) {
            return false;
        }

        AsignadosClp asignados = (AsignadosClp) obj;

        String primaryKey = asignados.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
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
        return getPrimaryKey().hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(23);

        sb.append("{asignadosId=");
        sb.append(getAsignadosId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", userName=");
        sb.append(getUserName());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", usuarioId=");
        sb.append(getUsuarioId());
        sb.append(", concursoId=");
        sb.append(getConcursoId());
        sb.append(", documento=");
        sb.append(getDocumento());
        sb.append(", puntuacionObtenida=");
        sb.append(getPuntuacionObtenida());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(37);

        sb.append("<model><model-name>");
        sb.append("com.telefonica.plataformaconcursos.model.Asignados");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>asignadosId</column-name><column-value><![CDATA[");
        sb.append(getAsignadosId());
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
            "<column><column-name>userName</column-name><column-value><![CDATA[");
        sb.append(getUserName());
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
            "<column><column-name>usuarioId</column-name><column-value><![CDATA[");
        sb.append(getUsuarioId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>concursoId</column-name><column-value><![CDATA[");
        sb.append(getConcursoId());
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
