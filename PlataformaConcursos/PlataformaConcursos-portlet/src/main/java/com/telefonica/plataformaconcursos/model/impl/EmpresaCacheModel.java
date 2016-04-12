package com.telefonica.plataformaconcursos.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.telefonica.plataformaconcursos.model.Empresa;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Empresa in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Empresa
 * @generated
 */
public class EmpresaCacheModel implements CacheModel<Empresa>, Externalizable {
    public long empresaId;
    public long groupId;
    public long companyId;
    public long userId;
    public String nombre;
    public long createDate;
    public long modifiedDate;
    public String sectorEmpresa;
    public String cif;
    public String pais;
    public String password1;
    public String password2;
    public String correoElectronico;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{empresaId=");
        sb.append(empresaId);
        sb.append(", groupId=");
        sb.append(groupId);
        sb.append(", companyId=");
        sb.append(companyId);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", nombre=");
        sb.append(nombre);
        sb.append(", createDate=");
        sb.append(createDate);
        sb.append(", modifiedDate=");
        sb.append(modifiedDate);
        sb.append(", sectorEmpresa=");
        sb.append(sectorEmpresa);
        sb.append(", cif=");
        sb.append(cif);
        sb.append(", pais=");
        sb.append(pais);
        sb.append(", password1=");
        sb.append(password1);
        sb.append(", password2=");
        sb.append(password2);
        sb.append(", correoElectronico=");
        sb.append(correoElectronico);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Empresa toEntityModel() {
        EmpresaImpl empresaImpl = new EmpresaImpl();

        empresaImpl.setEmpresaId(empresaId);
        empresaImpl.setGroupId(groupId);
        empresaImpl.setCompanyId(companyId);
        empresaImpl.setUserId(userId);

        if (nombre == null) {
            empresaImpl.setNombre(StringPool.BLANK);
        } else {
            empresaImpl.setNombre(nombre);
        }

        if (createDate == Long.MIN_VALUE) {
            empresaImpl.setCreateDate(null);
        } else {
            empresaImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            empresaImpl.setModifiedDate(null);
        } else {
            empresaImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (sectorEmpresa == null) {
            empresaImpl.setSectorEmpresa(StringPool.BLANK);
        } else {
            empresaImpl.setSectorEmpresa(sectorEmpresa);
        }

        if (cif == null) {
            empresaImpl.setCif(StringPool.BLANK);
        } else {
            empresaImpl.setCif(cif);
        }

        if (pais == null) {
            empresaImpl.setPais(StringPool.BLANK);
        } else {
            empresaImpl.setPais(pais);
        }

        if (password1 == null) {
            empresaImpl.setPassword1(StringPool.BLANK);
        } else {
            empresaImpl.setPassword1(password1);
        }

        if (password2 == null) {
            empresaImpl.setPassword2(StringPool.BLANK);
        } else {
            empresaImpl.setPassword2(password2);
        }

        if (correoElectronico == null) {
            empresaImpl.setCorreoElectronico(StringPool.BLANK);
        } else {
            empresaImpl.setCorreoElectronico(correoElectronico);
        }

        empresaImpl.resetOriginalValues();

        return empresaImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        empresaId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        nombre = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        sectorEmpresa = objectInput.readUTF();
        cif = objectInput.readUTF();
        pais = objectInput.readUTF();
        password1 = objectInput.readUTF();
        password2 = objectInput.readUTF();
        correoElectronico = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(empresaId);
        objectOutput.writeLong(groupId);
        objectOutput.writeLong(companyId);
        objectOutput.writeLong(userId);

        if (nombre == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nombre);
        }

        objectOutput.writeLong(createDate);
        objectOutput.writeLong(modifiedDate);

        if (sectorEmpresa == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(sectorEmpresa);
        }

        if (cif == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(cif);
        }

        if (pais == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(pais);
        }

        if (password1 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(password1);
        }

        if (password2 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(password2);
        }

        if (correoElectronico == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(correoElectronico);
        }
    }
}
