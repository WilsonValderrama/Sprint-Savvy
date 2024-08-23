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
 * This class is a wrapper for {@link T_Ul_Estud_Curso}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_Estud_Curso
 * @generated
 */
public class T_Ul_Estud_CursoWrapper
	extends BaseModelWrapper<T_Ul_Estud_Curso>
	implements ModelWrapper<T_Ul_Estud_Curso>, T_Ul_Estud_Curso {

	public T_Ul_Estud_CursoWrapper(T_Ul_Estud_Curso t_Ul_Estud_Curso) {
		super(t_Ul_Estud_Curso);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("T_Ul_Curso_id", getT_Ul_Curso_id());
		attributes.put("T_Ul_Estudiante_id", getT_Ul_Estudiante_id());
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

		Long T_Ul_Curso_id = (Long)attributes.get("T_Ul_Curso_id");

		if (T_Ul_Curso_id != null) {
			setT_Ul_Curso_id(T_Ul_Curso_id);
		}

		Long T_Ul_Estudiante_id = (Long)attributes.get("T_Ul_Estudiante_id");

		if (T_Ul_Estudiante_id != null) {
			setT_Ul_Estudiante_id(T_Ul_Estudiante_id);
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
	 * Returns the company ID of this t_ ul_ estud_ curso.
	 *
	 * @return the company ID of this t_ ul_ estud_ curso
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this t_ ul_ estud_ curso.
	 *
	 * @return the create date of this t_ ul_ estud_ curso
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this t_ ul_ estud_ curso.
	 *
	 * @return the group ID of this t_ ul_ estud_ curso
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this t_ ul_ estud_ curso.
	 *
	 * @return the modified date of this t_ ul_ estud_ curso
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this t_ ul_ estud_ curso.
	 *
	 * @return the primary key of this t_ ul_ estud_ curso
	 */
	@Override
	public com.aula.sb.service.persistence.T_Ul_Estud_CursoPK getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the t_ ul_ curso_id of this t_ ul_ estud_ curso.
	 *
	 * @return the t_ ul_ curso_id of this t_ ul_ estud_ curso
	 */
	@Override
	public long getT_Ul_Curso_id() {
		return model.getT_Ul_Curso_id();
	}

	/**
	 * Returns the t_ ul_ estudiante_id of this t_ ul_ estud_ curso.
	 *
	 * @return the t_ ul_ estudiante_id of this t_ ul_ estud_ curso
	 */
	@Override
	public long getT_Ul_Estudiante_id() {
		return model.getT_Ul_Estudiante_id();
	}

	/**
	 * Returns the user ID of this t_ ul_ estud_ curso.
	 *
	 * @return the user ID of this t_ ul_ estud_ curso
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this t_ ul_ estud_ curso.
	 *
	 * @return the user name of this t_ ul_ estud_ curso
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this t_ ul_ estud_ curso.
	 *
	 * @return the user uuid of this t_ ul_ estud_ curso
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this t_ ul_ estud_ curso.
	 *
	 * @return the uuid of this t_ ul_ estud_ curso
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
	 * Sets the company ID of this t_ ul_ estud_ curso.
	 *
	 * @param companyId the company ID of this t_ ul_ estud_ curso
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this t_ ul_ estud_ curso.
	 *
	 * @param createDate the create date of this t_ ul_ estud_ curso
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this t_ ul_ estud_ curso.
	 *
	 * @param groupId the group ID of this t_ ul_ estud_ curso
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this t_ ul_ estud_ curso.
	 *
	 * @param modifiedDate the modified date of this t_ ul_ estud_ curso
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this t_ ul_ estud_ curso.
	 *
	 * @param primaryKey the primary key of this t_ ul_ estud_ curso
	 */
	@Override
	public void setPrimaryKey(
		com.aula.sb.service.persistence.T_Ul_Estud_CursoPK primaryKey) {

		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the t_ ul_ curso_id of this t_ ul_ estud_ curso.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id of this t_ ul_ estud_ curso
	 */
	@Override
	public void setT_Ul_Curso_id(long T_Ul_Curso_id) {
		model.setT_Ul_Curso_id(T_Ul_Curso_id);
	}

	/**
	 * Sets the t_ ul_ estudiante_id of this t_ ul_ estud_ curso.
	 *
	 * @param T_Ul_Estudiante_id the t_ ul_ estudiante_id of this t_ ul_ estud_ curso
	 */
	@Override
	public void setT_Ul_Estudiante_id(long T_Ul_Estudiante_id) {
		model.setT_Ul_Estudiante_id(T_Ul_Estudiante_id);
	}

	/**
	 * Sets the user ID of this t_ ul_ estud_ curso.
	 *
	 * @param userId the user ID of this t_ ul_ estud_ curso
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this t_ ul_ estud_ curso.
	 *
	 * @param userName the user name of this t_ ul_ estud_ curso
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this t_ ul_ estud_ curso.
	 *
	 * @param userUuid the user uuid of this t_ ul_ estud_ curso
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this t_ ul_ estud_ curso.
	 *
	 * @param uuid the uuid of this t_ ul_ estud_ curso
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
	protected T_Ul_Estud_CursoWrapper wrap(T_Ul_Estud_Curso t_Ul_Estud_Curso) {
		return new T_Ul_Estud_CursoWrapper(t_Ul_Estud_Curso);
	}

}