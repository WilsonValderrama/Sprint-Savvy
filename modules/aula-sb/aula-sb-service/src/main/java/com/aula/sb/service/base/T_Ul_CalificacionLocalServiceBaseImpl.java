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

import com.aula.sb.model.T_Ul_Calificacion;
import com.aula.sb.service.T_Ul_CalificacionLocalService;
import com.aula.sb.service.T_Ul_CalificacionLocalServiceUtil;
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

import com.liferay.exportimport.kernel.lar.ExportImportHelperUtil;
import com.liferay.exportimport.kernel.lar.ManifestSummary;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.exportimport.kernel.lar.StagedModelDataHandlerUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * Provides the base implementation for the t_ ul_ calificacion local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.aula.sb.service.impl.T_Ul_CalificacionLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.aula.sb.service.impl.T_Ul_CalificacionLocalServiceImpl
 * @generated
 */
public abstract class T_Ul_CalificacionLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   T_Ul_CalificacionLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>T_Ul_CalificacionLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>T_Ul_CalificacionLocalServiceUtil</code>.
	 */

	/**
	 * Adds the t_ ul_ calificacion to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_CalificacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Calificacion the t_ ul_ calificacion
	 * @return the t_ ul_ calificacion that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public T_Ul_Calificacion addT_Ul_Calificacion(
		T_Ul_Calificacion t_Ul_Calificacion) {

		t_Ul_Calificacion.setNew(true);

		return t_Ul_CalificacionPersistence.update(t_Ul_Calificacion);
	}

	/**
	 * Creates a new t_ ul_ calificacion with the primary key. Does not add the t_ ul_ calificacion to the database.
	 *
	 * @param idCalificacion the primary key for the new t_ ul_ calificacion
	 * @return the new t_ ul_ calificacion
	 */
	@Override
	@Transactional(enabled = false)
	public T_Ul_Calificacion createT_Ul_Calificacion(long idCalificacion) {
		return t_Ul_CalificacionPersistence.create(idCalificacion);
	}

	/**
	 * Deletes the t_ ul_ calificacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_CalificacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idCalificacion the primary key of the t_ ul_ calificacion
	 * @return the t_ ul_ calificacion that was removed
	 * @throws PortalException if a t_ ul_ calificacion with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public T_Ul_Calificacion deleteT_Ul_Calificacion(long idCalificacion)
		throws PortalException {

		return t_Ul_CalificacionPersistence.remove(idCalificacion);
	}

	/**
	 * Deletes the t_ ul_ calificacion from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_CalificacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Calificacion the t_ ul_ calificacion
	 * @return the t_ ul_ calificacion that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public T_Ul_Calificacion deleteT_Ul_Calificacion(
		T_Ul_Calificacion t_Ul_Calificacion) {

		return t_Ul_CalificacionPersistence.remove(t_Ul_Calificacion);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			T_Ul_Calificacion.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return t_Ul_CalificacionPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return t_Ul_CalificacionPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return t_Ul_CalificacionPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return t_Ul_CalificacionPersistence.countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection) {

		return t_Ul_CalificacionPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public T_Ul_Calificacion fetchT_Ul_Calificacion(long idCalificacion) {
		return t_Ul_CalificacionPersistence.fetchByPrimaryKey(idCalificacion);
	}

	/**
	 * Returns the t_ ul_ calificacion matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ calificacion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ calificacion, or <code>null</code> if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public T_Ul_Calificacion fetchT_Ul_CalificacionByUuidAndGroupId(
		String uuid, long groupId) {

		return t_Ul_CalificacionPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the t_ ul_ calificacion with the primary key.
	 *
	 * @param idCalificacion the primary key of the t_ ul_ calificacion
	 * @return the t_ ul_ calificacion
	 * @throws PortalException if a t_ ul_ calificacion with the primary key could not be found
	 */
	@Override
	public T_Ul_Calificacion getT_Ul_Calificacion(long idCalificacion)
		throws PortalException {

		return t_Ul_CalificacionPersistence.findByPrimaryKey(idCalificacion);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			t_Ul_CalificacionLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(T_Ul_Calificacion.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("idCalificacion");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			t_Ul_CalificacionLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(T_Ul_Calificacion.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"idCalificacion");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			t_Ul_CalificacionLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(T_Ul_Calificacion.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("idCalificacion");
	}

	@Override
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		final PortletDataContext portletDataContext) {

		final ExportActionableDynamicQuery exportActionableDynamicQuery =
			new ExportActionableDynamicQuery() {

				@Override
				public long performCount() throws PortalException {
					ManifestSummary manifestSummary =
						portletDataContext.getManifestSummary();

					StagedModelType stagedModelType = getStagedModelType();

					long modelAdditionCount = super.performCount();

					manifestSummary.addModelAdditionCount(
						stagedModelType, modelAdditionCount);

					long modelDeletionCount =
						ExportImportHelperUtil.getModelDeletionCount(
							portletDataContext, stagedModelType);

					manifestSummary.addModelDeletionCount(
						stagedModelType, modelDeletionCount);

					return modelAdditionCount;
				}

			};

		initActionableDynamicQuery(exportActionableDynamicQuery);

		exportActionableDynamicQuery.setAddCriteriaMethod(
			new ActionableDynamicQuery.AddCriteriaMethod() {

				@Override
				public void addCriteria(DynamicQuery dynamicQuery) {
					portletDataContext.addDateRangeCriteria(
						dynamicQuery, "modifiedDate");
				}

			});

		exportActionableDynamicQuery.setCompanyId(
			portletDataContext.getCompanyId());

		exportActionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod
				<T_Ul_Calificacion>() {

				@Override
				public void performAction(T_Ul_Calificacion t_Ul_Calificacion)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, t_Ul_Calificacion);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(T_Ul_Calificacion.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return t_Ul_CalificacionPersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return t_Ul_CalificacionLocalService.deleteT_Ul_Calificacion(
			(T_Ul_Calificacion)persistedModel);
	}

	public BasePersistence<T_Ul_Calificacion> getBasePersistence() {
		return t_Ul_CalificacionPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return t_Ul_CalificacionPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the t_ ul_ calificacions matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ calificacions
	 * @param companyId the primary key of the company
	 * @return the matching t_ ul_ calificacions, or an empty list if no matches were found
	 */
	@Override
	public List<T_Ul_Calificacion> getT_Ul_CalificacionsByUuidAndCompanyId(
		String uuid, long companyId) {

		return t_Ul_CalificacionPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of t_ ul_ calificacions matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ calificacions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching t_ ul_ calificacions, or an empty list if no matches were found
	 */
	@Override
	public List<T_Ul_Calificacion> getT_Ul_CalificacionsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<T_Ul_Calificacion> orderByComparator) {

		return t_Ul_CalificacionPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the t_ ul_ calificacion matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ calificacion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ calificacion
	 * @throws PortalException if a matching t_ ul_ calificacion could not be found
	 */
	@Override
	public T_Ul_Calificacion getT_Ul_CalificacionByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return t_Ul_CalificacionPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the t_ ul_ calificacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_CalificacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ calificacions
	 * @param end the upper bound of the range of t_ ul_ calificacions (not inclusive)
	 * @return the range of t_ ul_ calificacions
	 */
	@Override
	public List<T_Ul_Calificacion> getT_Ul_Calificacions(int start, int end) {
		return t_Ul_CalificacionPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of t_ ul_ calificacions.
	 *
	 * @return the number of t_ ul_ calificacions
	 */
	@Override
	public int getT_Ul_CalificacionsCount() {
		return t_Ul_CalificacionPersistence.countAll();
	}

	/**
	 * Updates the t_ ul_ calificacion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_CalificacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Calificacion the t_ ul_ calificacion
	 * @return the t_ ul_ calificacion that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public T_Ul_Calificacion updateT_Ul_Calificacion(
		T_Ul_Calificacion t_Ul_Calificacion) {

		return t_Ul_CalificacionPersistence.update(t_Ul_Calificacion);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			T_Ul_CalificacionLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		t_Ul_CalificacionLocalService = (T_Ul_CalificacionLocalService)aopProxy;

		_setLocalServiceUtilService(t_Ul_CalificacionLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return T_Ul_CalificacionLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return T_Ul_Calificacion.class;
	}

	protected String getModelClassName() {
		return T_Ul_Calificacion.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				t_Ul_CalificacionPersistence.getDataSource();

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

	private void _setLocalServiceUtilService(
		T_Ul_CalificacionLocalService t_Ul_CalificacionLocalService) {

		try {
			Field field =
				T_Ul_CalificacionLocalServiceUtil.class.getDeclaredField(
					"_service");

			field.setAccessible(true);

			field.set(null, t_Ul_CalificacionLocalService);
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

	protected T_Ul_CalificacionLocalService t_Ul_CalificacionLocalService;

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
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@Reference
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetEntryLocalService
		assetEntryLocalService;

	@Reference
	protected com.liferay.asset.kernel.service.AssetTagLocalService
		assetTagLocalService;

	private static final Log _log = LogFactoryUtil.getLog(
		T_Ul_CalificacionLocalServiceBaseImpl.class);

}