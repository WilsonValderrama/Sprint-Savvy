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
 * This class is a wrapper for {@link T_Ul_Calificacion}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_Calificacion
 * @generated
 */
public class T_Ul_CalificacionWrapper
	extends BaseModelWrapper<T_Ul_Calificacion>
	implements ModelWrapper<T_Ul_Calificacion>, T_Ul_Calificacion {

	public T_Ul_CalificacionWrapper(T_Ul_Calificacion t_Ul_Calificacion) {
		super(t_Ul_Calificacion);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("idCalificacion", getIdCalificacion());
		attributes.put("puntCalificacion", getPuntCalificacion());
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

		Long idCalificacion = (Long)attributes.get("idCalificacion");

		if (idCalificacion != null) {
			setIdCalificacion(idCalificacion);
		}

		String puntCalificacion = (String)attributes.get("puntCalificacion");

		if (puntCalificacion != null) {
			setPuntCalificacion(puntCalificacion);
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
	 * Returns the company ID of this t_ ul_ calificacion.
	 *
	 * @return the company ID of this t_ ul_ calificacion
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this t_ ul_ calificacion.
	 *
	 * @return the create date of this t_ ul_ calificacion
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this t_ ul_ calificacion.
	 *
	 * @return the group ID of this t_ ul_ calificacion
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the id calificacion of this t_ ul_ calificacion.
	 *
	 * @return the id calificacion of this t_ ul_ calificacion
	 */
	@Override
	public long getIdCalificacion() {
		return model.getIdCalificacion();
	}

	/**
	 * Returns the modified date of this t_ ul_ calificacion.
	 *
	 * @return the modified date of this t_ ul_ calificacion
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this t_ ul_ calificacion.
	 *
	 * @return the primary key of this t_ ul_ calificacion
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the punt calificacion of this t_ ul_ calificacion.
	 *
	 * @return the punt calificacion of this t_ ul_ calificacion
	 */
	@Override
	public String getPuntCalificacion() {
		return model.getPuntCalificacion();
	}

	/**
	 * Returns the user ID of this t_ ul_ calificacion.
	 *
	 * @return the user ID of this t_ ul_ calificacion
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this t_ ul_ calificacion.
	 *
	 * @return the user name of this t_ ul_ calificacion
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this t_ ul_ calificacion.
	 *
	 * @return the user uuid of this t_ ul_ calificacion
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this t_ ul_ calificacion.
	 *
	 * @return the uuid of this t_ ul_ calificacion
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
	 * Sets the company ID of this t_ ul_ calificacion.
	 *
	 * @param companyId the company ID of this t_ ul_ calificacion
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this t_ ul_ calificacion.
	 *
	 * @param createDate the create date of this t_ ul_ calificacion
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this t_ ul_ calificacion.
	 *
	 * @param groupId the group ID of this t_ ul_ calificacion
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the id calificacion of this t_ ul_ calificacion.
	 *
	 * @param idCalificacion the id calificacion of this t_ ul_ calificacion
	 */
	@Override
	public void setIdCalificacion(long idCalificacion) {
		model.setIdCalificacion(idCalificacion);
	}

	/**
	 * Sets the modified date of this t_ ul_ calificacion.
	 *
	 * @param modifiedDate the modified date of this t_ ul_ calificacion
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this t_ ul_ calificacion.
	 *
	 * @param primaryKey the primary key of this t_ ul_ calificacion
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the punt calificacion of this t_ ul_ calificacion.
	 *
	 * @param puntCalificacion the punt calificacion of this t_ ul_ calificacion
	 */
	@Override
	public void setPuntCalificacion(String puntCalificacion) {
		model.setPuntCalificacion(puntCalificacion);
	}

	/**
	 * Sets the user ID of this t_ ul_ calificacion.
	 *
	 * @param userId the user ID of this t_ ul_ calificacion
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this t_ ul_ calificacion.
	 *
	 * @param userName the user name of this t_ ul_ calificacion
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this t_ ul_ calificacion.
	 *
	 * @param userUuid the user uuid of this t_ ul_ calificacion
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this t_ ul_ calificacion.
	 *
	 * @param uuid the uuid of this t_ ul_ calificacion
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
	protected T_Ul_CalificacionWrapper wrap(
		T_Ul_Calificacion t_Ul_Calificacion) {

		return new T_Ul_CalificacionWrapper(t_Ul_Calificacion);
	}

}