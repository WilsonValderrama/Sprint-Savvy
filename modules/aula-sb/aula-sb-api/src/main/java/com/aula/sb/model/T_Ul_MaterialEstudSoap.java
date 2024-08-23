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
 * This class is used by SOAP remote services, specifically {@link com.aula.sb.service.http.T_Ul_MaterialEstudServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class T_Ul_MaterialEstudSoap implements Serializable {

	public static T_Ul_MaterialEstudSoap toSoapModel(T_Ul_MaterialEstud model) {
		T_Ul_MaterialEstudSoap soapModel = new T_Ul_MaterialEstudSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setIdMaterial(model.getIdMaterial());
		soapModel.setTituloMaterial(model.getTituloMaterial());
		soapModel.setFCreacionMaterial(model.getFCreacionMaterial());
		soapModel.setUrlArchMaterial(model.getUrlArchMaterial());
		soapModel.setDescripMaterial(model.getDescripMaterial());
		soapModel.setT_Ul_PAcademico_id(model.getT_Ul_PAcademico_id());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static T_Ul_MaterialEstudSoap[] toSoapModels(
		T_Ul_MaterialEstud[] models) {

		T_Ul_MaterialEstudSoap[] soapModels =
			new T_Ul_MaterialEstudSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static T_Ul_MaterialEstudSoap[][] toSoapModels(
		T_Ul_MaterialEstud[][] models) {

		T_Ul_MaterialEstudSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new T_Ul_MaterialEstudSoap[models.length][models[0].length];
		}
		else {
			soapModels = new T_Ul_MaterialEstudSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static T_Ul_MaterialEstudSoap[] toSoapModels(
		List<T_Ul_MaterialEstud> models) {

		List<T_Ul_MaterialEstudSoap> soapModels =
			new ArrayList<T_Ul_MaterialEstudSoap>(models.size());

		for (T_Ul_MaterialEstud model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new T_Ul_MaterialEstudSoap[soapModels.size()]);
	}

	public T_Ul_MaterialEstudSoap() {
	}

	public long getPrimaryKey() {
		return _idMaterial;
	}

	public void setPrimaryKey(long pk) {
		setIdMaterial(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getIdMaterial() {
		return _idMaterial;
	}

	public void setIdMaterial(long idMaterial) {
		_idMaterial = idMaterial;
	}

	public String getTituloMaterial() {
		return _tituloMaterial;
	}

	public void setTituloMaterial(String tituloMaterial) {
		_tituloMaterial = tituloMaterial;
	}

	public Date getFCreacionMaterial() {
		return _fCreacionMaterial;
	}

	public void setFCreacionMaterial(Date fCreacionMaterial) {
		_fCreacionMaterial = fCreacionMaterial;
	}

	public String getUrlArchMaterial() {
		return _urlArchMaterial;
	}

	public void setUrlArchMaterial(String urlArchMaterial) {
		_urlArchMaterial = urlArchMaterial;
	}

	public String getDescripMaterial() {
		return _descripMaterial;
	}

	public void setDescripMaterial(String descripMaterial) {
		_descripMaterial = descripMaterial;
	}

	public long getT_Ul_PAcademico_id() {
		return _T_Ul_PAcademico_id;
	}

	public void setT_Ul_PAcademico_id(long T_Ul_PAcademico_id) {
		_T_Ul_PAcademico_id = T_Ul_PAcademico_id;
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
	private long _idMaterial;
	private String _tituloMaterial;
	private Date _fCreacionMaterial;
	private String _urlArchMaterial;
	private String _descripMaterial;
	private long _T_Ul_PAcademico_id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;

}