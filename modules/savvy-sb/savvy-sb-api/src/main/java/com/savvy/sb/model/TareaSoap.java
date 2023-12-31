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
 * This class is used by SOAP remote services, specifically {@link com.savvy.sb.service.http.TareaServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class TareaSoap implements Serializable {

	public static TareaSoap toSoapModel(Tarea model) {
		TareaSoap soapModel = new TareaSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setTareaId(model.getTareaId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setNombreTarea(model.getNombreTarea());
		soapModel.setProyecto(model.getProyecto());
		soapModel.setResponsable(model.getResponsable());
		soapModel.setPrioridad(model.getPrioridad());
		soapModel.setSprint(model.getSprint());
		soapModel.setEstado(model.getEstado());
		soapModel.setFechaLimite(model.getFechaLimite());
		soapModel.setResumen(model.getResumen());
		soapModel.setDescripcion(model.getDescripcion());
		soapModel.setCategoria(model.getCategoria());
		soapModel.setEtiqueta(model.getEtiqueta());

		return soapModel;
	}

	public static TareaSoap[] toSoapModels(Tarea[] models) {
		TareaSoap[] soapModels = new TareaSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static TareaSoap[][] toSoapModels(Tarea[][] models) {
		TareaSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new TareaSoap[models.length][models[0].length];
		}
		else {
			soapModels = new TareaSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static TareaSoap[] toSoapModels(List<Tarea> models) {
		List<TareaSoap> soapModels = new ArrayList<TareaSoap>(models.size());

		for (Tarea model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new TareaSoap[soapModels.size()]);
	}

	public TareaSoap() {
	}

	public long getPrimaryKey() {
		return _tareaId;
	}

	public void setPrimaryKey(long pk) {
		setTareaId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getTareaId() {
		return _tareaId;
	}

	public void setTareaId(long tareaId) {
		_tareaId = tareaId;
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

	public String getNombreTarea() {
		return _nombreTarea;
	}

	public void setNombreTarea(String nombreTarea) {
		_nombreTarea = nombreTarea;
	}

	public String getProyecto() {
		return _proyecto;
	}

	public void setProyecto(String proyecto) {
		_proyecto = proyecto;
	}

	public String getResponsable() {
		return _responsable;
	}

	public void setResponsable(String responsable) {
		_responsable = responsable;
	}

	public String getPrioridad() {
		return _prioridad;
	}

	public void setPrioridad(String prioridad) {
		_prioridad = prioridad;
	}

	public String getSprint() {
		return _sprint;
	}

	public void setSprint(String sprint) {
		_sprint = sprint;
	}

	public String getEstado() {
		return _estado;
	}

	public void setEstado(String estado) {
		_estado = estado;
	}

	public String getFechaLimite() {
		return _fechaLimite;
	}

	public void setFechaLimite(String fechaLimite) {
		_fechaLimite = fechaLimite;
	}

	public String getResumen() {
		return _resumen;
	}

	public void setResumen(String resumen) {
		_resumen = resumen;
	}

	public String getDescripcion() {
		return _descripcion;
	}

	public void setDescripcion(String descripcion) {
		_descripcion = descripcion;
	}

	public String getCategoria() {
		return _categoria;
	}

	public void setCategoria(String categoria) {
		_categoria = categoria;
	}

	public String getEtiqueta() {
		return _etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		_etiqueta = etiqueta;
	}

	private String _uuid;
	private long _tareaId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _nombreTarea;
	private String _proyecto;
	private String _responsable;
	private String _prioridad;
	private String _sprint;
	private String _estado;
	private String _fechaLimite;
	private String _resumen;
	private String _descripcion;
	private String _categoria;
	private String _etiqueta;

}