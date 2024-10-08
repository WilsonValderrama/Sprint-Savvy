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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the T_Ul_Curso service. Represents a row in the &quot;AulaVirtual_T_Ul_Curso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.aula.sb.model.impl.T_Ul_CursoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.aula.sb.model.impl.T_Ul_CursoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_Curso
 * @generated
 */
@ProviderType
public interface T_Ul_CursoModel
	extends BaseModel<T_Ul_Curso>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a t_ ul_ curso model instance should use the {@link T_Ul_Curso} interface instead.
	 */

	/**
	 * Returns the primary key of this t_ ul_ curso.
	 *
	 * @return the primary key of this t_ ul_ curso
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this t_ ul_ curso.
	 *
	 * @param primaryKey the primary key of this t_ ul_ curso
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this t_ ul_ curso.
	 *
	 * @return the uuid of this t_ ul_ curso
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this t_ ul_ curso.
	 *
	 * @param uuid the uuid of this t_ ul_ curso
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the id curso of this t_ ul_ curso.
	 *
	 * @return the id curso of this t_ ul_ curso
	 */
	public long getIdCurso();

	/**
	 * Sets the id curso of this t_ ul_ curso.
	 *
	 * @param idCurso the id curso of this t_ ul_ curso
	 */
	public void setIdCurso(long idCurso);

	/**
	 * Returns the nombre curso of this t_ ul_ curso.
	 *
	 * @return the nombre curso of this t_ ul_ curso
	 */
	@AutoEscape
	public String getNombreCurso();

	/**
	 * Sets the nombre curso of this t_ ul_ curso.
	 *
	 * @param nombreCurso the nombre curso of this t_ ul_ curso
	 */
	public void setNombreCurso(String nombreCurso);

	/**
	 * Returns the f inicio curso of this t_ ul_ curso.
	 *
	 * @return the f inicio curso of this t_ ul_ curso
	 */
	public Date getFInicioCurso();

	/**
	 * Sets the f inicio curso of this t_ ul_ curso.
	 *
	 * @param fInicioCurso the f inicio curso of this t_ ul_ curso
	 */
	public void setFInicioCurso(Date fInicioCurso);

	/**
	 * Returns the f fin curso of this t_ ul_ curso.
	 *
	 * @return the f fin curso of this t_ ul_ curso
	 */
	public Date getFFinCurso();

	/**
	 * Sets the f fin curso of this t_ ul_ curso.
	 *
	 * @param fFinCurso the f fin curso of this t_ ul_ curso
	 */
	public void setFFinCurso(Date fFinCurso);

	/**
	 * Returns the color curso of this t_ ul_ curso.
	 *
	 * @return the color curso of this t_ ul_ curso
	 */
	@AutoEscape
	public String getColorCurso();

	/**
	 * Sets the color curso of this t_ ul_ curso.
	 *
	 * @param colorCurso the color curso of this t_ ul_ curso
	 */
	public void setColorCurso(String colorCurso);

	/**
	 * Returns the t_ ul_ califi_id of this t_ ul_ curso.
	 *
	 * @return the t_ ul_ califi_id of this t_ ul_ curso
	 */
	public long getT_Ul_Califi_id();

	/**
	 * Sets the t_ ul_ califi_id of this t_ ul_ curso.
	 *
	 * @param T_Ul_Califi_id the t_ ul_ califi_id of this t_ ul_ curso
	 */
	public void setT_Ul_Califi_id(long T_Ul_Califi_id);

	/**
	 * Returns the t_ ul_ profesor_id of this t_ ul_ curso.
	 *
	 * @return the t_ ul_ profesor_id of this t_ ul_ curso
	 */
	public long getT_Ul_Profesor_id();

	/**
	 * Sets the t_ ul_ profesor_id of this t_ ul_ curso.
	 *
	 * @param T_Ul_Profesor_id the t_ ul_ profesor_id of this t_ ul_ curso
	 */
	public void setT_Ul_Profesor_id(long T_Ul_Profesor_id);

	/**
	 * Returns the group ID of this t_ ul_ curso.
	 *
	 * @return the group ID of this t_ ul_ curso
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this t_ ul_ curso.
	 *
	 * @param groupId the group ID of this t_ ul_ curso
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this t_ ul_ curso.
	 *
	 * @return the company ID of this t_ ul_ curso
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this t_ ul_ curso.
	 *
	 * @param companyId the company ID of this t_ ul_ curso
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this t_ ul_ curso.
	 *
	 * @return the user ID of this t_ ul_ curso
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this t_ ul_ curso.
	 *
	 * @param userId the user ID of this t_ ul_ curso
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this t_ ul_ curso.
	 *
	 * @return the user uuid of this t_ ul_ curso
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this t_ ul_ curso.
	 *
	 * @param userUuid the user uuid of this t_ ul_ curso
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this t_ ul_ curso.
	 *
	 * @return the user name of this t_ ul_ curso
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this t_ ul_ curso.
	 *
	 * @param userName the user name of this t_ ul_ curso
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this t_ ul_ curso.
	 *
	 * @return the create date of this t_ ul_ curso
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this t_ ul_ curso.
	 *
	 * @param createDate the create date of this t_ ul_ curso
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this t_ ul_ curso.
	 *
	 * @return the modified date of this t_ ul_ curso
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this t_ ul_ curso.
	 *
	 * @param modifiedDate the modified date of this t_ ul_ curso
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

}