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

import com.savvy.sb.model.Categoria;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Categoria in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class CategoriaCacheModel
	implements CacheModel<Categoria>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof CategoriaCacheModel)) {
			return false;
		}

		CategoriaCacheModel categoriaCacheModel = (CategoriaCacheModel)object;

		if (categoriaId == categoriaCacheModel.categoriaId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, categoriaId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", categoriaId=");
		sb.append(categoriaId);
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
		sb.append(", nombreCategoria=");
		sb.append(nombreCategoria);
		sb.append(", descripcion=");
		sb.append(descripcion);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Categoria toEntityModel() {
		CategoriaImpl categoriaImpl = new CategoriaImpl();

		if (uuid == null) {
			categoriaImpl.setUuid("");
		}
		else {
			categoriaImpl.setUuid(uuid);
		}

		categoriaImpl.setCategoriaId(categoriaId);
		categoriaImpl.setGroupId(groupId);
		categoriaImpl.setCompanyId(companyId);
		categoriaImpl.setUserId(userId);

		if (userName == null) {
			categoriaImpl.setUserName("");
		}
		else {
			categoriaImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			categoriaImpl.setCreateDate(null);
		}
		else {
			categoriaImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			categoriaImpl.setModifiedDate(null);
		}
		else {
			categoriaImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (nombreCategoria == null) {
			categoriaImpl.setNombreCategoria("");
		}
		else {
			categoriaImpl.setNombreCategoria(nombreCategoria);
		}

		if (descripcion == null) {
			categoriaImpl.setDescripcion("");
		}
		else {
			categoriaImpl.setDescripcion(descripcion);
		}

		categoriaImpl.resetOriginalValues();

		return categoriaImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		categoriaId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		nombreCategoria = objectInput.readUTF();
		descripcion = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(categoriaId);

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

		if (nombreCategoria == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nombreCategoria);
		}

		if (descripcion == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descripcion);
		}
	}

	public String uuid;
	public long categoriaId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String nombreCategoria;
	public String descripcion;

}