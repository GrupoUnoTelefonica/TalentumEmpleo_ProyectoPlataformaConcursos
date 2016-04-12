package com.telefonica.plataformaconcursos.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.telefonica.plataformaconcursos.model.Concurso;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Concurso in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Concurso
 * @generated
 */
public class ConcursoCacheModel implements CacheModel<Concurso>, Externalizable {
    public long concursoId;
    public long groupId;
    public long companyId;
    public long userId;
    public String nombre;
    public long fechaInicioInscripcion;
    public long modifiedDate;
    public String descripcion;
    public String premio;
    public long fechaFinInscripcion;
    public long fechaPublicacionConcurso;
    public long fechaPublicacionGanador;
    public long fechaInicioEntrega;
    public long fechaFinEntrega;
    public long empresaId;
    public String documento;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(33);

        sb.append("{concursoId=");
        sb.append(concursoId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", nombre=");
        sb.append(nombre);
        sb.append(", fechaInicioInscripcion=");
        sb.append(fechaInicioInscripcion);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", descripcion=");
        sb.append(descripcion);
        sb.append(", premio=");
        sb.append(premio);
        sb.append(", fechaFinInscripcion=");
        sb.append(fechaFinInscripcion);
        sb.append(", fechaPublicacionConcurso=");
        sb.append(fechaPublicacionConcurso);
        sb.append(", fechaPublicacionGanador=");
        sb.append(fechaPublicacionGanador);
        sb.append(", fechaInicioEntrega=");
        sb.append(fechaInicioEntrega);
        sb.append(", fechaFinEntrega=");
        sb.append(fechaFinEntrega);
        sb.append(", empresaId=");
        sb.append(empresaId);
        sb.append(", documento=");
        sb.append(documento);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Concurso toEntityModel() {
        ConcursoImpl concursoImpl = new ConcursoImpl();

        concursoImpl.setConcursoId(concursoId);
        concursoImpl.setGroupId(groupId);
        concursoImpl.setCompanyId(companyId);
        concursoImpl.setUserId(userId);

        if (nombre == null) {
            concursoImpl.setNombre(StringPool.BLANK);
        } else {
            concursoImpl.setNombre(nombre);
        }

        if (fechaInicioInscripcion == Long.MIN_VALUE) {
            concursoImpl.setFechaInicioInscripcion(null);
        } else {
            concursoImpl.setFechaInicioInscripcion(new Date(
                    fechaInicioInscripcion));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            concursoImpl.setModifiedDate(null);
        } else {
            concursoImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (descripcion == null) {
            concursoImpl.setDescripcion(StringPool.BLANK);
        } else {
            concursoImpl.setDescripcion(descripcion);
        }

        if (premio == null) {
            concursoImpl.setPremio(StringPool.BLANK);
        } else {
            concursoImpl.setPremio(premio);
        }

        if (fechaFinInscripcion == Long.MIN_VALUE) {
            concursoImpl.setFechaFinInscripcion(null);
        } else {
            concursoImpl.setFechaFinInscripcion(new Date(fechaFinInscripcion));
        }

        if (fechaPublicacionConcurso == Long.MIN_VALUE) {
            concursoImpl.setFechaPublicacionConcurso(null);
        } else {
            concursoImpl.setFechaPublicacionConcurso(new Date(
                    fechaPublicacionConcurso));
        }

        if (fechaPublicacionGanador == Long.MIN_VALUE) {
            concursoImpl.setFechaPublicacionGanador(null);
        } else {
            concursoImpl.setFechaPublicacionGanador(new Date(
                    fechaPublicacionGanador));
        }

        if (fechaInicioEntrega == Long.MIN_VALUE) {
            concursoImpl.setFechaInicioEntrega(null);
        } else {
            concursoImpl.setFechaInicioEntrega(new Date(fechaInicioEntrega));
        }

        if (fechaFinEntrega == Long.MIN_VALUE) {
            concursoImpl.setFechaFinEntrega(null);
        } else {
            concursoImpl.setFechaFinEntrega(new Date(fechaFinEntrega));
        }

        concursoImpl.setEmpresaId(empresaId);

        if (documento == null) {
            concursoImpl.setDocumento(StringPool.BLANK);
        } else {
            concursoImpl.setDocumento(documento);
        }

        concursoImpl.resetOriginalValues();

        return concursoImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        concursoId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        nombre = objectInput.readUTF();
        fechaInicioInscripcion = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        descripcion = objectInput.readUTF();
        premio = objectInput.readUTF();
        fechaFinInscripcion = objectInput.readLong();
        fechaPublicacionConcurso = objectInput.readLong();
        fechaPublicacionGanador = objectInput.readLong();
        fechaInicioEntrega = objectInput.readLong();
        fechaFinEntrega = objectInput.readLong();
        empresaId = objectInput.readLong();
        documento = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(concursoId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (nombre == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nombre);
        }

        objectOutput.writeLong(fechaInicioInscripcion);
        objectOutput.writeLong(modifiedDate);

        if (descripcion == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(descripcion);
        }

        if (premio == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(premio);
        }

        objectOutput.writeLong(fechaFinInscripcion);
        objectOutput.writeLong(fechaPublicacionConcurso);
        objectOutput.writeLong(fechaPublicacionGanador);
        objectOutput.writeLong(fechaInicioEntrega);
        objectOutput.writeLong(fechaFinEntrega);
        objectOutput.writeLong(empresaId);

        if (documento == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(documento);
        }
    }
}
