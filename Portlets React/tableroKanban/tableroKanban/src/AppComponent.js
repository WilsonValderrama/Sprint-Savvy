import React from 'react';

 

export default class CardDisplay extends React.Component {

  render() {

    return (

      <div className="card-container">

        <div className="card">

          <div className="card-header">{Liferay.Language.get('Sin empezar')}</div>

        </div>

        <div className="card">

          <div className="card-header">{Liferay.Language.get('En progreso')}</div>

        </div>

        <div className="card">

          <div className="card-header">{Liferay.Language.get('Lista')}</div>

        </div>

        <div className="card">

          <div className="card-header">{Liferay.Language.get('Archivado')}</div>

        </div>

 

        {/* Agrega cuatro tarjetas nuevas debajo de las existentes */}

        {Array.from({ length: 4 }).map((_, index) => (

          <div className="card" key={`new-card-${index}`}>

            <div className="card-header">Nueva Tarjeta {index + 1}</div>

          </div>

        ))}

 

        {/* Agrega más grupos de cuatro tarjetas nuevas aquí */}

        {Array.from({ length: 4 }).map((_, groupIndex) => (

          <div key={`group-${groupIndex}`}>

            {Array.from({ length: 4 }).map((_, cardIndex) => (

              <div className="card" key={`new-card-${groupIndex}-${cardIndex}`}>

                <div className="card-header">Nueva Tarjeta {groupIndex * 4 + cardIndex + 5}</div>

              </div>

            ))}

          </div>

        ))}

 

        {/* Agrega el botón "Agregar Tarea" */}

        <button className="add-task-button">Agregar Tarea</button>

      </div>

    );

  }

}