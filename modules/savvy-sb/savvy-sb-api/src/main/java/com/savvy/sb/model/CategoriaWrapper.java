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
 * This class is a wrapper for {@link Categoria}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Categoria
 * @generated
 */
public class CategoriaWrapper
	extends BaseModelWrapper<Categoria>
	implements Categoria, ModelWrapper<Categoria> {

	public CategoriaWrapper(Categoria categoria) {
		super(categoria);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("categoriaId", getCategoriaId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("nombreCategoria", getNombreCategoria());
		attributes.put("descripcion", getDescripcion());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long categoriaId = (Long)attributes.get("categoriaId");

		if (categoriaId != null) {
			setCategoriaId(categoriaId);
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

		String nombreCategoria = (String)attributes.get("nombreCategoria");

		if (nombreCategoria != null) {
			setNombreCategoria(nombreCategoria);
		}

		String descripcion = (String)attributes.get("descripcion");

		if (descripcion != null) {
			setDescripcion(descripcion);
		}
	}

	/**
	 * Returns the categoria ID of this categoria.
	 *
	 * @return the categoria ID of this categoria
	 */
	@Override
	public long getCategoriaId() {
		return model.getCategoriaId();
	}

	/**
	 * Returns the company ID of this categoria.
	 *
	 * @return the company ID of this categoria
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this categoria.
	 *
	 * @return the create date of this categoria
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the descripcion of this categoria.
	 *
	 * @return the descripcion of this categoria
	 */
	@Override
	public String getDescripcion() {
		return model.getDescripcion();
	}

	/**
	 * Returns the group ID of this categoria.
	 *
	 * @return the group ID of this categoria
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this categoria.
	 *
	 * @return the modified date of this categoria
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the nombre categoria of this categoria.
	 *
	 * @return the nombre categoria of this categoria
	 */
	@Override
	public String getNombreCategoria() {
		return model.getNombreCategoria();
	}

	/**
	 * Returns the primary key of this categoria.
	 *
	 * @return the primary key of this categoria
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this categoria.
	 *
	 * @return the user ID of this categoria
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this categoria.
	 *
	 * @return the user name of this categoria
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this categoria.
	 *
	 * @return the user uuid of this categoria
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this categoria.
	 *
	 * @return the uuid of this categoria
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
	 * Sets the categoria ID of this categoria.
	 *
	 * @param categoriaId the categoria ID of this categoria
	 */
	@Override
	public void setCategoriaId(long categoriaId) {
		model.setCategoriaId(categoriaId);
	}

	/**
	 * Sets the company ID of this categoria.
	 *
	 * @param companyId the company ID of this categoria
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this categoria.
	 *
	 * @param createDate the create date of this categoria
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the descripcion of this categoria.
	 *
	 * @param descripcion the descripcion of this categoria
	 */
	@Override
	public void setDescripcion(String descripcion) {
		model.setDescripcion(descripcion);
	}

	/**
	 * Sets the group ID of this categoria.
	 *
	 * @param groupId the group ID of this categoria
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this categoria.
	 *
	 * @param modifiedDate the modified date of this categoria
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the nombre categoria of this categoria.
	 *
	 * @param nombreCategoria the nombre categoria of this categoria
	 */
	@Override
	public void setNombreCategoria(String nombreCategoria) {
		model.setNombreCategoria(nombreCategoria);
	}

	/**
	 * Sets the primary key of this categoria.
	 *
	 * @param primaryKey the primary key of this categoria
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this categoria.
	 *
	 * @param userId the user ID of this categoria
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this categoria.
	 *
	 * @param userName the user name of this categoria
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this categoria.
	 *
	 * @param userUuid the user uuid of this categoria
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this categoria.
	 *
	 * @param uuid the uuid of this categoria
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
	protected CategoriaWrapper wrap(Categoria categoria) {
		return new CategoriaWrapper(categoria);
	}

}