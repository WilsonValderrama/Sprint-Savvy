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

package com.aula.sb.model.impl;

import com.aula.sb.model.T_Ul_PAcademico;
import com.aula.sb.model.T_Ul_PAcademicoModel;
import com.aula.sb.model.T_Ul_PAcademicoSoap;

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
 * The base model implementation for the T_Ul_PAcademico service. Represents a row in the &quot;AulaVirtual_T_Ul_PAcademico&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>T_Ul_PAcademicoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link T_Ul_PAcademicoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_PAcademicoImpl
 * @generated
 */
@JSON(strict = true)
public class T_Ul_PAcademicoModelImpl
	extends BaseModelImpl<T_Ul_PAcademico> implements T_Ul_PAcademicoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a t_ ul_p academico model instance should use the <code>T_Ul_PAcademico</code> interface instead.
	 */
	public static final String TABLE_NAME = "AulaVirtual_T_Ul_PAcademico";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"idPeriodo", Types.BIGINT},
		{"tituloPeriodo", Types.VARCHAR}, {"fInicioPeriodo", Types.TIMESTAMP},
		{"fFinPeriodo", Types.TIMESTAMP}, {"porcPeriodo", Types.VARCHAR},
		{"T_Ul_Curso_id", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("idPeriodo", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("tituloPeriodo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("fInicioPeriodo", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("fFinPeriodo", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("porcPeriodo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("T_Ul_Curso_id", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table AulaVirtual_T_Ul_PAcademico (uuid_ VARCHAR(75) null,idPeriodo LONG not null primary key,tituloPeriodo VARCHAR(75) null,fInicioPeriodo DATE null,fFinPeriodo DATE null,porcPeriodo VARCHAR(75) null,T_Ul_Curso_id LONG,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";

	public static final String TABLE_SQL_DROP =
		"drop table AulaVirtual_T_Ul_PAcademico";

	public static final String ORDER_BY_JPQL =
		" ORDER BY t_Ul_PAcademico.idPeriodo ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY AulaVirtual_T_Ul_PAcademico.idPeriodo ASC";

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
	public static final long TITULOPERIODO_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long IDPERIODO_COLUMN_BITMASK = 16L;

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
	public static T_Ul_PAcademico toModel(T_Ul_PAcademicoSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		T_Ul_PAcademico model = new T_Ul_PAcademicoImpl();

		model.setUuid(soapModel.getUuid());
		model.setIdPeriodo(soapModel.getIdPeriodo());
		model.setTituloPeriodo(soapModel.getTituloPeriodo());
		model.setFInicioPeriodo(soapModel.getFInicioPeriodo());
		model.setFFinPeriodo(soapModel.getFFinPeriodo());
		model.setPorcPeriodo(soapModel.getPorcPeriodo());
		model.setT_Ul_Curso_id(soapModel.getT_Ul_Curso_id());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());

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
	public static List<T_Ul_PAcademico> toModels(
		T_Ul_PAcademicoSoap[] soapModels) {

		if (soapModels == null) {
			return null;
		}

		List<T_Ul_PAcademico> models = new ArrayList<T_Ul_PAcademico>(
			soapModels.length);

		for (T_Ul_PAcademicoSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public T_Ul_PAcademicoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _idPeriodo;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setIdPeriodo(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _idPeriodo;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return T_Ul_PAcademico.class;
	}

	@Override
	public String getModelClassName() {
		return T_Ul_PAcademico.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<T_Ul_PAcademico, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<T_Ul_PAcademico, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<T_Ul_PAcademico, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((T_Ul_PAcademico)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<T_Ul_PAcademico, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<T_Ul_PAcademico, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(T_Ul_PAcademico)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<T_Ul_PAcademico, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<T_Ul_PAcademico, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<T_Ul_PAcademico, Object>>
		_attributeGetterFunctions;

	static {
		Map<String, Function<T_Ul_PAcademico, Object>>
			attributeGetterFunctions =
				new LinkedHashMap<String, Function<T_Ul_PAcademico, Object>>();

		attributeGetterFunctions.put("uuid", T_Ul_PAcademico::getUuid);
		attributeGetterFunctions.put(
			"idPeriodo", T_Ul_PAcademico::getIdPeriodo);
		attributeGetterFunctions.put(
			"tituloPeriodo", T_Ul_PAcademico::getTituloPeriodo);
		attributeGetterFunctions.put(
			"fInicioPeriodo", T_Ul_PAcademico::getFInicioPeriodo);
		attributeGetterFunctions.put(
			"fFinPeriodo", T_Ul_PAcademico::getFFinPeriodo);
		attributeGetterFunctions.put(
			"porcPeriodo", T_Ul_PAcademico::getPorcPeriodo);
		attributeGetterFunctions.put(
			"T_Ul_Curso_id", T_Ul_PAcademico::getT_Ul_Curso_id);
		attributeGetterFunctions.put("groupId", T_Ul_PAcademico::getGroupId);
		attributeGetterFunctions.put(
			"companyId", T_Ul_PAcademico::getCompanyId);
		attributeGetterFunctions.put("userId", T_Ul_PAcademico::getUserId);
		attributeGetterFunctions.put("userName", T_Ul_PAcademico::getUserName);
		attributeGetterFunctions.put(
			"createDate", T_Ul_PAcademico::getCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", T_Ul_PAcademico::getModifiedDate);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
	}

	private static final Map<String, BiConsumer<T_Ul_PAcademico, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, BiConsumer<T_Ul_PAcademico, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<T_Ul_PAcademico, ?>>();

		attributeSetterBiConsumers.put(
			"uuid",
			(BiConsumer<T_Ul_PAcademico, String>)T_Ul_PAcademico::setUuid);
		attributeSetterBiConsumers.put(
			"idPeriodo",
			(BiConsumer<T_Ul_PAcademico, Long>)T_Ul_PAcademico::setIdPeriodo);
		attributeSetterBiConsumers.put(
			"tituloPeriodo",
			(BiConsumer<T_Ul_PAcademico, String>)
				T_Ul_PAcademico::setTituloPeriodo);
		attributeSetterBiConsumers.put(
			"fInicioPeriodo",
			(BiConsumer<T_Ul_PAcademico, Date>)
				T_Ul_PAcademico::setFInicioPeriodo);
		attributeSetterBiConsumers.put(
			"fFinPeriodo",
			(BiConsumer<T_Ul_PAcademico, Date>)T_Ul_PAcademico::setFFinPeriodo);
		attributeSetterBiConsumers.put(
			"porcPeriodo",
			(BiConsumer<T_Ul_PAcademico, String>)
				T_Ul_PAcademico::setPorcPeriodo);
		attributeSetterBiConsumers.put(
			"T_Ul_Curso_id",
			(BiConsumer<T_Ul_PAcademico, Long>)
				T_Ul_PAcademico::setT_Ul_Curso_id);
		attributeSetterBiConsumers.put(
			"groupId",
			(BiConsumer<T_Ul_PAcademico, Long>)T_Ul_PAcademico::setGroupId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<T_Ul_PAcademico, Long>)T_Ul_PAcademico::setCompanyId);
		attributeSetterBiConsumers.put(
			"userId",
			(BiConsumer<T_Ul_PAcademico, Long>)T_Ul_PAcademico::setUserId);
		attributeSetterBiConsumers.put(
			"userName",
			(BiConsumer<T_Ul_PAcademico, String>)T_Ul_PAcademico::setUserName);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<T_Ul_PAcademico, Date>)T_Ul_PAcademico::setCreateDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<T_Ul_PAcademico, Date>)
				T_Ul_PAcademico::setModifiedDate);

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
	public long getIdPeriodo() {
		return _idPeriodo;
	}

	@Override
	public void setIdPeriodo(long idPeriodo) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_idPeriodo = idPeriodo;
	}

	@JSON
	@Override
	public String getTituloPeriodo() {
		if (_tituloPeriodo == null) {
			return "";
		}
		else {
			return _tituloPeriodo;
		}
	}

	@Override
	public void setTituloPeriodo(String tituloPeriodo) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tituloPeriodo = tituloPeriodo;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalTituloPeriodo() {
		return getColumnOriginalValue("tituloPeriodo");
	}

	@JSON
	@Override
	public Date getFInicioPeriodo() {
		return _fInicioPeriodo;
	}

	@Override
	public void setFInicioPeriodo(Date fInicioPeriodo) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_fInicioPeriodo = fInicioPeriodo;
	}

	@JSON
	@Override
	public Date getFFinPeriodo() {
		return _fFinPeriodo;
	}

	@Override
	public void setFFinPeriodo(Date fFinPeriodo) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_fFinPeriodo = fFinPeriodo;
	}

	@JSON
	@Override
	public String getPorcPeriodo() {
		if (_porcPeriodo == null) {
			return "";
		}
		else {
			return _porcPeriodo;
		}
	}

	@Override
	public void setPorcPeriodo(String porcPeriodo) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_porcPeriodo = porcPeriodo;
	}

	@JSON
	@Override
	public long getT_Ul_Curso_id() {
		return _T_Ul_Curso_id;
	}

	@Override
	public void setT_Ul_Curso_id(long T_Ul_Curso_id) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_T_Ul_Curso_id = T_Ul_Curso_id;
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

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(T_Ul_PAcademico.class.getName()));
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
			getCompanyId(), T_Ul_PAcademico.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public T_Ul_PAcademico toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, T_Ul_PAcademico>
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
		T_Ul_PAcademicoImpl t_Ul_PAcademicoImpl = new T_Ul_PAcademicoImpl();

		t_Ul_PAcademicoImpl.setUuid(getUuid());
		t_Ul_PAcademicoImpl.setIdPeriodo(getIdPeriodo());
		t_Ul_PAcademicoImpl.setTituloPeriodo(getTituloPeriodo());
		t_Ul_PAcademicoImpl.setFInicioPeriodo(getFInicioPeriodo());
		t_Ul_PAcademicoImpl.setFFinPeriodo(getFFinPeriodo());
		t_Ul_PAcademicoImpl.setPorcPeriodo(getPorcPeriodo());
		t_Ul_PAcademicoImpl.setT_Ul_Curso_id(getT_Ul_Curso_id());
		t_Ul_PAcademicoImpl.setGroupId(getGroupId());
		t_Ul_PAcademicoImpl.setCompanyId(getCompanyId());
		t_Ul_PAcademicoImpl.setUserId(getUserId());
		t_Ul_PAcademicoImpl.setUserName(getUserName());
		t_Ul_PAcademicoImpl.setCreateDate(getCreateDate());
		t_Ul_PAcademicoImpl.setModifiedDate(getModifiedDate());

		t_Ul_PAcademicoImpl.resetOriginalValues();

		return t_Ul_PAcademicoImpl;
	}

	@Override
	public int compareTo(T_Ul_PAcademico t_Ul_PAcademico) {
		int value = 0;

		if (getIdPeriodo() < t_Ul_PAcademico.getIdPeriodo()) {
			value = -1;
		}
		else if (getIdPeriodo() > t_Ul_PAcademico.getIdPeriodo()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		if (!(object instanceof T_Ul_PAcademico)) {
			return false;
		}

		T_Ul_PAcademico t_Ul_PAcademico = (T_Ul_PAcademico)object;

		long primaryKey = t_Ul_PAcademico.getPrimaryKey();

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
	public CacheModel<T_Ul_PAcademico> toCacheModel() {
		T_Ul_PAcademicoCacheModel t_Ul_PAcademicoCacheModel =
			new T_Ul_PAcademicoCacheModel();

		t_Ul_PAcademicoCacheModel.uuid = getUuid();

		String uuid = t_Ul_PAcademicoCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			t_Ul_PAcademicoCacheModel.uuid = null;
		}

		t_Ul_PAcademicoCacheModel.idPeriodo = getIdPeriodo();

		t_Ul_PAcademicoCacheModel.tituloPeriodo = getTituloPeriodo();

		String tituloPeriodo = t_Ul_PAcademicoCacheModel.tituloPeriodo;

		if ((tituloPeriodo != null) && (tituloPeriodo.length() == 0)) {
			t_Ul_PAcademicoCacheModel.tituloPeriodo = null;
		}

		Date fInicioPeriodo = getFInicioPeriodo();

		if (fInicioPeriodo != null) {
			t_Ul_PAcademicoCacheModel.fInicioPeriodo = fInicioPeriodo.getTime();
		}
		else {
			t_Ul_PAcademicoCacheModel.fInicioPeriodo = Long.MIN_VALUE;
		}

		Date fFinPeriodo = getFFinPeriodo();

		if (fFinPeriodo != null) {
			t_Ul_PAcademicoCacheModel.fFinPeriodo = fFinPeriodo.getTime();
		}
		else {
			t_Ul_PAcademicoCacheModel.fFinPeriodo = Long.MIN_VALUE;
		}

		t_Ul_PAcademicoCacheModel.porcPeriodo = getPorcPeriodo();

		String porcPeriodo = t_Ul_PAcademicoCacheModel.porcPeriodo;

		if ((porcPeriodo != null) && (porcPeriodo.length() == 0)) {
			t_Ul_PAcademicoCacheModel.porcPeriodo = null;
		}

		t_Ul_PAcademicoCacheModel.T_Ul_Curso_id = getT_Ul_Curso_id();

		t_Ul_PAcademicoCacheModel.groupId = getGroupId();

		t_Ul_PAcademicoCacheModel.companyId = getCompanyId();

		t_Ul_PAcademicoCacheModel.userId = getUserId();

		t_Ul_PAcademicoCacheModel.userName = getUserName();

		String userName = t_Ul_PAcademicoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			t_Ul_PAcademicoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			t_Ul_PAcademicoCacheModel.createDate = createDate.getTime();
		}
		else {
			t_Ul_PAcademicoCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			t_Ul_PAcademicoCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			t_Ul_PAcademicoCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return t_Ul_PAcademicoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<T_Ul_PAcademico, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<T_Ul_PAcademico, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<T_Ul_PAcademico, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((T_Ul_PAcademico)this);

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
		Map<String, Function<T_Ul_PAcademico, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<T_Ul_PAcademico, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<T_Ul_PAcademico, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((T_Ul_PAcademico)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, T_Ul_PAcademico>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					T_Ul_PAcademico.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _idPeriodo;
	private String _tituloPeriodo;
	private Date _fInicioPeriodo;
	private Date _fFinPeriodo;
	private String _porcPeriodo;
	private long _T_Ul_Curso_id;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<T_Ul_PAcademico, Object> function =
			_attributeGetterFunctions.get(columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((T_Ul_PAcademico)this);
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
		_columnOriginalValues.put("idPeriodo", _idPeriodo);
		_columnOriginalValues.put("tituloPeriodo", _tituloPeriodo);
		_columnOriginalValues.put("fInicioPeriodo", _fInicioPeriodo);
		_columnOriginalValues.put("fFinPeriodo", _fFinPeriodo);
		_columnOriginalValues.put("porcPeriodo", _porcPeriodo);
		_columnOriginalValues.put("T_Ul_Curso_id", _T_Ul_Curso_id);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
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

		columnBitmasks.put("idPeriodo", 2L);

		columnBitmasks.put("tituloPeriodo", 4L);

		columnBitmasks.put("fInicioPeriodo", 8L);

		columnBitmasks.put("fFinPeriodo", 16L);

		columnBitmasks.put("porcPeriodo", 32L);

		columnBitmasks.put("T_Ul_Curso_id", 64L);

		columnBitmasks.put("groupId", 128L);

		columnBitmasks.put("companyId", 256L);

		columnBitmasks.put("userId", 512L);

		columnBitmasks.put("userName", 1024L);

		columnBitmasks.put("createDate", 2048L);

		columnBitmasks.put("modifiedDate", 4096L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private T_Ul_PAcademico _escapedModel;

}