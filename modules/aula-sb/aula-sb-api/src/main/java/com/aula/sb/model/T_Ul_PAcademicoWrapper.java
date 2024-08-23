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
 * This class is a wrapper for {@link T_Ul_PAcademico}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_PAcademico
 * @generated
 */
public class T_Ul_PAcademicoWrapper
	extends BaseModelWrapper<T_Ul_PAcademico>
	implements ModelWrapper<T_Ul_PAcademico>, T_Ul_PAcademico {

	public T_Ul_PAcademicoWrapper(T_Ul_PAcademico t_Ul_PAcademico) {
		super(t_Ul_PAcademico);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("idPeriodo", getIdPeriodo());
		attributes.put("tituloPeriodo", getTituloPeriodo());
		attributes.put("fInicioPeriodo", getFInicioPeriodo());
		attributes.put("fFinPeriodo", getFFinPeriodo());
		attributes.put("porcPeriodo", getPorcPeriodo());
		attributes.put("T_Ul_Curso_id", getT_Ul_Curso_id());
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

		Long idPeriodo = (Long)attributes.get("idPeriodo");

		if (idPeriodo != null) {
			setIdPeriodo(idPeriodo);
		}

		String tituloPeriodo = (String)attributes.get("tituloPeriodo");

		if (tituloPeriodo != null) {
			setTituloPeriodo(tituloPeriodo);
		}

		Date fInicioPeriodo = (Date)attributes.get("fInicioPeriodo");

		if (fInicioPeriodo != null) {
			setFInicioPeriodo(fInicioPeriodo);
		}

		Date fFinPeriodo = (Date)attributes.get("fFinPeriodo");

		if (fFinPeriodo != null) {
			setFFinPeriodo(fFinPeriodo);
		}

		String porcPeriodo = (String)attributes.get("porcPeriodo");

		if (porcPeriodo != null) {
			setPorcPeriodo(porcPeriodo);
		}

		Long T_Ul_Curso_id = (Long)attributes.get("T_Ul_Curso_id");

		if (T_Ul_Curso_id != null) {
			setT_Ul_Curso_id(T_Ul_Curso_id);
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
	 * Returns the company ID of this t_ ul_p academico.
	 *
	 * @return the company ID of this t_ ul_p academico
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this t_ ul_p academico.
	 *
	 * @return the create date of this t_ ul_p academico
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the f fin periodo of this t_ ul_p academico.
	 *
	 * @return the f fin periodo of this t_ ul_p academico
	 */
	@Override
	public Date getFFinPeriodo() {
		return model.getFFinPeriodo();
	}

	/**
	 * Returns the f inicio periodo of this t_ ul_p academico.
	 *
	 * @return the f inicio periodo of this t_ ul_p academico
	 */
	@Override
	public Date getFInicioPeriodo() {
		return model.getFInicioPeriodo();
	}

	/**
	 * Returns the group ID of this t_ ul_p academico.
	 *
	 * @return the group ID of this t_ ul_p academico
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the id periodo of this t_ ul_p academico.
	 *
	 * @return the id periodo of this t_ ul_p academico
	 */
	@Override
	public long getIdPeriodo() {
		return model.getIdPeriodo();
	}

	/**
	 * Returns the modified date of this t_ ul_p academico.
	 *
	 * @return the modified date of this t_ ul_p academico
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the porc periodo of this t_ ul_p academico.
	 *
	 * @return the porc periodo of this t_ ul_p academico
	 */
	@Override
	public String getPorcPeriodo() {
		return model.getPorcPeriodo();
	}

	/**
	 * Returns the primary key of this t_ ul_p academico.
	 *
	 * @return the primary key of this t_ ul_p academico
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the t_ ul_ curso_id of this t_ ul_p academico.
	 *
	 * @return the t_ ul_ curso_id of this t_ ul_p academico
	 */
	@Override
	public long getT_Ul_Curso_id() {
		return model.getT_Ul_Curso_id();
	}

	/**
	 * Returns the titulo periodo of this t_ ul_p academico.
	 *
	 * @return the titulo periodo of this t_ ul_p academico
	 */
	@Override
	public String getTituloPeriodo() {
		return model.getTituloPeriodo();
	}

	/**
	 * Returns the user ID of this t_ ul_p academico.
	 *
	 * @return the user ID of this t_ ul_p academico
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this t_ ul_p academico.
	 *
	 * @return the user name of this t_ ul_p academico
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this t_ ul_p academico.
	 *
	 * @return the user uuid of this t_ ul_p academico
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this t_ ul_p academico.
	 *
	 * @return the uuid of this t_ ul_p academico
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
	 * Sets the company ID of this t_ ul_p academico.
	 *
	 * @param companyId the company ID of this t_ ul_p academico
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this t_ ul_p academico.
	 *
	 * @param createDate the create date of this t_ ul_p academico
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the f fin periodo of this t_ ul_p academico.
	 *
	 * @param fFinPeriodo the f fin periodo of this t_ ul_p academico
	 */
	@Override
	public void setFFinPeriodo(Date fFinPeriodo) {
		model.setFFinPeriodo(fFinPeriodo);
	}

	/**
	 * Sets the f inicio periodo of this t_ ul_p academico.
	 *
	 * @param fInicioPeriodo the f inicio periodo of this t_ ul_p academico
	 */
	@Override
	public void setFInicioPeriodo(Date fInicioPeriodo) {
		model.setFInicioPeriodo(fInicioPeriodo);
	}

	/**
	 * Sets the group ID of this t_ ul_p academico.
	 *
	 * @param groupId the group ID of this t_ ul_p academico
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the id periodo of this t_ ul_p academico.
	 *
	 * @param idPeriodo the id periodo of this t_ ul_p academico
	 */
	@Override
	public void setIdPeriodo(long idPeriodo) {
		model.setIdPeriodo(idPeriodo);
	}

	/**
	 * Sets the modified date of this t_ ul_p academico.
	 *
	 * @param modifiedDate the modified date of this t_ ul_p academico
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the porc periodo of this t_ ul_p academico.
	 *
	 * @param porcPeriodo the porc periodo of this t_ ul_p academico
	 */
	@Override
	public void setPorcPeriodo(String porcPeriodo) {
		model.setPorcPeriodo(porcPeriodo);
	}

	/**
	 * Sets the primary key of this t_ ul_p academico.
	 *
	 * @param primaryKey the primary key of this t_ ul_p academico
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the t_ ul_ curso_id of this t_ ul_p academico.
	 *
	 * @param T_Ul_Curso_id the t_ ul_ curso_id of this t_ ul_p academico
	 */
	@Override
	public void setT_Ul_Curso_id(long T_Ul_Curso_id) {
		model.setT_Ul_Curso_id(T_Ul_Curso_id);
	}

	/**
	 * Sets the titulo periodo of this t_ ul_p academico.
	 *
	 * @param tituloPeriodo the titulo periodo of this t_ ul_p academico
	 */
	@Override
	public void setTituloPeriodo(String tituloPeriodo) {
		model.setTituloPeriodo(tituloPeriodo);
	}

	/**
	 * Sets the user ID of this t_ ul_p academico.
	 *
	 * @param userId the user ID of this t_ ul_p academico
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this t_ ul_p academico.
	 *
	 * @param userName the user name of this t_ ul_p academico
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this t_ ul_p academico.
	 *
	 * @param userUuid the user uuid of this t_ ul_p academico
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this t_ ul_p academico.
	 *
	 * @param uuid the uuid of this t_ ul_p academico
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
	protected T_Ul_PAcademicoWrapper wrap(T_Ul_PAcademico t_Ul_PAcademico) {
		return new T_Ul_PAcademicoWrapper(t_Ul_PAcademico);
	}

}