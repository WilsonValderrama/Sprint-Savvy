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

package com.savvy.sb.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Sprint}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Sprint
 * @generated
 */
public class SprintWrapper
	extends BaseModelWrapper<Sprint> implements ModelWrapper<Sprint>, Sprint {

	public SprintWrapper(Sprint sprint) {
		super(sprint);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("sprintId", getSprintId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("tituloSprint", getTituloSprint());
		attributes.put("fechaInicio", getFechaInicio());
		attributes.put("fechaFinal", getFechaFinal());
		attributes.put("descripcion", getDescripcion());
		attributes.put("estado", getEstado());
		attributes.put("proyecto", getProyecto());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long sprintId = (Long)attributes.get("sprintId");

		if (sprintId != null) {
			setSprintId(sprintId);
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

		String tituloSprint = (String)attributes.get("tituloSprint");

		if (tituloSprint != null) {
			setTituloSprint(tituloSprint);
		}

		String fechaInicio = (String)attributes.get("fechaInicio");

		if (fechaInicio != null) {
			setFechaInicio(fechaInicio);
		}

		String fechaFinal = (String)attributes.get("fechaFinal");

		if (fechaFinal != null) {
			setFechaFinal(fechaFinal);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String estado = (String)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		String proyecto = (String)attributes.get("proyecto");

		if (proyecto != null) {
			setProyecto(proyecto);
		}
	}

	/**
	 * Returns the company ID of this sprint.
	 *
	 * @return the company ID of this sprint
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sprint.
	 *
	 * @return the create date of this sprint
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the descripcion of this sprint.
	 *
	 * @return the descripcion of this sprint
	 */
	@Override
	public String getDescripcion() {
		return model.getDescripcion();
	}

	/**
	 * Returns the estado of this sprint.
	 *
	 * @return the estado of this sprint
	 */
	@Override
	public String getEstado() {
		return model.getEstado();
	}

	/**
	 * Returns the fecha final of this sprint.
	 *
	 * @return the fecha final of this sprint
	 */
	@Override
	public String getFechaFinal() {
		return model.getFechaFinal();
	}

	/**
	 * Returns the fecha inicio of this sprint.
	 *
	 * @return the fecha inicio of this sprint
	 */
	@Override
	public String getFechaInicio() {
		return model.getFechaInicio();
	}

	/**
	 * Returns the group ID of this sprint.
	 *
	 * @return the group ID of this sprint
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sprint.
	 *
	 * @return the modified date of this sprint
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this sprint.
	 *
	 * @return the primary key of this sprint
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proyecto of this sprint.
	 *
	 * @return the proyecto of this sprint
	 */
	@Override
	public String getProyecto() {
		return model.getProyecto();
	}

	/**
	 * Returns the sprint ID of this sprint.
	 *
	 * @return the sprint ID of this sprint
	 */
	@Override
	public long getSprintId() {
		return model.getSprintId();
	}

	/**
	 * Returns the titulo sprint of this sprint.
	 *
	 * @return the titulo sprint of this sprint
	 */
	@Override
	public String getTituloSprint() {
		return model.getTituloSprint();
	}

	/**
	 * Returns the user ID of this sprint.
	 *
	 * @return the user ID of this sprint
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sprint.
	 *
	 * @return the user name of this sprint
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sprint.
	 *
	 * @return the user uuid of this sprint
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this sprint.
	 *
	 * @return the uuid of this sprint
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
	 * Sets the company ID of this sprint.
	 *
	 * @param companyId the company ID of this sprint
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sprint.
	 *
	 * @param createDate the create date of this sprint
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the descripcion of this sprint.
	 *
	 * @param descripcion the descripcion of this sprint
	 */
	@Override
	public void setDescripcion(String descripcion) {
		model.setDescripcion(descripcion);
	}

	/**
	 * Sets the estado of this sprint.
	 *
	 * @param estado the estado of this sprint
	 */
	@Override
	public void setEstado(String estado) {
		model.setEstado(estado);
	}

	/**
	 * Sets the fecha final of this sprint.
	 *
	 * @param fechaFinal the fecha final of this sprint
	 */
	@Override
	public void setFechaFinal(String fechaFinal) {
		model.setFechaFinal(fechaFinal);
	}

	/**
	 * Sets the fecha inicio of this sprint.
	 *
	 * @param fechaInicio the fecha inicio of this sprint
	 */
	@Override
	public void setFechaInicio(String fechaInicio) {
		model.setFechaInicio(fechaInicio);
	}

	/**
	 * Sets the group ID of this sprint.
	 *
	 * @param groupId the group ID of this sprint
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sprint.
	 *
	 * @param modifiedDate the modified date of this sprint
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this sprint.
	 *
	 * @param primaryKey the primary key of this sprint
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proyecto of this sprint.
	 *
	 * @param proyecto the proyecto of this sprint
	 */
	@Override
	public void setProyecto(String proyecto) {
		model.setProyecto(proyecto);
	}

	/**
	 * Sets the sprint ID of this sprint.
	 *
	 * @param sprintId the sprint ID of this sprint
	 */
	@Override
	public void setSprintId(long sprintId) {
		model.setSprintId(sprintId);
	}

	/**
	 * Sets the titulo sprint of this sprint.
	 *
	 * @param tituloSprint the titulo sprint of this sprint
	 */
	@Override
	public void setTituloSprint(String tituloSprint) {
		model.setTituloSprint(tituloSprint);
	}

	/**
	 * Sets the user ID of this sprint.
	 *
	 * @param userId the user ID of this sprint
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sprint.
	 *
	 * @param userName the user name of this sprint
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sprint.
	 *
	 * @param userUuid the user uuid of this sprint
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this sprint.
	 *
	 * @param uuid the uuid of this sprint
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
	protected SprintWrapper wrap(Sprint sprint) {
		return new SprintWrapper(sprint);
	}

}