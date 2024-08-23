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

package com.aula.sb.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the T_Ul_MaterialEstud service. Represents a row in the &quot;AulaVirtual_T_Ul_MaterialEstud&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_MaterialEstudModel
 * @generated
 */
@ImplementationClassName("com.aula.sb.model.impl.T_Ul_MaterialEstudImpl")
@ProviderType
public interface T_Ul_MaterialEstud
	extends PersistedModel, T_Ul_MaterialEstudModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.aula.sb.model.impl.T_Ul_MaterialEstudImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<T_Ul_MaterialEstud, Long>
		ID_MATERIAL_ACCESSOR = new Accessor<T_Ul_MaterialEstud, Long>() {

			@Override
			public Long get(T_Ul_MaterialEstud t_Ul_MaterialEstud) {
				return t_Ul_MaterialEstud.getIdMaterial();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<T_Ul_MaterialEstud> getTypeClass() {
				return T_Ul_MaterialEstud.class;
			}

		};

}