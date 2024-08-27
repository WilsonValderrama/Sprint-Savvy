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

import com.aula.sb.model.T_Ul_MaterialEstud;
import com.aula.sb.service.T_Ul_MaterialEstudLocalService;
import com.aula.sb.service.T_Ul_MaterialEstudLocalServiceUtil;
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
 * Provides the base implementation for the t_ ul_ material estud local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.aula.sb.service.impl.T_Ul_MaterialEstudLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.aula.sb.service.impl.T_Ul_MaterialEstudLocalServiceImpl
 * @generated
 */
public abstract class T_Ul_MaterialEstudLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements AopService, IdentifiableOSGiService,
			   T_Ul_MaterialEstudLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>T_Ul_MaterialEstudLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>T_Ul_MaterialEstudLocalServiceUtil</code>.
	 */

	/**
	 * Adds the t_ ul_ material estud to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_MaterialEstudLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_MaterialEstud the t_ ul_ material estud
	 * @return the t_ ul_ material estud that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public T_Ul_MaterialEstud addT_Ul_MaterialEstud(
		T_Ul_MaterialEstud t_Ul_MaterialEstud) {

		t_Ul_MaterialEstud.setNew(true);

		return t_Ul_MaterialEstudPersistence.update(t_Ul_MaterialEstud);
	}

	/**
	 * Creates a new t_ ul_ material estud with the primary key. Does not add the t_ ul_ material estud to the database.
	 *
	 * @param idMaterial the primary key for the new t_ ul_ material estud
	 * @return the new t_ ul_ material estud
	 */
	@Override
	@Transactional(enabled = false)
	public T_Ul_MaterialEstud createT_Ul_MaterialEstud(long idMaterial) {
		return t_Ul_MaterialEstudPersistence.create(idMaterial);
	}

	/**
	 * Deletes the t_ ul_ material estud with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_MaterialEstudLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idMaterial the primary key of the t_ ul_ material estud
	 * @return the t_ ul_ material estud that was removed
	 * @throws PortalException if a t_ ul_ material estud with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public T_Ul_MaterialEstud deleteT_Ul_MaterialEstud(long idMaterial)
		throws PortalException {

		return t_Ul_MaterialEstudPersistence.remove(idMaterial);
	}

	/**
	 * Deletes the t_ ul_ material estud from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_MaterialEstudLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_MaterialEstud the t_ ul_ material estud
	 * @return the t_ ul_ material estud that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public T_Ul_MaterialEstud deleteT_Ul_MaterialEstud(
		T_Ul_MaterialEstud t_Ul_MaterialEstud) {

		return t_Ul_MaterialEstudPersistence.remove(t_Ul_MaterialEstud);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			T_Ul_MaterialEstud.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return t_Ul_MaterialEstudPersistence.findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_MaterialEstudModelImpl</code>.
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

		return t_Ul_MaterialEstudPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_MaterialEstudModelImpl</code>.
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

		return t_Ul_MaterialEstudPersistence.findWithDynamicQuery(
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
		return t_Ul_MaterialEstudPersistence.countWithDynamicQuery(
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

		return t_Ul_MaterialEstudPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public T_Ul_MaterialEstud fetchT_Ul_MaterialEstud(long idMaterial) {
		return t_Ul_MaterialEstudPersistence.fetchByPrimaryKey(idMaterial);
	}

	/**
	 * Returns the t_ ul_ material estud matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ material estud's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ material estud, or <code>null</code> if a matching t_ ul_ material estud could not be found
	 */
	@Override
	public T_Ul_MaterialEstud fetchT_Ul_MaterialEstudByUuidAndGroupId(
		String uuid, long groupId) {

		return t_Ul_MaterialEstudPersistence.fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the t_ ul_ material estud with the primary key.
	 *
	 * @param idMaterial the primary key of the t_ ul_ material estud
	 * @return the t_ ul_ material estud
	 * @throws PortalException if a t_ ul_ material estud with the primary key could not be found
	 */
	@Override
	public T_Ul_MaterialEstud getT_Ul_MaterialEstud(long idMaterial)
		throws PortalException {

		return t_Ul_MaterialEstudPersistence.findByPrimaryKey(idMaterial);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			t_Ul_MaterialEstudLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(T_Ul_MaterialEstud.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("idMaterial");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			t_Ul_MaterialEstudLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(T_Ul_MaterialEstud.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("idMaterial");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			t_Ul_MaterialEstudLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(T_Ul_MaterialEstud.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("idMaterial");
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
				<T_Ul_MaterialEstud>() {

				@Override
				public void performAction(T_Ul_MaterialEstud t_Ul_MaterialEstud)
					throws PortalException {

					StagedModelDataHandlerUtil.exportStagedModel(
						portletDataContext, t_Ul_MaterialEstud);
				}

			});
		exportActionableDynamicQuery.setStagedModelType(
			new StagedModelType(
				PortalUtil.getClassNameId(T_Ul_MaterialEstud.class.getName())));

		return exportActionableDynamicQuery;
	}

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return t_Ul_MaterialEstudPersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return t_Ul_MaterialEstudLocalService.deleteT_Ul_MaterialEstud(
			(T_Ul_MaterialEstud)persistedModel);
	}

	public BasePersistence<T_Ul_MaterialEstud> getBasePersistence() {
		return t_Ul_MaterialEstudPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return t_Ul_MaterialEstudPersistence.findByPrimaryKey(primaryKeyObj);
	}

	/**
	 * Returns all the t_ ul_ material estuds matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ material estuds
	 * @param companyId the primary key of the company
	 * @return the matching t_ ul_ material estuds, or an empty list if no matches were found
	 */
	@Override
	public List<T_Ul_MaterialEstud> getT_Ul_MaterialEstudsByUuidAndCompanyId(
		String uuid, long companyId) {

		return t_Ul_MaterialEstudPersistence.findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of t_ ul_ material estuds matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ material estuds
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of t_ ul_ material estuds
	 * @param end the upper bound of the range of t_ ul_ material estuds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching t_ ul_ material estuds, or an empty list if no matches were found
	 */
	@Override
	public List<T_Ul_MaterialEstud> getT_Ul_MaterialEstudsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<T_Ul_MaterialEstud> orderByComparator) {

		return t_Ul_MaterialEstudPersistence.findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the t_ ul_ material estud matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ material estud's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ material estud
	 * @throws PortalException if a matching t_ ul_ material estud could not be found
	 */
	@Override
	public T_Ul_MaterialEstud getT_Ul_MaterialEstudByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException {

		return t_Ul_MaterialEstudPersistence.findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns a range of all the t_ ul_ material estuds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_MaterialEstudModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ material estuds
	 * @param end the upper bound of the range of t_ ul_ material estuds (not inclusive)
	 * @return the range of t_ ul_ material estuds
	 */
	@Override
	public List<T_Ul_MaterialEstud> getT_Ul_MaterialEstuds(int start, int end) {
		return t_Ul_MaterialEstudPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of t_ ul_ material estuds.
	 *
	 * @return the number of t_ ul_ material estuds
	 */
	@Override
	public int getT_Ul_MaterialEstudsCount() {
		return t_Ul_MaterialEstudPersistence.countAll();
	}

	/**
	 * Updates the t_ ul_ material estud in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_MaterialEstudLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_MaterialEstud the t_ ul_ material estud
	 * @return the t_ ul_ material estud that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public T_Ul_MaterialEstud updateT_Ul_MaterialEstud(
		T_Ul_MaterialEstud t_Ul_MaterialEstud) {

		return t_Ul_MaterialEstudPersistence.update(t_Ul_MaterialEstud);
	}

	@Deactivate
	protected void deactivate() {
		_setLocalServiceUtilService(null);
	}

	@Override
	public Class<?>[] getAopInterfaces() {
		return new Class<?>[] {
			T_Ul_MaterialEstudLocalService.class, IdentifiableOSGiService.class,
			PersistedModelLocalService.class
		};
	}

	@Override
	public void setAopProxy(Object aopProxy) {
		t_Ul_MaterialEstudLocalService =
			(T_Ul_MaterialEstudLocalService)aopProxy;

		_setLocalServiceUtilService(t_Ul_MaterialEstudLocalService);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return T_Ul_MaterialEstudLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return T_Ul_MaterialEstud.class;
	}

	protected String getModelClassName() {
		return T_Ul_MaterialEstud.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				t_Ul_MaterialEstudPersistence.getDataSource();

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
		T_Ul_MaterialEstudLocalService t_Ul_MaterialEstudLocalService) {

		try {
			Field field =
				T_Ul_MaterialEstudLocalServiceUtil.class.getDeclaredField(
					"_service");

			field.setAccessible(true);

			field.set(null, t_Ul_MaterialEstudLocalService);
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

	protected T_Ul_MaterialEstudLocalService t_Ul_MaterialEstudLocalService;

	@Reference
	protected T_Ul_MaterialEstudPersistence t_Ul_MaterialEstudPersistence;

	@Reference
	protected T_Ul_PAcademicoPersistence t_Ul_PAcademicoPersistence;

	@Reference
	protected T_Ul_PrgEvaluacionPersistence t_Ul_PrgEvaluacionPersistence;

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
		T_Ul_MaterialEstudLocalServiceBaseImpl.class);

}