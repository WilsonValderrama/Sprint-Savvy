import React from 'react';
import ReactDOM from 'react-dom';

export default class extends React.Component {
	constructor(props) {
		super(props);
		// Inicializa el estado con un array vacío para los cursos
		this.state = {
			courses: []
		};
	}


	//Lamado funcion Liferay.Service(
	componentDidMount() {
		Liferay.Service(
			'/aulavirtual.t_ul_curso/get-all-t_-ul_-cursos',
			{},
			(response) => {
				console.log(response);
				this.setState({
					courses: response
				});
			}
		);
	}

	render() {
		return (
			<div className="card-ul-container">
				{this.state.courses.map(course => (
					<div className="card-ul card-ul-one" key={course.idCurso}>
						<div className="card-ul-content">
							<h4 className="text-middle">{course.nombreCurso}</h4>
							<p className="text-bold">{`ID Curso: ${course.idCurso}`}</p>
							<p className="text-middle">{`PRIMER SEMESTRE 2024`}</p>
						</div>
						<div className="card-ul-icons">
							<a href="#" title="Alertas"><i className='bx bx-bell'></i></a>
							<a href="#" title="Carpeta"><i className='bx bx-folder'></i></a>
							<a href="#" title="Tareas"><i className='bx bx-receipt'></i></a>
							<a href="#" title="Personas"><i className='bx bx-user-voice'></i></a>
						</div>
					</div>
				))}
			</div>
		);
	}
}