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

import com.aula.sb.model.T_Ul_ResEvaluacion;
import com.aula.sb.service.T_Ul_ResEvaluacionLocalService;
import com.aula.sb.service.T_Ul_ResEvaluacionLocalServiceUtil;
import com.aula.sb.service.persistence.T_Ul_ActividadPersistence;
import com.aula.sb.service.persistence.T_Ul_AdminCursoPersistence;
import com.aula.sb.service.persistence.T_Ul_CalificacionPersistence;
import com.aula.sb.service.persistence.T_Ul_CursoPersistence;
import com.aula.sb.service.persistence.T_Ul_Estud_CursoPersistence;
import com.aula.sb.service.persistence.T_Ul_MaterialEstudPersistence;
import com.aula.sb.service.persistence.T_Ul_PAcademicoPersistence;
import com.aula.sb.service.persistence.T_Ul_PrgEvaluacionPersistence;
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
 * Provides the base implementation for the t_ ul_ res evaluacion local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.aula.sb.service.impl.T_Ul_ResEvaluacionLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.aula.sb.service.impl.T_Ul_ResEvaluacionLocalServiceImpl
 * @generated
 */
public abstract class T_Ul_ResEvaluacionLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   T_Ul_ResEvaluacionLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>T_Ul_ResEvaluacionLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>T_Ul_ResEvaluacionLocalServiceUtil</code>.
	 */

	/**
	 * Adds the t_ ul_ res evaluacion to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_ResEvaluacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_ResEvaluacion the t_ ul_ res evaluacion
	 * @return the t_ ul_ res evaluacion that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public T_Ul_ResEvaluacion addT_Ul_ResEvaluacion(
		T_Ul_ResEvaluacion t_Ul_ResEvaluacion) {

		t_Ul_ResEvaluacion.setNew(true);

		return t_Ul_ResEvaluacionPersistence.update(t_Ul_ResEvaluacion);
	}

	/**
	 * Creates a new t_ ul_ res evaluacion with the primary key. Does not add the t_ ul_ res evaluacion to the database.
	 *
	 * @param idRespuestas the primary key for the new t_ ul_ res evaluacion
	 * @return the new t_ ul_ res evaluacion
	 */
	@Override
	@Transactional(enabled = false)
	public T_Ul_ResEvaluacion createT_Ul_ResEvaluacion(long idRespuestas) {
		return t_Ul_ResEvaluacionPersistence.create(idRespuestas);
	}

	/**
	 * Deletes the t_ ul_ res evaluacion with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_ResEvaluacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idRespuestas the primary key of the t_ ul_ res evaluacion
	 * @return the t_ ul_ res evaluacion that was removed
	 * @throws PortalException if a t_ ul_ res evaluacion with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public T_Ul_ResEvaluacion deleteT_Ul_ResEvaluacion(long idRespuestas)
		throws PortalException {

		return t_Ul_ResEvaluacionPersistence.remove(idRespuestas);
	}

	/**
	 * Deletes the t_ ul_ res evaluacion from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_ResEvaluacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_ResEvaluacion the t_ ul_ res evaluacion
	 * @return the t_ ul_ res evaluacion that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public T_Ul_ResEvaluacion deleteT_Ul_ResEvaluacion(
		T_Ul_ResEvaluacion t_Ul_ResEvaluacion) {

		return t_Ul_ResEvaluacionPersistence.remove(t_Ul_ResEvaluacion);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			T_Ul_ResEvaluacion.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return t_Ul_ResEvaluacionPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_ResEvaluacionModelImpl</code>.
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

		return t_Ul_ResEvaluacionPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_ResEvaluacionModelImpl</code>.
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

		return t_Ul_ResEvaluacionPersistence.findWithDynamicQuery(
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
		return t_Ul_ResEvaluacionPersistence.countWithDynamicQuery(
			dynamicQuery);
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

		return t_Ul_ResEvaluacionPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public T_Ul_ResEvaluacion fetchT_Ul_ResEvaluacion(long idRespuestas) {
		return t_Ul_ResEvaluacionPersistence.fetchByPrimaryKey(idRespuestas);
	}

	/**
	 * Returns the t_ ul_ res evaluacion matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ res evaluacion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ res evaluacion, or <code>null</code> if a matching t_ ul_ res evaluacion could not be found
	 */
	@Override
	public T_Ul_ResEvaluacion fetchT_Ul_ResEvaluacionByUuidAndGroupId(
		String uuid, long groupId) {

		return t_Ul_ResEvaluacionPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the t_ ul_ res evaluacion with the primary key.
	 *
	 * @param idRespuestas the primary key of the t_ ul_ res evaluacion
	 * @return the t_ ul_ res evaluacion
	 * @throws PortalException if a t_ ul_ res evaluacion with the primary key could not be found
	 */
	@Override
	public T_Ul_ResEvaluacion getT_Ul_ResEvaluacion(long idRespuestas)
		throws PortalException {

		return t_Ul_ResEvaluacionPersistence.findByPrimaryKey(idRespuestas);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			t_Ul_ResEvaluacionLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(T_Ul_ResEvaluacion.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("idRespuestas");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			t_Ul_ResEvaluacionLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(T_Ul_ResEvaluacion.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName(
			"idRespuestas");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			t_Ul_ResEvaluacionLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(T_Ul_ResEvaluacion.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("idRespuestas");
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
				<T_Ul_ResEvaluacion>() {

				@Override
				public void performAction(T_Ul_ResEvaluacion t_Ul_ResEvaluacion)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, t_Ul_ResEvaluacion);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(T_Ul_ResEvaluacion.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return t_Ul_ResEvaluacionPersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return t_Ul_ResEvaluacionLocalService.deleteT_Ul_ResEvaluacion(
			(T_Ul_ResEvaluacion)persistedModel);
	}

	public BasePersistence<T_Ul_ResEvaluacion> getBasePersistence() {
		return t_Ul_ResEvaluacionPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return t_Ul_ResEvaluacionPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the t_ ul_ res evaluacions matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ res evaluacions
	 * @param companyId the primary key of the company
	 * @return the matching t_ ul_ res evaluacions, or an empty list if no matches were found
	 */
	@Override
	public List<T_Ul_ResEvaluacion> getT_Ul_ResEvaluacionsByUuidAndCompanyId(
		String uuid, long companyId) {

		return t_Ul_ResEvaluacionPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of t_ ul_ res evaluacions matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ res evaluacions
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of t_ ul_ res evaluacions
	 * @param end the upper bound of the range of t_ ul_ res evaluacions (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching t_ ul_ res evaluacions, or an empty list if no matches were found
	 */
	@Override
	public List<T_Ul_ResEvaluacion> getT_Ul_ResEvaluacionsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<T_Ul_ResEvaluacion> orderByComparator) {

		return t_Ul_ResEvaluacionPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the t_ ul_ res evaluacion matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ res evaluacion's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ res evaluacion
	 * @throws PortalException if a matching t_ ul_ res evaluacion could not be found
	 */
	@Override
	public T_Ul_ResEvaluacion getT_Ul_ResEvaluacionByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return t_Ul_ResEvaluacionPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the t_ ul_ res evaluacions.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_ResEvaluacionModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ res evaluacions
	 * @param end the upper bound of the range of t_ ul_ res evaluacions (not inclusive)
	 * @return the range of t_ ul_ res evaluacions
	 */
	@Override
	public List<T_Ul_ResEvaluacion> getT_Ul_ResEvaluacions(int start, int end) {
		return t_Ul_ResEvaluacionPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of t_ ul_ res evaluacions.
	 *
	 * @return the number of t_ ul_ res evaluacions
	 */
	@Override
	public int getT_Ul_ResEvaluacionsCount() {
		return t_Ul_ResEvaluacionPersistence.countAll();
	}

	/**
	 * Updates the t_ ul_ res evaluacion in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_ResEvaluacionLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_ResEvaluacion the t_ ul_ res evaluacion
	 * @return the t_ ul_ res evaluacion that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public T_Ul_ResEvaluacion updateT_Ul_ResEvaluacion(
		T_Ul_ResEvaluacion t_Ul_ResEvaluacion) {

		return t_Ul_ResEvaluacionPersistence.update(t_Ul_ResEvaluacion);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			T_Ul_ResEvaluacionLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		t_Ul_ResEvaluacionLocalService =
			(T_Ul_ResEvaluacionLocalService)aopProxy;

		_setLocalServiceUtilService(t_Ul_ResEvaluacionLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return T_Ul_ResEvaluacionLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return T_Ul_ResEvaluacion.class;
	}

	protected String getModelClassName() {
		return T_Ul_ResEvaluacion.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				t_Ul_ResEvaluacionPersistence.getDataSource();

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
		T_Ul_ResEvaluacionLocalService t_Ul_ResEvaluacionLocalService) {

		try {
			Field field =
				T_Ul_ResEvaluacionLocalServiceUtil.class.getDeclaredField(
					"_service");

			field.setAccessible(true);

			field.set(null, t_Ul_ResEvaluacionLocalService);
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
	protected T_Ul_CalificacionPersistence t_Ul_CalificacionPersistence;

	@Reference
	protected T_Ul_CursoPersistence t_Ul_CursoPersistence;

	@Reference
	protected T_Ul_Estud_CursoPersistence t_Ul_Estud_CursoPersistence;

	@Reference
	protected T_Ul_MaterialEstudPersistence t_Ul_MaterialEstudPersistence;

	@Reference
	protected T_Ul_PAcademicoPersistence t_Ul_PAcademicoPersistence;

	@Reference
	protected T_Ul_PrgEvaluacionPersistence t_Ul_PrgEvaluacionPersistence;

	protected T_Ul_ResEvaluacionLocalService t_Ul_ResEvaluacionLocalService;

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
		T_Ul_ResEvaluacionLocalServiceBaseImpl.class);

}