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

import com.aula.sb.model.T_Ul_Profesor;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing T_Ul_Profesor in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class T_Ul_ProfesorCacheModel
	implements CacheModel<T_Ul_Profesor>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof T_Ul_ProfesorCacheModel)) {
			return false;
		}

		T_Ul_ProfesorCacheModel t_Ul_ProfesorCacheModel =
			(T_Ul_ProfesorCacheModel)object;

		if (idProfesor == t_Ul_ProfesorCacheModel.idProfesor) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idProfesor);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", idProfesor=");
		sb.append(idProfesor);
		sb.append(", nombreProfesor=");
		sb.append(nombreProfesor);
		sb.append(", correoProfesor=");
		sb.append(correoProfesor);
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
	public T_Ul_Profesor toEntityModel() {
		T_Ul_ProfesorImpl t_Ul_ProfesorImpl = new T_Ul_ProfesorImpl();

		if (uuid == null) {
			t_Ul_ProfesorImpl.setUuid("");
		}
		else {
			t_Ul_ProfesorImpl.setUuid(uuid);
		}

		t_Ul_ProfesorImpl.setIdProfesor(idProfesor);

		if (nombreProfesor == null) {
			t_Ul_ProfesorImpl.setNombreProfesor("");
		}
		else {
			t_Ul_ProfesorImpl.setNombreProfesor(nombreProfesor);
		}

		if (correoProfesor == null) {
			t_Ul_ProfesorImpl.setCorreoProfesor("");
		}
		else {
			t_Ul_ProfesorImpl.setCorreoProfesor(correoProfesor);
		}

		t_Ul_ProfesorImpl.setGroupId(groupId);
		t_Ul_ProfesorImpl.setCompanyId(companyId);
		t_Ul_ProfesorImpl.setUserId(userId);

		if (userName == null) {
			t_Ul_ProfesorImpl.setUserName("");
		}
		else {
			t_Ul_ProfesorImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			t_Ul_ProfesorImpl.setCreateDate(null);
		}
		else {
			t_Ul_ProfesorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			t_Ul_ProfesorImpl.setModifiedDate(null);
		}
		else {
			t_Ul_ProfesorImpl.setModifiedDate(new Date(modifiedDate));
		}

		t_Ul_ProfesorImpl.resetOriginalValues();

		return t_Ul_ProfesorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idProfesor = objectInput.readLong();
		nombreProfesor = objectInput.readUTF();
		correoProfesor = objectInput.readUTF();

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

		objectOutput.writeLong(idProfesor);

		if (nombreProfesor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombreProfesor);
		}

		if (correoProfesor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(correoProfesor);
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
	public long idProfesor;
	public String nombreProfesor;
	public String correoProfesor;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}