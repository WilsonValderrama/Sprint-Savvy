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
 * This class is used by SOAP remote services, specifically {@link com.aula.sb.service.http.T_Ul_ResEvaluacionServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class T_Ul_ResEvaluacionSoap implements Serializable {

	public static T_Ul_ResEvaluacionSoap toSoapModel(T_Ul_ResEvaluacion model) {
		T_Ul_ResEvaluacionSoap soapModel = new T_Ul_ResEvaluacionSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setIdRespuestas(model.getIdRespuestas());
		soapModel.setProblRespuestas(model.getProblRespuestas());
		soapModel.setOpcionRespuestas(model.getOpcionRespuestas());
		soapModel.setPuntajeRespuestas(model.getPuntajeRespuestas());
		soapModel.setT_Ul_Estudiante_id(model.getT_Ul_Estudiante_id());
		soapModel.setT_Ul_PrgEvaluacion_id(model.getT_Ul_PrgEvaluacion_id());
		soapModel.setT_Ul_Califi_id(model.getT_Ul_Califi_id());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static T_Ul_ResEvaluacionSoap[] toSoapModels(
		T_Ul_ResEvaluacion[] models) {

		T_Ul_ResEvaluacionSoap[] soapModels =
			new T_Ul_ResEvaluacionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static T_Ul_ResEvaluacionSoap[][] toSoapModels(
		T_Ul_ResEvaluacion[][] models) {

		T_Ul_ResEvaluacionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new T_Ul_ResEvaluacionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new T_Ul_ResEvaluacionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static T_Ul_ResEvaluacionSoap[] toSoapModels(
		List<T_Ul_ResEvaluacion> models) {

		List<T_Ul_ResEvaluacionSoap> soapModels =
			new ArrayList<T_Ul_ResEvaluacionSoap>(models.size());

		for (T_Ul_ResEvaluacion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new T_Ul_ResEvaluacionSoap[soapModels.size()]);
	}

	public T_Ul_ResEvaluacionSoap() {
	}

	public long getPrimaryKey() {
		return _idRespuestas;
	}

	public void setPrimaryKey(long pk) {
		setIdRespuestas(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getIdRespuestas() {
		return _idRespuestas;
	}

	public void setIdRespuestas(long idRespuestas) {
		_idRespuestas = idRespuestas;
	}

	public String getProblRespuestas() {
		return _problRespuestas;
	}

	public void setProblRespuestas(String problRespuestas) {
		_problRespuestas = problRespuestas;
	}

	public String getOpcionRespuestas() {
		return _opcionRespuestas;
	}

	public void setOpcionRespuestas(String opcionRespuestas) {
		_opcionRespuestas = opcionRespuestas;
	}

	public String getPuntajeRespuestas() {
		return _puntajeRespuestas;
	}

	public void setPuntajeRespuestas(String puntajeRespuestas) {
		_puntajeRespuestas = puntajeRespuestas;
	}

	public long getT_Ul_Estudiante_id() {
		return _T_Ul_Estudiante_id;
	}

	public void setT_Ul_Estudiante_id(long T_Ul_Estudiante_id) {
		_T_Ul_Estudiante_id = T_Ul_Estudiante_id;
	}

	public long getT_Ul_PrgEvaluacion_id() {
		return _T_Ul_PrgEvaluacion_id;
	}

	public void setT_Ul_PrgEvaluacion_id(long T_Ul_PrgEvaluacion_id) {
		_T_Ul_PrgEvaluacion_id = T_Ul_PrgEvaluacion_id;
	}

	public long getT_Ul_Califi_id() {
		return _T_Ul_Califi_id;
	}

	public void setT_Ul_Califi_id(long T_Ul_Califi_id) {
		_T_Ul_Califi_id = T_Ul_Califi_id;
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
	private long _idRespuestas;
	private String _problRespuestas;
	private String _opcionRespuestas;
	private String _puntajeRespuestas;
	private long _T_Ul_Estudiante_id;
	private long _T_Ul_PrgEvaluacion_id;
	private long _T_Ul_Califi_id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;

}