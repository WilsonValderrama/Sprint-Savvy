import React, { useState, useEffect, useRef } from "react";
import ReactDOM from "react-dom";

function AppComponent(props) {
  //Estado para campos del formulario
  const [name, setName] = useState("");
  const [description, setDescription] = useState("");
  const [startDate, setStartDate] = useState("");
  const [endDate, setEndDate] = useState("");
  const [status, setStatus] = useState("");
  const [project, setProject] = useState("");
  const [data, setData] = useState([]);
  const [selectedOption, setSelectedOption] = useState("Proyecto");

  //Estados para validar los campos del formulario
  const [nameError, setNameError] = useState("");
  const [statusError, setStatusError] = useState("");
  const [startDateError, setStartDateError] = useState("");
  const [endDateError, setEndDateError] = useState("");
  //const [projectError, setProjectError] = useState("");

  const nameInputRef = useRef(null);
  const statusInputRef = useRef(null);
  const startDateInputRef = useRef(null);
  const endDateInputRef = useRef(null);
  //const projectInputRef = useRef(null);

  //funciónes para manejar el cambio de los campos del formulario
  const handleNameChange = (event) => {
    setName(event.target.value);
    setNameError(""); // Restablecer el estado de error a una cadena vacía
  };
  const handleDescriptionChange = (event) => {
    setDescription(event.target.value);
  };
  const handleStatusChange = (event) => {
    setStatus(event.target.value);
    setStatusError(""); // Restablecer el estado de error a una cadena vacía
  };
  const handleStartDateChange = (event) => {
    setStartDate(event.target.value);
    setStartDateError(""); // Restablecer el estado de error a una cadena vacía
  };
  const handleEndDateChange = (event) => {
    setEndDate(event.target.value);
    setEndDateError(""); // Restablecer el estado de error a una cadena vacía
  };

  const handleProjectChange = (event) => {
    setProject(event.target.value);
  };

  // Función para cargar los datos de la API según el valor de selectedOption
  const loadData = async () => {
    try {
      let apiUrl = "";
      switch (selectedOption) {
        case "Proyecto":
          apiUrl = "http://localhost:3000/proyectos";
          break;
        case "Sprint":
          apiUrl = "http://localhost:3000/sprints";
          break;
        case "Categoria":
          apiUrl = "http://localhost:3000/categorias";
          break;
        default:
          apiUrl = "";
          break;
      }

      if (apiUrl) {
        const response = await fetch(apiUrl);
        const jsonData = await response.json();
        setData(jsonData);
        console.log(jsonData);
      }
    } catch (error) {
      console.error("Error fetching data:", error);
    }
  };

  useEffect(() => {
    loadData();
  }, [selectedOption]);

  //Función para enviar los datos del formulario y aplicar validación de campos
  const handleSubmit = () => {
    if (selectedOption === "Proyecto") {
      let isValid = true;

      if (name === "") {
        setNameError("Ingresa el Nombre del Proyecto");
        nameInputRef.current.focus();
        isValid = false;
      } else {
        setNameError("");
      }

      if (status === "SeleccionaStatus" || status === "") {
        setStatusError("Selecciona un Estado válido");
        statusInputRef.current.focus();
        isValid = false;
      } else {
        setStatusError("");
      }

      if (startDate === "") {
        setStartDateError("Ingresa una Fecha de Inicio");
        startDateInputRef.current.focus();
        isValid = false;
      } else {
        setStartDateError("");
      }

      if (endDate === "") {
        setEndDateError("Ingresa una Fecha de Finalización");
        endDateInputRef.current.focus();
        isValid = false;
      } else {
        setEndDateError("");
      }
      if (isValid) {
        alert("Se ha registrado correctamente un Proyecto");
      }
    }
    if (selectedOption === "Sprint") {
      let isValid = true;

      if (name === "") {
        setNameError("Ingresa el Nombre del Sprint");
        nameInputRef.current.focus();
        isValid = false;
      } else {
        setNameError("");
      }

      if (status === "SeleccionaStatus" || status === "") {
        setStatusError("Selecciona un Estado válido");
        statusInputRef.current.focus();
        isValid = false;
      } else {
        setStatusError("");
      }

      if (startDate === "") {
        setStartDateError("Ingresa una Fecha de Inicio");
        startDateInputRef.current.focus();
        isValid = false;
      } else {
        setStartDateError("");
      }

      if (endDate === "") {
        setEndDateError("Ingresa una Fecha de Finalización");
        endDateInputRef.current.focus();
        isValid = false;
      } else {
        setEndDateError("");
      }
      if (isValid) {
        alert("Se ha registrado correctamente un Sprint");
      }
    }
    if (selectedOption === "Categoria") {
      let isValid = true;

      if (name === "") {
        setNameError("Ingresa el Nombre de la Categoría");
        nameInputRef.current.focus();
        isValid = false;
      } else {
        setNameError("");
      }

      if (isValid) {
        alert("Se ha registrado correctamente una Categoría");
      }
    }
  };

  //Función para manejar el cambio del selectfather del formulario
  const handleChange = (event) => {
    setSelectedOption(event.target.value);
    // Restablecer el estado de los campos del formulario
    setName("");
    setDescription("");
    setStartDate("");
    setEndDate("");
    setStatus("");
    setProject("");
    // Restablecer el estado de error a una cadena vacía
    setNameError("");
    setStatusError("");
    setStartDateError("");
    setEndDateError("");
    setProjectError("");
  };

  const renderFields = () => {
    switch (selectedOption) {
      case "Proyecto":
        return (
          <>
            <input
              name="name"
              className={`input-crudcsp ${nameError ? "input-crudcsp2" : ""}`}
              type="text"
              placeholder={nameError ? nameError : "Nombre del Proyecto*"}
              required
              value={name}
              onChange={handleNameChange}
              ref={nameInputRef}
            />

            <input
              name="description"
              className="input-crudcsp-textarea"
              type="textarea"
              placeholder="Descripción"
              value={description}
              onChange={handleDescriptionChange}
            />
            <select
              name="status"
              className={`input-crudcsp ${statusError ? "input-crudcsp3" : ""}`}
              required
              value={status}
              onChange={handleStatusChange}
              ref={statusInputRef}
            >
              <option value="SeleccionaStatus">
                {statusError ? statusError : "Selecciona un Estado... *"}
              </option>
              <option value="Pendiente">Pendiente</option>
              <option value="En progreso">En progreso</option>
              <option value="Realizado">Realizado</option>
            </select>
            <label
              className={`label-crudcsp ${startDateError ? "error-label" : ""}`}
            >
              {startDateError ? startDateError : "Fecha de Inicio*"}
            </label>
            <input
              name="startDate"
              className={`input-crudcsp ${
                startDateError ? "input-crudcsp3" : ""
              }`}
              type="date"
              required
              value={startDate}
              onChange={handleStartDateChange}
              ref={startDateInputRef}
            />
            <label
              className={`label-crudcsp ${endDateError ? "error-label" : ""}`}
            >
              {endDateError ? endDateError : "Fecha de Final*"}
            </label>
            <input
              name="endDate"
              className={`input-crudcsp ${
                endDateError ? "input-crudcsp3" : ""
              }`}
              type="date"
              required
              value={endDate}
              onChange={handleEndDateChange}
              ref={endDateInputRef}
            />
          </>
        );
      case "Sprint":
        return (
          <>
            <input
              name="name"
              className={`input-crudcsp ${nameError ? "input-crudcsp2" : ""}`}
              type="text"
              placeholder={nameError ? nameError : "Nombre del Sprint*"}
              required
              value={name}
              onChange={handleNameChange}
              ref={nameInputRef}
            />
            <input
              name="description"
              className="input-crudcsp-textarea"
              type="textarea"
              placeholder="Descripción"
              value={description}
              onChange={handleDescriptionChange}
            />
            <select
              name="status"
              className={`input-crudcsp ${statusError ? "input-crudcsp3" : ""}`}
              required
              value={status}
              onChange={handleStatusChange}
              ref={statusInputRef}
            >
              <option value="SeleccionaStatus">
                {statusError ? statusError : "Selecciona un Estado... *"}
              </option>
              <option value="Pendiente">Pendiente</option>
              <option value="En progreso">En progreso</option>
              <option value="Realizado">Realizado</option>
            </select>
            <input
              name="project"
              className="input-crudcsp"
              type="text"
              placeholder="Proyecto*"
              required
              value={project}
              onChange={handleProjectChange}
            />
            <label
              className={`label-crudcsp ${startDateError ? "error-label" : ""}`}
            >
              {startDateError ? startDateError : "Fecha de Inicio*"}
            </label>
            <input
              name="startDate"
              className={`input-crudcsp ${
                startDateError ? "input-crudcsp3" : ""
              }`}
              type="date"
              required
              value={startDate}
              onChange={handleStartDateChange}
              ref={startDateInputRef}
            />
            <label
              className={`label-crudcsp ${endDateError ? "error-label" : ""}`}
            >
              {endDateError ? endDateError : "Fecha de Final*"}
            </label>
            <input
              name="endDate"
              className={`input-crudcsp ${
                endDateError ? "input-crudcsp3" : ""
              }`}
              type="date"
              required
              value={endDate}
              onChange={handleEndDateChange}
              ref={endDateInputRef}
            />
          </>
        );
      case "Categoria":
      default:
        return (
          <>
            <input
              name="name"
              className={`input-crudcsp ${nameError ? "input-crudcsp2" : ""}`}
              type="text"
              placeholder={nameError ? nameError : "Nombre de la Categoría*"}
              required
              value={name}
              onChange={handleNameChange}
              ref={nameInputRef}
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
                  id="fatheselect-crudcsp"
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

            {/* Tabla que muestra los detalles de los datos cargados */}
            <table className="table table-striped table-hover custom-table">
              <thead>
                <tr>
                  {selectedOption === "Proyecto" && (
                    <>
                      <th>Nombre</th>
                      <th>Descripción</th>
                      <th>Fecha de Inicio</th>
                      <th>Fecha de Final</th>
                      <th>Estado</th>
                    </>
                  )}
                  {selectedOption === "Sprint" && (
                    <>
                      <th>Nombre</th>
                      <th>Descripción</th>
                      <th>Fecha de Inicio</th>
                      <th>Fecha de Final</th>
                      <th>Estado</th>
                      <th>Proyecto</th>
                    </>
                  )}
                  {selectedOption === "Categoria" && (
                    <>
                      <th>Nombre</th>
                      <th>Descripción</th>
                    </>
                  )}
                  {/* Resto de las columnas específicas */}
                  <th>Acciones</th>
                </tr>
              </thead>
              <tbody>
                {data.map((item) => (
                  <tr
                    key={
                      item.Id_Proyecto || item.Id_Sprint || item.Id_Categoria
                    }
                  >
                    {selectedOption === "Proyecto" && (
                      <>
                        <td>{item.Nombre_Proyecto}</td>
                        <td>{item.Descripcion}</td>
                        <td>{item.Fecha_Inicio}</td>
                        <td>{item.Fecha_Final}</td>
                        <td>{item.Estado}</td>
                      </>
                    )}
                    {selectedOption === "Sprint" && (
                      <>
                        <td>{item.Nombre_Sprint}</td>
                        <td>{item.Descripcion}</td>
                        <td>{item.Fecha_Inicio}</td>
                        <td>{item.Fecha_Final}</td>
                        <td>{item.Estado}</td>
                        <td>
                          {item.Proyecto && item.Proyecto.Nombre_Proyecto}
                        </td>
                      </>
                    )}
                    {selectedOption === "Categoria" && (
                      <>
                        <td>{item.Nombre_Categoria}</td>
                        <td>{item.Descripcion}</td>
                      </>
                    )}
                    {/* Resto de las columnas específicas */}
                    <td>
                      <button className="btntblupd">Editar</button>
                      <button className="btntbldel">Eliminar</button>
                    </td>
                  </tr>
                ))}
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </>
  );
}

export default AppComponent;
