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
 * This class is a wrapper for {@link Proyecto}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Proyecto
 * @generated
 */
public class ProyectoWrapper
	extends BaseModelWrapper<Proyecto>
	implements ModelWrapper<Proyecto>, Proyecto {

	public ProyectoWrapper(Proyecto proyecto) {
		super(proyecto);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("proyectoId", getProyectoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("tituloProyecto", getTituloProyecto());
		attributes.put("descripcion", getDescripcion());
		attributes.put("fechaInicio", getFechaInicio());
		attributes.put("fechaFinal", getFechaFinal());
		attributes.put("estado", getEstado());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long proyectoId = (Long)attributes.get("proyectoId");

		if (proyectoId != null) {
			setProyectoId(proyectoId);
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

		String tituloProyecto = (String)attributes.get("tituloProyecto");

		if (tituloProyecto != null) {
			setTituloProyecto(tituloProyecto);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String fechaInicio = (String)attributes.get("fechaInicio");

		if (fechaInicio != null) {
			setFechaInicio(fechaInicio);
		}

		String fechaFinal = (String)attributes.get("fechaFinal");

		if (fechaFinal != null) {
			setFechaFinal(fechaFinal);
		}

		String estado = (String)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}
	}

	/**
	 * Returns the company ID of this proyecto.
	 *
	 * @return the company ID of this proyecto
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this proyecto.
	 *
	 * @return the create date of this proyecto
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the descripcion of this proyecto.
	 *
	 * @return the descripcion of this proyecto
	 */
	@Override
	public String getDescripcion() {
		return model.getDescripcion();
	}

	/**
	 * Returns the estado of this proyecto.
	 *
	 * @return the estado of this proyecto
	 */
	@Override
	public String getEstado() {
		return model.getEstado();
	}

	/**
	 * Returns the fecha final of this proyecto.
	 *
	 * @return the fecha final of this proyecto
	 */
	@Override
	public String getFechaFinal() {
		return model.getFechaFinal();
	}

	/**
	 * Returns the fecha inicio of this proyecto.
	 *
	 * @return the fecha inicio of this proyecto
	 */
	@Override
	public String getFechaInicio() {
		return model.getFechaInicio();
	}

	/**
	 * Returns the group ID of this proyecto.
	 *
	 * @return the group ID of this proyecto
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this proyecto.
	 *
	 * @return the modified date of this proyecto
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this proyecto.
	 *
	 * @return the primary key of this proyecto
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proyecto ID of this proyecto.
	 *
	 * @return the proyecto ID of this proyecto
	 */
	@Override
	public long getProyectoId() {
		return model.getProyectoId();
	}

	/**
	 * Returns the titulo proyecto of this proyecto.
	 *
	 * @return the titulo proyecto of this proyecto
	 */
	@Override
	public String getTituloProyecto() {
		return model.getTituloProyecto();
	}

	/**
	 * Returns the user ID of this proyecto.
	 *
	 * @return the user ID of this proyecto
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this proyecto.
	 *
	 * @return the user name of this proyecto
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this proyecto.
	 *
	 * @return the user uuid of this proyecto
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this proyecto.
	 *
	 * @return the uuid of this proyecto
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
	 * Sets the company ID of this proyecto.
	 *
	 * @param companyId the company ID of this proyecto
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this proyecto.
	 *
	 * @param createDate the create date of this proyecto
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the descripcion of this proyecto.
	 *
	 * @param descripcion the descripcion of this proyecto
	 */
	@Override
	public void setDescripcion(String descripcion) {
		model.setDescripcion(descripcion);
	}

	/**
	 * Sets the estado of this proyecto.
	 *
	 * @param estado the estado of this proyecto
	 */
	@Override
	public void setEstado(String estado) {
		model.setEstado(estado);
	}

	/**
	 * Sets the fecha final of this proyecto.
	 *
	 * @param fechaFinal the fecha final of this proyecto
	 */
	@Override
	public void setFechaFinal(String fechaFinal) {
		model.setFechaFinal(fechaFinal);
	}

	/**
	 * Sets the fecha inicio of this proyecto.
	 *
	 * @param fechaInicio the fecha inicio of this proyecto
	 */
	@Override
	public void setFechaInicio(String fechaInicio) {
		model.setFechaInicio(fechaInicio);
	}

	/**
	 * Sets the group ID of this proyecto.
	 *
	 * @param groupId the group ID of this proyecto
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this proyecto.
	 *
	 * @param modifiedDate the modified date of this proyecto
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this proyecto.
	 *
	 * @param primaryKey the primary key of this proyecto
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proyecto ID of this proyecto.
	 *
	 * @param proyectoId the proyecto ID of this proyecto
	 */
	@Override
	public void setProyectoId(long proyectoId) {
		model.setProyectoId(proyectoId);
	}

	/**
	 * Sets the titulo proyecto of this proyecto.
	 *
	 * @param tituloProyecto the titulo proyecto of this proyecto
	 */
	@Override
	public void setTituloProyecto(String tituloProyecto) {
		model.setTituloProyecto(tituloProyecto);
	}

	/**
	 * Sets the user ID of this proyecto.
	 *
	 * @param userId the user ID of this proyecto
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this proyecto.
	 *
	 * @param userName the user name of this proyecto
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this proyecto.
	 *
	 * @param userUuid the user uuid of this proyecto
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this proyecto.
	 *
	 * @param uuid the uuid of this proyecto
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
	protected ProyectoWrapper wrap(Proyecto proyecto) {
		return new ProyectoWrapper(proyecto);
	}

}