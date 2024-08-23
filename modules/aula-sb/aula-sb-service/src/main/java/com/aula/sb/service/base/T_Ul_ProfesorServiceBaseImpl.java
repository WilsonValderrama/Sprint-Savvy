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

package com.aula.sb.service.base;

import com.aula.sb.model.T_Ul_Profesor;
import com.aula.sb.service.T_Ul_ProfesorService;
import com.aula.sb.service.T_Ul_ProfesorServiceUtil;
import com.aula.sb.service.persistence.T_Ul_ActividadPersistence;
import com.aula.sb.service.persistence.T_Ul_AdminCursoPersistence;
import com.aula.sb.service.persistence.T_Ul_AdministradorPersistence;
import com.aula.sb.service.persistence.T_Ul_CalificacionPersistence;
import com.aula.sb.service.persistence.T_Ul_CursoPersistence;
import com.aula.sb.service.persistence.T_Ul_Estud_CursoPersistence;
import com.aula.sb.service.persistence.T_Ul_EstudiantePersistence;
import com.aula.sb.service.persistence.T_Ul_MaterialEstudPersistence;
import com.aula.sb.service.persistence.T_Ul_PAcademicoPersistence;
import com.aula.sb.service.persistence.T_Ul_PrgEvaluacionPersistence;
import com.aula.sb.service.persistence.T_Ul_ProfesorPersistence;
import com.aula.sb.service.persistence.T_Ul_ResEvaluacionPersistence;

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

import java.lang.reflect.Field;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the t_ ul_ profesor remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.aula.sb.service.impl.T_Ul_ProfesorServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.aula.sb.service.impl.T_Ul_ProfesorServiceImpl
 * @generated
 */
public abstract class T_Ul_ProfesorServiceBaseImpl
	extends BaseServiceImpl
	implements AopService, IdentifiableOSGiService, T_Ul_ProfesorService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>T_Ul_ProfesorService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>T_Ul_ProfesorServiceUtil</code>.
	 */
	@Deactivate
	protected void deactivate() {
		_setServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			T_Ul_ProfesorService.class, IdentifiableOSGiService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		t_Ul_ProfesorService = (T_Ul_ProfesorService)aopProxy;

		_setServiceUtilService(t_Ul_ProfesorService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return T_Ul_ProfesorService.class.getName();
	}

	protected Class<?> getModelClass() {
		return T_Ul_Profesor.class;
	}

	protected String getModelClassName() {
		return T_Ul_Profesor.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource = t_Ul_ProfesorPersistence.getDataSource();

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

	private void _setServiceUtilService(
		T_Ul_ProfesorService t_Ul_ProfesorService) {

		try {
			Field field = T_Ul_ProfesorServiceUtil.class.getDeclaredField(
				"_service");

			field.setAccessible(true);

			field.set(null, t_Ul_ProfesorService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Reference
	protected T_Ul_ActividadPersistence t_Ul_ActividadPersistence;

	@Reference
	protected T_Ul_AdminCursoPersistence t_Ul_AdminCursoPersistence;

	@Reference
	protected T_Ul_AdministradorPersistence t_Ul_AdministradorPersistence;

	@Reference
	protected T_Ul_CalificacionPersistence t_Ul_CalificacionPersistence;

	@Reference
	protected T_Ul_CursoPersistence t_Ul_CursoPersistence;

	@Reference
	protected T_Ul_Estud_CursoPersistence t_Ul_Estud_CursoPersistence;

	@Reference
	protected T_Ul_EstudiantePersistence t_Ul_EstudiantePersistence;

	@Reference
	protected T_Ul_MaterialEstudPersistence t_Ul_MaterialEstudPersistence;

	@Reference
	protected T_Ul_PAcademicoPersistence t_Ul_PAcademicoPersistence;

	@Reference
	protected T_Ul_PrgEvaluacionPersistence t_Ul_PrgEvaluacionPersistence;

	@Reference
	protected com.aula.sb.service.T_Ul_ProfesorLocalService
		t_Ul_ProfesorLocalService;

	protected T_Ul_ProfesorService t_Ul_ProfesorService;

	@Reference
	protected T_Ul_ProfesorPersistence t_Ul_ProfesorPersistence;

	@Reference
	protected T_Ul_ResEvaluacionPersistence t_Ul_ResEvaluacionPersistence;

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
		T_Ul_ProfesorServiceBaseImpl.class);

}