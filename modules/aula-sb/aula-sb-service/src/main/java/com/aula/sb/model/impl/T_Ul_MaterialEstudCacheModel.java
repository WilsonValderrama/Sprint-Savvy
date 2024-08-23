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

import com.aula.sb.model.T_Ul_MaterialEstud;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing T_Ul_MaterialEstud in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class T_Ul_MaterialEstudCacheModel
	implements CacheModel<T_Ul_MaterialEstud>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof T_Ul_MaterialEstudCacheModel)) {
			return false;
		}

		T_Ul_MaterialEstudCacheModel t_Ul_MaterialEstudCacheModel =
			(T_Ul_MaterialEstudCacheModel)object;

		if (idMaterial == t_Ul_MaterialEstudCacheModel.idMaterial) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, idMaterial);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", idMaterial=");
		sb.append(idMaterial);
		sb.append(", tituloMaterial=");
		sb.append(tituloMaterial);
		sb.append(", fCreacionMaterial=");
		sb.append(fCreacionMaterial);
		sb.append(", urlArchMaterial=");
		sb.append(urlArchMaterial);
		sb.append(", descripMaterial=");
		sb.append(descripMaterial);
		sb.append(", T_Ul_PAcademico_id=");
		sb.append(T_Ul_PAcademico_id);
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
	public T_Ul_MaterialEstud toEntityModel() {
		T_Ul_MaterialEstudImpl t_Ul_MaterialEstudImpl =
			new T_Ul_MaterialEstudImpl();

		if (uuid == null) {
			t_Ul_MaterialEstudImpl.setUuid("");
		}
		else {
			t_Ul_MaterialEstudImpl.setUuid(uuid);
		}

		t_Ul_MaterialEstudImpl.setIdMaterial(idMaterial);

		if (tituloMaterial == null) {
			t_Ul_MaterialEstudImpl.setTituloMaterial("");
		}
		else {
			t_Ul_MaterialEstudImpl.setTituloMaterial(tituloMaterial);
		}

		if (fCreacionMaterial == Long.MIN_VALUE) {
			t_Ul_MaterialEstudImpl.setFCreacionMaterial(null);
		}
		else {
			t_Ul_MaterialEstudImpl.setFCreacionMaterial(
				new Date(fCreacionMaterial));
		}

		if (urlArchMaterial == null) {
			t_Ul_MaterialEstudImpl.setUrlArchMaterial("");
		}
		else {
			t_Ul_MaterialEstudImpl.setUrlArchMaterial(urlArchMaterial);
		}

		if (descripMaterial == null) {
			t_Ul_MaterialEstudImpl.setDescripMaterial("");
		}
		else {
			t_Ul_MaterialEstudImpl.setDescripMaterial(descripMaterial);
		}

		t_Ul_MaterialEstudImpl.setT_Ul_PAcademico_id(T_Ul_PAcademico_id);
		t_Ul_MaterialEstudImpl.setGroupId(groupId);
		t_Ul_MaterialEstudImpl.setCompanyId(companyId);
		t_Ul_MaterialEstudImpl.setUserId(userId);

		if (userName == null) {
			t_Ul_MaterialEstudImpl.setUserName("");
		}
		else {
			t_Ul_MaterialEstudImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			t_Ul_MaterialEstudImpl.setCreateDate(null);
		}
		else {
			t_Ul_MaterialEstudImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			t_Ul_MaterialEstudImpl.setModifiedDate(null);
		}
		else {
			t_Ul_MaterialEstudImpl.setModifiedDate(new Date(modifiedDate));
		}

		t_Ul_MaterialEstudImpl.resetOriginalValues();

		return t_Ul_MaterialEstudImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		idMaterial = objectInput.readLong();
		tituloMaterial = objectInput.readUTF();
		fCreacionMaterial = objectInput.readLong();
		urlArchMaterial = objectInput.readUTF();
		descripMaterial = objectInput.readUTF();

		T_Ul_PAcademico_id = objectInput.readLong();

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

		objectOutput.writeLong(idMaterial);

		if (tituloMaterial == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tituloMaterial);
		}

		objectOutput.writeLong(fCreacionMaterial);

		if (urlArchMaterial == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(urlArchMaterial);
		}

		if (descripMaterial == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descripMaterial);
		}

		objectOutput.writeLong(T_Ul_PAcademico_id);

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
	public long idMaterial;
	public String tituloMaterial;
	public long fCreacionMaterial;
	public String urlArchMaterial;
	public String descripMaterial;
	public long T_Ul_PAcademico_id;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;

}