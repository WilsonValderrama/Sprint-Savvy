package com.savvy.sb.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.savvy.sb.model.Etiqueta;
import com.savvy.sb.service.EtiquetaLocalServiceUtil;
import com.savvy.sb.service.base.EtiquetaServiceBaseImpl;


import java.util.List;


import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */	
@Component(
	property = {
		"json.web.service.context.name=servicio_savvy",
		"json.web.service.context.path=Etiqueta"
	},
	service = AopService.class
)
public class EtiquetaServiceImpl extends EtiquetaServiceBaseImpl {
	

private final Log log = LogFactoryUtil.getLog(EtiquetaServiceImpl.class);

	
	public Etiqueta crearEtiqueta(String tituloEtiqueta, 
			ServiceContext serviceContext) throws PortalException {	
		return EtiquetaLocalServiceUtil.crearEtiqueta(tituloEtiqueta, serviceContext);
		}	
	
	public Etiqueta actualizarEtiqueta(long etiquetaId, String  tituloEtiqueta,
			ServiceContext serviceContext) throws PortalException  {
		return EtiquetaLocalServiceUtil.actualizarEtiqueta(etiquetaId, tituloEtiqueta, serviceContext);
		}
	
	public Etiqueta eliminarEtiqueta(long etiquetaId) throws PortalException {
		return EtiquetaLocalServiceUtil.eliminarEtiqueta(etiquetaId);
	}
	
	public Etiqueta getEtiqueta(long etiquetaId) throws PortalException {
		return EtiquetaLocalServiceUtil.getEtiqueta(etiquetaId);
	}
	
	//dudas
	public List<Etiqueta> getEtiquetaByNombre(String tituloEtiqueta) {
		return EtiquetaLocalServiceUtil.getEtiquetaByNombre(tituloEtiqueta);
	}
	
	//dudas
	public List<Etiqueta> getAllEtiqueta() {
		return EtiquetaLocalServiceUtil.getAllEtiquetas();
	}
	

}