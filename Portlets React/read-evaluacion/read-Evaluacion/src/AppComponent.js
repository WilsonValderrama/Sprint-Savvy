import React from 'react';
import ReactDOM from 'react-dom';

export default class extends React.Component {


	constructor(props) {
		super(props);
		// Inicializa el estado con un array vacío para las actividades
		this.state = {
			assessment: []
		};
	}

	componentDidMount() {
		Liferay.Service(
			'/aulavirtual.t_ul_prgevaluacion/get-all-t_-ul_-prg-evaluaciones',  
			{},
			(response) => {
				console.log(response);
				this.setState({
					assessment: response
				});
			}
		);
	}

	render() {
		return (
      <>
	  
		  {this.state.assessment.map((assessment) => (
			<React.Fragment key={assessment.idPreguntas}>
		
	  		
        <div className="container-evaluation">

          
		  	<div className="header-evaluation">Examen</div>
            
            <div className="due-date"><span className="text-bold">Fecha límite:</span> El 3 deseptiembre a las 11:55 PM <i className="bx bx-calendar"></i>
            </div>
          

			<div className="details-item">
				<span className="title text-bold">Detalles</span>
			</div>


        	
              
			  
				<div className="details-item">
                  	<div className="details">
                    	<span className="subtitle">Puntos</span>
                    	<p>{assessment.puntajePreguntas}</p>
                  	</div>
                  	<div className="details">
                    	<span className="subtitle">Preguntas</span>
                    	<p>5</p>
                	</div>
				</div>

                
                  
                  <div className="details-item">
                    <div className="details">
                      <span className="subtitle">Disponibilidad</span>
                      <p> Ago 31, 12:00 AM - Sep 3, 11:55 PM </p>
                    </div>
                    <div className="details">
                      <span className="subtitle">Fecha Final</span>
                      <p> Sep 3, 11:55 PM </p>
                    </div>
                  </div>
                

                <div className="details-item">
                  <div className="details">
                    <span className="subtitle">Duración del examen</span>
                    <p> {assessment.limiteTPreguntas} </p>
                  </div>
                  <div className="details">
                    <span className="subtitle">Intentos Permitidos</span>
                    <p> {assessment.intentoPreguntas}</p>
                  </div>
                </div>

			
              
            
			<div className="details-item">
				<a href="#" className="start-button">Start</a>
			</div>
		  
        </div>
		</React.Fragment>
	))}
      </>
    );
	}	
}