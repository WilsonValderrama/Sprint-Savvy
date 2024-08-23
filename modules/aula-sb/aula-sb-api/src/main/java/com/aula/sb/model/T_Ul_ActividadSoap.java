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
 * This class is used by SOAP remote services, specifically {@link com.aula.sb.service.http.T_Ul_ActividadServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class T_Ul_ActividadSoap implements Serializable {

	public static T_Ul_ActividadSoap toSoapModel(T_Ul_Actividad model) {
		T_Ul_ActividadSoap soapModel = new T_Ul_ActividadSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setIdActividad(model.getIdActividad());
		soapModel.setTituloActividad(model.getTituloActividad());
		soapModel.setTipoActividad(model.getTipoActividad());
		soapModel.setDescriActividad(model.getDescriActividad());
		soapModel.setEstadoEntrActividad(model.getEstadoEntrActividad());
		soapModel.setFCreacActividad(model.getFCreacActividad());
		soapModel.setFCierrActividad(model.getFCierrActividad());
		soapModel.setPorcActividad(model.getPorcActividad());
		soapModel.setT_Ul_Califi_id(model.getT_Ul_Califi_id());
		soapModel.setT_Ul_PAcademico_id(model.getT_Ul_PAcademico_id());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static T_Ul_ActividadSoap[] toSoapModels(T_Ul_Actividad[] models) {
		T_Ul_ActividadSoap[] soapModels = new T_Ul_ActividadSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static T_Ul_ActividadSoap[][] toSoapModels(
		T_Ul_Actividad[][] models) {

		T_Ul_ActividadSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new T_Ul_ActividadSoap[models.length][models[0].length];
		}
		else {
			soapModels = new T_Ul_ActividadSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static T_Ul_ActividadSoap[] toSoapModels(
		List<T_Ul_Actividad> models) {

		List<T_Ul_ActividadSoap> soapModels = new ArrayList<T_Ul_ActividadSoap>(
			models.size());

		for (T_Ul_Actividad model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new T_Ul_ActividadSoap[soapModels.size()]);
	}

	public T_Ul_ActividadSoap() {
	}

	public long getPrimaryKey() {
		return _idActividad;
	}

	public void setPrimaryKey(long pk) {
		setIdActividad(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getIdActividad() {
		return _idActividad;
	}

	public void setIdActividad(long idActividad) {
		_idActividad = idActividad;
	}

	public String getTituloActividad() {
		return _tituloActividad;
	}

	public void setTituloActividad(String tituloActividad) {
		_tituloActividad = tituloActividad;
	}

	public String getTipoActividad() {
		return _tipoActividad;
	}

	public void setTipoActividad(String tipoActividad) {
		_tipoActividad = tipoActividad;
	}

	public String getDescriActividad() {
		return _descriActividad;
	}

	public void setDescriActividad(String descriActividad) {
		_descriActividad = descriActividad;
	}

	public String getEstadoEntrActividad() {
		return _estadoEntrActividad;
	}

	public void setEstadoEntrActividad(String estadoEntrActividad) {
		_estadoEntrActividad = estadoEntrActividad;
	}

	public Date getFCreacActividad() {
		return _fCreacActividad;
	}

	public void setFCreacActividad(Date fCreacActividad) {
		_fCreacActividad = fCreacActividad;
	}

	public Date getFCierrActividad() {
		return _fCierrActividad;
	}

	public void setFCierrActividad(Date fCierrActividad) {
		_fCierrActividad = fCierrActividad;
	}

	public String getPorcActividad() {
		return _porcActividad;
	}

	public void setPorcActividad(String porcActividad) {
		_porcActividad = porcActividad;
	}

	public long getT_Ul_Califi_id() {
		return _T_Ul_Califi_id;
	}

	public void setT_Ul_Califi_id(long T_Ul_Califi_id) {
		_T_Ul_Califi_id = T_Ul_Califi_id;
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
	private long _idActividad;
	private String _tituloActividad;
	private String _tipoActividad;
	private String _descriActividad;
	private String _estadoEntrActividad;
	private Date _fCreacActividad;
	private Date _fCierrActividad;
	private String _porcActividad;
	private long _T_Ul_Califi_id;
	private long _T_Ul_PAcademico_id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;

}