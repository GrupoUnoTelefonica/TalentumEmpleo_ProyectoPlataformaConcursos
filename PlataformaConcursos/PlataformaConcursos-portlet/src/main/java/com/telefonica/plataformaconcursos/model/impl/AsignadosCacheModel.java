package com.telefonica.plataformaconcursos.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.telefonica.plataformaconcursos.model.Asignados;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Asignados in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Asignados
 * @generated
 */
public class AsignadosCacheModel implements CacheModel<Asignados>,
    Externalizable {
    public String asignadosId;
    public long groupId;
    public long companyId;
    public long userId;
    public String userName;
    public long createDate;
    public long modifiedDate;
    public long usuarioId;
    public long concursoId;
    public String documento;
    public String puntuacionObtenida;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(23);

        sb.append("{asignadosId=");
        sb.append(asignadosId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", userName=");
        sb.append(userName);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", usuarioId=");
        sb.append(usuarioId);
        sb.append(", concursoId=");
        sb.append(concursoId);
        sb.append(", documento=");
        sb.append(documento);
        sb.append(", puntuacionObtenida=");
        sb.append(puntuacionObtenida);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Asignados toEntityModel() {
        AsignadosImpl asignadosImpl = new AsignadosImpl();

        if (asignadosId == null) {
            asignadosImpl.setAsignadosId(StringPool.BLANK);
        } else {
            asignadosImpl.setAsignadosId(asignadosId);
        }

        asignadosImpl.setGroupId(groupId);
        asignadosImpl.setCompanyId(companyId);
        asignadosImpl.setUserId(userId);

        if (userName == null) {
            asignadosImpl.setUserName(StringPool.BLANK);
        } else {
            asignadosImpl.setUserName(userName);
        }

        if (createDate == Long.MIN_VALUE) {
            asignadosImpl.setCreateDate(null);
        } else {
            asignadosImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            asignadosImpl.setModifiedDate(null);
        } else {
            asignadosImpl.setModifiedDate(new Date(modifiedDate));
        }

        asignadosImpl.setUsuarioId(usuarioId);
        asignadosImpl.setConcursoId(concursoId);

        if (documento == null) {
            asignadosImpl.setDocumento(StringPool.BLANK);
        } else {
            asignadosImpl.setDocumento(documento);
        }

        if (puntuacionObtenida == null) {
            asignadosImpl.setPuntuacionObtenida(StringPool.BLANK);
        } else {
            asignadosImpl.setPuntuacionObtenida(puntuacionObtenida);
        }

        asignadosImpl.resetOriginalValues();

        return asignadosImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        asignadosId = objectInput.readUTF();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        userName = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        usuarioId = objectInput.readLong();
        concursoId = objectInput.readLong();
        documento = objectInput.readUTF();
        puntuacionObtenida = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        if (asignadosId == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(asignadosId);
        }

        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (userName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(userName);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);
        objectOutput.writeLong(usuarioId);
        objectOutput.writeLong(concursoId);

        if (documento == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(documento);
        }

        if (puntuacionObtenida == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(puntuacionObtenida);
        }
    }
}
