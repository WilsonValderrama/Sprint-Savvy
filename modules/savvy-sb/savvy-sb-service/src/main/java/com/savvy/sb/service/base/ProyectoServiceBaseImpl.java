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

package com.savvy.sb.service.base;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.service.BaseServiceImpl;
import com.liferay.portal.kernel.util.PortalUtil;

import com.savvy.sb.model.Proyecto;
import com.savvy.sb.service.ProyectoService;
import com.savvy.sb.service.ProyectoServiceUtil;
import com.savvy.sb.service.persistence.CategoriaPersistence;
import com.savvy.sb.service.persistence.EtiquetaPersistence;
import com.savvy.sb.service.persistence.ProyectoPersistence;
import com.savvy.sb.service.persistence.SprintPersistence;
import com.savvy.sb.service.persistence.TareaPersistence;

import java.lang.reflect.Field;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the proyecto remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.savvy.sb.service.impl.ProyectoServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.savvy.sb.service.impl.ProyectoServiceImpl
 * @generated
 */
public abstract class ProyectoServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService, ProyectoService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>ProyectoService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>ProyectoServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
		_setServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			ProyectoService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		proyectoService = (ProyectoService)aopProxy;

		_setServiceUtilService(proyectoService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return ProyectoService.class.getName();
	}

	protected Class<?> getModelClass() {
		return Proyecto.class;
	}

	protected String getModelClassName() {
		return Proyecto.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = proyectoPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setServiceUtilService(ProyectoService proyectoService) {
		try {
			Field field = ProyectoServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, proyectoService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected CategoriaPersistence categoriaPersistence;

	@Reference
	protected EtiquetaPersistence etiquetaPersistence;

	@Reference
	protected com.savvy.sb.service.ProyectoLocalService proyectoLocalService;

	protected ProyectoService proyectoService;

	@Reference
	protected ProyectoPersistence proyectoPersistence;

	@Reference
	protected SprintPersistence sprintPersistence;

	@Reference
	protected TareaPersistence tareaPersistence;

	@Reference
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.ClassNameService
		classNameService;

	@Reference
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserService userService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryLocalService
		assetEntryLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryService
		assetEntryService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagLocalService
		assetTagLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagService assetTagService;

	private static final Log _log = LogFactoryUtil.getLog(
		ProyectoServiceBaseImpl.class);

}