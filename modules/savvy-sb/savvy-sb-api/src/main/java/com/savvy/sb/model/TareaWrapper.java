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
 * This class is a wrapper for {@link Tarea}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Tarea
 * @generated
 */
public class TareaWrapper
	extends BaseModelWrapper<Tarea> implements ModelWrapper<Tarea>, Tarea {

	public TareaWrapper(Tarea tarea) {
		super(tarea);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("tareaId", getTareaId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nombreTarea", getNombreTarea());
		attributes.put("proyecto", getProyecto());
		attributes.put("responsable", getResponsable());
		attributes.put("prioridad", getPrioridad());
		attributes.put("sprint", getSprint());
		attributes.put("estado", getEstado());
		attributes.put("fechaLimite", getFechaLimite());
		attributes.put("resumen", getResumen());
		attributes.put("descripcion", getDescripcion());
		attributes.put("categoria", getCategoria());
		attributes.put("etiqueta", getEtiqueta());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long tareaId = (Long)attributes.get("tareaId");

		if (tareaId != null) {
			setTareaId(tareaId);
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

		String nombreTarea = (String)attributes.get("nombreTarea");

		if (nombreTarea != null) {
			setNombreTarea(nombreTarea);
		}

		String proyecto = (String)attributes.get("proyecto");

		if (proyecto != null) {
			setProyecto(proyecto);
		}

		String responsable = (String)attributes.get("responsable");

		if (responsable != null) {
			setResponsable(responsable);
		}

		String prioridad = (String)attributes.get("prioridad");

		if (prioridad != null) {
			setPrioridad(prioridad);
		}

		String sprint = (String)attributes.get("sprint");

		if (sprint != null) {
			setSprint(sprint);
		}

		String estado = (String)attributes.get("estado");

		if (estado != null) {
			setEstado(estado);
		}

		String fechaLimite = (String)attributes.get("fechaLimite");

		if (fechaLimite != null) {
			setFechaLimite(fechaLimite);
		}

		String resumen = (String)attributes.get("resumen");

		if (resumen != null) {
			setResumen(resumen);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}

		String categoria = (String)attributes.get("categoria");

		if (categoria != null) {
			setCategoria(categoria);
		}

		String etiqueta = (String)attributes.get("etiqueta");

		if (etiqueta != null) {
			setEtiqueta(etiqueta);
		}
	}

	/**
	 * Returns the categoria of this tarea.
	 *
	 * @return the categoria of this tarea
	 */
	@Override
	public String getCategoria() {
		return model.getCategoria();
	}

	/**
	 * Returns the company ID of this tarea.
	 *
	 * @return the company ID of this tarea
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tarea.
	 *
	 * @return the create date of this tarea
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the descripcion of this tarea.
	 *
	 * @return the descripcion of this tarea
	 */
	@Override
	public String getDescripcion() {
		return model.getDescripcion();
	}

	/**
	 * Returns the estado of this tarea.
	 *
	 * @return the estado of this tarea
	 */
	@Override
	public String getEstado() {
		return model.getEstado();
	}

	/**
	 * Returns the etiqueta of this tarea.
	 *
	 * @return the etiqueta of this tarea
	 */
	@Override
	public String getEtiqueta() {
		return model.getEtiqueta();
	}

	/**
	 * Returns the fecha limite of this tarea.
	 *
	 * @return the fecha limite of this tarea
	 */
	@Override
	public String getFechaLimite() {
		return model.getFechaLimite();
	}

	/**
	 * Returns the group ID of this tarea.
	 *
	 * @return the group ID of this tarea
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tarea.
	 *
	 * @return the modified date of this tarea
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nombre tarea of this tarea.
	 *
	 * @return the nombre tarea of this tarea
	 */
	@Override
	public String getNombreTarea() {
		return model.getNombreTarea();
	}

	/**
	 * Returns the primary key of this tarea.
	 *
	 * @return the primary key of this tarea
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the prioridad of this tarea.
	 *
	 * @return the prioridad of this tarea
	 */
	@Override
	public String getPrioridad() {
		return model.getPrioridad();
	}

	/**
	 * Returns the proyecto of this tarea.
	 *
	 * @return the proyecto of this tarea
	 */
	@Override
	public String getProyecto() {
		return model.getProyecto();
	}

	/**
	 * Returns the responsable of this tarea.
	 *
	 * @return the responsable of this tarea
	 */
	@Override
	public String getResponsable() {
		return model.getResponsable();
	}

	/**
	 * Returns the resumen of this tarea.
	 *
	 * @return the resumen of this tarea
	 */
	@Override
	public String getResumen() {
		return model.getResumen();
	}

	/**
	 * Returns the sprint of this tarea.
	 *
	 * @return the sprint of this tarea
	 */
	@Override
	public String getSprint() {
		return model.getSprint();
	}

	/**
	 * Returns the tarea ID of this tarea.
	 *
	 * @return the tarea ID of this tarea
	 */
	@Override
	public long getTareaId() {
		return model.getTareaId();
	}

	/**
	 * Returns the user ID of this tarea.
	 *
	 * @return the user ID of this tarea
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tarea.
	 *
	 * @return the user name of this tarea
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tarea.
	 *
	 * @return the user uuid of this tarea
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this tarea.
	 *
	 * @return the uuid of this tarea
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
	 * Sets the categoria of this tarea.
	 *
	 * @param categoria the categoria of this tarea
	 */
	@Override
	public void setCategoria(String categoria) {
		model.setCategoria(categoria);
	}

	/**
	 * Sets the company ID of this tarea.
	 *
	 * @param companyId the company ID of this tarea
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tarea.
	 *
	 * @param createDate the create date of this tarea
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the descripcion of this tarea.
	 *
	 * @param descripcion the descripcion of this tarea
	 */
	@Override
	public void setDescripcion(String descripcion) {
		model.setDescripcion(descripcion);
	}

	/**
	 * Sets the estado of this tarea.
	 *
	 * @param estado the estado of this tarea
	 */
	@Override
	public void setEstado(String estado) {
		model.setEstado(estado);
	}

	/**
	 * Sets the etiqueta of this tarea.
	 *
	 * @param etiqueta the etiqueta of this tarea
	 */
	@Override
	public void setEtiqueta(String etiqueta) {
		model.setEtiqueta(etiqueta);
	}

	/**
	 * Sets the fecha limite of this tarea.
	 *
	 * @param fechaLimite the fecha limite of this tarea
	 */
	@Override
	public void setFechaLimite(String fechaLimite) {
		model.setFechaLimite(fechaLimite);
	}

	/**
	 * Sets the group ID of this tarea.
	 *
	 * @param groupId the group ID of this tarea
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tarea.
	 *
	 * @param modifiedDate the modified date of this tarea
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nombre tarea of this tarea.
	 *
	 * @param nombreTarea the nombre tarea of this tarea
	 */
	@Override
	public void setNombreTarea(String nombreTarea) {
		model.setNombreTarea(nombreTarea);
	}

	/**
	 * Sets the primary key of this tarea.
	 *
	 * @param primaryKey the primary key of this tarea
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the prioridad of this tarea.
	 *
	 * @param prioridad the prioridad of this tarea
	 */
	@Override
	public void setPrioridad(String prioridad) {
		model.setPrioridad(prioridad);
	}

	/**
	 * Sets the proyecto of this tarea.
	 *
	 * @param proyecto the proyecto of this tarea
	 */
	@Override
	public void setProyecto(String proyecto) {
		model.setProyecto(proyecto);
	}

	/**
	 * Sets the responsable of this tarea.
	 *
	 * @param responsable the responsable of this tarea
	 */
	@Override
	public void setResponsable(String responsable) {
		model.setResponsable(responsable);
	}

	/**
	 * Sets the resumen of this tarea.
	 *
	 * @param resumen the resumen of this tarea
	 */
	@Override
	public void setResumen(String resumen) {
		model.setResumen(resumen);
	}

	/**
	 * Sets the sprint of this tarea.
	 *
	 * @param sprint the sprint of this tarea
	 */
	@Override
	public void setSprint(String sprint) {
		model.setSprint(sprint);
	}

	/**
	 * Sets the tarea ID of this tarea.
	 *
	 * @param tareaId the tarea ID of this tarea
	 */
	@Override
	public void setTareaId(long tareaId) {
		model.setTareaId(tareaId);
	}

	/**
	 * Sets the user ID of this tarea.
	 *
	 * @param userId the user ID of this tarea
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tarea.
	 *
	 * @param userName the user name of this tarea
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tarea.
	 *
	 * @param userUuid the user uuid of this tarea
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this tarea.
	 *
	 * @param uuid the uuid of this tarea
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
	protected TareaWrapper wrap(Tarea tarea) {
		return new TareaWrapper(tarea);
	}

}