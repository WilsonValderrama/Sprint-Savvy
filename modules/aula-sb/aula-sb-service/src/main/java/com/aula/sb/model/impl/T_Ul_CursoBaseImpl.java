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

import com.aula.sb.model.T_Ul_Curso;
import com.aula.sb.service.T_Ul_CursoLocalServiceUtil;

/**
 * The extended model base implementation for the T_Ul_Curso service. Represents a row in the &quot;AulaVirtual_T_Ul_Curso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link T_Ul_CursoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_CursoImpl
 * @see T_Ul_Curso
 * @generated
 */
public abstract class T_Ul_CursoBaseImpl
	extends T_Ul_CursoModelImpl implements T_Ul_Curso {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a t_ ul_ curso model instance should use the <code>T_Ul_Curso</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			T_Ul_CursoLocalServiceUtil.addT_Ul_Curso(this);
		}
		else {
			T_Ul_CursoLocalServiceUtil.updateT_Ul_Curso(this);
		}
	}

}