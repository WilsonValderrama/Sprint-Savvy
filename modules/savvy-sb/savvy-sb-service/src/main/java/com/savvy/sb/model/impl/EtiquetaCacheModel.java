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

package com.savvy.sb.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.savvy.sb.model.Etiqueta;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Etiqueta in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EtiquetaCacheModel
	implements CacheModel<Etiqueta>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof EtiquetaCacheModel)) {
			return false;
		}

		EtiquetaCacheModel etiquetaCacheModel = (EtiquetaCacheModel)object;

		if (etiquetaId == etiquetaCacheModel.etiquetaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, etiquetaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", etiquetaId=");
		sb.append(etiquetaId);
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
		sb.append(", tituloEtiqueta=");
		sb.append(tituloEtiqueta);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Etiqueta toEntityModel() {
		EtiquetaImpl etiquetaImpl = new EtiquetaImpl();

		if (uuid == null) {
			etiquetaImpl.setUuid("");
		}
		else {
			etiquetaImpl.setUuid(uuid);
		}

		etiquetaImpl.setEtiquetaId(etiquetaId);
		etiquetaImpl.setGroupId(groupId);
		etiquetaImpl.setCompanyId(companyId);
		etiquetaImpl.setUserId(userId);

		if (userName == null) {
			etiquetaImpl.setUserName("");
		}
		else {
			etiquetaImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			etiquetaImpl.setCreateDate(null);
		}
		else {
			etiquetaImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			etiquetaImpl.setModifiedDate(null);
		}
		else {
			etiquetaImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (tituloEtiqueta == null) {
			etiquetaImpl.setTituloEtiqueta("");
		}
		else {
			etiquetaImpl.setTituloEtiqueta(tituloEtiqueta);
		}

		etiquetaImpl.resetOriginalValues();

		return etiquetaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		etiquetaId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		tituloEtiqueta = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(etiquetaId);

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

		if (tituloEtiqueta == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tituloEtiqueta);
		}
	}

	public String uuid;
	public long etiquetaId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String tituloEtiqueta;

}