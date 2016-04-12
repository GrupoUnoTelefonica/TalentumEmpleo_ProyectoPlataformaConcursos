package com.telefonica.plataformaconcursos.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.telefonica.plataformaconcursos.service.http.AsignadosServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.telefonica.plataformaconcursos.service.http.AsignadosServiceSoap
 * @generated
 */
public class AsignadosSoap implements Serializable {
    private String _asignadosId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _userName;
    private Date _createDate;
    private Date _modifiedDate;
    private long _usuarioId;
    private long _concursoId;
    private String _documento;
    private String _puntuacionObtenida;

    public AsignadosSoap() {
    }

    public static AsignadosSoap toSoapModel(Asignados model) {
        AsignadosSoap soapModel = new AsignadosSoap();

        soapModel.setAsignadosId(model.getAsignadosId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setUserName(model.getUserName());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setUsuarioId(model.getUsuarioId());
        soapModel.setConcursoId(model.getConcursoId());
        soapModel.setDocumento(model.getDocumento());
        soapModel.setPuntuacionObtenida(model.getPuntuacionObtenida());

        return soapModel;
    }

    public static AsignadosSoap[] toSoapModels(Asignados[] models) {
        AsignadosSoap[] soapModels = new AsignadosSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AsignadosSoap[][] toSoapModels(Asignados[][] models) {
        AsignadosSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AsignadosSoap[models.length][models[0].length];
        } else {
            soapModels = new AsignadosSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AsignadosSoap[] toSoapModels(List<Asignados> models) {
        List<AsignadosSoap> soapModels = new ArrayList<AsignadosSoap>(models.size());

        for (Asignados model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AsignadosSoap[soapModels.size()]);
    }

    public String getPrimaryKey() {
        return _asignadosId;
    }

    public void setPrimaryKey(String pk) {
        setAsignadosId(pk);
    }

    public String getAsignadosId() {
        return _asignadosId;
    }

    public void setAsignadosId(String asignadosId) {
        _asignadosId = asignadosId;
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

    public String getUserName() {
        return _userName;
    }

    public void setUserName(String userName) {
        _userName = userName;
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

    public long getUsuarioId() {
        return _usuarioId;
    }

    public void setUsuarioId(long usuarioId) {
        _usuarioId = usuarioId;
    }

    public long getConcursoId() {
        return _concursoId;
    }

    public void setConcursoId(long concursoId) {
        _concursoId = concursoId;
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
