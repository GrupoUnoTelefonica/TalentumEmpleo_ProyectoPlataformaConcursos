package com.telefonica.plataformaconcursos.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.telefonica.plataformaconcursos.model.Usuario;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Usuario in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Usuario
 * @generated
 */
public class UsuarioCacheModel implements CacheModel<Usuario>, Externalizable {
    public long usuarioId;
    public long groupId;
    public long companyId;
    public long userId;
    public String nombre;
    public long createDate;
    public long modifiedDate;
    public String apellidos;
    public String correoElectronico;
    public String password1;
    public String password2;
    public String documento;
    public String puntuacionObtenida;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{usuarioId=");
        sb.append(usuarioId);
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
        sb.append(", apellidos=");
        sb.append(apellidos);
        sb.append(", correoElectronico=");
        sb.append(correoElectronico);
        sb.append(", password1=");
        sb.append(password1);
        sb.append(", password2=");
        sb.append(password2);
        sb.append(", documento=");
        sb.append(documento);
        sb.append(", puntuacionObtenida=");
        sb.append(puntuacionObtenida);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Usuario toEntityModel() {
        UsuarioImpl usuarioImpl = new UsuarioImpl();

        usuarioImpl.setUsuarioId(usuarioId);
        usuarioImpl.setGroupId(groupId);
        usuarioImpl.setCompanyId(companyId);
        usuarioImpl.setUserId(userId);

        if (nombre == null) {
            usuarioImpl.setNombre(StringPool.BLANK);
        } else {
            usuarioImpl.setNombre(nombre);
        }

        if (createDate == Long.MIN_VALUE) {
            usuarioImpl.setCreateDate(null);
        } else {
            usuarioImpl.setCreateDate(new Date(createDate));
        }

        if (modifiedDate == Long.MIN_VALUE) {
            usuarioImpl.setModifiedDate(null);
        } else {
            usuarioImpl.setModifiedDate(new Date(modifiedDate));
        }

        if (apellidos == null) {
            usuarioImpl.setApellidos(StringPool.BLANK);
        } else {
            usuarioImpl.setApellidos(apellidos);
        }

        if (correoElectronico == null) {
            usuarioImpl.setCorreoElectronico(StringPool.BLANK);
        } else {
            usuarioImpl.setCorreoElectronico(correoElectronico);
        }

        if (password1 == null) {
            usuarioImpl.setPassword1(StringPool.BLANK);
        } else {
            usuarioImpl.setPassword1(password1);
        }

        if (password2 == null) {
            usuarioImpl.setPassword2(StringPool.BLANK);
        } else {
            usuarioImpl.setPassword2(password2);
        }

        if (documento == null) {
            usuarioImpl.setDocumento(StringPool.BLANK);
        } else {
            usuarioImpl.setDocumento(documento);
        }

        if (puntuacionObtenida == null) {
            usuarioImpl.setPuntuacionObtenida(StringPool.BLANK);
        } else {
            usuarioImpl.setPuntuacionObtenida(puntuacionObtenida);
        }

        usuarioImpl.resetOriginalValues();

        return usuarioImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        usuarioId = objectInput.readLong();
        groupId = objectInput.readLong();
        companyId = objectInput.readLong();
        userId = objectInput.readLong();
        nombre = objectInput.readUTF();
        createDate = objectInput.readLong();
        modifiedDate = objectInput.readLong();
        apellidos = objectInput.readUTF();
        correoElectronico = objectInput.readUTF();
        password1 = objectInput.readUTF();
        password2 = objectInput.readUTF();
        documento = objectInput.readUTF();
        puntuacionObtenida = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(usuarioId);
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

        if (apellidos == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(apellidos);
        }

        if (correoElectronico == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(correoElectronico);
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
