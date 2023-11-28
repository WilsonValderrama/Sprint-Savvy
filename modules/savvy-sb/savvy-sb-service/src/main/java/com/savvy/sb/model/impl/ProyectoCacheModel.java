/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.savvy.sb.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.savvy.sb.model.Proyecto;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Proyecto in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ProyectoCacheModel
	implements CacheModel<Proyecto>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ProyectoCacheModel)) {
			return false;
		}

		ProyectoCacheModel proyectoCacheModel = (ProyectoCacheModel)object;

		if (proyectoId == proyectoCacheModel.proyectoId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, proyectoId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", proyectoId=");
		sb.append(proyectoId);
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
		sb.append(", tituloProyecto=");
		sb.append(tituloProyecto);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", fechaInicio=");
		sb.append(fechaInicio);
		sb.append(", fechaFinal=");
		sb.append(fechaFinal);
		sb.append(", estado=");
		sb.append(estado);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Proyecto toEntityModel() {
		ProyectoImpl proyectoImpl = new ProyectoImpl();

		if (uuid == null) {
			proyectoImpl.setUuid("");
		}
		else {
			proyectoImpl.setUuid(uuid);
		}

		proyectoImpl.setProyectoId(proyectoId);
		proyectoImpl.setGroupId(groupId);
		proyectoImpl.setCompanyId(companyId);
		proyectoImpl.setUserId(userId);

		if (userName == null) {
			proyectoImpl.setUserName("");
		}
		else {
			proyectoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			proyectoImpl.setCreateDate(null);
		}
		else {
			proyectoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			proyectoImpl.setModifiedDate(null);
		}
		else {
			proyectoImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (tituloProyecto == null) {
			proyectoImpl.setTituloProyecto("");
		}
		else {
			proyectoImpl.setTituloProyecto(tituloProyecto);
		}

		if (descripcion == null) {
			proyectoImpl.setDescripcion("");
		}
		else {
			proyectoImpl.setDescripcion(descripcion);
		}

		if (fechaInicio == null) {
			proyectoImpl.setFechaInicio("");
		}
		else {
			proyectoImpl.setFechaInicio(fechaInicio);
		}

		if (fechaFinal == null) {
			proyectoImpl.setFechaFinal("");
		}
		else {
			proyectoImpl.setFechaFinal(fechaFinal);
		}

		if (estado == null) {
			proyectoImpl.setEstado("");
		}
		else {
			proyectoImpl.setEstado(estado);
		}

		proyectoImpl.resetOriginalValues();

		return proyectoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		proyectoId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		tituloProyecto = objectInput.readUTF();
		descripcion = objectInput.readUTF();
		fechaInicio = objectInput.readUTF();
		fechaFinal = objectInput.readUTF();
		estado = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(proyectoId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (tituloProyecto == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tituloProyecto);
		}

		if (descripcion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		if (fechaInicio == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fechaInicio);
		}

		if (fechaFinal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fechaFinal);
		}

		if (estado == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(estado);
		}
	}

	public String uuid;
	public long proyectoId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String tituloProyecto;
	public String descripcion;
	public String fechaInicio;
	public String fechaFinal;
	public String estado;

}