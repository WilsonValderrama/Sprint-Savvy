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

package com.aula.sb.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.aula.sb.service.http.T_Ul_AdministradorServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class T_Ul_AdministradorSoap implements Serializable {

	public static T_Ul_AdministradorSoap toSoapModel(T_Ul_Administrador model) {
		T_Ul_AdministradorSoap soapModel = new T_Ul_AdministradorSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setIdAdmin(model.getIdAdmin());
		soapModel.setNombreAdmin(model.getNombreAdmin());
		soapModel.setCorreoAdmin(model.getCorreoAdmin());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static T_Ul_AdministradorSoap[] toSoapModels(
		T_Ul_Administrador[] models) {

		T_Ul_AdministradorSoap[] soapModels =
			new T_Ul_AdministradorSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static T_Ul_AdministradorSoap[][] toSoapModels(
		T_Ul_Administrador[][] models) {

		T_Ul_AdministradorSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new T_Ul_AdministradorSoap[models.length][models[0].length];
		}
		else {
			soapModels = new T_Ul_AdministradorSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static T_Ul_AdministradorSoap[] toSoapModels(
		List<T_Ul_Administrador> models) {

		List<T_Ul_AdministradorSoap> soapModels =
			new ArrayList<T_Ul_AdministradorSoap>(models.size());

		for (T_Ul_Administrador model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new T_Ul_AdministradorSoap[soapModels.size()]);
	}

	public T_Ul_AdministradorSoap() {
	}

	public long getPrimaryKey() {
		return _idAdmin;
	}

	public void setPrimaryKey(long pk) {
		setIdAdmin(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getIdAdmin() {
		return _idAdmin;
	}

	public void setIdAdmin(long idAdmin) {
		_idAdmin = idAdmin;
	}

	public String getNombreAdmin() {
		return _nombreAdmin;
	}

	public void setNombreAdmin(String nombreAdmin) {
		_nombreAdmin = nombreAdmin;
	}

	public String getCorreoAdmin() {
		return _CorreoAdmin;
	}

	public void setCorreoAdmin(String CorreoAdmin) {
		_CorreoAdmin = CorreoAdmin;
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

	private String _uuid;
	private long _idAdmin;
	private String _nombreAdmin;
	private String _CorreoAdmin;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;

}