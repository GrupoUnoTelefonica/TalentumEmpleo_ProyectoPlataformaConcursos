package com.telefonica.plataformaconcursos.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.telefonica.plataformaconcursos.model.Usuario;
import com.telefonica.plataformaconcursos.model.UsuarioModel;
import com.telefonica.plataformaconcursos.model.UsuarioSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Usuario service. Represents a row in the &quot;usuario&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.telefonica.plataformaconcursos.model.UsuarioModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link UsuarioImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see UsuarioImpl
 * @see com.telefonica.plataformaconcursos.model.Usuario
 * @see com.telefonica.plataformaconcursos.model.UsuarioModel
 * @generated
 */
@JSON(strict = true)
public class UsuarioModelImpl extends BaseModelImpl<Usuario>
    implements UsuarioModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a usuario model instance should use the {@link com.telefonica.plataformaconcursos.model.Usuario} interface instead.
     */
    public static final String TABLE_NAME = "usuario";
    public static final Object[][] TABLE_COLUMNS = {
            { "usuarioId", Types.BIGINT },
            { "groupId", Types.BIGINT },
            { "companyId", Types.BIGINT },
            { "userId", Types.BIGINT },
            { "nombre", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "modifiedDate", Types.TIMESTAMP },
            { "apellidos", Types.VARCHAR },
            { "correoElectronico", Types.VARCHAR },
            { "password1", Types.VARCHAR },
            { "password2", Types.VARCHAR },
            { "documento", Types.VARCHAR },
            { "puntuacionObtenida", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table usuario (usuarioId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,nombre VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,apellidos VARCHAR(75) null,correoElectronico VARCHAR(75) null,password1 VARCHAR(75) null,password2 VARCHAR(75) null,documento VARCHAR(75) null,puntuacionObtenida VARCHAR(75) null)";
    public static final String TABLE_SQL_DROP = "drop table usuario";
    public static final String ORDER_BY_JPQL = " ORDER BY usuario.usuarioId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY usuario.usuarioId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.telefonica.plataformaconcursos.model.Usuario"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.telefonica.plataformaconcursos.model.Usuario"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.telefonica.plataformaconcursos.model.Usuario"));
    private static ClassLoader _classLoader = Usuario.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Usuario.class
        };
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
    private Usuario _escapedModel;

    public UsuarioModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Usuario toModel(UsuarioSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Usuario model = new UsuarioImpl();

        model.setUsuarioId(soapModel.getUsuarioId());
        model.setGroupId(soapModel.getGroupId());
        model.setCompanyId(soapModel.getCompanyId());
        model.setUserId(soapModel.getUserId());
        model.setNombre(soapModel.getNombre());
        model.setCreateDate(soapModel.getCreateDate());
        model.setModifiedDate(soapModel.getModifiedDate());
        model.setApellidos(soapModel.getApellidos());
        model.setCorreoElectronico(soapModel.getCorreoElectronico());
        model.setPassword1(soapModel.getPassword1());
        model.setPassword2(soapModel.getPassword2());
        model.setDocumento(soapModel.getDocumento());
        model.setPuntuacionObtenida(soapModel.getPuntuacionObtenida());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Usuario> toModels(UsuarioSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Usuario> models = new ArrayList<Usuario>(soapModels.length);

        for (UsuarioSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
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
    public Class<?> getModelClass() {
        return Usuario.class;
    }

    @Override
    public String getModelClassName() {
        return Usuario.class.getName();
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

    @JSON
    @Override
    public long getUsuarioId() {
        return _usuarioId;
    }

    @Override
    public void setUsuarioId(long usuarioId) {
        _usuarioId = usuarioId;
    }

    @JSON
    @Override
    public long getGroupId() {
        return _groupId;
    }

    @Override
    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    @JSON
    @Override
    public long getCompanyId() {
        return _companyId;
    }

    @Override
    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    @JSON
    @Override
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    @JSON
    @Override
    public String getNombre() {
        if (_nombre == null) {
            return StringPool.BLANK;
        } else {
            return _nombre;
        }
    }

    @Override
    public void setNombre(String nombre) {
        _nombre = nombre;
    }

    @JSON
    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    @JSON
    @Override
    public Date getModifiedDate() {
        return _modifiedDate;
    }

    @Override
    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    @JSON
    @Override
    public String getApellidos() {
        if (_apellidos == null) {
            return StringPool.BLANK;
        } else {
            return _apellidos;
        }
    }

    @Override
    public void setApellidos(String apellidos) {
        _apellidos = apellidos;
    }

    @JSON
    @Override
    public String getCorreoElectronico() {
        if (_correoElectronico == null) {
            return StringPool.BLANK;
        } else {
            return _correoElectronico;
        }
    }

    @Override
    public void setCorreoElectronico(String correoElectronico) {
        _correoElectronico = correoElectronico;
    }

    @JSON
    @Override
    public String getPassword1() {
        if (_password1 == null) {
            return StringPool.BLANK;
        } else {
            return _password1;
        }
    }

    @Override
    public void setPassword1(String password1) {
        _password1 = password1;
    }

    @JSON
    @Override
    public String getPassword2() {
        if (_password2 == null) {
            return StringPool.BLANK;
        } else {
            return _password2;
        }
    }

    @Override
    public void setPassword2(String password2) {
        _password2 = password2;
    }

    @JSON
    @Override
    public String getDocumento() {
        if (_documento == null) {
            return StringPool.BLANK;
        } else {
            return _documento;
        }
    }

    @Override
    public void setDocumento(String documento) {
        _documento = documento;
    }

    @JSON
    @Override
    public String getPuntuacionObtenida() {
        if (_puntuacionObtenida == null) {
            return StringPool.BLANK;
        } else {
            return _puntuacionObtenida;
        }
    }

    @Override
    public void setPuntuacionObtenida(String puntuacionObtenida) {
        _puntuacionObtenida = puntuacionObtenida;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
            Usuario.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public Usuario toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Usuario) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        UsuarioImpl usuarioImpl = new UsuarioImpl();

        usuarioImpl.setUsuarioId(getUsuarioId());
        usuarioImpl.setGroupId(getGroupId());
        usuarioImpl.setCompanyId(getCompanyId());
        usuarioImpl.setUserId(getUserId());
        usuarioImpl.setNombre(getNombre());
        usuarioImpl.setCreateDate(getCreateDate());
        usuarioImpl.setModifiedDate(getModifiedDate());
        usuarioImpl.setApellidos(getApellidos());
        usuarioImpl.setCorreoElectronico(getCorreoElectronico());
        usuarioImpl.setPassword1(getPassword1());
        usuarioImpl.setPassword2(getPassword2());
        usuarioImpl.setDocumento(getDocumento());
        usuarioImpl.setPuntuacionObtenida(getPuntuacionObtenida());

        usuarioImpl.resetOriginalValues();

        return usuarioImpl;
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

        if (!(obj instanceof Usuario)) {
            return false;
        }

        Usuario usuario = (Usuario) obj;

        long primaryKey = usuario.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Usuario> toCacheModel() {
        UsuarioCacheModel usuarioCacheModel = new UsuarioCacheModel();

        usuarioCacheModel.usuarioId = getUsuarioId();

        usuarioCacheModel.groupId = getGroupId();

        usuarioCacheModel.companyId = getCompanyId();

        usuarioCacheModel.userId = getUserId();

        usuarioCacheModel.nombre = getNombre();

        String nombre = usuarioCacheModel.nombre;

        if ((nombre != null) && (nombre.length() == 0)) {
            usuarioCacheModel.nombre = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            usuarioCacheModel.createDate = createDate.getTime();
        } else {
            usuarioCacheModel.createDate = Long.MIN_VALUE;
        }

        Date modifiedDate = getModifiedDate();

        if (modifiedDate != null) {
            usuarioCacheModel.modifiedDate = modifiedDate.getTime();
        } else {
            usuarioCacheModel.modifiedDate = Long.MIN_VALUE;
        }

        usuarioCacheModel.apellidos = getApellidos();

        String apellidos = usuarioCacheModel.apellidos;

        if ((apellidos != null) && (apellidos.length() == 0)) {
            usuarioCacheModel.apellidos = null;
        }

        usuarioCacheModel.correoElectronico = getCorreoElectronico();

        String correoElectronico = usuarioCacheModel.correoElectronico;

        if ((correoElectronico != null) && (correoElectronico.length() == 0)) {
            usuarioCacheModel.correoElectronico = null;
        }

        usuarioCacheModel.password1 = getPassword1();

        String password1 = usuarioCacheModel.password1;

        if ((password1 != null) && (password1.length() == 0)) {
            usuarioCacheModel.password1 = null;
        }

        usuarioCacheModel.password2 = getPassword2();

        String password2 = usuarioCacheModel.password2;

        if ((password2 != null) && (password2.length() == 0)) {
            usuarioCacheModel.password2 = null;
        }

        usuarioCacheModel.documento = getDocumento();

        String documento = usuarioCacheModel.documento;

        if ((documento != null) && (documento.length() == 0)) {
            usuarioCacheModel.documento = null;
        }

        usuarioCacheModel.puntuacionObtenida = getPuntuacionObtenida();

        String puntuacionObtenida = usuarioCacheModel.puntuacionObtenida;

        if ((puntuacionObtenida != null) && (puntuacionObtenida.length() == 0)) {
            usuarioCacheModel.puntuacionObtenida = null;
        }

        return usuarioCacheModel;
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
