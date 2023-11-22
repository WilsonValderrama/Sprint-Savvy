import React, { useState, useEffect, useRef } from "react";
import ReactDOM from "react-dom";

function AppComponent(props) {
  //Estado para campos del formulario
  const [name, setName] = useState("");
  const [color, setColor] = useState("");
  const [description, setDescription] = useState("");
  const [startDate, setStartDate] = useState("");
  const [endDate, setEndDate] = useState("");
  const [status, setStatus] = useState("");
  const [project, setProject] = useState("");
  const [selectedOption, setSelectedOption] = useState("Proyecto");

  //Estado para datos de la tabla
  const [categorias, setCategorias] = React.useState([]);

  //Estados para validar los campos del formulario
  const [nameError, setNameError] = useState("");
  const [statusError, setStatusError] = useState("");
  const [startDateError, setStartDateError] = useState("");
  const [endDateError, setEndDateError] = useState("");
  const [colorError, setColorError] = useState("");
  const [projectError, setProjectError] = useState("");

  const nameInputRef = useRef(null);
  const statusInputRef = useRef(null);
  const startDateInputRef = useRef(null);
  const endDateInputRef = useRef(null);
  const colorInputRef = useRef(null);
  const projectInputRef = useRef(null);

  // Estados para almacenar la información del formulario de categoría
  const [categoriaId, setCategoriaId] = useState(null);
  const [categoriaName, setCategoriaName] = useState("");
  const [categoriaDescription, setCategoriaDescription] = useState("");

  // Función para manejar el cambio del nombre de categoría
  const handleCategoriaNameChange = (event) => {
    setCategoriaName(event.target.value);
  };

  // Función para manejar el cambio de la descripción de categoría
  const handleCategoriaDescriptionChange = (event) => {
    setCategoriaDescription(event.target.value);
  };

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
  const handleColorChange = (event) => {
    setColor(event.target.value);
    setColorError(""); // Restablecer el estado de error a una cadena vacía
  };

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

      if (project === "") {
        setProjectError("Ingresa el Nombre del Proyecto");
        projectInputRef.current.focus();
        isValid = false;
      } else {
        setProjectError("");
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
    if (selectedOption == "Etiqueta") {
      let isValid = true;

      if (name === "") {
        setNameError("Ingresa el Nombre del Proyecto");
        nameInputRef.current.focus();
        isValid = false;
      } else {
        setNameError("");
      }

      if (color === "") {
        setColorError("Debes seleccionar un Color");
        colorInputRef.current.focus();
        isValid = false;
        console.log(color);
      } else {
        setColorError("");
      }
      if (isValid) {
        console.log(color);
        alert("Se ha registrado correctamente una Etiqueta");
      }
    }
  };

  //CRUD Categorías
  // Función para obtener la lista de categorías del servidor
  const fetchCategorias = () => {
    Liferay.Service(
      "/servicio_savvy.categoria/get-all-categorias",
      function (obj) {
        // Verifica si los datos se imprimen correctamente en la consola
        console.log(obj);

        // Actualiza el estado con los datos recibidos
        setCategorias(obj);
      }
    );
  };

  useEffect(() => {
    fetchCategorias();
  }, []);

  // Función para agregar o actualizar una categoría
  const handleCategoriaAdd = () => {
    // Si hay una categoría en edición, actualizamos sus datos
    if (categoriaId) {
      Liferay.Service(
        "/servicio_savvy.categoria/update-categoria",
        {
          categoriaId: categoriaId,
          nombreCategoria: categoriaName,
          descripcion: categoriaDescription,
        },
        function (obj) {
          fetchCategorias(); // Actualizamos la lista de categorías
          clearCategoriaForm(); // Limpia el formulario de categoría
          setNameError(""); // Restablecer el estado de error a una cadena vacía porque ya hay un dato
        }
      );
      // Si no hay una categoría en edición, agregamos una nueva categoría
    } else {
      let isValid = true;

      if (categoriaName === "") {
        setNameError("Ingresa el Nombre de la Categoría");
        nameInputRef.current.focus();
        isValid = false;
      } else {
        setNameError("");
      }

      if (isValid) {
        Liferay.Service(
          "/servicio_savvy.categoria/create-categoria",
          {
            nombreCategoria: categoriaName,
            descripcion: categoriaDescription,
          },
          function (obj) {
            fetchCategorias(); // Actualizamos la lista de categorías
            clearCategoriaForm(); // Limpia el formulario de categoría
          }
        );
      }
    }
  };

  //Función para cancelar la edición de categoría
  const handleCancel = () => {
    setCategoriaId(null);
    clearCategoriaForm();
  };

  // Función para editar una categoría
  const handleEditCategoria = (categoriaId, nombreCategoria, descripcion) => {
    setCategoriaId(categoriaId);
    setCategoriaName(nombreCategoria);
    setCategoriaDescription(descripcion);
    setNameError(""); // Restablecer el estado de error a una cadena vacía porque ya hay un dato
  };

  // Función para eliminar una categoría
  const handleDeleteCategoria = (categoriaId) => {
    Liferay.Service(
      "/servicio_savvy.categoria/delete-categoria",
      {
        categoriaId: categoriaId,
      },
      function (obj) {
        console.log(obj);
        if (obj) {
          fetchCategorias(); // Actualizamos la lista de categorías
          clearCategoriaForm(); // Limpia el formulario de categoría
        }
      }
    );
  };

  // Función para limpiar el formulario de categoría
  const clearCategoriaForm = () => {
    setCategoriaId(null);
    setCategoriaName("");
    setCategoriaDescription("");
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
    setColor("");
    // Restablecer el estado de error a una cadena vacía
    setNameError("");
    setStatusError("");
    setStartDateError("");
    setEndDateError("");
    setProjectError("");
    setColorError("");

    if (event.target.value === "Categoria") {
      fetchCategorias();
    }
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
        return (
          <>
            <input
              name="categoriaName"
              className={`input-crudcsp ${nameError ? "input-crudcsp2" : ""}`}
              type="text"
              placeholder={nameError ? nameError : "Nombre de la Categoría*"}
              required
              value={categoriaName}
              onChange={handleCategoriaNameChange}
              ref={nameInputRef}
            />
            <input
              name="categoriaDescription"
              className="input-crudcsp-textarea"
              type="textarea"
              placeholder="Descripción"
              required
              value={categoriaDescription}
              onChange={handleCategoriaDescriptionChange}
            />
          </>
        );
      case "Etiqueta":
        return (
          <>
            <input
              name="name"
              className={`input-crudcsp ${nameError ? "input-crudcsp2" : ""}`}
              type="text"
              placeholder={nameError ? nameError : "Nombre de Etiqueta*"}
              required
              value={name}
              onChange={handleNameChange}
              ref={nameInputRef}
            />
            <label
              className={`label-crudcsp ${colorError ? "error-label" : ""}`}
            >
              {" "}
              {colorError ? colorError : "Color*"}
            </label>
            <input
              name="color"
              className={`input-crudcsp ${colorError ? "input-crudcsp2" : ""}`}
              type="color"
              placeholder={colorError ? colorError : "Color:"}
              required
              value={color}
              onChange={handleColorChange}
              ref={colorInputRef}
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
                  <option value="Etiqueta">Etiqueta</option>
                </select>
                <p>Ingresa la información solicitada a continuación</p>
              </div>
              <div className="inputs">{renderFields()}</div>
              {selectedOption === "Categoria" && (
                <button
                  className="button-crudcsp"
                  type="button"
                  onClick={handleCategoriaAdd}
                >
                  {categoriaId ? "Actualizar Categoría" : "Agregar"}
                </button>
              )}
              {categoriaId && (
                <button
                  className="button-crudcsp2"
                  type="button"
                  onClick={handleCancel}
                >
                  Cancelar
                </button>
              )}
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
                  {selectedOption === "Etiqueta" && (
                    <>
                      <th>Nombre</th>
                      <th>Color</th>
                    </>
                  )}
                  {/* Resto de las columnas específicas */}
                  <th>Acciones</th>
                </tr>
              </thead>
              {selectedOption === "Categoria" && (
                <tbody>
                  {categorias.map((categoria) => (
                    <tr key={categoria.categoriaId}>
                      <td>{categoria.nombreCategoria}</td>
                      <td>{categoria.descripcion}</td>
                      {/* Otras columnas específicas de categoría si las hay */}
                      <td>
                        <button
                          className="btntblupd"
                          onClick={() =>
                            handleEditCategoria(
                              categoria.categoriaId,
                              categoria.nombreCategoria,
                              categoria.descripcion
                            )
                          }
                        >
                          Editar
                        </button>
                        <button
                          className="btntbldel"
                          onClick={() =>
                            handleDeleteCategoria(categoria.categoriaId)
                          }
                        >
                          Eliminar
                        </button>
                      </td>
                    </tr>
                  ))}
                </tbody>
              )}
            </table>
          </div>
        </div>
      </div>
    </>
  );
}

export default AppComponent;