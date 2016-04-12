package com.telefonica.plataformaconcursos.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.telefonica.plataformaconcursos.service.http.ConcursoServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.telefonica.plataformaconcursos.service.http.ConcursoServiceSoap
 * @generated
 */
public class ConcursoSoap implements Serializable {
    private long _concursoId;
    private long _groupId;
    private long _companyId;
    private long _userId;
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

    public ConcursoSoap() {
    }

    public static ConcursoSoap toSoapModel(Concurso model) {
        ConcursoSoap soapModel = new ConcursoSoap();

        soapModel.setConcursoId(model.getConcursoId());
        soapModel.setGroupId(model.getGroupId());
        soapModel.setCompanyId(model.getCompanyId());
        soapModel.setUserId(model.getUserId());
        soapModel.setNombre(model.getNombre());
        soapModel.setFechaInicioInscripcion(model.getFechaInicioInscripcion());
        soapModel.setModifiedDate(model.getModifiedDate());
        soapModel.setDescripcion(model.getDescripcion());
        soapModel.setPremio(model.getPremio());
        soapModel.setFechaFinInscripcion(model.getFechaFinInscripcion());
        soapModel.setFechaPublicacionConcurso(model.getFechaPublicacionConcurso());
        soapModel.setFechaPublicacionGanador(model.getFechaPublicacionGanador());
        soapModel.setFechaInicioEntrega(model.getFechaInicioEntrega());
        soapModel.setFechaFinEntrega(model.getFechaFinEntrega());
        soapModel.setEmpresaId(model.getEmpresaId());
        soapModel.setDocumento(model.getDocumento());

        return soapModel;
    }

    public static ConcursoSoap[] toSoapModels(Concurso[] models) {
        ConcursoSoap[] soapModels = new ConcursoSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ConcursoSoap[][] toSoapModels(Concurso[][] models) {
        ConcursoSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ConcursoSoap[models.length][models[0].length];
        } else {
            soapModels = new ConcursoSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ConcursoSoap[] toSoapModels(List<Concurso> models) {
        List<ConcursoSoap> soapModels = new ArrayList<ConcursoSoap>(models.size());

        for (Concurso model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ConcursoSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _concursoId;
    }

    public void setPrimaryKey(long pk) {
        setConcursoId(pk);
    }

    public long getConcursoId() {
        return _concursoId;
    }

    public void setConcursoId(long concursoId) {
        _concursoId = concursoId;
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

    public Date getFechaInicioInscripcion() {
        return _fechaInicioInscripcion;
    }

    public void setFechaInicioInscripcion(Date fechaInicioInscripcion) {
        _fechaInicioInscripcion = fechaInicioInscripcion;
    }

    public Date getModifiedDate() {
        return _modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        _modifiedDate = modifiedDate;
    }

    public String getDescripcion() {
        return _descripcion;
    }

    public void setDescripcion(String descripcion) {
        _descripcion = descripcion;
    }

    public String getPremio() {
        return _premio;
    }

    public void setPremio(String premio) {
        _premio = premio;
    }

    public Date getFechaFinInscripcion() {
        return _fechaFinInscripcion;
    }

    public void setFechaFinInscripcion(Date fechaFinInscripcion) {
        _fechaFinInscripcion = fechaFinInscripcion;
    }

    public Date getFechaPublicacionConcurso() {
        return _fechaPublicacionConcurso;
    }

    public void setFechaPublicacionConcurso(Date fechaPublicacionConcurso) {
        _fechaPublicacionConcurso = fechaPublicacionConcurso;
    }

    public Date getFechaPublicacionGanador() {
        return _fechaPublicacionGanador;
    }

    public void setFechaPublicacionGanador(Date fechaPublicacionGanador) {
        _fechaPublicacionGanador = fechaPublicacionGanador;
    }

    public Date getFechaInicioEntrega() {
        return _fechaInicioEntrega;
    }

    public void setFechaInicioEntrega(Date fechaInicioEntrega) {
        _fechaInicioEntrega = fechaInicioEntrega;
    }

    public Date getFechaFinEntrega() {
        return _fechaFinEntrega;
    }

    public void setFechaFinEntrega(Date fechaFinEntrega) {
        _fechaFinEntrega = fechaFinEntrega;
    }

    public long getEmpresaId() {
        return _empresaId;
    }

    public void setEmpresaId(long empresaId) {
        _empresaId = empresaId;
    }

    public String getDocumento() {
        return _documento;
    }

    public void setDocumento(String documento) {
        _documento = documento;
    }
}
