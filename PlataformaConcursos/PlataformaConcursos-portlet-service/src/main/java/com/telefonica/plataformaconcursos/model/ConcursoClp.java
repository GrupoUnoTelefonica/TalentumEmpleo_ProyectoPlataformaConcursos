package com.telefonica.plataformaconcursos.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import com.telefonica.plataformaconcursos.service.ClpSerializer;
import com.telefonica.plataformaconcursos.service.ConcursoLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class ConcursoClp extends BaseModelImpl<Concurso> implements Concurso {
    private long _concursoId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userUuid;
    private String _nombre;
    private Date _fechaInicioInscripcion;
    private Date _modifiedDate;
    private String _descripcion;
    private String _premio;
    private Date _fechaFinInscripcion;
    private Date _fechaPublicacionConcurso;
    private Date _fechaPublicacionGanador;
    private Date _fechaInicioEntrega;
    private Date _fechaFinEntrega;
    private long _empresaId;
    private String _documento;
    private BaseModel<?> _concursoRemoteModel;
    private Class<?> _clpSerializerClass = com.telefonica.plataformaconcursos.service.ClpSerializer.class;

    public ConcursoClp() {
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
    public long getPrimaryKey() {
        return _concursoId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setConcursoId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _concursoId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getConcursoId() {
        return _concursoId;
    }

    @Override
    public void setConcursoId(long concursoId) {
        _concursoId = concursoId;

        if (_concursoRemoteModel != null) {
            try {
                Class<?> clazz = _concursoRemoteModel.getClass();

                Method method = clazz.getMethod("setConcursoId", long.class);

                method.invoke(_concursoRemoteModel, concursoId);
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

        if (_concursoRemoteModel != null) {
            try {
                Class<?> clazz = _concursoRemoteModel.getClass();

                Method method = clazz.getMethod("setGroupId", long.class);

                method.invoke(_concursoRemoteModel, groupId);
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

        if (_concursoRemoteModel != null) {
            try {
                Class<?> clazz = _concursoRemoteModel.getClass();

                Method method = clazz.getMethod("setCompanyId", long.class);

                method.invoke(_concursoRemoteModel, companyId);
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

        if (_concursoRemoteModel != null) {
            try {
                Class<?> clazz = _concursoRemoteModel.getClass();

                Method method = clazz.getMethod("setUserId", long.class);

                method.invoke(_concursoRemoteModel, userId);
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

        if (_concursoRemoteModel != null) {
            try {
                Class<?> clazz = _concursoRemoteModel.getClass();

                Method method = clazz.getMethod("setNombre", String.class);

                method.invoke(_concursoRemoteModel, nombre);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getFechaInicioInscripcion() {
        return _fechaInicioInscripcion;
    }

    @Override
    public void setFechaInicioInscripcion(Date fechaInicioInscripcion) {
        _fechaInicioInscripcion = fechaInicioInscripcion;

        if (_concursoRemoteModel != null) {
            try {
                Class<?> clazz = _concursoRemoteModel.getClass();

                Method method = clazz.getMethod("setFechaInicioInscripcion",
                        Date.class);

                method.invoke(_concursoRemoteModel, fechaInicioInscripcion);
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

        if (_concursoRemoteModel != null) {
            try {
                Class<?> clazz = _concursoRemoteModel.getClass();

                Method method = clazz.getMethod("setModifiedDate", Date.class);

                method.invoke(_concursoRemoteModel, modifiedDate);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDescripcion() {
        return _descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        _descripcion = descripcion;

        if (_concursoRemoteModel != null) {
            try {
                Class<?> clazz = _concursoRemoteModel.getClass();

                Method method = clazz.getMethod("setDescripcion", String.class);

                method.invoke(_concursoRemoteModel, descripcion);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPremio() {
        return _premio;
    }

    @Override
    public void setPremio(String premio) {
        _premio = premio;

        if (_concursoRemoteModel != null) {
            try {
                Class<?> clazz = _concursoRemoteModel.getClass();

                Method method = clazz.getMethod("setPremio", String.class);

                method.invoke(_concursoRemoteModel, premio);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getFechaFinInscripcion() {
        return _fechaFinInscripcion;
    }

    @Override
    public void setFechaFinInscripcion(Date fechaFinInscripcion) {
        _fechaFinInscripcion = fechaFinInscripcion;

        if (_concursoRemoteModel != null) {
            try {
                Class<?> clazz = _concursoRemoteModel.getClass();

                Method method = clazz.getMethod("setFechaFinInscripcion",
                        Date.class);

                method.invoke(_concursoRemoteModel, fechaFinInscripcion);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getFechaPublicacionConcurso() {
        return _fechaPublicacionConcurso;
    }

    @Override
    public void setFechaPublicacionConcurso(Date fechaPublicacionConcurso) {
        _fechaPublicacionConcurso = fechaPublicacionConcurso;

        if (_concursoRemoteModel != null) {
            try {
                Class<?> clazz = _concursoRemoteModel.getClass();

                Method method = clazz.getMethod("setFechaPublicacionConcurso",
                        Date.class);

                method.invoke(_concursoRemoteModel, fechaPublicacionConcurso);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getFechaPublicacionGanador() {
        return _fechaPublicacionGanador;
    }

    @Override
    public void setFechaPublicacionGanador(Date fechaPublicacionGanador) {
        _fechaPublicacionGanador = fechaPublicacionGanador;

        if (_concursoRemoteModel != null) {
            try {
                Class<?> clazz = _concursoRemoteModel.getClass();

                Method method = clazz.getMethod("setFechaPublicacionGanador",
                        Date.class);

                method.invoke(_concursoRemoteModel, fechaPublicacionGanador);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getFechaInicioEntrega() {
        return _fechaInicioEntrega;
    }

    @Override
    public void setFechaInicioEntrega(Date fechaInicioEntrega) {
        _fechaInicioEntrega = fechaInicioEntrega;

        if (_concursoRemoteModel != null) {
            try {
                Class<?> clazz = _concursoRemoteModel.getClass();

                Method method = clazz.getMethod("setFechaInicioEntrega",
                        Date.class);

                method.invoke(_concursoRemoteModel, fechaInicioEntrega);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getFechaFinEntrega() {
        return _fechaFinEntrega;
    }

    @Override
    public void setFechaFinEntrega(Date fechaFinEntrega) {
        _fechaFinEntrega = fechaFinEntrega;

        if (_concursoRemoteModel != null) {
            try {
                Class<?> clazz = _concursoRemoteModel.getClass();

                Method method = clazz.getMethod("setFechaFinEntrega", Date.class);

                method.invoke(_concursoRemoteModel, fechaFinEntrega);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getEmpresaId() {
        return _empresaId;
    }

    @Override
    public void setEmpresaId(long empresaId) {
        _empresaId = empresaId;

        if (_concursoRemoteModel != null) {
            try {
                Class<?> clazz = _concursoRemoteModel.getClass();

                Method method = clazz.getMethod("setEmpresaId", long.class);

                method.invoke(_concursoRemoteModel, empresaId);
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

        if (_concursoRemoteModel != null) {
            try {
                Class<?> clazz = _concursoRemoteModel.getClass();

                Method method = clazz.getMethod("setDocumento", String.class);

                method.invoke(_concursoRemoteModel, documento);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getConcursoRemoteModel() {
        return _concursoRemoteModel;
    }

    public void setConcursoRemoteModel(BaseModel<?> concursoRemoteModel) {
        _concursoRemoteModel = concursoRemoteModel;
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

        Class<?> remoteModelClass = _concursoRemoteModel.getClass();

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

        Object returnValue = method.invoke(_concursoRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ConcursoLocalServiceUtil.addConcurso(this);
        } else {
            ConcursoLocalServiceUtil.updateConcurso(this);
        }
    }

    @Override
    public Concurso toEscapedModel() {
        return (Concurso) ProxyUtil.newProxyInstance(Concurso.class.getClassLoader(),
            new Class[] { Concurso.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        ConcursoClp clone = new ConcursoClp();

        clone.setConcursoId(getConcursoId());
        clone.setGroupId(getGroupId());
        clone.setCompanyId(getCompanyId());
        clone.setUserId(getUserId());
        clone.setNombre(getNombre());
        clone.setFechaInicioInscripcion(getFechaInicioInscripcion());
        clone.setModifiedDate(getModifiedDate());
        clone.setDescripcion(getDescripcion());
        clone.setPremio(getPremio());
        clone.setFechaFinInscripcion(getFechaFinInscripcion());
        clone.setFechaPublicacionConcurso(getFechaPublicacionConcurso());
        clone.setFechaPublicacionGanador(getFechaPublicacionGanador());
        clone.setFechaInicioEntrega(getFechaInicioEntrega());
        clone.setFechaFinEntrega(getFechaFinEntrega());
        clone.setEmpresaId(getEmpresaId());
        clone.setDocumento(getDocumento());

        return clone;
    }

    @Override
    public int compareTo(Concurso concurso) {
        long primaryKey = concurso.getPrimaryKey();

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

        if (!(obj instanceof ConcursoClp)) {
            return false;
        }

        ConcursoClp concurso = (ConcursoClp) obj;

        long primaryKey = concurso.getPrimaryKey();

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
        StringBundler sb = new StringBundler(33);

        sb.append("{concursoId=");
        sb.append(getConcursoId());
        sb.append(", groupId=");
        sb.append(getGroupId());
        sb.append(", companyId=");
        sb.append(getCompanyId());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", nombre=");
        sb.append(getNombre());
        sb.append(", fechaInicioInscripcion=");
        sb.append(getFechaInicioInscripcion());
        sb.append(", modifiedDate=");
        sb.append(getModifiedDate());
        sb.append(", descripcion=");
        sb.append(getDescripcion());
        sb.append(", premio=");
        sb.append(getPremio());
        sb.append(", fechaFinInscripcion=");
        sb.append(getFechaFinInscripcion());
        sb.append(", fechaPublicacionConcurso=");
        sb.append(getFechaPublicacionConcurso());
        sb.append(", fechaPublicacionGanador=");
        sb.append(getFechaPublicacionGanador());
        sb.append(", fechaInicioEntrega=");
        sb.append(getFechaInicioEntrega());
        sb.append(", fechaFinEntrega=");
        sb.append(getFechaFinEntrega());
        sb.append(", empresaId=");
        sb.append(getEmpresaId());
        sb.append(", documento=");
        sb.append(getDocumento());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(52);

        sb.append("<model><model-name>");
        sb.append("com.telefonica.plataformaconcursos.model.Concurso");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>concursoId</column-name><column-value><![CDATA[");
        sb.append(getConcursoId());
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
            "<column><column-name>fechaInicioInscripcion</column-name><column-value><![CDATA[");
        sb.append(getFechaInicioInscripcion());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
        sb.append(getModifiedDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>descripcion</column-name><column-value><![CDATA[");
        sb.append(getDescripcion());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>premio</column-name><column-value><![CDATA[");
        sb.append(getPremio());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fechaFinInscripcion</column-name><column-value><![CDATA[");
        sb.append(getFechaFinInscripcion());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fechaPublicacionConcurso</column-name><column-value><![CDATA[");
        sb.append(getFechaPublicacionConcurso());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fechaPublicacionGanador</column-name><column-value><![CDATA[");
        sb.append(getFechaPublicacionGanador());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fechaInicioEntrega</column-name><column-value><![CDATA[");
        sb.append(getFechaInicioEntrega());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>fechaFinEntrega</column-name><column-value><![CDATA[");
        sb.append(getFechaFinEntrega());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>empresaId</column-name><column-value><![CDATA[");
        sb.append(getEmpresaId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>documento</column-name><column-value><![CDATA[");
        sb.append(getDocumento());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
