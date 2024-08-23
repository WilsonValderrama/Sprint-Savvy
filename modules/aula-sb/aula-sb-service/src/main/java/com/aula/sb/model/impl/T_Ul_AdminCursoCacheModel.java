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

import com.aula.sb.model.T_Ul_AdminCurso;
import com.aula.sb.service.persistence.T_Ul_AdminCursoPK;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing T_Ul_AdminCurso in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class T_Ul_AdminCursoCacheModel
	implements CacheModel<T_Ul_AdminCurso>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof T_Ul_AdminCursoCacheModel)) {
			return false;
		}

		T_Ul_AdminCursoCacheModel t_Ul_AdminCursoCacheModel =
			(T_Ul_AdminCursoCacheModel)object;

		if (t_Ul_AdminCursoPK.equals(
				t_Ul_AdminCursoCacheModel.t_Ul_AdminCursoPK)) {

			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, t_Ul_AdminCursoPK);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", T_Ul_Admin_id=");
		sb.append(T_Ul_Admin_id);
		sb.append(", T_Ul_Curso_id=");
		sb.append(T_Ul_Curso_id);
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
	public T_Ul_AdminCurso toEntityModel() {
		T_Ul_AdminCursoImpl t_Ul_AdminCursoImpl = new T_Ul_AdminCursoImpl();

		if (uuid == null) {
			t_Ul_AdminCursoImpl.setUuid("");
		}
		else {
			t_Ul_AdminCursoImpl.setUuid(uuid);
		}

		t_Ul_AdminCursoImpl.setT_Ul_Admin_id(T_Ul_Admin_id);
		t_Ul_AdminCursoImpl.setT_Ul_Curso_id(T_Ul_Curso_id);
		t_Ul_AdminCursoImpl.setGroupId(groupId);
		t_Ul_AdminCursoImpl.setCompanyId(companyId);
		t_Ul_AdminCursoImpl.setUserId(userId);

		if (userName == null) {
			t_Ul_AdminCursoImpl.setUserName("");
		}
		else {
			t_Ul_AdminCursoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			t_Ul_AdminCursoImpl.setCreateDate(null);
		}
		else {
			t_Ul_AdminCursoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			t_Ul_AdminCursoImpl.setModifiedDate(null);
		}
		else {
			t_Ul_AdminCursoImpl.setModifiedDate(new Date(modifiedDate));
		}

		t_Ul_AdminCursoImpl.resetOriginalValues();

		return t_Ul_AdminCursoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		T_Ul_Admin_id = objectInput.readLong();

		T_Ul_Curso_id = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		t_Ul_AdminCursoPK = new T_Ul_AdminCursoPK(T_Ul_Admin_id, T_Ul_Curso_id);
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(T_Ul_Admin_id);

		objectOutput.writeLong(T_Ul_Curso_id);

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
	public long T_Ul_Admin_id;
	public long T_Ul_Curso_id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public transient T_Ul_AdminCursoPK t_Ul_AdminCursoPK;

}