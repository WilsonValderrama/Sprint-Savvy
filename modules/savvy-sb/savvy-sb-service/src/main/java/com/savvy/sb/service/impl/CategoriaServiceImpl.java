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
import com.liferay.portal.kernel.service.ServiceContext;
import com.savvy.sb.model.Categoria;
import com.savvy.sb.service.CategoriaLocalServiceUtil;
import com.savvy.sb.service.base.CategoriaServiceBaseImpl;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=servicio_savvy",
		"json.web.service.context.path=Categoria"
	},
	service = AopService.class
)
public class CategoriaServiceImpl extends CategoriaServiceBaseImpl {
	public Categoria createCategoria(String nombreCategoria, String descripcion,
			  ServiceContext serviceContext) throws PortalException {
return CategoriaLocalServiceUtil.createCategoria(nombreCategoria, descripcion, serviceContext);
}



public Categoria updateCategoria(long categoriaId, String nombreCategoria, String descripcion,
			  ServiceContext serviceContext) throws PortalException  {
return CategoriaLocalServiceUtil.updateCategoria(categoriaId, nombreCategoria, descripcion, serviceContext);
}



public Categoria deleteCategoria(long categoriaId) throws PortalException {
return CategoriaLocalServiceUtil.deleteCategoria(categoriaId);
}

public List<Categoria> getAllCategorias() {
return CategoriaLocalServiceUtil.getAllCategorias();
}

public List<Categoria> getCategoriaByNombre(String nombreCategoria) {
	return CategoriaLocalServiceUtil.getCategoriaByNombre(nombreCategoria);
}

}