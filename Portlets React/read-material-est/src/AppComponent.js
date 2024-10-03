import React from 'react';
import ReactDOM from 'react-dom';

export default class extends React.Component {

	constructor(props) {
		super(props);
		// Inicializa el estado con un array vacío para las actividades
		this.state = {
			material: []
		};
	}

	componentDidMount() {
		Liferay.Service(
			'/aulavirtual.t_ul_materialestud/get-all-t_-ul_-material-estud',  
			{},
			(response) => {
				console.log(response);
				this.setState({
					material: response
				});
			}
		);
	}


	render() {
		return (
            <>

<div className="content-flex">
        <div className="container-activity">
          <div className="header-activity">
            <button className="toggle-button text-bold">
              Corte 1 04/06/2024 - 04/06/2024 <i className='bx bx-chevron-down'></i>
            </button>
          </div>

          {/* Iteramos sobre los materiales obtenidos del servicio */}
          <div className="task-list">
            {this.state.material.map((item, index) => (
              <div className="task-item" key={index}>
                <div className="task-title">
                  <i className='bx bx-book-reader'></i>  {/* Ícono de material de estudio */}
                  <p className="text-activity">
                    <span className="text-bold">{item.tituloMaterial}</span>
                    <br />
                    <span className="text-bold">{item.descripMaterial}</span>
                    
                  </p>
                </div>
              </div>
            ))}
          </div>
        </div>
      </div>

				
			</>
		);
	}	
}