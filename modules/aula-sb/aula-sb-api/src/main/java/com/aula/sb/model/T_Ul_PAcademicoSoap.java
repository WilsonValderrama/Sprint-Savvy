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
 * This class is used by SOAP remote services, specifically {@link com.aula.sb.service.http.T_Ul_PAcademicoServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class T_Ul_PAcademicoSoap implements Serializable {

	public static T_Ul_PAcademicoSoap toSoapModel(T_Ul_PAcademico model) {
		T_Ul_PAcademicoSoap soapModel = new T_Ul_PAcademicoSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setIdPeriodo(model.getIdPeriodo());
		soapModel.setTituloPeriodo(model.getTituloPeriodo());
		soapModel.setFInicioPeriodo(model.getFInicioPeriodo());
		soapModel.setFFinPeriodo(model.getFFinPeriodo());
		soapModel.setPorcPeriodo(model.getPorcPeriodo());
		soapModel.setT_Ul_Curso_id(model.getT_Ul_Curso_id());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static T_Ul_PAcademicoSoap[] toSoapModels(T_Ul_PAcademico[] models) {
		T_Ul_PAcademicoSoap[] soapModels =
			new T_Ul_PAcademicoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static T_Ul_PAcademicoSoap[][] toSoapModels(
		T_Ul_PAcademico[][] models) {

		T_Ul_PAcademicoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new T_Ul_PAcademicoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new T_Ul_PAcademicoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static T_Ul_PAcademicoSoap[] toSoapModels(
		List<T_Ul_PAcademico> models) {

		List<T_Ul_PAcademicoSoap> soapModels =
			new ArrayList<T_Ul_PAcademicoSoap>(models.size());

		for (T_Ul_PAcademico model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new T_Ul_PAcademicoSoap[soapModels.size()]);
	}

	public T_Ul_PAcademicoSoap() {
	}

	public long getPrimaryKey() {
		return _idPeriodo;
	}

	public void setPrimaryKey(long pk) {
		setIdPeriodo(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getIdPeriodo() {
		return _idPeriodo;
	}

	public void setIdPeriodo(long idPeriodo) {
		_idPeriodo = idPeriodo;
	}

	public String getTituloPeriodo() {
		return _tituloPeriodo;
	}

	public void setTituloPeriodo(String tituloPeriodo) {
		_tituloPeriodo = tituloPeriodo;
	}

	public Date getFInicioPeriodo() {
		return _fInicioPeriodo;
	}

	public void setFInicioPeriodo(Date fInicioPeriodo) {
		_fInicioPeriodo = fInicioPeriodo;
	}

	public Date getFFinPeriodo() {
		return _fFinPeriodo;
	}

	public void setFFinPeriodo(Date fFinPeriodo) {
		_fFinPeriodo = fFinPeriodo;
	}

	public String getPorcPeriodo() {
		return _porcPeriodo;
	}

	public void setPorcPeriodo(String porcPeriodo) {
		_porcPeriodo = porcPeriodo;
	}

	public long getT_Ul_Curso_id() {
		return _T_Ul_Curso_id;
	}

	public void setT_Ul_Curso_id(long T_Ul_Curso_id) {
		_T_Ul_Curso_id = T_Ul_Curso_id;
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
	private long _idPeriodo;
	private String _tituloPeriodo;
	private Date _fInicioPeriodo;
	private Date _fFinPeriodo;
	private String _porcPeriodo;
	private long _T_Ul_Curso_id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;

}