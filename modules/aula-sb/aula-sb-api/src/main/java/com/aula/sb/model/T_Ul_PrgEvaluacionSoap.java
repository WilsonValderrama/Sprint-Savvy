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
 * This class is used by SOAP remote services, specifically {@link com.aula.sb.service.http.T_Ul_PrgEvaluacionServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class T_Ul_PrgEvaluacionSoap implements Serializable {

	public static T_Ul_PrgEvaluacionSoap toSoapModel(T_Ul_PrgEvaluacion model) {
		T_Ul_PrgEvaluacionSoap soapModel = new T_Ul_PrgEvaluacionSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setIdPreguntas(model.getIdPreguntas());
		soapModel.setProblPreguntas(model.getProblPreguntas());
		soapModel.setOpcPreguntas(model.getOpcPreguntas());
		soapModel.setPuntajePreguntas(model.getPuntajePreguntas());
		soapModel.setIntentoPreguntas(model.getIntentoPreguntas());
		soapModel.setLimiteTPreguntas(model.getLimiteTPreguntas());
		soapModel.setT_Ul_Actividad_id(model.getT_Ul_Actividad_id());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());

		return soapModel;
	}

	public static T_Ul_PrgEvaluacionSoap[] toSoapModels(
		T_Ul_PrgEvaluacion[] models) {

		T_Ul_PrgEvaluacionSoap[] soapModels =
			new T_Ul_PrgEvaluacionSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static T_Ul_PrgEvaluacionSoap[][] toSoapModels(
		T_Ul_PrgEvaluacion[][] models) {

		T_Ul_PrgEvaluacionSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new T_Ul_PrgEvaluacionSoap[models.length][models[0].length];
		}
		else {
			soapModels = new T_Ul_PrgEvaluacionSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static T_Ul_PrgEvaluacionSoap[] toSoapModels(
		List<T_Ul_PrgEvaluacion> models) {

		List<T_Ul_PrgEvaluacionSoap> soapModels =
			new ArrayList<T_Ul_PrgEvaluacionSoap>(models.size());

		for (T_Ul_PrgEvaluacion model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new T_Ul_PrgEvaluacionSoap[soapModels.size()]);
	}

	public T_Ul_PrgEvaluacionSoap() {
	}

	public long getPrimaryKey() {
		return _idPreguntas;
	}

	public void setPrimaryKey(long pk) {
		setIdPreguntas(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getIdPreguntas() {
		return _idPreguntas;
	}

	public void setIdPreguntas(long idPreguntas) {
		_idPreguntas = idPreguntas;
	}

	public String getProblPreguntas() {
		return _problPreguntas;
	}

	public void setProblPreguntas(String problPreguntas) {
		_problPreguntas = problPreguntas;
	}

	public String getOpcPreguntas() {
		return _opcPreguntas;
	}

	public void setOpcPreguntas(String opcPreguntas) {
		_opcPreguntas = opcPreguntas;
	}

	public String getPuntajePreguntas() {
		return _puntajePreguntas;
	}

	public void setPuntajePreguntas(String puntajePreguntas) {
		_puntajePreguntas = puntajePreguntas;
	}

	public String getIntentoPreguntas() {
		return _intentoPreguntas;
	}

	public void setIntentoPreguntas(String intentoPreguntas) {
		_intentoPreguntas = intentoPreguntas;
	}

	public String getLimiteTPreguntas() {
		return _limiteTPreguntas;
	}

	public void setLimiteTPreguntas(String limiteTPreguntas) {
		_limiteTPreguntas = limiteTPreguntas;
	}

	public long getT_Ul_Actividad_id() {
		return _T_Ul_Actividad_id;
	}

	public void setT_Ul_Actividad_id(long T_Ul_Actividad_id) {
		_T_Ul_Actividad_id = T_Ul_Actividad_id;
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
	private long _idPreguntas;
	private String _problPreguntas;
	private String _opcPreguntas;
	private String _puntajePreguntas;
	private String _intentoPreguntas;
	private String _limiteTPreguntas;
	private long _T_Ul_Actividad_id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;

}