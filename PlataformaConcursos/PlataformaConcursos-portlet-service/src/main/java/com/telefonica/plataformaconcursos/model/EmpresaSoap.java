package com.telefonica.plataformaconcursos.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.telefonica.plataformaconcursos.service.http.EmpresaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.telefonica.plataformaconcursos.service.http.EmpresaServiceSoap
 * @generated
 */
public class EmpresaSoap implements Serializable {
    private long _empresaId;
    private long _groupId;
    private long _companyId;
    private long _userId;
    private String _nombre;
    private Date _createDate;
    private Date _modifiedDate;
    private String _sectorEmpresa;
    private String _cif;
    private String _pais;
    private String _password1;
    private String _password2;
    private String _correoElectronico;

    public EmpresaSoap() {
    }

    public static EmpresaSoap toSoapModel(Empresa model) {
        EmpresaSoap soapModel = new EmpresaSoap();

        soapModel.setEmpresaId(model.getEmpresaId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setNombre(model.getNombre());
        soapModel.setCreateDate(model.getCreateDate());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setSectorEmpresa(model.getSectorEmpresa());
        soapModel.setCif(model.getCif());
        soapModel.setPais(model.getPais());
        soapModel.setPassword1(model.getPassword1());
        soapModel.setPassword2(model.getPassword2());
        soapModel.setCorreoElectronico(model.getCorreoElectronico());

        return soapModel;
    }

    public static EmpresaSoap[] toSoapModels(Empresa[] models) {
        EmpresaSoap[] soapModels = new EmpresaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EmpresaSoap[][] toSoapModels(Empresa[][] models) {
        EmpresaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EmpresaSoap[models.length][models[0].length];
        } else {
            soapModels = new EmpresaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EmpresaSoap[] toSoapModels(List<Empresa> models) {
        List<EmpresaSoap> soapModels = new ArrayList<EmpresaSoap>(models.size());

        for (Empresa model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EmpresaSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _empresaId;
    }

    public void setPrimaryKey(long pk) {
        setEmpresaId(pk);
    }

    public long getEmpresaId() {
        return _empresaId;
    }

    public void setEmpresaId(long empresaId) {
        _empresaId = empresaId;
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

    public String getSectorEmpresa() {
        return _sectorEmpresa;
    }

    public void setSectorEmpresa(String sectorEmpresa) {
        _sectorEmpresa = sectorEmpresa;
    }

    public String getCif() {
        return _cif;
    }

    public void setCif(String cif) {
        _cif = cif;
    }

    public String getPais() {
        return _pais;
    }

    public void setPais(String pais) {
        _pais = pais;
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

    public String getCorreoElectronico() {
        return _correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        _correoElectronico = correoElectronico;
    }
}
