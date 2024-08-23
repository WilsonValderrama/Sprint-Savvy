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

import com.aula.sb.model.T_Ul_Administrador;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing T_Ul_Administrador in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class T_Ul_AdministradorCacheModel
	implements CacheModel<T_Ul_Administrador>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof T_Ul_AdministradorCacheModel)) {
			return false;
		}

		T_Ul_AdministradorCacheModel t_Ul_AdministradorCacheModel =
			(T_Ul_AdministradorCacheModel)object;

		if (idAdmin == t_Ul_AdministradorCacheModel.idAdmin) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idAdmin);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", idAdmin=");
		sb.append(idAdmin);
		sb.append(", nombreAdmin=");
		sb.append(nombreAdmin);
		sb.append(", CorreoAdmin=");
		sb.append(CorreoAdmin);
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
	public T_Ul_Administrador toEntityModel() {
		T_Ul_AdministradorImpl t_Ul_AdministradorImpl =
			new T_Ul_AdministradorImpl();

		if (uuid == null) {
			t_Ul_AdministradorImpl.setUuid("");
		}
		else {
			t_Ul_AdministradorImpl.setUuid(uuid);
		}

		t_Ul_AdministradorImpl.setIdAdmin(idAdmin);

		if (nombreAdmin == null) {
			t_Ul_AdministradorImpl.setNombreAdmin("");
		}
		else {
			t_Ul_AdministradorImpl.setNombreAdmin(nombreAdmin);
		}

		if (CorreoAdmin == null) {
			t_Ul_AdministradorImpl.setCorreoAdmin("");
		}
		else {
			t_Ul_AdministradorImpl.setCorreoAdmin(CorreoAdmin);
		}

		t_Ul_AdministradorImpl.setGroupId(groupId);
		t_Ul_AdministradorImpl.setCompanyId(companyId);
		t_Ul_AdministradorImpl.setUserId(userId);

		if (userName == null) {
			t_Ul_AdministradorImpl.setUserName("");
		}
		else {
			t_Ul_AdministradorImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			t_Ul_AdministradorImpl.setCreateDate(null);
		}
		else {
			t_Ul_AdministradorImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			t_Ul_AdministradorImpl.setModifiedDate(null);
		}
		else {
			t_Ul_AdministradorImpl.setModifiedDate(new Date(modifiedDate));
		}

		t_Ul_AdministradorImpl.resetOriginalValues();

		return t_Ul_AdministradorImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idAdmin = objectInput.readLong();
		nombreAdmin = objectInput.readUTF();
		CorreoAdmin = objectInput.readUTF();

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

		objectOutput.writeLong(idAdmin);

		if (nombreAdmin == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombreAdmin);
		}

		if (CorreoAdmin == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(CorreoAdmin);
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
	public long idAdmin;
	public String nombreAdmin;
	public String CorreoAdmin;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}