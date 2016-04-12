package com.telefonica.plataformaconcursos.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.telefonica.plataformaconcursos.service.http.UsuarioServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.telefonica.plataformaconcursos.service.http.UsuarioServiceSoap
 * @generated
 */
public class UsuarioSoap implements Serializable {
    private long _usuarioId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _nombre;
    private Date _createDate;
    private Date _modifiedDate;
    private String _apellidos;
    private String _correoElectronico;
    private String _password1;
    private String _password2;
    private String _documento;
    private String _puntuacionObtenida;

    public UsuarioSoap() {
    }

    public static UsuarioSoap toSoapModel(Usuario model) {
        UsuarioSoap soapModel = new UsuarioSoap();

        soapModel.setUsuarioId(model.getUsuarioId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setNombre(model.getNombre());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setApellidos(model.getApellidos());
        soapModel.setCorreoElectronico(model.getCorreoElectronico());
        soapModel.setPassword1(model.getPassword1());
        soapModel.setPassword2(model.getPassword2());
        soapModel.setDocumento(model.getDocumento());
        soapModel.setPuntuacionObtenida(model.getPuntuacionObtenida());

        return soapModel;
    }

    public static UsuarioSoap[] toSoapModels(Usuario[] models) {
        UsuarioSoap[] soapModels = new UsuarioSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static UsuarioSoap[][] toSoapModels(Usuario[][] models) {
        UsuarioSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new UsuarioSoap[models.length][models[0].length];
        } else {
            soapModels = new UsuarioSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static UsuarioSoap[] toSoapModels(List<Usuario> models) {
        List<UsuarioSoap> soapModels = new ArrayList<UsuarioSoap>(models.size());

        for (Usuario model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new UsuarioSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _usuarioId;
    }

    public void setPrimaryKey(long pk) {
        setUsuarioId(pk);
    }

    public long getUsuarioId() {
        return _usuarioId;
    }

    public void setUsuarioId(long usuarioId) {
        _usuarioId = usuarioId;
    }

    public long getGroupId() {
        return _groupId;
    }

    public void setGroupId(long groupId) {
        _groupId = groupId;
    }

    public long getCompanyId() {
        return _companyId;
    }

    public void setCompanyId(long companyId) {
        _companyId = companyId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String nombre) {
        _nombre = nombre;
    }

    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getApellidos() {
        return _apellidos;
    }

    public void setApellidos(String apellidos) {
        _apellidos = apellidos;
    }

    public String getCorreoElectronico() {
        return _correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        _correoElectronico = correoElectronico;
    }

    public String getPassword1() {
        return _password1;
    }

    public void setPassword1(String password1) {
        _password1 = password1;
    }

    public String getPassword2() {
        return _password2;
    }

    public void setPassword2(String password2) {
        _password2 = password2;
    }

    public String getDocumento() {
        return _documento;
    }

    public void setDocumento(String documento) {
        _documento = documento;
    }

    public String getPuntuacionObtenida() {
        return _puntuacionObtenida;
    }

    public void setPuntuacionObtenida(String puntuacionObtenida) {
        _puntuacionObtenida = puntuacionObtenida;
    }
}
