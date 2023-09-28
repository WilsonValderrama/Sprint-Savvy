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

package com.savvy.sb.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.savvy.sb.service.http.CategoriaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class CategoriaSoap implements Serializable {

	public static CategoriaSoap toSoapModel(Categoria model) {
		CategoriaSoap soapModel = new CategoriaSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setCategoriaId(model.getCategoriaId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setNombreCategoria(model.getNombreCategoria());
		soapModel.setDescripcion(model.getDescripcion());

		return soapModel;
	}

	public static CategoriaSoap[] toSoapModels(Categoria[] models) {
		CategoriaSoap[] soapModels = new CategoriaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static CategoriaSoap[][] toSoapModels(Categoria[][] models) {
		CategoriaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new CategoriaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new CategoriaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static CategoriaSoap[] toSoapModels(List<Categoria> models) {
		List<CategoriaSoap> soapModels = new ArrayList<CategoriaSoap>(
			models.size());

		for (Categoria model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new CategoriaSoap[soapModels.size()]);
	}

	public CategoriaSoap() {
	}

	public long getPrimaryKey() {
		return _categoriaId;
	}

	public void setPrimaryKey(long pk) {
		setCategoriaId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getCategoriaId() {
		return _categoriaId;
	}

	public void setCategoriaId(long categoriaId) {
		_categoriaId = categoriaId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getNombreCategoria() {
		return _nombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		_nombreCategoria = nombreCategoria;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	private String _uuid;
	private long _categoriaId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _nombreCategoria;
	private String _descripcion;

}