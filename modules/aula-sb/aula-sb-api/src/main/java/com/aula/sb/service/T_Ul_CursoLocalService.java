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

import com.aula.sb.model.T_Ul_Curso;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for T_Ul_Curso. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_CursoLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface T_Ul_CursoLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add custom service methods to <code>com.aula.sb.service.impl.T_Ul_CursoLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface. Consume the t_ ul_ curso local service via injection or a <code>org.osgi.util.tracker.ServiceTracker</code>. Use {@link T_Ul_CursoLocalServiceUtil} if injection and service tracking are not available.
	 */

	/**
	 * Adds the t_ ul_ curso to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_CursoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Curso the t_ ul_ curso
	 * @return the t_ ul_ curso that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public T_Ul_Curso addT_Ul_Curso(T_Ul_Curso t_Ul_Curso);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Creates a new t_ ul_ curso with the primary key. Does not add the t_ ul_ curso to the database.
	 *
	 * @param idCurso the primary key for the new t_ ul_ curso
	 * @return the new t_ ul_ curso
	 */
	@Transactional(enabled = false)
	public T_Ul_Curso createT_Ul_Curso(long idCurso);

	public T_Ul_Curso createT_Ul_Curso(
			String nombreCurso, Date fInicioCurso, Date fFinCurso,
			String colorCurso, Long T_Ul_Califi_id, Long T_Ul_Profesor_id,
			ServiceContext serviceContext)
		throws PortalException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the t_ ul_ curso with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_CursoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param idCurso the primary key of the t_ ul_ curso
	 * @return the t_ ul_ curso that was removed
	 * @throws PortalException if a t_ ul_ curso with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public T_Ul_Curso deleteT_Ul_Curso(long idCurso) throws PortalException;

	/**
	 * Deletes the t_ ul_ curso from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_CursoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Curso the t_ ul_ curso
	 * @return the t_ ul_ curso that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public T_Ul_Curso deleteT_Ul_Curso(T_Ul_Curso t_Ul_Curso);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public T_Ul_Curso fetchT_Ul_Curso(long idCurso);

	/**
	 * Returns the t_ ul_ curso matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ curso's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ curso, or <code>null</code> if a matching t_ ul_ curso could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public T_Ul_Curso fetchT_Ul_CursoByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<T_Ul_Curso> getAllT_Ul_Cursos();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Returns the t_ ul_ curso with the primary key.
	 *
	 * @param idCurso the primary key of the t_ ul_ curso
	 * @return the t_ ul_ curso
	 * @throws PortalException if a t_ ul_ curso with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public T_Ul_Curso getT_Ul_Curso(long idCurso) throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<T_Ul_Curso> getT_Ul_CursoByName(String nombreCurso);

	/**
	 * Returns the t_ ul_ curso matching the UUID and group.
	 *
	 * @param uuid the t_ ul_ curso's UUID
	 * @param groupId the primary key of the group
	 * @return the matching t_ ul_ curso
	 * @throws PortalException if a matching t_ ul_ curso could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public T_Ul_Curso getT_Ul_CursoByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	 * Returns a range of all the t_ ul_ cursos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.aula.sb.model.impl.T_Ul_CursoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @return the range of t_ ul_ cursos
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<T_Ul_Curso> getT_Ul_Cursos(int start, int end);

	/**
	 * Returns all the t_ ul_ cursos matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ cursos
	 * @param companyId the primary key of the company
	 * @return the matching t_ ul_ cursos, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<T_Ul_Curso> getT_Ul_CursosByUuidAndCompanyId(
		String uuid, long companyId);

	/**
	 * Returns a range of t_ ul_ cursos matching the UUID and company.
	 *
	 * @param uuid the UUID of the t_ ul_ cursos
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of t_ ul_ cursos
	 * @param end the upper bound of the range of t_ ul_ cursos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching t_ ul_ cursos, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<T_Ul_Curso> getT_Ul_CursosByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<T_Ul_Curso> orderByComparator);

	/**
	 * Returns the number of t_ ul_ cursos.
	 *
	 * @return the number of t_ ul_ cursos
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getT_Ul_CursosCount();

	public T_Ul_Curso updateT_Ul_Curso(
			long idCurso, String nombreCurso, Date fInicioCurso, Date fFinCurso,
			String colorCurso, Long T_Ul_Califi_id, Long T_Ul_Profesor_id,
			ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Updates the t_ ul_ curso in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect T_Ul_CursoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param t_Ul_Curso the t_ ul_ curso
	 * @return the t_ ul_ curso that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public T_Ul_Curso updateT_Ul_Curso(T_Ul_Curso t_Ul_Curso);

}