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
 * This class is used by SOAP remote services, specifically {@link com.aula.sb.service.http.T_Ul_EstudianteServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class T_Ul_EstudianteSoap implements Serializable {

	public static T_Ul_EstudianteSoap toSoapModel(T_Ul_Estudiante model) {
		T_Ul_EstudianteSoap soapModel = new T_Ul_EstudianteSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setIdEstudiante(model.getIdEstudiante());
		soapModel.setNombreEstudiante(model.getNombreEstudiante());
		soapModel.setCorreoEstudiante(model.getCorreoEstudiante());
		soapModel.setProfesEstudiante(model.getProfesEstudiante());
		soapModel.setSedeEstudiante(model.getSedeEstudiante());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static T_Ul_EstudianteSoap[] toSoapModels(T_Ul_Estudiante[] models) {
		T_Ul_EstudianteSoap[] soapModels =
			new T_Ul_EstudianteSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static T_Ul_EstudianteSoap[][] toSoapModels(
		T_Ul_Estudiante[][] models) {

		T_Ul_EstudianteSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new T_Ul_EstudianteSoap[models.length][models[0].length];
		}
		else {
			soapModels = new T_Ul_EstudianteSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static T_Ul_EstudianteSoap[] toSoapModels(
		List<T_Ul_Estudiante> models) {

		List<T_Ul_EstudianteSoap> soapModels =
			new ArrayList<T_Ul_EstudianteSoap>(models.size());

		for (T_Ul_Estudiante model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new T_Ul_EstudianteSoap[soapModels.size()]);
	}

	public T_Ul_EstudianteSoap() {
	}

	public long getPrimaryKey() {
		return _idEstudiante;
	}

	public void setPrimaryKey(long pk) {
		setIdEstudiante(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getIdEstudiante() {
		return _idEstudiante;
	}

	public void setIdEstudiante(long idEstudiante) {
		_idEstudiante = idEstudiante;
	}

	public String getNombreEstudiante() {
		return _nombreEstudiante;
	}

	public void setNombreEstudiante(String nombreEstudiante) {
		_nombreEstudiante = nombreEstudiante;
	}

	public String getCorreoEstudiante() {
		return _correoEstudiante;
	}

	public void setCorreoEstudiante(String correoEstudiante) {
		_correoEstudiante = correoEstudiante;
	}

	public String getProfesEstudiante() {
		return _profesEstudiante;
	}

	public void setProfesEstudiante(String profesEstudiante) {
		_profesEstudiante = profesEstudiante;
	}

	public String getSedeEstudiante() {
		return _sedeEstudiante;
	}

	public void setSedeEstudiante(String sedeEstudiante) {
		_sedeEstudiante = sedeEstudiante;
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
	private long _idEstudiante;
	private String _nombreEstudiante;
	private String _correoEstudiante;
	private String _profesEstudiante;
	private String _sedeEstudiante;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;

}