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

import com.aula.sb.model.T_Ul_PrgEvaluacion;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing T_Ul_PrgEvaluacion in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class T_Ul_PrgEvaluacionCacheModel
	implements CacheModel<T_Ul_PrgEvaluacion>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof T_Ul_PrgEvaluacionCacheModel)) {
			return false;
		}

		T_Ul_PrgEvaluacionCacheModel t_Ul_PrgEvaluacionCacheModel =
			(T_Ul_PrgEvaluacionCacheModel)object;

		if (idPreguntas == t_Ul_PrgEvaluacionCacheModel.idPreguntas) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idPreguntas);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(29);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", idPreguntas=");
		sb.append(idPreguntas);
		sb.append(", problPreguntas=");
		sb.append(problPreguntas);
		sb.append(", opcPreguntas=");
		sb.append(opcPreguntas);
		sb.append(", puntajePreguntas=");
		sb.append(puntajePreguntas);
		sb.append(", intentoPreguntas=");
		sb.append(intentoPreguntas);
		sb.append(", limiteTPreguntas=");
		sb.append(limiteTPreguntas);
		sb.append(", T_Ul_Actividad_id=");
		sb.append(T_Ul_Actividad_id);
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
	public T_Ul_PrgEvaluacion toEntityModel() {
		T_Ul_PrgEvaluacionImpl t_Ul_PrgEvaluacionImpl =
			new T_Ul_PrgEvaluacionImpl();

		if (uuid == null) {
			t_Ul_PrgEvaluacionImpl.setUuid("");
		}
		else {
			t_Ul_PrgEvaluacionImpl.setUuid(uuid);
		}

		t_Ul_PrgEvaluacionImpl.setIdPreguntas(idPreguntas);

		if (problPreguntas == null) {
			t_Ul_PrgEvaluacionImpl.setProblPreguntas("");
		}
		else {
			t_Ul_PrgEvaluacionImpl.setProblPreguntas(problPreguntas);
		}

		if (opcPreguntas == null) {
			t_Ul_PrgEvaluacionImpl.setOpcPreguntas("");
		}
		else {
			t_Ul_PrgEvaluacionImpl.setOpcPreguntas(opcPreguntas);
		}

		if (puntajePreguntas == null) {
			t_Ul_PrgEvaluacionImpl.setPuntajePreguntas("");
		}
		else {
			t_Ul_PrgEvaluacionImpl.setPuntajePreguntas(puntajePreguntas);
		}

		if (intentoPreguntas == null) {
			t_Ul_PrgEvaluacionImpl.setIntentoPreguntas("");
		}
		else {
			t_Ul_PrgEvaluacionImpl.setIntentoPreguntas(intentoPreguntas);
		}

		if (limiteTPreguntas == null) {
			t_Ul_PrgEvaluacionImpl.setLimiteTPreguntas("");
		}
		else {
			t_Ul_PrgEvaluacionImpl.setLimiteTPreguntas(limiteTPreguntas);
		}

		t_Ul_PrgEvaluacionImpl.setT_Ul_Actividad_id(T_Ul_Actividad_id);
		t_Ul_PrgEvaluacionImpl.setGroupId(groupId);
		t_Ul_PrgEvaluacionImpl.setCompanyId(companyId);
		t_Ul_PrgEvaluacionImpl.setUserId(userId);

		if (userName == null) {
			t_Ul_PrgEvaluacionImpl.setUserName("");
		}
		else {
			t_Ul_PrgEvaluacionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			t_Ul_PrgEvaluacionImpl.setCreateDate(null);
		}
		else {
			t_Ul_PrgEvaluacionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			t_Ul_PrgEvaluacionImpl.setModifiedDate(null);
		}
		else {
			t_Ul_PrgEvaluacionImpl.setModifiedDate(new Date(modifiedDate));
		}

		t_Ul_PrgEvaluacionImpl.resetOriginalValues();

		return t_Ul_PrgEvaluacionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idPreguntas = objectInput.readLong();
		problPreguntas = objectInput.readUTF();
		opcPreguntas = objectInput.readUTF();
		puntajePreguntas = objectInput.readUTF();
		intentoPreguntas = objectInput.readUTF();
		limiteTPreguntas = objectInput.readUTF();

		T_Ul_Actividad_id = objectInput.readLong();

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

		objectOutput.writeLong(idPreguntas);

		if (problPreguntas == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(problPreguntas);
		}

		if (opcPreguntas == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(opcPreguntas);
		}

		if (puntajePreguntas == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(puntajePreguntas);
		}

		if (intentoPreguntas == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(intentoPreguntas);
		}

		if (limiteTPreguntas == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(limiteTPreguntas);
		}

		objectOutput.writeLong(T_Ul_Actividad_id);

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
	public long idPreguntas;
	public String problPreguntas;
	public String opcPreguntas;
	public String puntajePreguntas;
	public String intentoPreguntas;
	public String limiteTPreguntas;
	public long T_Ul_Actividad_id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}