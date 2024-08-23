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
 * This class is a wrapper for {@link T_Ul_Estudiante}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_Estudiante
 * @generated
 */
public class T_Ul_EstudianteWrapper
	extends BaseModelWrapper<T_Ul_Estudiante>
	implements ModelWrapper<T_Ul_Estudiante>, T_Ul_Estudiante {

	public T_Ul_EstudianteWrapper(T_Ul_Estudiante t_Ul_Estudiante) {
		super(t_Ul_Estudiante);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("idEstudiante", getIdEstudiante());
		attributes.put("nombreEstudiante", getNombreEstudiante());
		attributes.put("correoEstudiante", getCorreoEstudiante());
		attributes.put("profesEstudiante", getProfesEstudiante());
		attributes.put("sedeEstudiante", getSedeEstudiante());
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

		Long idEstudiante = (Long)attributes.get("idEstudiante");

		if (idEstudiante != null) {
			setIdEstudiante(idEstudiante);
		}

		String nombreEstudiante = (String)attributes.get("nombreEstudiante");

		if (nombreEstudiante != null) {
			setNombreEstudiante(nombreEstudiante);
		}

		String correoEstudiante = (String)attributes.get("correoEstudiante");

		if (correoEstudiante != null) {
			setCorreoEstudiante(correoEstudiante);
		}

		String profesEstudiante = (String)attributes.get("profesEstudiante");

		if (profesEstudiante != null) {
			setProfesEstudiante(profesEstudiante);
		}

		String sedeEstudiante = (String)attributes.get("sedeEstudiante");

		if (sedeEstudiante != null) {
			setSedeEstudiante(sedeEstudiante);
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
	 * Returns the company ID of this t_ ul_ estudiante.
	 *
	 * @return the company ID of this t_ ul_ estudiante
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the correo estudiante of this t_ ul_ estudiante.
	 *
	 * @return the correo estudiante of this t_ ul_ estudiante
	 */
	@Override
	public String getCorreoEstudiante() {
		return model.getCorreoEstudiante();
	}

	/**
	 * Returns the create date of this t_ ul_ estudiante.
	 *
	 * @return the create date of this t_ ul_ estudiante
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this t_ ul_ estudiante.
	 *
	 * @return the group ID of this t_ ul_ estudiante
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the id estudiante of this t_ ul_ estudiante.
	 *
	 * @return the id estudiante of this t_ ul_ estudiante
	 */
	@Override
	public long getIdEstudiante() {
		return model.getIdEstudiante();
	}

	/**
	 * Returns the modified date of this t_ ul_ estudiante.
	 *
	 * @return the modified date of this t_ ul_ estudiante
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nombre estudiante of this t_ ul_ estudiante.
	 *
	 * @return the nombre estudiante of this t_ ul_ estudiante
	 */
	@Override
	public String getNombreEstudiante() {
		return model.getNombreEstudiante();
	}

	/**
	 * Returns the primary key of this t_ ul_ estudiante.
	 *
	 * @return the primary key of this t_ ul_ estudiante
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the profes estudiante of this t_ ul_ estudiante.
	 *
	 * @return the profes estudiante of this t_ ul_ estudiante
	 */
	@Override
	public String getProfesEstudiante() {
		return model.getProfesEstudiante();
	}

	/**
	 * Returns the sede estudiante of this t_ ul_ estudiante.
	 *
	 * @return the sede estudiante of this t_ ul_ estudiante
	 */
	@Override
	public String getSedeEstudiante() {
		return model.getSedeEstudiante();
	}

	/**
	 * Returns the user ID of this t_ ul_ estudiante.
	 *
	 * @return the user ID of this t_ ul_ estudiante
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this t_ ul_ estudiante.
	 *
	 * @return the user name of this t_ ul_ estudiante
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this t_ ul_ estudiante.
	 *
	 * @return the user uuid of this t_ ul_ estudiante
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this t_ ul_ estudiante.
	 *
	 * @return the uuid of this t_ ul_ estudiante
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
	 * Sets the company ID of this t_ ul_ estudiante.
	 *
	 * @param companyId the company ID of this t_ ul_ estudiante
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the correo estudiante of this t_ ul_ estudiante.
	 *
	 * @param correoEstudiante the correo estudiante of this t_ ul_ estudiante
	 */
	@Override
	public void setCorreoEstudiante(String correoEstudiante) {
		model.setCorreoEstudiante(correoEstudiante);
	}

	/**
	 * Sets the create date of this t_ ul_ estudiante.
	 *
	 * @param createDate the create date of this t_ ul_ estudiante
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this t_ ul_ estudiante.
	 *
	 * @param groupId the group ID of this t_ ul_ estudiante
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the id estudiante of this t_ ul_ estudiante.
	 *
	 * @param idEstudiante the id estudiante of this t_ ul_ estudiante
	 */
	@Override
	public void setIdEstudiante(long idEstudiante) {
		model.setIdEstudiante(idEstudiante);
	}

	/**
	 * Sets the modified date of this t_ ul_ estudiante.
	 *
	 * @param modifiedDate the modified date of this t_ ul_ estudiante
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nombre estudiante of this t_ ul_ estudiante.
	 *
	 * @param nombreEstudiante the nombre estudiante of this t_ ul_ estudiante
	 */
	@Override
	public void setNombreEstudiante(String nombreEstudiante) {
		model.setNombreEstudiante(nombreEstudiante);
	}

	/**
	 * Sets the primary key of this t_ ul_ estudiante.
	 *
	 * @param primaryKey the primary key of this t_ ul_ estudiante
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the profes estudiante of this t_ ul_ estudiante.
	 *
	 * @param profesEstudiante the profes estudiante of this t_ ul_ estudiante
	 */
	@Override
	public void setProfesEstudiante(String profesEstudiante) {
		model.setProfesEstudiante(profesEstudiante);
	}

	/**
	 * Sets the sede estudiante of this t_ ul_ estudiante.
	 *
	 * @param sedeEstudiante the sede estudiante of this t_ ul_ estudiante
	 */
	@Override
	public void setSedeEstudiante(String sedeEstudiante) {
		model.setSedeEstudiante(sedeEstudiante);
	}

	/**
	 * Sets the user ID of this t_ ul_ estudiante.
	 *
	 * @param userId the user ID of this t_ ul_ estudiante
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this t_ ul_ estudiante.
	 *
	 * @param userName the user name of this t_ ul_ estudiante
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this t_ ul_ estudiante.
	 *
	 * @param userUuid the user uuid of this t_ ul_ estudiante
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this t_ ul_ estudiante.
	 *
	 * @param uuid the uuid of this t_ ul_ estudiante
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
	protected T_Ul_EstudianteWrapper wrap(T_Ul_Estudiante t_Ul_Estudiante) {
		return new T_Ul_EstudianteWrapper(t_Ul_Estudiante);
	}

}