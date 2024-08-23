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

package com.aula.sb.model.impl;

import com.aula.sb.model.T_Ul_ResEvaluacion;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing T_Ul_ResEvaluacion in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class T_Ul_ResEvaluacionCacheModel
	implements CacheModel<T_Ul_ResEvaluacion>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof T_Ul_ResEvaluacionCacheModel)) {
			return false;
		}

		T_Ul_ResEvaluacionCacheModel t_Ul_ResEvaluacionCacheModel =
			(T_Ul_ResEvaluacionCacheModel)object;

		if (idRespuestas == t_Ul_ResEvaluacionCacheModel.idRespuestas) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idRespuestas);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", idRespuestas=");
		sb.append(idRespuestas);
		sb.append(", problRespuestas=");
		sb.append(problRespuestas);
		sb.append(", opcionRespuestas=");
		sb.append(opcionRespuestas);
		sb.append(", puntajeRespuestas=");
		sb.append(puntajeRespuestas);
		sb.append(", T_Ul_Estudiante_id=");
		sb.append(T_Ul_Estudiante_id);
		sb.append(", T_Ul_PrgEvaluacion_id=");
		sb.append(T_Ul_PrgEvaluacion_id);
		sb.append(", T_Ul_Califi_id=");
		sb.append(T_Ul_Califi_id);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public T_Ul_ResEvaluacion toEntityModel() {
		T_Ul_ResEvaluacionImpl t_Ul_ResEvaluacionImpl =
			new T_Ul_ResEvaluacionImpl();

		if (uuid == null) {
			t_Ul_ResEvaluacionImpl.setUuid("");
		}
		else {
			t_Ul_ResEvaluacionImpl.setUuid(uuid);
		}

		t_Ul_ResEvaluacionImpl.setIdRespuestas(idRespuestas);

		if (problRespuestas == null) {
			t_Ul_ResEvaluacionImpl.setProblRespuestas("");
		}
		else {
			t_Ul_ResEvaluacionImpl.setProblRespuestas(problRespuestas);
		}

		if (opcionRespuestas == null) {
			t_Ul_ResEvaluacionImpl.setOpcionRespuestas("");
		}
		else {
			t_Ul_ResEvaluacionImpl.setOpcionRespuestas(opcionRespuestas);
		}

		if (puntajeRespuestas == null) {
			t_Ul_ResEvaluacionImpl.setPuntajeRespuestas("");
		}
		else {
			t_Ul_ResEvaluacionImpl.setPuntajeRespuestas(puntajeRespuestas);
		}

		t_Ul_ResEvaluacionImpl.setT_Ul_Estudiante_id(T_Ul_Estudiante_id);
		t_Ul_ResEvaluacionImpl.setT_Ul_PrgEvaluacion_id(T_Ul_PrgEvaluacion_id);
		t_Ul_ResEvaluacionImpl.setT_Ul_Califi_id(T_Ul_Califi_id);
		t_Ul_ResEvaluacionImpl.setGroupId(groupId);
		t_Ul_ResEvaluacionImpl.setCompanyId(companyId);
		t_Ul_ResEvaluacionImpl.setUserId(userId);

		if (userName == null) {
			t_Ul_ResEvaluacionImpl.setUserName("");
		}
		else {
			t_Ul_ResEvaluacionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			t_Ul_ResEvaluacionImpl.setCreateDate(null);
		}
		else {
			t_Ul_ResEvaluacionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			t_Ul_ResEvaluacionImpl.setModifiedDate(null);
		}
		else {
			t_Ul_ResEvaluacionImpl.setModifiedDate(new Date(modifiedDate));
		}

		t_Ul_ResEvaluacionImpl.resetOriginalValues();

		return t_Ul_ResEvaluacionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idRespuestas = objectInput.readLong();
		problRespuestas = objectInput.readUTF();
		opcionRespuestas = objectInput.readUTF();
		puntajeRespuestas = objectInput.readUTF();

		T_Ul_Estudiante_id = objectInput.readLong();

		T_Ul_PrgEvaluacion_id = objectInput.readLong();

		T_Ul_Califi_id = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(idRespuestas);

		if (problRespuestas == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(problRespuestas);
		}

		if (opcionRespuestas == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(opcionRespuestas);
		}

		if (puntajeRespuestas == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(puntajeRespuestas);
		}

		objectOutput.writeLong(T_Ul_Estudiante_id);

		objectOutput.writeLong(T_Ul_PrgEvaluacion_id);

		objectOutput.writeLong(T_Ul_Califi_id);

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
	}

	public String uuid;
	public long idRespuestas;
	public String problRespuestas;
	public String opcionRespuestas;
	public String puntajeRespuestas;
	public long T_Ul_Estudiante_id;
	public long T_Ul_PrgEvaluacion_id;
	public long T_Ul_Califi_id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}