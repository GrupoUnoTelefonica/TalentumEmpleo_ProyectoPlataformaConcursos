package com.telefonica.plataformaconcursos.model;

import java.sql.Blob;

/**
 * The Blob model class for lazy loading the documento column in Asignados.
 *
 * @author Brian Wing Shun Chan
 * @see Asignados
 * @generated
 */
public class AsignadosDocumentoBlobModel {
    private String _asignadosId;
    private Blob _documentoBlob;

    public AsignadosDocumentoBlobModel() {
    }

    public AsignadosDocumentoBlobModel(String asignadosId) {
        _asignadosId = asignadosId;
    }

    public AsignadosDocumentoBlobModel(String asignadosId, Blob documentoBlob) {
        _asignadosId = asignadosId;
        _documentoBlob = documentoBlob;
    }

    public String getAsignadosId() {
        return _asignadosId;
    }

    public void setAsignadosId(String asignadosId) {
        _asignadosId = asignadosId;
    }

    public Blob getDocumentoBlob() {
        return _documentoBlob;
    }

    public void setDocumentoBlob(Blob documentoBlob) {
        _documentoBlob = documentoBlob;
    }
}
