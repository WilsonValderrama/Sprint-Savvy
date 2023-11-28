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

import com.savvy.sb.model.Tarea;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Tarea in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class TareaCacheModel implements CacheModel<Tarea>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof TareaCacheModel)) {
			return false;
		}

		TareaCacheModel tareaCacheModel = (TareaCacheModel)object;

		if (tareaId == tareaCacheModel.tareaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, tareaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", tareaId=");
		sb.append(tareaId);
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
		sb.append(", nombreTarea=");
		sb.append(nombreTarea);
		sb.append(", proyecto=");
		sb.append(proyecto);
		sb.append(", responsable=");
		sb.append(responsable);
		sb.append(", prioridad=");
		sb.append(prioridad);
		sb.append(", sprint=");
		sb.append(sprint);
		sb.append(", estado=");
		sb.append(estado);
		sb.append(", fechaLimite=");
		sb.append(fechaLimite);
		sb.append(", resumen=");
		sb.append(resumen);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append(", categoria=");
		sb.append(categoria);
		sb.append(", etiqueta=");
		sb.append(etiqueta);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Tarea toEntityModel() {
		TareaImpl tareaImpl = new TareaImpl();

		if (uuid == null) {
			tareaImpl.setUuid("");
		}
		else {
			tareaImpl.setUuid(uuid);
		}

		tareaImpl.setTareaId(tareaId);
		tareaImpl.setGroupId(groupId);
		tareaImpl.setCompanyId(companyId);
		tareaImpl.setUserId(userId);

		if (userName == null) {
			tareaImpl.setUserName("");
		}
		else {
			tareaImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			tareaImpl.setCreateDate(null);
		}
		else {
			tareaImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tareaImpl.setModifiedDate(null);
		}
		else {
			tareaImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nombreTarea == null) {
			tareaImpl.setNombreTarea("");
		}
		else {
			tareaImpl.setNombreTarea(nombreTarea);
		}

		if (proyecto == null) {
			tareaImpl.setProyecto("");
		}
		else {
			tareaImpl.setProyecto(proyecto);
		}

		if (responsable == null) {
			tareaImpl.setResponsable("");
		}
		else {
			tareaImpl.setResponsable(responsable);
		}

		if (prioridad == null) {
			tareaImpl.setPrioridad("");
		}
		else {
			tareaImpl.setPrioridad(prioridad);
		}

		if (sprint == null) {
			tareaImpl.setSprint("");
		}
		else {
			tareaImpl.setSprint(sprint);
		}

		if (estado == null) {
			tareaImpl.setEstado("");
		}
		else {
			tareaImpl.setEstado(estado);
		}

		if (fechaLimite == null) {
			tareaImpl.setFechaLimite("");
		}
		else {
			tareaImpl.setFechaLimite(fechaLimite);
		}

		if (resumen == null) {
			tareaImpl.setResumen("");
		}
		else {
			tareaImpl.setResumen(resumen);
		}

		if (descripcion == null) {
			tareaImpl.setDescripcion("");
		}
		else {
			tareaImpl.setDescripcion(descripcion);
		}

		if (categoria == null) {
			tareaImpl.setCategoria("");
		}
		else {
			tareaImpl.setCategoria(categoria);
		}

		if (etiqueta == null) {
			tareaImpl.setEtiqueta("");
		}
		else {
			tareaImpl.setEtiqueta(etiqueta);
		}

		tareaImpl.resetOriginalValues();

		return tareaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		tareaId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nombreTarea = objectInput.readUTF();
		proyecto = objectInput.readUTF();
		responsable = objectInput.readUTF();
		prioridad = objectInput.readUTF();
		sprint = objectInput.readUTF();
		estado = objectInput.readUTF();
		fechaLimite = objectInput.readUTF();
		resumen = objectInput.readUTF();
		descripcion = objectInput.readUTF();
		categoria = objectInput.readUTF();
		etiqueta = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(tareaId);

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

		if (nombreTarea == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombreTarea);
		}

		if (proyecto == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(proyecto);
		}

		if (responsable == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(responsable);
		}

		if (prioridad == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(prioridad);
		}

		if (sprint == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sprint);
		}

		if (estado == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(estado);
		}

		if (fechaLimite == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fechaLimite);
		}

		if (resumen == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(resumen);
		}

		if (descripcion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descripcion);
		}

		if (categoria == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(categoria);
		}

		if (etiqueta == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(etiqueta);
		}
	}

	public String uuid;
	public long tareaId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nombreTarea;
	public String proyecto;
	public String responsable;
	public String prioridad;
	public String sprint;
	public String estado;
	public String fechaLimite;
	public String resumen;
	public String descripcion;
	public String categoria;
	public String etiqueta;

}