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

package com.savvy.sb.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.savvy.sb.model.Sprint;
import com.savvy.sb.model.SprintModel;
import com.savvy.sb.model.SprintSoap;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Sprint service. Represents a row in the &quot;Servicio_Savvy_Sprint&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>SprintModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SprintImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SprintImpl
 * @generated
 */
@JSON(strict = true)
public class SprintModelImpl
	extends BaseModelImpl<Sprint> implements SprintModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sprint model instance should use the <code>Sprint</code> interface instead.
	 */
	public static final String TABLE_NAME = "Servicio_Savvy_Sprint";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"sprintId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"tituloSprint", Types.VARCHAR}, {"fechaInicio", Types.TIMESTAMP},
		{"fechaFinal", Types.TIMESTAMP}, {"descripcion", Types.VARCHAR},
		{"estado", Types.VARCHAR}, {"proyecto", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sprintId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("tituloSprint", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fechaInicio", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("fechaFinal", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("descripcion", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("estado", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("proyecto", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table Servicio_Savvy_Sprint (uuid_ VARCHAR(75) null,sprintId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,tituloSprint VARCHAR(75) null,fechaInicio DATE null,fechaFinal DATE null,descripcion VARCHAR(75) null,estado VARCHAR(75) null,proyecto VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table Servicio_Savvy_Sprint";

	public static final String ORDER_BY_JPQL =
		" ORDER BY sprint.tituloSprint ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY Servicio_Savvy_Sprint.tituloSprint ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long TITULOSPRINT_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static Sprint toModel(SprintSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Sprint model = new SprintImpl();

		model.setUuid(soapModel.getUuid());
		model.setSprintId(soapModel.getSprintId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setTituloSprint(soapModel.getTituloSprint());
		model.setFechaInicio(soapModel.getFechaInicio());
		model.setFechaFinal(soapModel.getFechaFinal());
		model.setDescripcion(soapModel.getDescripcion());
		model.setEstado(soapModel.getEstado());
		model.setProyecto(soapModel.getProyecto());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static List<Sprint> toModels(SprintSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Sprint> models = new ArrayList<Sprint>(soapModels.length);

		for (SprintSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public SprintModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _sprintId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSprintId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sprintId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Sprint.class;
	}

	@Override
	public String getModelClassName() {
		return Sprint.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Sprint, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Sprint, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Sprint, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Sprint)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Sprint, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Sprint, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Sprint)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Sprint, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Sprint, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<Sprint, Object>>
		_attributeGetterFunctions;

	static {
		Map<String, Function<Sprint, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Sprint, Object>>();

		attributeGetterFunctions.put("uuid", Sprint::getUuid);
		attributeGetterFunctions.put("sprintId", Sprint::getSprintId);
		attributeGetterFunctions.put("groupId", Sprint::getGroupId);
		attributeGetterFunctions.put("companyId", Sprint::getCompanyId);
		attributeGetterFunctions.put("userId", Sprint::getUserId);
		attributeGetterFunctions.put("userName", Sprint::getUserName);
		attributeGetterFunctions.put("createDate", Sprint::getCreateDate);
		attributeGetterFunctions.put("modifiedDate", Sprint::getModifiedDate);
		attributeGetterFunctions.put("tituloSprint", Sprint::getTituloSprint);
		attributeGetterFunctions.put("fechaInicio", Sprint::getFechaInicio);
		attributeGetterFunctions.put("fechaFinal", Sprint::getFechaFinal);
		attributeGetterFunctions.put("descripcion", Sprint::getDescripcion);
		attributeGetterFunctions.put("estado", Sprint::getEstado);
		attributeGetterFunctions.put("proyecto", Sprint::getProyecto);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
	}

	private static final Map<String, BiConsumer<Sprint, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, BiConsumer<Sprint, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Sprint, ?>>();

		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Sprint, String>)Sprint::setUuid);
		attributeSetterBiConsumers.put(
			"sprintId", (BiConsumer<Sprint, Long>)Sprint::setSprintId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Sprint, Long>)Sprint::setGroupId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<Sprint, Long>)Sprint::setCompanyId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Sprint, Long>)Sprint::setUserId);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<Sprint, String>)Sprint::setUserName);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<Sprint, Date>)Sprint::setCreateDate);
		attributeSetterBiConsumers.put(
			"modifiedDate", (BiConsumer<Sprint, Date>)Sprint::setModifiedDate);
		attributeSetterBiConsumers.put(
			"tituloSprint",
			(BiConsumer<Sprint, String>)Sprint::setTituloSprint);
		attributeSetterBiConsumers.put(
			"fechaInicio", (BiConsumer<Sprint, Date>)Sprint::setFechaInicio);
		attributeSetterBiConsumers.put(
			"fechaFinal", (BiConsumer<Sprint, Date>)Sprint::setFechaFinal);
		attributeSetterBiConsumers.put(
			"descripcion", (BiConsumer<Sprint, String>)Sprint::setDescripcion);
		attributeSetterBiConsumers.put(
			"estado", (BiConsumer<Sprint, String>)Sprint::setEstado);
		attributeSetterBiConsumers.put(
			"proyecto", (BiConsumer<Sprint, String>)Sprint::setProyecto);

		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getSprintId() {
		return _sprintId;
	}

	@Override
	public void setSprintId(long sprintId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sprintId = sprintId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_groupId = groupId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalGroupId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("groupId"));
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyId"));
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getTituloSprint() {
		if (_tituloSprint == null) {
			return "";
		}
		else {
			return _tituloSprint;
		}
	}

	@Override
	public void setTituloSprint(String tituloSprint) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tituloSprint = tituloSprint;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalTituloSprint() {
		return getColumnOriginalValue("tituloSprint");
	}

	@JSON
	@Override
	public Date getFechaInicio() {
		return _fechaInicio;
	}

	@Override
	public void setFechaInicio(Date fechaInicio) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_fechaInicio = fechaInicio;
	}

	@JSON
	@Override
	public Date getFechaFinal() {
		return _fechaFinal;
	}

	@Override
	public void setFechaFinal(Date fechaFinal) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_fechaFinal = fechaFinal;
	}

	@JSON
	@Override
	public String getDescripcion() {
		if (_descripcion == null) {
			return "";
		}
		else {
			return _descripcion;
		}
	}

	@Override
	public void setDescripcion(String descripcion) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_descripcion = descripcion;
	}

	@JSON
	@Override
	public String getEstado() {
		if (_estado == null) {
			return "";
		}
		else {
			return _estado;
		}
	}

	@Override
	public void setEstado(String estado) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_estado = estado;
	}

	@JSON
	@Override
	public String getProyecto() {
		if (_proyecto == null) {
			return "";
		}
		else {
			return _proyecto;
		}
	}

	@Override
	public void setProyecto(String proyecto) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_proyecto = proyecto;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Sprint.class.getName()));
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Sprint.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Sprint toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Sprint>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SprintImpl sprintImpl = new SprintImpl();

		sprintImpl.setUuid(getUuid());
		sprintImpl.setSprintId(getSprintId());
		sprintImpl.setGroupId(getGroupId());
		sprintImpl.setCompanyId(getCompanyId());
		sprintImpl.setUserId(getUserId());
		sprintImpl.setUserName(getUserName());
		sprintImpl.setCreateDate(getCreateDate());
		sprintImpl.setModifiedDate(getModifiedDate());
		sprintImpl.setTituloSprint(getTituloSprint());
		sprintImpl.setFechaInicio(getFechaInicio());
		sprintImpl.setFechaFinal(getFechaFinal());
		sprintImpl.setDescripcion(getDescripcion());
		sprintImpl.setEstado(getEstado());
		sprintImpl.setProyecto(getProyecto());

		sprintImpl.resetOriginalValues();

		return sprintImpl;
	}

	@Override
	public int compareTo(Sprint sprint) {
		int value = 0;

		value = getTituloSprint().compareTo(sprint.getTituloSprint());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Sprint)) {
			return false;
		}

		Sprint sprint = (Sprint)object;

		long primaryKey = sprint.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Sprint> toCacheModel() {
		SprintCacheModel sprintCacheModel = new SprintCacheModel();

		sprintCacheModel.uuid = getUuid();

		String uuid = sprintCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			sprintCacheModel.uuid = null;
		}

		sprintCacheModel.sprintId = getSprintId();

		sprintCacheModel.groupId = getGroupId();

		sprintCacheModel.companyId = getCompanyId();

		sprintCacheModel.userId = getUserId();

		sprintCacheModel.userName = getUserName();

		String userName = sprintCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			sprintCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			sprintCacheModel.createDate = createDate.getTime();
		}
		else {
			sprintCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			sprintCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			sprintCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		sprintCacheModel.tituloSprint = getTituloSprint();

		String tituloSprint = sprintCacheModel.tituloSprint;

		if ((tituloSprint != null) && (tituloSprint.length() == 0)) {
			sprintCacheModel.tituloSprint = null;
		}

		Date fechaInicio = getFechaInicio();

		if (fechaInicio != null) {
			sprintCacheModel.fechaInicio = fechaInicio.getTime();
		}
		else {
			sprintCacheModel.fechaInicio = Long.MIN_VALUE;
		}

		Date fechaFinal = getFechaFinal();

		if (fechaFinal != null) {
			sprintCacheModel.fechaFinal = fechaFinal.getTime();
		}
		else {
			sprintCacheModel.fechaFinal = Long.MIN_VALUE;
		}

		sprintCacheModel.descripcion = getDescripcion();

		String descripcion = sprintCacheModel.descripcion;

		if ((descripcion != null) && (descripcion.length() == 0)) {
			sprintCacheModel.descripcion = null;
		}

		sprintCacheModel.estado = getEstado();

		String estado = sprintCacheModel.estado;

		if ((estado != null) && (estado.length() == 0)) {
			sprintCacheModel.estado = null;
		}

		sprintCacheModel.proyecto = getProyecto();

		String proyecto = sprintCacheModel.proyecto;

		if ((proyecto != null) && (proyecto.length() == 0)) {
			sprintCacheModel.proyecto = null;
		}

		return sprintCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Sprint, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Sprint, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Sprint, Object> attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Sprint)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Sprint, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Sprint, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Sprint, Object> attributeGetterFunction = entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Sprint)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Sprint>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Sprint.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _sprintId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _tituloSprint;
	private Date _fechaInicio;
	private Date _fechaFinal;
	private String _descripcion;
	private String _estado;
	private String _proyecto;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Sprint, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Sprint)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("sprintId", _sprintId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("tituloSprint", _tituloSprint);
		_columnOriginalValues.put("fechaInicio", _fechaInicio);
		_columnOriginalValues.put("fechaFinal", _fechaFinal);
		_columnOriginalValues.put("descripcion", _descripcion);
		_columnOriginalValues.put("estado", _estado);
		_columnOriginalValues.put("proyecto", _proyecto);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("sprintId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("tituloSprint", 256L);

		columnBitmasks.put("fechaInicio", 512L);

		columnBitmasks.put("fechaFinal", 1024L);

		columnBitmasks.put("descripcion", 2048L);

		columnBitmasks.put("estado", 4096L);

		columnBitmasks.put("proyecto", 8192L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Sprint _escapedModel;

}