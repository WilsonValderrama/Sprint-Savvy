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

import com.aula.sb.model.T_Ul_Estudiante;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing T_Ul_Estudiante in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class T_Ul_EstudianteCacheModel
	implements CacheModel<T_Ul_Estudiante>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof T_Ul_EstudianteCacheModel)) {
			return false;
		}

		T_Ul_EstudianteCacheModel t_Ul_EstudianteCacheModel =
			(T_Ul_EstudianteCacheModel)object;

		if (idEstudiante == t_Ul_EstudianteCacheModel.idEstudiante) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idEstudiante);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", idEstudiante=");
		sb.append(idEstudiante);
		sb.append(", nombreEstudiante=");
		sb.append(nombreEstudiante);
		sb.append(", correoEstudiante=");
		sb.append(correoEstudiante);
		sb.append(", profesEstudiante=");
		sb.append(profesEstudiante);
		sb.append(", sedeEstudiante=");
		sb.append(sedeEstudiante);
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
	public T_Ul_Estudiante toEntityModel() {
		T_Ul_EstudianteImpl t_Ul_EstudianteImpl = new T_Ul_EstudianteImpl();

		if (uuid == null) {
			t_Ul_EstudianteImpl.setUuid("");
		}
		else {
			t_Ul_EstudianteImpl.setUuid(uuid);
		}

		t_Ul_EstudianteImpl.setIdEstudiante(idEstudiante);

		if (nombreEstudiante == null) {
			t_Ul_EstudianteImpl.setNombreEstudiante("");
		}
		else {
			t_Ul_EstudianteImpl.setNombreEstudiante(nombreEstudiante);
		}

		if (correoEstudiante == null) {
			t_Ul_EstudianteImpl.setCorreoEstudiante("");
		}
		else {
			t_Ul_EstudianteImpl.setCorreoEstudiante(correoEstudiante);
		}

		if (profesEstudiante == null) {
			t_Ul_EstudianteImpl.setProfesEstudiante("");
		}
		else {
			t_Ul_EstudianteImpl.setProfesEstudiante(profesEstudiante);
		}

		if (sedeEstudiante == null) {
			t_Ul_EstudianteImpl.setSedeEstudiante("");
		}
		else {
			t_Ul_EstudianteImpl.setSedeEstudiante(sedeEstudiante);
		}

		t_Ul_EstudianteImpl.setGroupId(groupId);
		t_Ul_EstudianteImpl.setCompanyId(companyId);
		t_Ul_EstudianteImpl.setUserId(userId);

		if (userName == null) {
			t_Ul_EstudianteImpl.setUserName("");
		}
		else {
			t_Ul_EstudianteImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			t_Ul_EstudianteImpl.setCreateDate(null);
		}
		else {
			t_Ul_EstudianteImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			t_Ul_EstudianteImpl.setModifiedDate(null);
		}
		else {
			t_Ul_EstudianteImpl.setModifiedDate(new Date(modifiedDate));
		}

		t_Ul_EstudianteImpl.resetOriginalValues();

		return t_Ul_EstudianteImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idEstudiante = objectInput.readLong();
		nombreEstudiante = objectInput.readUTF();
		correoEstudiante = objectInput.readUTF();
		profesEstudiante = objectInput.readUTF();
		sedeEstudiante = objectInput.readUTF();

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

		objectOutput.writeLong(idEstudiante);

		if (nombreEstudiante == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombreEstudiante);
		}

		if (correoEstudiante == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(correoEstudiante);
		}

		if (profesEstudiante == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(profesEstudiante);
		}

		if (sedeEstudiante == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sedeEstudiante);
		}

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
	public long idEstudiante;
	public String nombreEstudiante;
	public String correoEstudiante;
	public String profesEstudiante;
	public String sedeEstudiante;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}