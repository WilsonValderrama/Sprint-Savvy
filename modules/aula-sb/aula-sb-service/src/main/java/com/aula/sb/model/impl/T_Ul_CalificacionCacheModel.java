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

import com.aula.sb.model.T_Ul_Calificacion;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing T_Ul_Calificacion in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class T_Ul_CalificacionCacheModel
	implements CacheModel<T_Ul_Calificacion>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof T_Ul_CalificacionCacheModel)) {
			return false;
		}

		T_Ul_CalificacionCacheModel t_Ul_CalificacionCacheModel =
			(T_Ul_CalificacionCacheModel)object;

		if (idCalificacion == t_Ul_CalificacionCacheModel.idCalificacion) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idCalificacion);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", idCalificacion=");
		sb.append(idCalificacion);
		sb.append(", puntCalificacion=");
		sb.append(puntCalificacion);
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
	public T_Ul_Calificacion toEntityModel() {
		T_Ul_CalificacionImpl t_Ul_CalificacionImpl =
			new T_Ul_CalificacionImpl();

		if (uuid == null) {
			t_Ul_CalificacionImpl.setUuid("");
		}
		else {
			t_Ul_CalificacionImpl.setUuid(uuid);
		}

		t_Ul_CalificacionImpl.setIdCalificacion(idCalificacion);

		if (puntCalificacion == null) {
			t_Ul_CalificacionImpl.setPuntCalificacion("");
		}
		else {
			t_Ul_CalificacionImpl.setPuntCalificacion(puntCalificacion);
		}

		t_Ul_CalificacionImpl.setGroupId(groupId);
		t_Ul_CalificacionImpl.setCompanyId(companyId);
		t_Ul_CalificacionImpl.setUserId(userId);

		if (userName == null) {
			t_Ul_CalificacionImpl.setUserName("");
		}
		else {
			t_Ul_CalificacionImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			t_Ul_CalificacionImpl.setCreateDate(null);
		}
		else {
			t_Ul_CalificacionImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			t_Ul_CalificacionImpl.setModifiedDate(null);
		}
		else {
			t_Ul_CalificacionImpl.setModifiedDate(new Date(modifiedDate));
		}

		t_Ul_CalificacionImpl.resetOriginalValues();

		return t_Ul_CalificacionImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idCalificacion = objectInput.readLong();
		puntCalificacion = objectInput.readUTF();

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

		objectOutput.writeLong(idCalificacion);

		if (puntCalificacion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(puntCalificacion);
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
	public long idCalificacion;
	public String puntCalificacion;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}