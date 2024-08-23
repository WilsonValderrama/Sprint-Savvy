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

import com.aula.sb.model.T_Ul_PAcademico;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing T_Ul_PAcademico in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class T_Ul_PAcademicoCacheModel
	implements CacheModel<T_Ul_PAcademico>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof T_Ul_PAcademicoCacheModel)) {
			return false;
		}

		T_Ul_PAcademicoCacheModel t_Ul_PAcademicoCacheModel =
			(T_Ul_PAcademicoCacheModel)object;

		if (idPeriodo == t_Ul_PAcademicoCacheModel.idPeriodo) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idPeriodo);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", idPeriodo=");
		sb.append(idPeriodo);
		sb.append(", tituloPeriodo=");
		sb.append(tituloPeriodo);
		sb.append(", fInicioPeriodo=");
		sb.append(fInicioPeriodo);
		sb.append(", fFinPeriodo=");
		sb.append(fFinPeriodo);
		sb.append(", porcPeriodo=");
		sb.append(porcPeriodo);
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
	public T_Ul_PAcademico toEntityModel() {
		T_Ul_PAcademicoImpl t_Ul_PAcademicoImpl = new T_Ul_PAcademicoImpl();

		if (uuid == null) {
			t_Ul_PAcademicoImpl.setUuid("");
		}
		else {
			t_Ul_PAcademicoImpl.setUuid(uuid);
		}

		t_Ul_PAcademicoImpl.setIdPeriodo(idPeriodo);

		if (tituloPeriodo == null) {
			t_Ul_PAcademicoImpl.setTituloPeriodo("");
		}
		else {
			t_Ul_PAcademicoImpl.setTituloPeriodo(tituloPeriodo);
		}

		if (fInicioPeriodo == Long.MIN_VALUE) {
			t_Ul_PAcademicoImpl.setFInicioPeriodo(null);
		}
		else {
			t_Ul_PAcademicoImpl.setFInicioPeriodo(new Date(fInicioPeriodo));
		}

		if (fFinPeriodo == Long.MIN_VALUE) {
			t_Ul_PAcademicoImpl.setFFinPeriodo(null);
		}
		else {
			t_Ul_PAcademicoImpl.setFFinPeriodo(new Date(fFinPeriodo));
		}

		if (porcPeriodo == null) {
			t_Ul_PAcademicoImpl.setPorcPeriodo("");
		}
		else {
			t_Ul_PAcademicoImpl.setPorcPeriodo(porcPeriodo);
		}

		t_Ul_PAcademicoImpl.setT_Ul_Curso_id(T_Ul_Curso_id);
		t_Ul_PAcademicoImpl.setGroupId(groupId);
		t_Ul_PAcademicoImpl.setCompanyId(companyId);
		t_Ul_PAcademicoImpl.setUserId(userId);

		if (userName == null) {
			t_Ul_PAcademicoImpl.setUserName("");
		}
		else {
			t_Ul_PAcademicoImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			t_Ul_PAcademicoImpl.setCreateDate(null);
		}
		else {
			t_Ul_PAcademicoImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			t_Ul_PAcademicoImpl.setModifiedDate(null);
		}
		else {
			t_Ul_PAcademicoImpl.setModifiedDate(new Date(modifiedDate));
		}

		t_Ul_PAcademicoImpl.resetOriginalValues();

		return t_Ul_PAcademicoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idPeriodo = objectInput.readLong();
		tituloPeriodo = objectInput.readUTF();
		fInicioPeriodo = objectInput.readLong();
		fFinPeriodo = objectInput.readLong();
		porcPeriodo = objectInput.readUTF();

		T_Ul_Curso_id = objectInput.readLong();

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

		objectOutput.writeLong(idPeriodo);

		if (tituloPeriodo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tituloPeriodo);
		}

		objectOutput.writeLong(fInicioPeriodo);
		objectOutput.writeLong(fFinPeriodo);

		if (porcPeriodo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(porcPeriodo);
		}

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
	public long idPeriodo;
	public String tituloPeriodo;
	public long fInicioPeriodo;
	public long fFinPeriodo;
	public String porcPeriodo;
	public long T_Ul_Curso_id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}