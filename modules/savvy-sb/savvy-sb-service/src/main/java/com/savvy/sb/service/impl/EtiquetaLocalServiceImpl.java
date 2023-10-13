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

package com.savvy.sb.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.savvy.sb.model.Etiqueta;
import com.savvy.sb.service.base.EtiquetaLocalServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.savvy.sb.model.Etiqueta",
	service = AopService.class
)
public class EtiquetaLocalServiceImpl extends EtiquetaLocalServiceBaseImpl {
	
private final Log log = LogFactoryUtil.getLog(EtiquetaLocalServiceBaseImpl.class);
	
	public Etiqueta crearEtiqueta(String tituloEtiqueta, 
			ServiceContext serviceContext) throws PortalException {
	
		Long etiquetaId = counterLocalService.increment();
		
		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
		Etiqueta etiqueta = etiquetaPersistence.create(etiquetaId);
		etiqueta.setTituloEtiqueta(tituloEtiqueta);
		
		etiqueta.setUserId(serviceContext.getUserId());
		etiqueta.setGroupId(serviceContext.getScopeGroupId());
		etiqueta.setUserName(user.getFullName());
		
		log.info(serviceContext.getUserId());
		log.info(serviceContext.getScopeGroupId());
		log.info(user.getFullName());
		etiquetaPersistence.update(etiqueta);
		
		return etiqueta;
		}
	
	public Etiqueta actualizarEtiqueta(long etiquetaId, String tituloEtiqueta, 
			ServiceContext serviceContext) throws PortalException {
		
		Etiqueta etiqueta = etiquetaPersistence.findByPrimaryKey(etiquetaId);
		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
		etiqueta.setTituloEtiqueta(tituloEtiqueta);
	
		etiqueta.setUserId(serviceContext.getUserId());
		etiqueta.setGroupId(serviceContext.getScopeGroupId());
		etiqueta.setUserName(user.getFullName());
		
		return etiquetaPersistence.update(etiqueta);
		}
	
	public Etiqueta eliminarEtiqueta(long etiquetaId) throws PortalException {
		return etiquetaPersistence.remove(etiquetaId);
	}
	
	public Etiqueta getEtiqueta(long etiquetaId) throws PortalException {
		return etiquetaPersistence.findByPrimaryKey(etiquetaId);
	}
	
	public List<Etiqueta> getEtiquetaByNombre(String tituloEtiqueta) {
		return etiquetaPersistence.findByTituloEtiqueta(tituloEtiqueta);
	}
																							
	public List<Etiqueta> getAllEtiquetas() {
		return etiquetaPersistence.findAll();
	}
	
	
}