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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Tarea service. Represents a row in the &quot;Servicio_Savvy_Tarea&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.savvy.sb.model.impl.TareaModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.savvy.sb.model.impl.TareaImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Tarea
 * @generated
 */
@ProviderType
public interface TareaModel
	extends BaseModel<Tarea>, GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tarea model instance should use the {@link Tarea} interface instead.
	 */

	/**
	 * Returns the primary key of this tarea.
	 *
	 * @return the primary key of this tarea
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tarea.
	 *
	 * @param primaryKey the primary key of this tarea
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this tarea.
	 *
	 * @return the uuid of this tarea
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this tarea.
	 *
	 * @param uuid the uuid of this tarea
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the tarea ID of this tarea.
	 *
	 * @return the tarea ID of this tarea
	 */
	public long getTareaId();

	/**
	 * Sets the tarea ID of this tarea.
	 *
	 * @param tareaId the tarea ID of this tarea
	 */
	public void setTareaId(long tareaId);

	/**
	 * Returns the group ID of this tarea.
	 *
	 * @return the group ID of this tarea
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this tarea.
	 *
	 * @param groupId the group ID of this tarea
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this tarea.
	 *
	 * @return the company ID of this tarea
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this tarea.
	 *
	 * @param companyId the company ID of this tarea
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this tarea.
	 *
	 * @return the user ID of this tarea
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this tarea.
	 *
	 * @param userId the user ID of this tarea
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this tarea.
	 *
	 * @return the user uuid of this tarea
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this tarea.
	 *
	 * @param userUuid the user uuid of this tarea
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this tarea.
	 *
	 * @return the user name of this tarea
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this tarea.
	 *
	 * @param userName the user name of this tarea
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this tarea.
	 *
	 * @return the create date of this tarea
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this tarea.
	 *
	 * @param createDate the create date of this tarea
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this tarea.
	 *
	 * @return the modified date of this tarea
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this tarea.
	 *
	 * @param modifiedDate the modified date of this tarea
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the nombre tarea of this tarea.
	 *
	 * @return the nombre tarea of this tarea
	 */
	@AutoEscape
	public String getNombreTarea();

	/**
	 * Sets the nombre tarea of this tarea.
	 *
	 * @param nombreTarea the nombre tarea of this tarea
	 */
	public void setNombreTarea(String nombreTarea);

	/**
	 * Returns the proyecto of this tarea.
	 *
	 * @return the proyecto of this tarea
	 */
	@AutoEscape
	public String getProyecto();

	/**
	 * Sets the proyecto of this tarea.
	 *
	 * @param proyecto the proyecto of this tarea
	 */
	public void setProyecto(String proyecto);

	/**
	 * Returns the responsable of this tarea.
	 *
	 * @return the responsable of this tarea
	 */
	@AutoEscape
	public String getResponsable();

	/**
	 * Sets the responsable of this tarea.
	 *
	 * @param responsable the responsable of this tarea
	 */
	public void setResponsable(String responsable);

	/**
	 * Returns the prioridad of this tarea.
	 *
	 * @return the prioridad of this tarea
	 */
	@AutoEscape
	public String getPrioridad();

	/**
	 * Sets the prioridad of this tarea.
	 *
	 * @param prioridad the prioridad of this tarea
	 */
	public void setPrioridad(String prioridad);

	/**
	 * Returns the sprint of this tarea.
	 *
	 * @return the sprint of this tarea
	 */
	@AutoEscape
	public String getSprint();

	/**
	 * Sets the sprint of this tarea.
	 *
	 * @param sprint the sprint of this tarea
	 */
	public void setSprint(String sprint);

	/**
	 * Returns the estado of this tarea.
	 *
	 * @return the estado of this tarea
	 */
	@AutoEscape
	public String getEstado();

	/**
	 * Sets the estado of this tarea.
	 *
	 * @param estado the estado of this tarea
	 */
	public void setEstado(String estado);

	/**
	 * Returns the fecha limite of this tarea.
	 *
	 * @return the fecha limite of this tarea
	 */
	public Date getFechaLimite();

	/**
	 * Sets the fecha limite of this tarea.
	 *
	 * @param fechaLimite the fecha limite of this tarea
	 */
	public void setFechaLimite(Date fechaLimite);

	/**
	 * Returns the resumen of this tarea.
	 *
	 * @return the resumen of this tarea
	 */
	@AutoEscape
	public String getResumen();

	/**
	 * Sets the resumen of this tarea.
	 *
	 * @param resumen the resumen of this tarea
	 */
	public void setResumen(String resumen);

	/**
	 * Returns the descripcion of this tarea.
	 *
	 * @return the descripcion of this tarea
	 */
	@AutoEscape
	public String getDescripcion();

	/**
	 * Sets the descripcion of this tarea.
	 *
	 * @param descripcion the descripcion of this tarea
	 */
	public void setDescripcion(String descripcion);

	/**
	 * Returns the categoria of this tarea.
	 *
	 * @return the categoria of this tarea
	 */
	@AutoEscape
	public String getCategoria();

	/**
	 * Sets the categoria of this tarea.
	 *
	 * @param categoria the categoria of this tarea
	 */
	public void setCategoria(String categoria);

	/**
	 * Returns the etiqueta of this tarea.
	 *
	 * @return the etiqueta of this tarea
	 */
	@AutoEscape
	public String getEtiqueta();

	/**
	 * Sets the etiqueta of this tarea.
	 *
	 * @param etiqueta the etiqueta of this tarea
	 */
	public void setEtiqueta(String etiqueta);

}