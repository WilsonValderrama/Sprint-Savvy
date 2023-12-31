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
 * This class is used by SOAP remote services, specifically {@link com.savvy.sb.service.http.SprintServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class SprintSoap implements Serializable {

	public static SprintSoap toSoapModel(Sprint model) {
		SprintSoap soapModel = new SprintSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setSprintId(model.getSprintId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTituloSprint(model.getTituloSprint());
		soapModel.setFechaInicio(model.getFechaInicio());
		soapModel.setFechaFinal(model.getFechaFinal());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setEstado(model.getEstado());
		soapModel.setProyecto(model.getProyecto());

		return soapModel;
	}

	public static SprintSoap[] toSoapModels(Sprint[] models) {
		SprintSoap[] soapModels = new SprintSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SprintSoap[][] toSoapModels(Sprint[][] models) {
		SprintSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SprintSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SprintSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SprintSoap[] toSoapModels(List<Sprint> models) {
		List<SprintSoap> soapModels = new ArrayList<SprintSoap>(models.size());

		for (Sprint model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SprintSoap[soapModels.size()]);
	}

	public SprintSoap() {
	}

	public long getPrimaryKey() {
		return _sprintId;
	}

	public void setPrimaryKey(long pk) {
		setSprintId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getSprintId() {
		return _sprintId;
	}

	public void setSprintId(long sprintId) {
		_sprintId = sprintId;
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

	public String getTituloSprint() {
		return _tituloSprint;
	}

	public void setTituloSprint(String tituloSprint) {
		_tituloSprint = tituloSprint;
	}

	public String getFechaInicio() {
		return _fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		_fechaInicio = fechaInicio;
	}

	public String getFechaFinal() {
		return _fechaFinal;
	}

	public void setFechaFinal(String fechaFinal) {
		_fechaFinal = fechaFinal;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public String getEstado() {
		return _estado;
	}

	public void setEstado(String estado) {
		_estado = estado;
	}

	public String getProyecto() {
		return _proyecto;
	}

	public void setProyecto(String proyecto) {
		_proyecto = proyecto;
	}

	private String _uuid;
	private long _sprintId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _tituloSprint;
	private String _fechaInicio;
	private String _fechaFinal;
	private String _descripcion;
	private String _estado;
	private String _proyecto;

}