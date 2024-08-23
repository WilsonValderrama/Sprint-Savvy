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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link T_Ul_ResEvaluacion}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_ResEvaluacion
 * @generated
 */
public class T_Ul_ResEvaluacionWrapper
	extends BaseModelWrapper<T_Ul_ResEvaluacion>
	implements ModelWrapper<T_Ul_ResEvaluacion>, T_Ul_ResEvaluacion {

	public T_Ul_ResEvaluacionWrapper(T_Ul_ResEvaluacion t_Ul_ResEvaluacion) {
		super(t_Ul_ResEvaluacion);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("idRespuestas", getIdRespuestas());
		attributes.put("problRespuestas", getProblRespuestas());
		attributes.put("opcionRespuestas", getOpcionRespuestas());
		attributes.put("puntajeRespuestas", getPuntajeRespuestas());
		attributes.put("T_Ul_Estudiante_id", getT_Ul_Estudiante_id());
		attributes.put("T_Ul_PrgEvaluacion_id", getT_Ul_PrgEvaluacion_id());
		attributes.put("T_Ul_Califi_id", getT_Ul_Califi_id());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long idRespuestas = (Long)attributes.get("idRespuestas");

		if (idRespuestas != null) {
			setIdRespuestas(idRespuestas);
		}

		String problRespuestas = (String)attributes.get("problRespuestas");

		if (problRespuestas != null) {
			setProblRespuestas(problRespuestas);
		}

		String opcionRespuestas = (String)attributes.get("opcionRespuestas");

		if (opcionRespuestas != null) {
			setOpcionRespuestas(opcionRespuestas);
		}

		String puntajeRespuestas = (String)attributes.get("puntajeRespuestas");

		if (puntajeRespuestas != null) {
			setPuntajeRespuestas(puntajeRespuestas);
		}

		Long T_Ul_Estudiante_id = (Long)attributes.get("T_Ul_Estudiante_id");

		if (T_Ul_Estudiante_id != null) {
			setT_Ul_Estudiante_id(T_Ul_Estudiante_id);
		}

		Long T_Ul_PrgEvaluacion_id = (Long)attributes.get(
			"T_Ul_PrgEvaluacion_id");

		if (T_Ul_PrgEvaluacion_id != null) {
			setT_Ul_PrgEvaluacion_id(T_Ul_PrgEvaluacion_id);
		}

		Long T_Ul_Califi_id = (Long)attributes.get("T_Ul_Califi_id");

		if (T_Ul_Califi_id != null) {
			setT_Ul_Califi_id(T_Ul_Califi_id);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	 * Returns the company ID of this t_ ul_ res evaluacion.
	 *
	 * @return the company ID of this t_ ul_ res evaluacion
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this t_ ul_ res evaluacion.
	 *
	 * @return the create date of this t_ ul_ res evaluacion
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this t_ ul_ res evaluacion.
	 *
	 * @return the group ID of this t_ ul_ res evaluacion
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the id respuestas of this t_ ul_ res evaluacion.
	 *
	 * @return the id respuestas of this t_ ul_ res evaluacion
	 */
	@Override
	public long getIdRespuestas() {
		return model.getIdRespuestas();
	}

	/**
	 * Returns the modified date of this t_ ul_ res evaluacion.
	 *
	 * @return the modified date of this t_ ul_ res evaluacion
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the opcion respuestas of this t_ ul_ res evaluacion.
	 *
	 * @return the opcion respuestas of this t_ ul_ res evaluacion
	 */
	@Override
	public String getOpcionRespuestas() {
		return model.getOpcionRespuestas();
	}

	/**
	 * Returns the primary key of this t_ ul_ res evaluacion.
	 *
	 * @return the primary key of this t_ ul_ res evaluacion
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the probl respuestas of this t_ ul_ res evaluacion.
	 *
	 * @return the probl respuestas of this t_ ul_ res evaluacion
	 */
	@Override
	public String getProblRespuestas() {
		return model.getProblRespuestas();
	}

	/**
	 * Returns the puntaje respuestas of this t_ ul_ res evaluacion.
	 *
	 * @return the puntaje respuestas of this t_ ul_ res evaluacion
	 */
	@Override
	public String getPuntajeRespuestas() {
		return model.getPuntajeRespuestas();
	}

	/**
	 * Returns the t_ ul_ califi_id of this t_ ul_ res evaluacion.
	 *
	 * @return the t_ ul_ califi_id of this t_ ul_ res evaluacion
	 */
	@Override
	public long getT_Ul_Califi_id() {
		return model.getT_Ul_Califi_id();
	}

	/**
	 * Returns the t_ ul_ estudiante_id of this t_ ul_ res evaluacion.
	 *
	 * @return the t_ ul_ estudiante_id of this t_ ul_ res evaluacion
	 */
	@Override
	public long getT_Ul_Estudiante_id() {
		return model.getT_Ul_Estudiante_id();
	}

	/**
	 * Returns the t_ ul_ prg evaluacion_id of this t_ ul_ res evaluacion.
	 *
	 * @return the t_ ul_ prg evaluacion_id of this t_ ul_ res evaluacion
	 */
	@Override
	public long getT_Ul_PrgEvaluacion_id() {
		return model.getT_Ul_PrgEvaluacion_id();
	}

	/**
	 * Returns the user ID of this t_ ul_ res evaluacion.
	 *
	 * @return the user ID of this t_ ul_ res evaluacion
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this t_ ul_ res evaluacion.
	 *
	 * @return the user name of this t_ ul_ res evaluacion
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this t_ ul_ res evaluacion.
	 *
	 * @return the user uuid of this t_ ul_ res evaluacion
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this t_ ul_ res evaluacion.
	 *
	 * @return the uuid of this t_ ul_ res evaluacion
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this t_ ul_ res evaluacion.
	 *
	 * @param companyId the company ID of this t_ ul_ res evaluacion
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this t_ ul_ res evaluacion.
	 *
	 * @param createDate the create date of this t_ ul_ res evaluacion
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this t_ ul_ res evaluacion.
	 *
	 * @param groupId the group ID of this t_ ul_ res evaluacion
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the id respuestas of this t_ ul_ res evaluacion.
	 *
	 * @param idRespuestas the id respuestas of this t_ ul_ res evaluacion
	 */
	@Override
	public void setIdRespuestas(long idRespuestas) {
		model.setIdRespuestas(idRespuestas);
	}

	/**
	 * Sets the modified date of this t_ ul_ res evaluacion.
	 *
	 * @param modifiedDate the modified date of this t_ ul_ res evaluacion
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the opcion respuestas of this t_ ul_ res evaluacion.
	 *
	 * @param opcionRespuestas the opcion respuestas of this t_ ul_ res evaluacion
	 */
	@Override
	public void setOpcionRespuestas(String opcionRespuestas) {
		model.setOpcionRespuestas(opcionRespuestas);
	}

	/**
	 * Sets the primary key of this t_ ul_ res evaluacion.
	 *
	 * @param primaryKey the primary key of this t_ ul_ res evaluacion
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the probl respuestas of this t_ ul_ res evaluacion.
	 *
	 * @param problRespuestas the probl respuestas of this t_ ul_ res evaluacion
	 */
	@Override
	public void setProblRespuestas(String problRespuestas) {
		model.setProblRespuestas(problRespuestas);
	}

	/**
	 * Sets the puntaje respuestas of this t_ ul_ res evaluacion.
	 *
	 * @param puntajeRespuestas the puntaje respuestas of this t_ ul_ res evaluacion
	 */
	@Override
	public void setPuntajeRespuestas(String puntajeRespuestas) {
		model.setPuntajeRespuestas(puntajeRespuestas);
	}

	/**
	 * Sets the t_ ul_ califi_id of this t_ ul_ res evaluacion.
	 *
	 * @param T_Ul_Califi_id the t_ ul_ califi_id of this t_ ul_ res evaluacion
	 */
	@Override
	public void setT_Ul_Califi_id(long T_Ul_Califi_id) {
		model.setT_Ul_Califi_id(T_Ul_Califi_id);
	}

	/**
	 * Sets the t_ ul_ estudiante_id of this t_ ul_ res evaluacion.
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id of this t_ ul_ res evaluacion
	 */
	@Override
	public void setT_Ul_Estudiante_id(long T_Ul_Estudiante_id) {
		model.setT_Ul_Estudiante_id(T_Ul_Estudiante_id);
	}

	/**
	 * Sets the t_ ul_ prg evaluacion_id of this t_ ul_ res evaluacion.
	 *
	 * @param T_Ul_PrgEvaluacion_id the t_ ul_ prg evaluacion_id of this t_ ul_ res evaluacion
	 */
	@Override
	public void setT_Ul_PrgEvaluacion_id(long T_Ul_PrgEvaluacion_id) {
		model.setT_Ul_PrgEvaluacion_id(T_Ul_PrgEvaluacion_id);
	}

	/**
	 * Sets the user ID of this t_ ul_ res evaluacion.
	 *
	 * @param userId the user ID of this t_ ul_ res evaluacion
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this t_ ul_ res evaluacion.
	 *
	 * @param userName the user name of this t_ ul_ res evaluacion
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this t_ ul_ res evaluacion.
	 *
	 * @param userUuid the user uuid of this t_ ul_ res evaluacion
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this t_ ul_ res evaluacion.
	 *
	 * @param uuid the uuid of this t_ ul_ res evaluacion
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected T_Ul_ResEvaluacionWrapper wrap(
		T_Ul_ResEvaluacion t_Ul_ResEvaluacion) {

		return new T_Ul_ResEvaluacionWrapper(t_Ul_ResEvaluacion);
	}

}