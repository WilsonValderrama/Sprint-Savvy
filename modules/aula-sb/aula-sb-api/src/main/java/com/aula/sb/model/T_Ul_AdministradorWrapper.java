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
 * This class is a wrapper for {@link T_Ul_Administrador}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_Administrador
 * @generated
 */
public class T_Ul_AdministradorWrapper
	extends BaseModelWrapper<T_Ul_Administrador>
	implements ModelWrapper<T_Ul_Administrador>, T_Ul_Administrador {

	public T_Ul_AdministradorWrapper(T_Ul_Administrador t_Ul_Administrador) {
		super(t_Ul_Administrador);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("idAdmin", getIdAdmin());
		attributes.put("nombreAdmin", getNombreAdmin());
		attributes.put("CorreoAdmin", getCorreoAdmin());
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

		Long idAdmin = (Long)attributes.get("idAdmin");

		if (idAdmin != null) {
			setIdAdmin(idAdmin);
		}

		String nombreAdmin = (String)attributes.get("nombreAdmin");

		if (nombreAdmin != null) {
			setNombreAdmin(nombreAdmin);
		}

		String CorreoAdmin = (String)attributes.get("CorreoAdmin");

		if (CorreoAdmin != null) {
			setCorreoAdmin(CorreoAdmin);
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
	 * Returns the company ID of this t_ ul_ administrador.
	 *
	 * @return the company ID of this t_ ul_ administrador
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the correo admin of this t_ ul_ administrador.
	 *
	 * @return the correo admin of this t_ ul_ administrador
	 */
	@Override
	public String getCorreoAdmin() {
		return model.getCorreoAdmin();
	}

	/**
	 * Returns the create date of this t_ ul_ administrador.
	 *
	 * @return the create date of this t_ ul_ administrador
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this t_ ul_ administrador.
	 *
	 * @return the group ID of this t_ ul_ administrador
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the id admin of this t_ ul_ administrador.
	 *
	 * @return the id admin of this t_ ul_ administrador
	 */
	@Override
	public long getIdAdmin() {
		return model.getIdAdmin();
	}

	/**
	 * Returns the modified date of this t_ ul_ administrador.
	 *
	 * @return the modified date of this t_ ul_ administrador
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nombre admin of this t_ ul_ administrador.
	 *
	 * @return the nombre admin of this t_ ul_ administrador
	 */
	@Override
	public String getNombreAdmin() {
		return model.getNombreAdmin();
	}

	/**
	 * Returns the primary key of this t_ ul_ administrador.
	 *
	 * @return the primary key of this t_ ul_ administrador
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this t_ ul_ administrador.
	 *
	 * @return the user ID of this t_ ul_ administrador
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this t_ ul_ administrador.
	 *
	 * @return the user name of this t_ ul_ administrador
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this t_ ul_ administrador.
	 *
	 * @return the user uuid of this t_ ul_ administrador
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this t_ ul_ administrador.
	 *
	 * @return the uuid of this t_ ul_ administrador
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
	 * Sets the company ID of this t_ ul_ administrador.
	 *
	 * @param companyId the company ID of this t_ ul_ administrador
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the correo admin of this t_ ul_ administrador.
	 *
	 * @param CorreoAdmin the correo admin of this t_ ul_ administrador
	 */
	@Override
	public void setCorreoAdmin(String CorreoAdmin) {
		model.setCorreoAdmin(CorreoAdmin);
	}

	/**
	 * Sets the create date of this t_ ul_ administrador.
	 *
	 * @param createDate the create date of this t_ ul_ administrador
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this t_ ul_ administrador.
	 *
	 * @param groupId the group ID of this t_ ul_ administrador
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the id admin of this t_ ul_ administrador.
	 *
	 * @param idAdmin the id admin of this t_ ul_ administrador
	 */
	@Override
	public void setIdAdmin(long idAdmin) {
		model.setIdAdmin(idAdmin);
	}

	/**
	 * Sets the modified date of this t_ ul_ administrador.
	 *
	 * @param modifiedDate the modified date of this t_ ul_ administrador
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nombre admin of this t_ ul_ administrador.
	 *
	 * @param nombreAdmin the nombre admin of this t_ ul_ administrador
	 */
	@Override
	public void setNombreAdmin(String nombreAdmin) {
		model.setNombreAdmin(nombreAdmin);
	}

	/**
	 * Sets the primary key of this t_ ul_ administrador.
	 *
	 * @param primaryKey the primary key of this t_ ul_ administrador
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this t_ ul_ administrador.
	 *
	 * @param userId the user ID of this t_ ul_ administrador
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this t_ ul_ administrador.
	 *
	 * @param userName the user name of this t_ ul_ administrador
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this t_ ul_ administrador.
	 *
	 * @param userUuid the user uuid of this t_ ul_ administrador
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this t_ ul_ administrador.
	 *
	 * @param uuid the uuid of this t_ ul_ administrador
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
	protected T_Ul_AdministradorWrapper wrap(
		T_Ul_Administrador t_Ul_Administrador) {

		return new T_Ul_AdministradorWrapper(t_Ul_Administrador);
	}

}