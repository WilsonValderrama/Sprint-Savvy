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

import com.aula.sb.model.T_Ul_Curso;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing T_Ul_Curso in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class T_Ul_CursoCacheModel
	implements CacheModel<T_Ul_Curso>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof T_Ul_CursoCacheModel)) {
			return false;
		}

		T_Ul_CursoCacheModel t_Ul_CursoCacheModel =
			(T_Ul_CursoCacheModel)object;

		if (idCurso == t_Ul_CursoCacheModel.idCurso) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idCurso);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", idCurso=");
		sb.append(idCurso);
		sb.append(", nombreCurso=");
		sb.append(nombreCurso);
		sb.append(", fInicioCurso=");
		sb.append(fInicioCurso);
		sb.append(", fFinCurso=");
		sb.append(fFinCurso);
		sb.append(", T_Ul_Califi_id=");
		sb.append(T_Ul_Califi_id);
		sb.append(", T_Ul_Profesor_id=");
		sb.append(T_Ul_Profesor_id);
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
	public T_Ul_Curso toEntityModel() {
		T_Ul_CursoImpl t_Ul_CursoImpl = new T_Ul_CursoImpl();

		if (uuid == null) {
			t_Ul_CursoImpl.setUuid("");
		}
		else {
			t_Ul_CursoImpl.setUuid(uuid);
		}

		t_Ul_CursoImpl.setIdCurso(idCurso);

		if (nombreCurso == null) {
			t_Ul_CursoImpl.setNombreCurso("");
		}
		else {
			t_Ul_CursoImpl.setNombreCurso(nombreCurso);
		}

		if (fInicioCurso == Long.MIN_VALUE) {
			t_Ul_CursoImpl.setFInicioCurso(null);
		}
		else {
			t_Ul_CursoImpl.setFInicioCurso(new Date(fInicioCurso));
		}

		if (fFinCurso == Long.MIN_VALUE) {
			t_Ul_CursoImpl.setFFinCurso(null);
		}
		else {
			t_Ul_CursoImpl.setFFinCurso(new Date(fFinCurso));
		}

		t_Ul_CursoImpl.setT_Ul_Califi_id(T_Ul_Califi_id);
		t_Ul_CursoImpl.setT_Ul_Profesor_id(T_Ul_Profesor_id);
		t_Ul_CursoImpl.setGroupId(groupId);
		t_Ul_CursoImpl.setCompanyId(companyId);
		t_Ul_CursoImpl.setUserId(userId);

		if (userName == null) {
			t_Ul_CursoImpl.setUserName("");
		}
		else {
			t_Ul_CursoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			t_Ul_CursoImpl.setCreateDate(null);
		}
		else {
			t_Ul_CursoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			t_Ul_CursoImpl.setModifiedDate(null);
		}
		else {
			t_Ul_CursoImpl.setModifiedDate(new Date(modifiedDate));
		}

		t_Ul_CursoImpl.resetOriginalValues();

		return t_Ul_CursoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idCurso = objectInput.readLong();
		nombreCurso = objectInput.readUTF();
		fInicioCurso = objectInput.readLong();
		fFinCurso = objectInput.readLong();

		T_Ul_Califi_id = objectInput.readLong();

		T_Ul_Profesor_id = objectInput.readLong();

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

		objectOutput.writeLong(idCurso);

		if (nombreCurso == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombreCurso);
		}

		objectOutput.writeLong(fInicioCurso);
		objectOutput.writeLong(fFinCurso);

		objectOutput.writeLong(T_Ul_Califi_id);

		objectOutput.writeLong(T_Ul_Profesor_id);

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
	public long idCurso;
	public String nombreCurso;
	public long fInicioCurso;
	public long fFinCurso;
	public long T_Ul_Califi_id;
	public long T_Ul_Profesor_id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}