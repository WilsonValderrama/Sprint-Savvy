import React, { useState } from "react";
import ReactDOM from "react-dom";

function AppComponent(props) {
  //Estado para campos del formulario
  const [name, setName] = useState("");
  const [description, setDescription] = useState("");
  const [startDate, setStartDate] = useState("");
  const [endDate, setEndDate] = useState("");
  const [status, setStatus] = useState("");
  const [project, setProject] = useState("");

  //funciónes para manejar el cambio de los campos del formulario
  const handleNameChange = (event) => {
    setName(event.target.value);
  };
  const handleDescriptionChange = (event) => {
    setDescription(event.target.value);
  };
  const handleStartDateChange = (event) => {
    setStartDate(event.target.value);
  };
  const handleEndDateChange = (event) => {
    setEndDate(event.target.value);
  };
  const handleStatusChange = (event) => {
    setStatus(event.target.value);
  };
  const handleProjectChange = (event) => {
    setProject(event.target.value);
  };

  //Función para enviar los datos del formulario
  // Función para enviar los datos del formulario
  const handleSubmit = () => {
    if (selectedOption === "Proyecto") {
      if (name === "" || startDate === "" || endDate === "" || status === "") {
        alert("Por favor, ingrese todos los campos obligatorios");
        console.log("Nombre:", name);
        console.log("Descripción:", description);
        console.log("Fecha de Inicio:", startDate);
        console.log("Fecha de Final:", endDate);
        console.log("Estado:", status);
        console.log("Proyecto:", project);
      } else {
        // Imprimir los datos en la consola
        console.log("Nombre:", name);
        console.log("Descripción:", description);
        console.log("Fecha de Inicio:", startDate);
        console.log("Fecha de Final:", endDate);
        console.log("Estado:", status);
        console.log("Proyecto:", project);

        alert("Se ha registrado correctamente");
      }
    }
    if (selectedOption === "Sprint") {
      if (
        name === "" ||
        startDate === "" ||
        endDate === "" ||
        status === "" ||
        project === ""
      ) {
        alert("Por favor, ingrese todos los campos obligatorios");
        console.log("Nombre:", name);
        console.log("Descripción:", description);
        console.log("Fecha de Inicio:", startDate);
        console.log("Fecha de Final:", endDate);
      } else {
        // Imprimir los datos en la consola
        console.log("Nombre:", name);
        console.log("Descripción:", description);
        console.log("Fecha de Inicio:", startDate);
        console.log("Fecha de Final:", endDate);
        console.log("Estado:", status);
        console.log("Proyecto:", project);
        alert("Se ha registrado correctamente");
      }
    }
    if (selectedOption === "Categoria") {
      if (name === "") {
        alert("Por favor, ingrese todos los campos obligatorios");
        console.log("Nombre:", name);
        console.log("Descripción:", description);
      } else {
        // Imprimir los datos en la consola
        console.log("Nombre:", name);
        console.log("Descripción:", description);
        alert("Se ha registrado correctamente");
      }
    }
  };

  //Estado para campos de la tabla
  const [selectedOption, setSelectedOption] = useState("Proyecto");

  //Función para validar los campos del formulario
  const handleChange = (event) => {
    setSelectedOption(event.target.value);
  };

  const renderFields = () => {
    switch (selectedOption) {
      case "Proyecto":
        return (
          <>
            <input
              name="name"
              className="input-crudcsp"
              type="text"
              placeholder="Nombre del Proyecto*"
              required
              value={name}
              onChange={handleNameChange}
            />
            <input
              name="description"
              className="input-crudcsp-textarea"
              type="textarea"
              placeholder="Descripción"
              value={description}
              onChange={handleDescriptionChange}
            />
            <input
              name="status"
              className="input-crudcsp"
              type="text"
              placeholder="Estado del Proyecto*"
              required
              value={status}
              onChange={handleStatusChange}
            />
            <label className="label-crudcsp">Fecha de Inicio*</label>
            <input
              name="startDate"
              className="input-crudcsp"
              type="date"
              required
              value={startDate}
              onChange={handleStartDateChange}
            />
            <label className="label-crudcsp">Fecha de Final*</label>
            <input
              name="endDate"
              className="input-crudcsp"
              type="date"
              required
              value={endDate}
              onChange={handleEndDateChange}
            />
          </>
        );
      case "Sprint":
        return (
          <>
            <input
              name="name"
              className="input-crudcsp"
              type="text"
              placeholder="Nombre del Sprint*"
              required
              value={name}
              onChange={handleNameChange}
            />
            <input
              name="description"
              className="input-crudcsp-textarea"
              type="textarea"
              placeholder="Descripción"
              value={description}
              onChange={handleDescriptionChange}
            />
            <input
              name="status"
              className="input-crudcsp"
              type="text"
              placeholder="Estado*"
              required
              value={status}
              onChange={handleStatusChange}
            />
            <input
              name="project"
              className="input-crudcsp"
              type="text"
              placeholder="Proyecto*"
              required
              value={project}
              onChange={handleProjectChange}
            />
            <label className="label-crudcsp">Fecha de Inicio*</label>
            <input
              name="startDate"
              className="input-crudcsp"
              type="date"
              placeholder="Fecha de Inicio"
              required
              value={startDate}
              onChange={handleStartDateChange}
            />
            <label className="label-crudcsp">Fecha de Final*</label>
            <input
              name="endDate"
              className="input-crudcsp"
              type="date"
              placeholder="Fecha de Final"
              required
              value={endDate}
              onChange={handleEndDateChange}
            />
          </>
        );
      case "Categoria":
      default:
        return (
          <>
            <input
              name="name"
              className="input-crudcsp"
              type="text"
              placeholder="Nombre de Categoría*"
              required
              value={name}
              onChange={handleNameChange}
            />
            <input
              name="description"
              className="input-crudcsp-textarea"
              type="textarea"
              placeholder="Descripción"
              required
              value={description}
              onChange={handleDescriptionChange}
            />
          </>
        );
    }
  };

  return (
    <>
      <div className="container-center">
        <div className="body">
          <div className="container-form">
            <form className="crudcsp-form" id="crudcsp-form">
              <div className="head">
                <span className="span-crudcsp">¿Qué Deseas Registrar??</span>
                <select
                  name="select-crudcsp"
                  id="input-crudcsp"
                  className="input-crudcsp"
                  value={selectedOption}
                  onChange={handleChange}
                >
                  <option value="Proyecto">Proyecto</option>
                  <option value="Sprint">Sprint</option>
                  <option value="Categoria">Categoría</option>
                </select>
                <p>Ingresa la información solicitada a continuación</p>
              </div>
              <div className="inputs">{renderFields()}</div>
              <button
                className="button-crudcsp"
                type="button"
                onClick={handleSubmit}
              >
                Enviar
              </button>
            </form>
          </div>
        </div>
      </div>
      <div className="container-lg">
        <div className="table-responsive">
          <div className="table-wrapper">
            <div className="table-title">
              <div className="row">
                <div className="col-sm-8">
                  <h2>Detalles Tbl {selectedOption}</h2>
                </div>
                <div className="search">
                  <input placeholder="Filtrar por nombre" type="text" />
                  <button type="submit">Ir</button>
                </div>

                {/* Botón para limpiar los filtros */}
                <button className="limpiarfiltros">
                  <span className="circle1"></span>
                  <span className="circle2"></span>
                  <span className="circle3"></span>
                  <span className="circle4"></span>
                  <span className="circle5"></span>
                  <span className="text">Limpiar</span>
                </button>
              </div>
            </div>

            {/* Tabla que muestra los detalles de los personajes */}
            <table className="table table-striped table-hover custom-table">
              <thead>
                <tr>
                  <th>Nombre</th>
                  <th>Descripción</th>
                  {selectedOption === "Proyecto" && (
                    <>
                      <th>Fecha de Inicio</th>
                      <th>Fecha de Final</th>
                    </>
                  )}
                  {selectedOption === "Sprint" && (
                    <>
                      <th>Fecha de Inicio</th>
                      <th>Fecha de Final</th>
                      <th>Estado</th>
                      <th>Proyecto</th>
                    </>
                  )}
                  <th>Acciones</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td></td>
                  <td></td>
                  {selectedOption === "Proyecto" && <td></td>}
                  {selectedOption === "Proyecto" && <td></td>}
                  {selectedOption === "Sprint" && <td></td>}
                  {selectedOption === "Sprint" && <td></td>}
                  {selectedOption === "Sprint" && <td></td>}
                  {selectedOption === "Sprint" && <td></td>}
                  <td>
                    <button className="btntblupd">Editar</button>
                    <button className="btntbldel">Eliminar</button>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </>
  );
}

export default AppComponent;
