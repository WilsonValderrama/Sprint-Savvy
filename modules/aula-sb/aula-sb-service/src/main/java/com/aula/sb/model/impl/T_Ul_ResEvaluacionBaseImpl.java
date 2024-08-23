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

import com.aula.sb.model.T_Ul_ResEvaluacion;
import com.aula.sb.service.T_Ul_ResEvaluacionLocalServiceUtil;

/**
 * The extended model base implementation for the T_Ul_ResEvaluacion service. Represents a row in the &quot;AulaVirtual_T_Ul_ResEvaluacion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link T_Ul_ResEvaluacionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see T_Ul_ResEvaluacionImpl
 * @see T_Ul_ResEvaluacion
 * @generated
 */
public abstract class T_Ul_ResEvaluacionBaseImpl
	extends T_Ul_ResEvaluacionModelImpl implements T_Ul_ResEvaluacion {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a t_ ul_ res evaluacion model instance should use the <code>T_Ul_ResEvaluacion</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			T_Ul_ResEvaluacionLocalServiceUtil.addT_Ul_ResEvaluacion(this);
		}
		else {
			T_Ul_ResEvaluacionLocalServiceUtil.updateT_Ul_ResEvaluacion(this);
		}
	}

}