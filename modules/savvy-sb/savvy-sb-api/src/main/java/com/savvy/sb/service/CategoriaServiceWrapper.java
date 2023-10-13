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

package com.savvy.sb.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link CategoriaService}.
 *
 * @author Brian Wing Shun Chan
 * @see CategoriaService
 * @generated
 */
public class CategoriaServiceWrapper
	implements CategoriaService, ServiceWrapper<CategoriaService> {

	public CategoriaServiceWrapper(CategoriaService categoriaService) {
		_categoriaService = categoriaService;
	}

	@Override
	public com.savvy.sb.model.Categoria createCategoria(
			String nombreCategoria, String descripcion,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _categoriaService.createCategoria(
			nombreCategoria, descripcion, serviceContext);
	}

	@Override
	public com.savvy.sb.model.Categoria deleteCategoria(long categoriaId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _categoriaService.deleteCategoria(categoriaId);
	}

	@Override
	public java.util.List<com.savvy.sb.model.Categoria> getAllCategorias() {
		return _categoriaService.getAllCategorias();
	}

	@Override
	public java.util.List<com.savvy.sb.model.Categoria> getCategoriaByNombre(
		String nombreCategoria) {

		return _categoriaService.getCategoriaByNombre(nombreCategoria);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _categoriaService.getOSGiServiceIdentifier();
	}

	@Override
	public com.savvy.sb.model.Categoria updateCategoria(
			long categoriaId, String nombreCategoria, String descripcion,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _categoriaService.updateCategoria(
			categoriaId, nombreCategoria, descripcion, serviceContext);
	}

	@Override
	public CategoriaService getWrappedService() {
		return _categoriaService;
	}

	@Override
	public void setWrappedService(CategoriaService categoriaService) {
		_categoriaService = categoriaService;
	}

	private CategoriaService _categoriaService;

}