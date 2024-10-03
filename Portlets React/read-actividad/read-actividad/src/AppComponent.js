import React from 'react';
import ReactDOM from 'react-dom';

export default class extends React.Component {

	constructor(props) {
		super(props);
		// Inicializa el estado con un array vacío para las actividades
		this.state = {
			activities: []
		};
	}

	// Llamado a la función Liferay.Service
	componentDidMount() {
		Liferay.Service(
			'/aulavirtual.t_ul_actividad/get-all-t_-ul_-actividad',  
			{},
			(response) => {
				console.log(response);
				this.setState({
					activities: response
				});
			}
		);
	}


	render() {
		return (
            <>

			<div class="container-activity">
            <div class="header-activity">
                <button class="toggle-button text-bold">Próximas Actividades<i class='bx bx-chevron-down'></i></button>
            </div>

			<div className="task-list">
				{this.state.activities.map(activity => (
					<div className="task-item" key={activity.idActividad}>
						<div className="task-title">
							<i className="bx bx-receipt"></i>
							<p className="text-activity">
								<span className="text-bold">{activity.tituloActividad}</span>
								<br />
								<span className="text-bold">{activity.estadoEntrActividad}</span> <span>|</span> 
								<span> Fecha de entrega </span> 
								<span className="text-bold">{new Date(activity.fCierrActividad).toLocaleDateString()} - {new Date(activity.fCierrActividad).toLocaleTimeString()}</span>
								<span>| {activity.porcActividad}% completado</span>
								<span>| {activity.tipoActividad}</span> 
								<span>| Descripción: {activity.descriActividad}</span>
							</p>
						</div>
					</div>
				))}
			</div>
			</div>	
			</>
		);
	}	
}