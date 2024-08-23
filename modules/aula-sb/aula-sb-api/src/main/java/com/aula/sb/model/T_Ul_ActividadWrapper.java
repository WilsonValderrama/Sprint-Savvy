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
 * This class is a wrapper for {@link T_Ul_Actividad}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_Actividad
 * @generated
 */
public class T_Ul_ActividadWrapper
	extends BaseModelWrapper<T_Ul_Actividad>
	implements ModelWrapper<T_Ul_Actividad>, T_Ul_Actividad {

	public T_Ul_ActividadWrapper(T_Ul_Actividad t_Ul_Actividad) {
		super(t_Ul_Actividad);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("idActividad", getIdActividad());
		attributes.put("tituloActividad", getTituloActividad());
		attributes.put("tipoActividad", getTipoActividad());
		attributes.put("descriActividad", getDescriActividad());
		attributes.put("estadoEntrActividad", getEstadoEntrActividad());
		attributes.put("fCreacActividad", getFCreacActividad());
		attributes.put("fCierrActividad", getFCierrActividad());
		attributes.put("porcActividad", getPorcActividad());
		attributes.put("T_Ul_Califi_id", getT_Ul_Califi_id());
		attributes.put("T_Ul_PAcademico_id", getT_Ul_PAcademico_id());
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

		Long idActividad = (Long)attributes.get("idActividad");

		if (idActividad != null) {
			setIdActividad(idActividad);
		}

		String tituloActividad = (String)attributes.get("tituloActividad");

		if (tituloActividad != null) {
			setTituloActividad(tituloActividad);
		}

		String tipoActividad = (String)attributes.get("tipoActividad");

		if (tipoActividad != null) {
			setTipoActividad(tipoActividad);
		}

		String descriActividad = (String)attributes.get("descriActividad");

		if (descriActividad != null) {
			setDescriActividad(descriActividad);
		}

		String estadoEntrActividad = (String)attributes.get(
			"estadoEntrActividad");

		if (estadoEntrActividad != null) {
			setEstadoEntrActividad(estadoEntrActividad);
		}

		Date fCreacActividad = (Date)attributes.get("fCreacActividad");

		if (fCreacActividad != null) {
			setFCreacActividad(fCreacActividad);
		}

		Date fCierrActividad = (Date)attributes.get("fCierrActividad");

		if (fCierrActividad != null) {
			setFCierrActividad(fCierrActividad);
		}

		String porcActividad = (String)attributes.get("porcActividad");

		if (porcActividad != null) {
			setPorcActividad(porcActividad);
		}

		Long T_Ul_Califi_id = (Long)attributes.get("T_Ul_Califi_id");

		if (T_Ul_Califi_id != null) {
			setT_Ul_Califi_id(T_Ul_Califi_id);
		}

		Long T_Ul_PAcademico_id = (Long)attributes.get("T_Ul_PAcademico_id");

		if (T_Ul_PAcademico_id != null) {
			setT_Ul_PAcademico_id(T_Ul_PAcademico_id);
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
	 * Returns the company ID of this t_ ul_ actividad.
	 *
	 * @return the company ID of this t_ ul_ actividad
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this t_ ul_ actividad.
	 *
	 * @return the create date of this t_ ul_ actividad
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the descri actividad of this t_ ul_ actividad.
	 *
	 * @return the descri actividad of this t_ ul_ actividad
	 */
	@Override
	public String getDescriActividad() {
		return model.getDescriActividad();
	}

	/**
	 * Returns the estado entr actividad of this t_ ul_ actividad.
	 *
	 * @return the estado entr actividad of this t_ ul_ actividad
	 */
	@Override
	public String getEstadoEntrActividad() {
		return model.getEstadoEntrActividad();
	}

	/**
	 * Returns the f cierr actividad of this t_ ul_ actividad.
	 *
	 * @return the f cierr actividad of this t_ ul_ actividad
	 */
	@Override
	public Date getFCierrActividad() {
		return model.getFCierrActividad();
	}

	/**
	 * Returns the f creac actividad of this t_ ul_ actividad.
	 *
	 * @return the f creac actividad of this t_ ul_ actividad
	 */
	@Override
	public Date getFCreacActividad() {
		return model.getFCreacActividad();
	}

	/**
	 * Returns the group ID of this t_ ul_ actividad.
	 *
	 * @return the group ID of this t_ ul_ actividad
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the id actividad of this t_ ul_ actividad.
	 *
	 * @return the id actividad of this t_ ul_ actividad
	 */
	@Override
	public long getIdActividad() {
		return model.getIdActividad();
	}

	/**
	 * Returns the modified date of this t_ ul_ actividad.
	 *
	 * @return the modified date of this t_ ul_ actividad
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the porc actividad of this t_ ul_ actividad.
	 *
	 * @return the porc actividad of this t_ ul_ actividad
	 */
	@Override
	public String getPorcActividad() {
		return model.getPorcActividad();
	}

	/**
	 * Returns the primary key of this t_ ul_ actividad.
	 *
	 * @return the primary key of this t_ ul_ actividad
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the t_ ul_ califi_id of this t_ ul_ actividad.
	 *
	 * @return the t_ ul_ califi_id of this t_ ul_ actividad
	 */
	@Override
	public long getT_Ul_Califi_id() {
		return model.getT_Ul_Califi_id();
	}

	/**
	 * Returns the t_ ul_p academico_id of this t_ ul_ actividad.
	 *
	 * @return the t_ ul_p academico_id of this t_ ul_ actividad
	 */
	@Override
	public long getT_Ul_PAcademico_id() {
		return model.getT_Ul_PAcademico_id();
	}

	/**
	 * Returns the tipo actividad of this t_ ul_ actividad.
	 *
	 * @return the tipo actividad of this t_ ul_ actividad
	 */
	@Override
	public String getTipoActividad() {
		return model.getTipoActividad();
	}

	/**
	 * Returns the titulo actividad of this t_ ul_ actividad.
	 *
	 * @return the titulo actividad of this t_ ul_ actividad
	 */
	@Override
	public String getTituloActividad() {
		return model.getTituloActividad();
	}

	/**
	 * Returns the user ID of this t_ ul_ actividad.
	 *
	 * @return the user ID of this t_ ul_ actividad
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this t_ ul_ actividad.
	 *
	 * @return the user name of this t_ ul_ actividad
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this t_ ul_ actividad.
	 *
	 * @return the user uuid of this t_ ul_ actividad
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this t_ ul_ actividad.
	 *
	 * @return the uuid of this t_ ul_ actividad
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
	 * Sets the company ID of this t_ ul_ actividad.
	 *
	 * @param companyId the company ID of this t_ ul_ actividad
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this t_ ul_ actividad.
	 *
	 * @param createDate the create date of this t_ ul_ actividad
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the descri actividad of this t_ ul_ actividad.
	 *
	 * @param descriActividad the descri actividad of this t_ ul_ actividad
	 */
	@Override
	public void setDescriActividad(String descriActividad) {
		model.setDescriActividad(descriActividad);
	}

	/**
	 * Sets the estado entr actividad of this t_ ul_ actividad.
	 *
	 * @param estadoEntrActividad the estado entr actividad of this t_ ul_ actividad
	 */
	@Override
	public void setEstadoEntrActividad(String estadoEntrActividad) {
		model.setEstadoEntrActividad(estadoEntrActividad);
	}

	/**
	 * Sets the f cierr actividad of this t_ ul_ actividad.
	 *
	 * @param fCierrActividad the f cierr actividad of this t_ ul_ actividad
	 */
	@Override
	public void setFCierrActividad(Date fCierrActividad) {
		model.setFCierrActividad(fCierrActividad);
	}

	/**
	 * Sets the f creac actividad of this t_ ul_ actividad.
	 *
	 * @param fCreacActividad the f creac actividad of this t_ ul_ actividad
	 */
	@Override
	public void setFCreacActividad(Date fCreacActividad) {
		model.setFCreacActividad(fCreacActividad);
	}

	/**
	 * Sets the group ID of this t_ ul_ actividad.
	 *
	 * @param groupId the group ID of this t_ ul_ actividad
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the id actividad of this t_ ul_ actividad.
	 *
	 * @param idActividad the id actividad of this t_ ul_ actividad
	 */
	@Override
	public void setIdActividad(long idActividad) {
		model.setIdActividad(idActividad);
	}

	/**
	 * Sets the modified date of this t_ ul_ actividad.
	 *
	 * @param modifiedDate the modified date of this t_ ul_ actividad
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the porc actividad of this t_ ul_ actividad.
	 *
	 * @param porcActividad the porc actividad of this t_ ul_ actividad
	 */
	@Override
	public void setPorcActividad(String porcActividad) {
		model.setPorcActividad(porcActividad);
	}

	/**
	 * Sets the primary key of this t_ ul_ actividad.
	 *
	 * @param primaryKey the primary key of this t_ ul_ actividad
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the t_ ul_ califi_id of this t_ ul_ actividad.
	 *
	 * @param T_Ul_Califi_id the t_ ul_ califi_id of this t_ ul_ actividad
	 */
	@Override
	public void setT_Ul_Califi_id(long T_Ul_Califi_id) {
		model.setT_Ul_Califi_id(T_Ul_Califi_id);
	}

	/**
	 * Sets the t_ ul_p academico_id of this t_ ul_ actividad.
	 *
	 * @param T_Ul_PAcademico_id the t_ ul_p academico_id of this t_ ul_ actividad
	 */
	@Override
	public void setT_Ul_PAcademico_id(long T_Ul_PAcademico_id) {
		model.setT_Ul_PAcademico_id(T_Ul_PAcademico_id);
	}

	/**
	 * Sets the tipo actividad of this t_ ul_ actividad.
	 *
	 * @param tipoActividad the tipo actividad of this t_ ul_ actividad
	 */
	@Override
	public void setTipoActividad(String tipoActividad) {
		model.setTipoActividad(tipoActividad);
	}

	/**
	 * Sets the titulo actividad of this t_ ul_ actividad.
	 *
	 * @param tituloActividad the titulo actividad of this t_ ul_ actividad
	 */
	@Override
	public void setTituloActividad(String tituloActividad) {
		model.setTituloActividad(tituloActividad);
	}

	/**
	 * Sets the user ID of this t_ ul_ actividad.
	 *
	 * @param userId the user ID of this t_ ul_ actividad
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this t_ ul_ actividad.
	 *
	 * @param userName the user name of this t_ ul_ actividad
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this t_ ul_ actividad.
	 *
	 * @param userUuid the user uuid of this t_ ul_ actividad
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this t_ ul_ actividad.
	 *
	 * @param uuid the uuid of this t_ ul_ actividad
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
	protected T_Ul_ActividadWrapper wrap(T_Ul_Actividad t_Ul_Actividad) {
		return new T_Ul_ActividadWrapper(t_Ul_Actividad);
	}

}