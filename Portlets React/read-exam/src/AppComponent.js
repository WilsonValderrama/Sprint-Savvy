import React from 'react';
import ReactDOM from 'react-dom';

export default class extends React.Component {

	constructor(props) {
		super(props);
		// Inicializa el estado con un array vacío para las actividades
		this.state = {
			exam: []
		};
	}

	componentDidMount() {
		Liferay.Service(
			'/aulavirtual.t_ul_prgevaluacion/get-all-t_-ul_-prg-evaluaciones',  
			{},
			(response) => {
				if (Array.isArray(response)) {
					this.setState({
						exam: response
					});
				} else {
					console.error("La respuesta no es un array");
				}
			}
		);
	}

	// Método para dividir y renderizar las opciones
	renderOptions(opcPreguntas) {
		if (!opcPreguntas) return null;

		// Dividimos la cadena por comas y la transformamos en un array
		const opciones = opcPreguntas.split(',');

		// Retornamos un map que renderiza los botones de radio con cada opción
		return opciones.map((opcion, index) => (
			<div key={index}>
				<label>
					<input type="radio" name="question1" value={opcion.trim()} />
					{opcion.trim()}
				</label>
			</div>
		));
	}


	render() {


		return (
			<div>
				<div className="container-tittle">
					<h4>Inicio / Assessable Points Activity - Scenario 2 / Exam</h4>
				</div>

				<div className="content-flex content-flex-evaluation">
					<div className="container-evaluation">
						<div className="header-evaluation">Examen</div>
						<div className="due-date">
							<span className="text-bold">Tiempo:</span> 59,00 min <i className='bx bx-timer' ></i>
						</div>
						{/*  {this.state.exam.map((item, index) => ( */}
						<form id="examForm" >

							<div className="question" >
								<h4>1. ¿Cuál es la capital de Francia?</h4>
								<label>
									<input type="radio" name="question1" value="Madrid"/> Madrid
								</label>
								<label>
									<input type="radio" name="question1" value="París"/> París
								</label>
								<label>
									<input type="radio" name="question1" value="Roma"/> Roma
								</label>
								
							</div>

							<div className="question">
							<h4>2. Selecciona los colores primarios:</h4>
								<label>
									<input type="checkbox" name="question2" value="Rojo"/> Rojo
								</label>
								<label>
									<input type="checkbox" name="question2" value="Verde"/> Verde
								</label>
								<label>
									<input type="checkbox" name="question2" value="Azul"/> Azul
								</label>
								<label>
									<input type="checkbox" name="question2" value="Amarillo"/> Amarillo
								</label>
							</div>

							<div className="question">
								<h4>3. Describe el ciclo del agua:</h4>
								<textarea title="question3" name="question3" rows="4"></textarea>
							</div>

							
						</form>
						 {/* ))} */}
						 <button className="start-button" type="button">Enviar Examen</button>
						<div id="results" className="hidden"></div>
					</div>
				</div>
			</div>

		);
	}


}