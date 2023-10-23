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
 * This class is used by SOAP remote services, specifically {@link com.savvy.sb.service.http.ProyectoServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ProyectoSoap implements Serializable {

	public static ProyectoSoap toSoapModel(Proyecto model) {
		ProyectoSoap soapModel = new ProyectoSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setProyectoId(model.getProyectoId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setTituloProyecto(model.getTituloProyecto());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setFechaInicio(model.getFechaInicio());
		soapModel.setFechaFinal(model.getFechaFinal());
		soapModel.setEstado(model.getEstado());

		return soapModel;
	}

	public static ProyectoSoap[] toSoapModels(Proyecto[] models) {
		ProyectoSoap[] soapModels = new ProyectoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ProyectoSoap[][] toSoapModels(Proyecto[][] models) {
		ProyectoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ProyectoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ProyectoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ProyectoSoap[] toSoapModels(List<Proyecto> models) {
		List<ProyectoSoap> soapModels = new ArrayList<ProyectoSoap>(
			models.size());

		for (Proyecto model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ProyectoSoap[soapModels.size()]);
	}

	public ProyectoSoap() {
	}

	public long getPrimaryKey() {
		return _proyectoId;
	}

	public void setPrimaryKey(long pk) {
		setProyectoId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getProyectoId() {
		return _proyectoId;
	}

	public void setProyectoId(long proyectoId) {
		_proyectoId = proyectoId;
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

	public String getTituloProyecto() {
		return _tituloProyecto;
	}

	public void setTituloProyecto(String tituloProyecto) {
		_tituloProyecto = tituloProyecto;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
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

	public String getEstado() {
		return _estado;
	}

	public void setEstado(String estado) {
		_estado = estado;
	}

	private String _uuid;
	private long _proyectoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _tituloProyecto;
	private String _descripcion;
	private String _fechaInicio;
	private String _fechaFinal;
	private String _estado;

}