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
 * This class is a wrapper for {@link T_Ul_Profesor}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_Profesor
 * @generated
 */
public class T_Ul_ProfesorWrapper
	extends BaseModelWrapper<T_Ul_Profesor>
	implements ModelWrapper<T_Ul_Profesor>, T_Ul_Profesor {

	public T_Ul_ProfesorWrapper(T_Ul_Profesor t_Ul_Profesor) {
		super(t_Ul_Profesor);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("idProfesor", getIdProfesor());
		attributes.put("nombreProfesor", getNombreProfesor());
		attributes.put("correoProfesor", getCorreoProfesor());
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

		Long idProfesor = (Long)attributes.get("idProfesor");

		if (idProfesor != null) {
			setIdProfesor(idProfesor);
		}

		String nombreProfesor = (String)attributes.get("nombreProfesor");

		if (nombreProfesor != null) {
			setNombreProfesor(nombreProfesor);
		}

		String correoProfesor = (String)attributes.get("correoProfesor");

		if (correoProfesor != null) {
			setCorreoProfesor(correoProfesor);
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
	 * Returns the company ID of this t_ ul_ profesor.
	 *
	 * @return the company ID of this t_ ul_ profesor
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the correo profesor of this t_ ul_ profesor.
	 *
	 * @return the correo profesor of this t_ ul_ profesor
	 */
	@Override
	public String getCorreoProfesor() {
		return model.getCorreoProfesor();
	}

	/**
	 * Returns the create date of this t_ ul_ profesor.
	 *
	 * @return the create date of this t_ ul_ profesor
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this t_ ul_ profesor.
	 *
	 * @return the group ID of this t_ ul_ profesor
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the id profesor of this t_ ul_ profesor.
	 *
	 * @return the id profesor of this t_ ul_ profesor
	 */
	@Override
	public long getIdProfesor() {
		return model.getIdProfesor();
	}

	/**
	 * Returns the modified date of this t_ ul_ profesor.
	 *
	 * @return the modified date of this t_ ul_ profesor
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nombre profesor of this t_ ul_ profesor.
	 *
	 * @return the nombre profesor of this t_ ul_ profesor
	 */
	@Override
	public String getNombreProfesor() {
		return model.getNombreProfesor();
	}

	/**
	 * Returns the primary key of this t_ ul_ profesor.
	 *
	 * @return the primary key of this t_ ul_ profesor
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this t_ ul_ profesor.
	 *
	 * @return the user ID of this t_ ul_ profesor
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this t_ ul_ profesor.
	 *
	 * @return the user name of this t_ ul_ profesor
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this t_ ul_ profesor.
	 *
	 * @return the user uuid of this t_ ul_ profesor
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this t_ ul_ profesor.
	 *
	 * @return the uuid of this t_ ul_ profesor
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
	 * Sets the company ID of this t_ ul_ profesor.
	 *
	 * @param companyId the company ID of this t_ ul_ profesor
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the correo profesor of this t_ ul_ profesor.
	 *
	 * @param correoProfesor the correo profesor of this t_ ul_ profesor
	 */
	@Override
	public void setCorreoProfesor(String correoProfesor) {
		model.setCorreoProfesor(correoProfesor);
	}

	/**
	 * Sets the create date of this t_ ul_ profesor.
	 *
	 * @param createDate the create date of this t_ ul_ profesor
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this t_ ul_ profesor.
	 *
	 * @param groupId the group ID of this t_ ul_ profesor
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the id profesor of this t_ ul_ profesor.
	 *
	 * @param idProfesor the id profesor of this t_ ul_ profesor
	 */
	@Override
	public void setIdProfesor(long idProfesor) {
		model.setIdProfesor(idProfesor);
	}

	/**
	 * Sets the modified date of this t_ ul_ profesor.
	 *
	 * @param modifiedDate the modified date of this t_ ul_ profesor
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nombre profesor of this t_ ul_ profesor.
	 *
	 * @param nombreProfesor the nombre profesor of this t_ ul_ profesor
	 */
	@Override
	public void setNombreProfesor(String nombreProfesor) {
		model.setNombreProfesor(nombreProfesor);
	}

	/**
	 * Sets the primary key of this t_ ul_ profesor.
	 *
	 * @param primaryKey the primary key of this t_ ul_ profesor
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this t_ ul_ profesor.
	 *
	 * @param userId the user ID of this t_ ul_ profesor
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this t_ ul_ profesor.
	 *
	 * @param userName the user name of this t_ ul_ profesor
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this t_ ul_ profesor.
	 *
	 * @param userUuid the user uuid of this t_ ul_ profesor
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this t_ ul_ profesor.
	 *
	 * @param uuid the uuid of this t_ ul_ profesor
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
	protected T_Ul_ProfesorWrapper wrap(T_Ul_Profesor t_Ul_Profesor) {
		return new T_Ul_ProfesorWrapper(t_Ul_Profesor);
	}

}