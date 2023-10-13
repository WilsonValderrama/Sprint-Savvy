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
import com.savvy.sb.model.Categoria;
import com.savvy.sb.service.base.CategoriaLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.savvy.sb.model.Categoria",
	service = AopService.class
)
public class CategoriaLocalServiceImpl extends CategoriaLocalServiceBaseImpl {
	private final Log log = LogFactoryUtil.getLog(CategoriaLocalServiceImpl.class);

	 

	public Categoria createCategoria(String nombreCategoria, String descripcion,
																  ServiceContext serviceContext) throws PortalException {

 

		Long categoriaId = counterLocalService.increment();

 

		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
		Categoria categoria = categoriaPersistence.create(categoriaId);
		categoria.setNombreCategoria(nombreCategoria);
		categoria.setDescripcion(descripcion);

 

		categoria.setUserId(serviceContext.getUserId());
		categoria.setGroupId(serviceContext.getScopeGroupId());
		categoria.setUserName(user.getFullName());
		categoria.setCreateDate(new Date());

 

		log.info(serviceContext.getUserId());
		log.info(serviceContext.getScopeGroupId());
		log.info(user.getFullName());
		categoriaPersistence.update(categoria);

 

		return categoria;
	}

 

	public Categoria updateCategoria(long categoriaId, String nombreCategoria, String descripcion,
																  ServiceContext serviceContext) throws PortalException {

 

		Categoria categoria = categoriaPersistence.findByPrimaryKey(categoriaId);
		User user = UserLocalServiceUtil.getUserById(serviceContext.getUserId());
		categoria.setNombreCategoria(nombreCategoria);
		categoria.setDescripcion(descripcion);

 

		categoria.setUserId(serviceContext.getUserId());
		categoria.setGroupId(serviceContext.getScopeGroupId());
		categoria.setUserName(user.getFullName());
		categoria.setModifiedDate(new Date());

 

		return categoriaPersistence.update(categoria);
	}

 

	public Categoria deleteCategoria(long categoriaId) throws PortalException {

 

		return categoriaPersistence.remove(categoriaId);
	}

	public List<Categoria> getCategoriaByNombre(String nombreCategoria) {
		return categoriaPersistence.findByNombreCategoria(nombreCategoria);
	}

 

	public List<Categoria> getAllCategorias() {
		return categoriaPersistence.findAll();
	}
}