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

import com.aula.sb.model.T_Ul_Estud_Curso;
import com.aula.sb.service.persistence.T_Ul_Estud_CursoPK;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing T_Ul_Estud_Curso in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class T_Ul_Estud_CursoCacheModel
	implements CacheModel<T_Ul_Estud_Curso>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof T_Ul_Estud_CursoCacheModel)) {
			return false;
		}

		T_Ul_Estud_CursoCacheModel t_Ul_Estud_CursoCacheModel =
			(T_Ul_Estud_CursoCacheModel)object;

		if (t_Ul_Estud_CursoPK.equals(
				t_Ul_Estud_CursoCacheModel.t_Ul_Estud_CursoPK)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, t_Ul_Estud_CursoPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", T_Ul_Curso_id=");
		sb.append(T_Ul_Curso_id);
		sb.append(", T_Ul_Estudiante_id=");
		sb.append(T_Ul_Estudiante_id);
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
	public T_Ul_Estud_Curso toEntityModel() {
		T_Ul_Estud_CursoImpl t_Ul_Estud_CursoImpl = new T_Ul_Estud_CursoImpl();

		if (uuid == null) {
			t_Ul_Estud_CursoImpl.setUuid("");
		}
		else {
			t_Ul_Estud_CursoImpl.setUuid(uuid);
		}

		t_Ul_Estud_CursoImpl.setT_Ul_Curso_id(T_Ul_Curso_id);
		t_Ul_Estud_CursoImpl.setT_Ul_Estudiante_id(T_Ul_Estudiante_id);
		t_Ul_Estud_CursoImpl.setGroupId(groupId);
		t_Ul_Estud_CursoImpl.setCompanyId(companyId);
		t_Ul_Estud_CursoImpl.setUserId(userId);

		if (userName == null) {
			t_Ul_Estud_CursoImpl.setUserName("");
		}
		else {
			t_Ul_Estud_CursoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			t_Ul_Estud_CursoImpl.setCreateDate(null);
		}
		else {
			t_Ul_Estud_CursoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			t_Ul_Estud_CursoImpl.setModifiedDate(null);
		}
		else {
			t_Ul_Estud_CursoImpl.setModifiedDate(new Date(modifiedDate));
		}

		t_Ul_Estud_CursoImpl.resetOriginalValues();

		return t_Ul_Estud_CursoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		T_Ul_Curso_id = objectInput.readLong();

		T_Ul_Estudiante_id = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		t_Ul_Estud_CursoPK = new T_Ul_Estud_CursoPK(
			T_Ul_Curso_id, T_Ul_Estudiante_id);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(T_Ul_Curso_id);

		objectOutput.writeLong(T_Ul_Estudiante_id);

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
	public long T_Ul_Curso_id;
	public long T_Ul_Estudiante_id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public transient T_Ul_Estud_CursoPK t_Ul_Estud_CursoPK;

}