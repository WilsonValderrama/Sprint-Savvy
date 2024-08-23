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
 * This class is a wrapper for {@link T_Ul_MaterialEstud}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_MaterialEstud
 * @generated
 */
public class T_Ul_MaterialEstudWrapper
	extends BaseModelWrapper<T_Ul_MaterialEstud>
	implements ModelWrapper<T_Ul_MaterialEstud>, T_Ul_MaterialEstud {

	public T_Ul_MaterialEstudWrapper(T_Ul_MaterialEstud t_Ul_MaterialEstud) {
		super(t_Ul_MaterialEstud);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("idMaterial", getIdMaterial());
		attributes.put("tituloMaterial", getTituloMaterial());
		attributes.put("fCreacionMaterial", getFCreacionMaterial());
		attributes.put("urlArchMaterial", getUrlArchMaterial());
		attributes.put("descripMaterial", getDescripMaterial());
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

		Long idMaterial = (Long)attributes.get("idMaterial");

		if (idMaterial != null) {
			setIdMaterial(idMaterial);
		}

		String tituloMaterial = (String)attributes.get("tituloMaterial");

		if (tituloMaterial != null) {
			setTituloMaterial(tituloMaterial);
		}

		Date fCreacionMaterial = (Date)attributes.get("fCreacionMaterial");

		if (fCreacionMaterial != null) {
			setFCreacionMaterial(fCreacionMaterial);
		}

		String urlArchMaterial = (String)attributes.get("urlArchMaterial");

		if (urlArchMaterial != null) {
			setUrlArchMaterial(urlArchMaterial);
		}

		String descripMaterial = (String)attributes.get("descripMaterial");

		if (descripMaterial != null) {
			setDescripMaterial(descripMaterial);
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
	 * Returns the company ID of this t_ ul_ material estud.
	 *
	 * @return the company ID of this t_ ul_ material estud
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this t_ ul_ material estud.
	 *
	 * @return the create date of this t_ ul_ material estud
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the descrip material of this t_ ul_ material estud.
	 *
	 * @return the descrip material of this t_ ul_ material estud
	 */
	@Override
	public String getDescripMaterial() {
		return model.getDescripMaterial();
	}

	/**
	 * Returns the f creacion material of this t_ ul_ material estud.
	 *
	 * @return the f creacion material of this t_ ul_ material estud
	 */
	@Override
	public Date getFCreacionMaterial() {
		return model.getFCreacionMaterial();
	}

	/**
	 * Returns the group ID of this t_ ul_ material estud.
	 *
	 * @return the group ID of this t_ ul_ material estud
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the id material of this t_ ul_ material estud.
	 *
	 * @return the id material of this t_ ul_ material estud
	 */
	@Override
	public long getIdMaterial() {
		return model.getIdMaterial();
	}

	/**
	 * Returns the modified date of this t_ ul_ material estud.
	 *
	 * @return the modified date of this t_ ul_ material estud
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this t_ ul_ material estud.
	 *
	 * @return the primary key of this t_ ul_ material estud
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the t_ ul_p academico_id of this t_ ul_ material estud.
	 *
	 * @return the t_ ul_p academico_id of this t_ ul_ material estud
	 */
	@Override
	public long getT_Ul_PAcademico_id() {
		return model.getT_Ul_PAcademico_id();
	}

	/**
	 * Returns the titulo material of this t_ ul_ material estud.
	 *
	 * @return the titulo material of this t_ ul_ material estud
	 */
	@Override
	public String getTituloMaterial() {
		return model.getTituloMaterial();
	}

	/**
	 * Returns the url arch material of this t_ ul_ material estud.
	 *
	 * @return the url arch material of this t_ ul_ material estud
	 */
	@Override
	public String getUrlArchMaterial() {
		return model.getUrlArchMaterial();
	}

	/**
	 * Returns the user ID of this t_ ul_ material estud.
	 *
	 * @return the user ID of this t_ ul_ material estud
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this t_ ul_ material estud.
	 *
	 * @return the user name of this t_ ul_ material estud
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this t_ ul_ material estud.
	 *
	 * @return the user uuid of this t_ ul_ material estud
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this t_ ul_ material estud.
	 *
	 * @return the uuid of this t_ ul_ material estud
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
	 * Sets the company ID of this t_ ul_ material estud.
	 *
	 * @param companyId the company ID of this t_ ul_ material estud
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this t_ ul_ material estud.
	 *
	 * @param createDate the create date of this t_ ul_ material estud
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the descrip material of this t_ ul_ material estud.
	 *
	 * @param descripMaterial the descrip material of this t_ ul_ material estud
	 */
	@Override
	public void setDescripMaterial(String descripMaterial) {
		model.setDescripMaterial(descripMaterial);
	}

	/**
	 * Sets the f creacion material of this t_ ul_ material estud.
	 *
	 * @param fCreacionMaterial the f creacion material of this t_ ul_ material estud
	 */
	@Override
	public void setFCreacionMaterial(Date fCreacionMaterial) {
		model.setFCreacionMaterial(fCreacionMaterial);
	}

	/**
	 * Sets the group ID of this t_ ul_ material estud.
	 *
	 * @param groupId the group ID of this t_ ul_ material estud
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the id material of this t_ ul_ material estud.
	 *
	 * @param idMaterial the id material of this t_ ul_ material estud
	 */
	@Override
	public void setIdMaterial(long idMaterial) {
		model.setIdMaterial(idMaterial);
	}

	/**
	 * Sets the modified date of this t_ ul_ material estud.
	 *
	 * @param modifiedDate the modified date of this t_ ul_ material estud
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this t_ ul_ material estud.
	 *
	 * @param primaryKey the primary key of this t_ ul_ material estud
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the t_ ul_p academico_id of this t_ ul_ material estud.
	 *
	 * @param T_Ul_PAcademico_id the t_ ul_p academico_id of this t_ ul_ material estud
	 */
	@Override
	public void setT_Ul_PAcademico_id(long T_Ul_PAcademico_id) {
		model.setT_Ul_PAcademico_id(T_Ul_PAcademico_id);
	}

	/**
	 * Sets the titulo material of this t_ ul_ material estud.
	 *
	 * @param tituloMaterial the titulo material of this t_ ul_ material estud
	 */
	@Override
	public void setTituloMaterial(String tituloMaterial) {
		model.setTituloMaterial(tituloMaterial);
	}

	/**
	 * Sets the url arch material of this t_ ul_ material estud.
	 *
	 * @param urlArchMaterial the url arch material of this t_ ul_ material estud
	 */
	@Override
	public void setUrlArchMaterial(String urlArchMaterial) {
		model.setUrlArchMaterial(urlArchMaterial);
	}

	/**
	 * Sets the user ID of this t_ ul_ material estud.
	 *
	 * @param userId the user ID of this t_ ul_ material estud
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this t_ ul_ material estud.
	 *
	 * @param userName the user name of this t_ ul_ material estud
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this t_ ul_ material estud.
	 *
	 * @param userUuid the user uuid of this t_ ul_ material estud
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this t_ ul_ material estud.
	 *
	 * @param uuid the uuid of this t_ ul_ material estud
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
	protected T_Ul_MaterialEstudWrapper wrap(
		T_Ul_MaterialEstud t_Ul_MaterialEstud) {

		return new T_Ul_MaterialEstudWrapper(t_Ul_MaterialEstud);
	}

}