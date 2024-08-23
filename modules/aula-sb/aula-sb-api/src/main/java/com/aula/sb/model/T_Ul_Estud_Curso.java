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
 * The extended model interface for the T_Ul_Estud_Curso service. Represents a row in the &quot;AulaVirtual_T_Ul_Estud_Curso&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_Estud_CursoModel
 * @generated
 */
@ImplementationClassName("com.aula.sb.model.impl.T_Ul_Estud_CursoImpl")
@ProviderType
public interface T_Ul_Estud_Curso
	extends PersistedModel, T_Ul_Estud_CursoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.aula.sb.model.impl.T_Ul_Estud_CursoImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<T_Ul_Estud_Curso, Long>
		T__UL__CURSO_ID_ACCESSOR = new Accessor<T_Ul_Estud_Curso, Long>() {

			@Override
			public Long get(T_Ul_Estud_Curso t_Ul_Estud_Curso) {
				return t_Ul_Estud_Curso.getT_Ul_Curso_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<T_Ul_Estud_Curso> getTypeClass() {
				return T_Ul_Estud_Curso.class;
			}

		};
	public static final Accessor<T_Ul_Estud_Curso, Long>
		T__UL__ESTUDIANTE_ID_ACCESSOR = new Accessor<T_Ul_Estud_Curso, Long>() {

			@Override
			public Long get(T_Ul_Estud_Curso t_Ul_Estud_Curso) {
				return t_Ul_Estud_Curso.getT_Ul_Estudiante_id();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<T_Ul_Estud_Curso> getTypeClass() {
				return T_Ul_Estud_Curso.class;
			}

		};

}