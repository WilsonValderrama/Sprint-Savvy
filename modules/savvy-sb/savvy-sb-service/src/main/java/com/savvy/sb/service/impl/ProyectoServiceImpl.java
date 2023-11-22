package com.savvy.sb.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.savvy.sb.model.Proyecto;
import com.savvy.sb.service.ProyectoLocalServiceUtil;
import com.savvy.sb.service.base.ProyectoServiceBaseImpl;
import java.util.List;

import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = {
		"json.web.service.context.name=servicio_savvy",
		"json.web.service.context.path=Proyecto"
	},
	service = AopService.class
)
public class ProyectoServiceImpl extends ProyectoServiceBaseImpl {
	

private final Log log = LogFactoryUtil.getLog(ProyectoServiceImpl.class);

	
	public Proyecto crearProyecto(String tituloProyecto, String descripcion, String fechaInicio,
			String fechaFinal, String estado, ServiceContext serviceContext) throws PortalException {
		return ProyectoLocalServiceUtil.crearProyecto(tituloProyecto, descripcion, fechaInicio, fechaFinal, estado, serviceContext);
	}
	
	public Proyecto actualizarProyecto(long proyectoId, String tituloProyecto, String descripcion, String fechaInicio,
			String fechaFinal, String estado, ServiceContext serviceContext) throws PortalException  {
		return ProyectoLocalServiceUtil.actualizarProyecto(proyectoId, tituloProyecto, descripcion, fechaInicio, fechaFinal, estado, serviceContext);
		}
	
	public Proyecto eliminarProyecto(long proyectoId) throws PortalException {
		return ProyectoLocalServiceUtil.eliminarProyecto(proyectoId);
	}
	
	public Proyecto getProyecto(long proyectoId) throws PortalException {
		return ProyectoLocalServiceUtil.getProyecto(proyectoId);
	}
	
	//Dudas
	public List<Proyecto> getProyectoByNombre(String tituloProyecto) {
		return ProyectoLocalServiceUtil.getProyectoByNombre(tituloProyecto);
	}
	//dudas
	public List<Proyecto> getAllProyecto() {
		return ProyectoLocalServiceUtil.getAllProyectos();
	}
	

}