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

package com.aula.sb.service;

import com.aula.sb.model.T_Ul_MaterialEstud;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.security.access.control.AccessControlled;
import com.liferay.portal.kernel.service.BaseService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;

import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the remote service interface for T_Ul_MaterialEstud. Methods of this
 * service are expected to have security checks based on the propagated JAAS
 * credentials because this service can be accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_MaterialEstudServiceUtil
 * @generated
 */
@AccessControlled
@JSONWebService
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface T_Ul_MaterialEstudService extends BaseService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.aula.sb.service.impl.T_Ul_MaterialEstudServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the t_ ul_ material estud remote service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link T_Ul_MaterialEstudServiceUtil} if injection and service tracking are not available.
	 */
	public T_Ul_MaterialEstud createMaterialEstudio(
			String tituloMaterial, String fCreacionMaterial,
			String urlArchMaterial, String descripMaterial,
			ServiceContext serviceContext)
		throws PortalException;

	public T_Ul_MaterialEstud deleteT_Ul_MaterialEstud(long idMaterial)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<T_Ul_MaterialEstud> getAllT_Ul_MaterialEstud();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public T_Ul_MaterialEstud getT_Ul_MaterialEstud(long idMaterial)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<T_Ul_MaterialEstud> getT_Ul_MaterialEstudByName(
		String tituloMaterial);

	public T_Ul_MaterialEstud updateT_Ul_MaterialEstud(
			long idMaterial, String tituloMaterial, String fCreacionMaterial,
			String urlArchMaterial, String descripMaterial,
			ServiceContext serviceContext)
		throws PortalException;

}