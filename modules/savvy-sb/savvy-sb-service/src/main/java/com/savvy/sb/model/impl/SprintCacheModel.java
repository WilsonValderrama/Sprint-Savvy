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

import com.savvy.sb.model.Sprint;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Sprint in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SprintCacheModel implements CacheModel<Sprint>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SprintCacheModel)) {
			return false;
		}

		SprintCacheModel sprintCacheModel = (SprintCacheModel)object;

		if (sprintId == sprintCacheModel.sprintId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, sprintId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", sprintId=");
		sb.append(sprintId);
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
		sb.append(", tituloSprint=");
		sb.append(tituloSprint);
		sb.append(", fechaInicio=");
		sb.append(fechaInicio);
		sb.append(", fechaFinal=");
		sb.append(fechaFinal);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", estado=");
		sb.append(estado);
		sb.append(", proyecto=");
		sb.append(proyecto);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Sprint toEntityModel() {
		SprintImpl sprintImpl = new SprintImpl();

		if (uuid == null) {
			sprintImpl.setUuid("");
		}
		else {
			sprintImpl.setUuid(uuid);
		}

		sprintImpl.setSprintId(sprintId);
		sprintImpl.setGroupId(groupId);
		sprintImpl.setCompanyId(companyId);
		sprintImpl.setUserId(userId);

		if (userName == null) {
			sprintImpl.setUserName("");
		}
		else {
			sprintImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			sprintImpl.setCreateDate(null);
		}
		else {
			sprintImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			sprintImpl.setModifiedDate(null);
		}
		else {
			sprintImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (tituloSprint == null) {
			sprintImpl.setTituloSprint("");
		}
		else {
			sprintImpl.setTituloSprint(tituloSprint);
		}

		if (fechaInicio == null) {
			sprintImpl.setFechaInicio("");
		}
		else {
			sprintImpl.setFechaInicio(fechaInicio);
		}

		if (fechaFinal == null) {
			sprintImpl.setFechaFinal("");
		}
		else {
			sprintImpl.setFechaFinal(fechaFinal);
		}

		if (descripcion == null) {
			sprintImpl.setDescripcion("");
		}
		else {
			sprintImpl.setDescripcion(descripcion);
		}

		if (estado == null) {
			sprintImpl.setEstado("");
		}
		else {
			sprintImpl.setEstado(estado);
		}

		if (proyecto == null) {
			sprintImpl.setProyecto("");
		}
		else {
			sprintImpl.setProyecto(proyecto);
		}

		sprintImpl.resetOriginalValues();

		return sprintImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		sprintId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		tituloSprint = objectInput.readUTF();
		fechaInicio = objectInput.readUTF();
		fechaFinal = objectInput.readUTF();
		descripcion = objectInput.readUTF();
		estado = objectInput.readUTF();
		proyecto = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(sprintId);

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

		if (tituloSprint == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tituloSprint);
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

		if (descripcion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		if (estado == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(estado);
		}

		if (proyecto == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(proyecto);
		}
	}

	public String uuid;
	public long sprintId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String tituloSprint;
	public String fechaInicio;
	public String fechaFinal;
	public String descripcion;
	public String estado;
	public String proyecto;

}