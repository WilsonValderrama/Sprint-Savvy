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
 * This class is a wrapper for {@link T_Ul_PrgEvaluacion}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_PrgEvaluacion
 * @generated
 */
public class T_Ul_PrgEvaluacionWrapper
	extends BaseModelWrapper<T_Ul_PrgEvaluacion>
	implements ModelWrapper<T_Ul_PrgEvaluacion>, T_Ul_PrgEvaluacion {

	public T_Ul_PrgEvaluacionWrapper(T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion) {
		super(t_Ul_PrgEvaluacion);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("idPreguntas", getIdPreguntas());
		attributes.put("problPreguntas", getProblPreguntas());
		attributes.put("opcPreguntas", getOpcPreguntas());
		attributes.put("puntajePreguntas", getPuntajePreguntas());
		attributes.put("intentoPreguntas", getIntentoPreguntas());
		attributes.put("limiteTPreguntas", getLimiteTPreguntas());
		attributes.put("T_Ul_Actividad_id", getT_Ul_Actividad_id());
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

		Long idPreguntas = (Long)attributes.get("idPreguntas");

		if (idPreguntas != null) {
			setIdPreguntas(idPreguntas);
		}

		String problPreguntas = (String)attributes.get("problPreguntas");

		if (problPreguntas != null) {
			setProblPreguntas(problPreguntas);
		}

		String opcPreguntas = (String)attributes.get("opcPreguntas");

		if (opcPreguntas != null) {
			setOpcPreguntas(opcPreguntas);
		}

		String puntajePreguntas = (String)attributes.get("puntajePreguntas");

		if (puntajePreguntas != null) {
			setPuntajePreguntas(puntajePreguntas);
		}

		String intentoPreguntas = (String)attributes.get("intentoPreguntas");

		if (intentoPreguntas != null) {
			setIntentoPreguntas(intentoPreguntas);
		}

		String limiteTPreguntas = (String)attributes.get("limiteTPreguntas");

		if (limiteTPreguntas != null) {
			setLimiteTPreguntas(limiteTPreguntas);
		}

		Long T_Ul_Actividad_id = (Long)attributes.get("T_Ul_Actividad_id");

		if (T_Ul_Actividad_id != null) {
			setT_Ul_Actividad_id(T_Ul_Actividad_id);
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
	 * Returns the company ID of this t_ ul_ prg evaluacion.
	 *
	 * @return the company ID of this t_ ul_ prg evaluacion
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this t_ ul_ prg evaluacion.
	 *
	 * @return the create date of this t_ ul_ prg evaluacion
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this t_ ul_ prg evaluacion.
	 *
	 * @return the group ID of this t_ ul_ prg evaluacion
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the id preguntas of this t_ ul_ prg evaluacion.
	 *
	 * @return the id preguntas of this t_ ul_ prg evaluacion
	 */
	@Override
	public long getIdPreguntas() {
		return model.getIdPreguntas();
	}

	/**
	 * Returns the intento preguntas of this t_ ul_ prg evaluacion.
	 *
	 * @return the intento preguntas of this t_ ul_ prg evaluacion
	 */
	@Override
	public String getIntentoPreguntas() {
		return model.getIntentoPreguntas();
	}

	/**
	 * Returns the limite t preguntas of this t_ ul_ prg evaluacion.
	 *
	 * @return the limite t preguntas of this t_ ul_ prg evaluacion
	 */
	@Override
	public String getLimiteTPreguntas() {
		return model.getLimiteTPreguntas();
	}

	/**
	 * Returns the modified date of this t_ ul_ prg evaluacion.
	 *
	 * @return the modified date of this t_ ul_ prg evaluacion
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the opc preguntas of this t_ ul_ prg evaluacion.
	 *
	 * @return the opc preguntas of this t_ ul_ prg evaluacion
	 */
	@Override
	public String getOpcPreguntas() {
		return model.getOpcPreguntas();
	}

	/**
	 * Returns the primary key of this t_ ul_ prg evaluacion.
	 *
	 * @return the primary key of this t_ ul_ prg evaluacion
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the probl preguntas of this t_ ul_ prg evaluacion.
	 *
	 * @return the probl preguntas of this t_ ul_ prg evaluacion
	 */
	@Override
	public String getProblPreguntas() {
		return model.getProblPreguntas();
	}

	/**
	 * Returns the puntaje preguntas of this t_ ul_ prg evaluacion.
	 *
	 * @return the puntaje preguntas of this t_ ul_ prg evaluacion
	 */
	@Override
	public String getPuntajePreguntas() {
		return model.getPuntajePreguntas();
	}

	/**
	 * Returns the t_ ul_ actividad_id of this t_ ul_ prg evaluacion.
	 *
	 * @return the t_ ul_ actividad_id of this t_ ul_ prg evaluacion
	 */
	@Override
	public long getT_Ul_Actividad_id() {
		return model.getT_Ul_Actividad_id();
	}

	/**
	 * Returns the user ID of this t_ ul_ prg evaluacion.
	 *
	 * @return the user ID of this t_ ul_ prg evaluacion
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this t_ ul_ prg evaluacion.
	 *
	 * @return the user name of this t_ ul_ prg evaluacion
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this t_ ul_ prg evaluacion.
	 *
	 * @return the user uuid of this t_ ul_ prg evaluacion
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this t_ ul_ prg evaluacion.
	 *
	 * @return the uuid of this t_ ul_ prg evaluacion
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
	 * Sets the company ID of this t_ ul_ prg evaluacion.
	 *
	 * @param companyId the company ID of this t_ ul_ prg evaluacion
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this t_ ul_ prg evaluacion.
	 *
	 * @param createDate the create date of this t_ ul_ prg evaluacion
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this t_ ul_ prg evaluacion.
	 *
	 * @param groupId the group ID of this t_ ul_ prg evaluacion
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the id preguntas of this t_ ul_ prg evaluacion.
	 *
	 * @param idPreguntas the id preguntas of this t_ ul_ prg evaluacion
	 */
	@Override
	public void setIdPreguntas(long idPreguntas) {
		model.setIdPreguntas(idPreguntas);
	}

	/**
	 * Sets the intento preguntas of this t_ ul_ prg evaluacion.
	 *
	 * @param intentoPreguntas the intento preguntas of this t_ ul_ prg evaluacion
	 */
	@Override
	public void setIntentoPreguntas(String intentoPreguntas) {
		model.setIntentoPreguntas(intentoPreguntas);
	}

	/**
	 * Sets the limite t preguntas of this t_ ul_ prg evaluacion.
	 *
	 * @param limiteTPreguntas the limite t preguntas of this t_ ul_ prg evaluacion
	 */
	@Override
	public void setLimiteTPreguntas(String limiteTPreguntas) {
		model.setLimiteTPreguntas(limiteTPreguntas);
	}

	/**
	 * Sets the modified date of this t_ ul_ prg evaluacion.
	 *
	 * @param modifiedDate the modified date of this t_ ul_ prg evaluacion
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the opc preguntas of this t_ ul_ prg evaluacion.
	 *
	 * @param opcPreguntas the opc preguntas of this t_ ul_ prg evaluacion
	 */
	@Override
	public void setOpcPreguntas(String opcPreguntas) {
		model.setOpcPreguntas(opcPreguntas);
	}

	/**
	 * Sets the primary key of this t_ ul_ prg evaluacion.
	 *
	 * @param primaryKey the primary key of this t_ ul_ prg evaluacion
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the probl preguntas of this t_ ul_ prg evaluacion.
	 *
	 * @param problPreguntas the probl preguntas of this t_ ul_ prg evaluacion
	 */
	@Override
	public void setProblPreguntas(String problPreguntas) {
		model.setProblPreguntas(problPreguntas);
	}

	/**
	 * Sets the puntaje preguntas of this t_ ul_ prg evaluacion.
	 *
	 * @param puntajePreguntas the puntaje preguntas of this t_ ul_ prg evaluacion
	 */
	@Override
	public void setPuntajePreguntas(String puntajePreguntas) {
		model.setPuntajePreguntas(puntajePreguntas);
	}

	/**
	 * Sets the t_ ul_ actividad_id of this t_ ul_ prg evaluacion.
	 *
	 * @param T_Ul_Actividad_id the t_ ul_ actividad_id of this t_ ul_ prg evaluacion
	 */
	@Override
	public void setT_Ul_Actividad_id(long T_Ul_Actividad_id) {
		model.setT_Ul_Actividad_id(T_Ul_Actividad_id);
	}

	/**
	 * Sets the user ID of this t_ ul_ prg evaluacion.
	 *
	 * @param userId the user ID of this t_ ul_ prg evaluacion
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this t_ ul_ prg evaluacion.
	 *
	 * @param userName the user name of this t_ ul_ prg evaluacion
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this t_ ul_ prg evaluacion.
	 *
	 * @param userUuid the user uuid of this t_ ul_ prg evaluacion
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this t_ ul_ prg evaluacion.
	 *
	 * @param uuid the uuid of this t_ ul_ prg evaluacion
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
	protected T_Ul_PrgEvaluacionWrapper wrap(
		T_Ul_PrgEvaluacion t_Ul_PrgEvaluacion) {

		return new T_Ul_PrgEvaluacionWrapper(t_Ul_PrgEvaluacion);
	}

}