import React, { useState, useEffect, useRef } from "react";
import ReactDOM from "react-dom";

function AppComponent(props) {

  const [selectedOption, setSelectedOption] = useState("Proyecto");
  const [filteredProjects, setFilteredProjects] = useState([]);

  //Estados para validar los campos del formulario
  const [nameError, setNameError] = useState("");
  const [statusError, setStatusError] = useState("");
  const [startDateError, setStartDateError] = useState("");
  const [endDateError, setEndDateError] = useState("");
  const [colorError, setColorError] = useState("");
  const [SprintProjectError, setSprintProjetError] = useState("");

  //Referencias para los campos del formulario
  const nameInputRef = useRef(null);
  const statusInputRef = useRef(null);
  const startDateInputRef = useRef(null);
  const endDateInputRef = useRef(null);
  const colorInputRef = useRef(null);
  const projectInputRef = useRef(null);

  //Estado para datos de la tabla
  const [categorias, setCategorias] = React.useState([]);
  const [etiquetas, setEtiquetas] = React.useState([]);
  const [proyectos, setProyectos] = React.useState([]);
  const [sprints, setSprints] = React.useState([]);


  //Estados para almacenar la información del formulario de proyecto
  const [proyectoId, setProyectoId] = useState(null);
  const [proyectoName, setProyectoName] = useState("");
  const [proyectoDescription, setProyectoDescription] = useState("");
  const [proyectoStartDate, setProyectoStartDate] = useState("");
  const [proyectoEndDate, setProyectoEndDate] = useState("");
  const [proyectoStatus, setProyectoStatus] = useState("");

  // Función para manejar el cambio del nombre de proyecto
  const handleProjectNameChange = (event) => {
    setProyectoName(event.target.value);
    setNameError(""); // Restablecer el estado de error a una cadena vacía
  }

  // Función para manejar el cambio de la descripción de proyecto
  const handleProjectDescriptionChange = (event) => {
    setProyectoDescription(event.target.value);
  }

  // Función para manejar el cambio de la fecha de inicio de proyecto
  const handleProjectStartDateChange = (event) => {
    setProyectoStartDate(event.target.value);
    setStartDateError(""); // Restablecer el estado de error a una cadena vacía
  }

  // Función para manejar el cambio de la fecha de finalización de proyecto
  const handleProjectEndDateChange = (event) => {
    setProyectoEndDate(event.target.value);
    setEndDateError(""); // Restablecer el estado de error a una cadena vacía
  }

  // Función para manejar el cambio del estado de proyecto
  const handleProjectStatusChange = (event) => {
    setProyectoStatus(event.target.value);
    setStatusError(""); // Restablecer el estado de error a una cadena vacía
  }

  //Estados para almacenar la información del formulario de sprint
  const [sprintId, setSprintId] = useState(null);
  const [sprintName, setSprintName] = useState("");
  const [sprintDescription, setDescription] = useState("");
  const [sprintStartDate, setStartDate] = useState("");
  const [sprintEndDate, setEndDate] = useState("");
  const [sprintStatus, setStatus] = useState("");
  const [sprintProject, setSprintProject] = useState("");

  // Función para manejar el cambio del nombre de sprint
  const handleSprintNameChange = (event) => {
    setSprintName(event.target.value);
    setNameError(""); // Restablecer el estado de error a una cadena vacía
  };

  // Función para manejar el cambio de la descripción de sprint
  const handleSprintDescriptionChange = (event) => {
    setDescription(event.target.value);
  };

  // Función para manejar el cambio de la fecha de inicio de sprint
  const handleSprintStartDateChange = (event) => {
    setStartDate(event.target.value);
    setStartDateError(""); // Restablecer el estado de error a una cadena vacía
  };

  // Función para manejar el cambio de la fecha de finalización de sprint
  const handleSprintEndDateChange = (event) => {
    setEndDate(event.target.value);
    setEndDateError(""); // Restablecer el estado de error a una cadena vacía
  };

  // Función para manejar el cambio del estado de sprint
  const handleSprintStatusChange = (event) => {
    setStatus(event.target.value);
    setStatusError(""); // Restablecer el estado de error a una cadena vacía
  };

  // Función para manejar el cambio del proyecto de sprint
  const handleSprintProjectChange = (event) => {
    const value = event.target.value;
    setSprintProject(value);
    if (value) {
      const filtered = proyectos.filter(proyecto =>
        proyecto.tituloProyecto.toLowerCase().includes(value.toLowerCase())
      );
      setFilteredProjects(filtered);
    } else {
      setFilteredProjects([]);
    }
  };

  // Manejar la tecla Tab para seleccionar la primera sugerencia
  const handleKeyDown = (event) => {
    if (event.key === 'Tab' && filteredProjects.length > 0) {
      selectProject(filteredProjects[0].tituloProyecto);
    }
  };

  // Función para actualizar el proyecto y el placeholder
  const selectProject = (tituloProyecto) => {
    setSprintProject(tituloProyecto);
    setFilteredProjects([]);
  };

  // Estados para almacenar la información del formulario de categoría
  const [categoriaId, setCategoriaId] = useState(null);
  const [categoriaName, setCategoriaName] = useState("");
  const [categoriaDescription, setCategoriaDescription] = useState("");

  // Función para manejar el cambio del nombre de categoría
  const handleCategoriaNameChange = (event) => {
    setCategoriaName(event.target.value);
    setNameError(""); // Restablecer el estado de error a una cadena vacía
  };

  // Función para manejar el cambio de la descripción de categoría
  const handleCategoriaDescriptionChange = (event) => {
    setCategoriaDescription(event.target.value);
  };

  // Estados para almacenar la información del formulario de etiqueta
  const [etiquetaId, setEtiquetaId] = useState(null);
  const [tituloEtiqueta, setituloEtiqueta] = useState("");
  const [color, setColor] = useState("");

  // Función para manejar el cambio del titulo de etiqueta
  const colorNameToHex = {
    "Rojo": "#FF1E1E",
    "Verde": "#1E9E1E",
    "Azul": "#c6d8e2",
    "Amarillo": "#FFFF1E",
    "Rosa": "#FFDEE9",
    "Negro": "#1E1E1E",
    "Blanco": "#FFFFFF",
    "Morado": "#9E1E9E",
    "Naranja": "#FFC31E",
    "Gris": "#9E9E9E",
    "Turquesa": "#5EFEEE",
    "Marrón": "#C34848",
    "Violeta": "#A849FF",
    "Oro": "#FFF51E",
    "Plata": "#DEDEDE",

    "rojo": "#FF1E1E",
    "verde": "#1E9E1E",
    "azul": "#c6d8e2",
    "amarillo": "#FFFF1E",
    "rosa": "#FFDEE9",
    "negro": "#1E1E1E",
    "blanco": "#FFFFFF",
    "morado": "#9E1E9E",
    "naranja": "#FFC31E",
    "gris": "#9E9E9E",
    "turquesa": "#5EFEEE",
    "marrón": "#C34848",
    "violeta": "#A849FF",
    "oro": "#FFF51E",
    "plata": "#DEDEDE",

  };


  const handleTituloEtiquetaChange = (event) => {
    const colorName = event.target.value.toLowerCase();
    setituloEtiqueta(colorName);

    // Establece el color basado en el nombre ingresado si está en el mapeo
    if (colorNameToHex[colorName]) {
      setColor(colorNameToHex[colorName]);
    } else {
      setColor("#000000"); // Valor por defecto si el color no se encuentra
    }

    setNameError(""); // Restablecer el estado de error a una cadena vacía
  };


  const handleColorChange = (event) => {
    const selectedColor = event.target.value;
    setColor(selectedColor);
    setColorError(""); // Restablecer el estado de error a una cadena vacía

    // Actualiza el título de la etiqueta con el nombre del color, si está disponible
    const colorName = colorNames[selectedColor];
    if (colorName) {
      setituloEtiqueta(colorName);
    }
  };


  // Función para limpiar el formulario
  const clearForm = () => {
    // Restablecer el estado de los campos de categoría
    setCategoriaId(null);
    setCategoriaName("");
    setCategoriaDescription("");
    // Restablecer el estado de los campos de etiqueta
    setEtiquetaId(null);
    setituloEtiqueta("");
    setColor("#000000");
    // Restablecer el estado de los campos de proyecto
    setProyectoId(null);
    setProyectoName("");
    setProyectoDescription("");
    setProyectoStartDate("");
    setProyectoEndDate("");
    setProyectoStatus("");
    // Restablecer el estado de los campos de spri
    setSprintId(null);
    setSprintName("");
    setDescription("");
    setStartDate("");
    setEndDate("");
    setStatus("");
    setSprintProject("");
    // Restablecer el estado de error a una cadena vacía
    clearErrors();
  };

  // Funcion para restablecer el estado de error a una cadena vacía
  const clearErrors = () => {
    setNameError("");
    setStatusError("");
    setStartDateError("");
    setEndDateError("");
    setColorError("");
    setSprintProjetError("");
  };


  //CRUD Categorías
  // Función para obtener la lista de categorías del servidor (READ)
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

  // Función para agregar o actualizar una categoría  (CREATE o UPDATE)
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
          clearForm(); // Limpia el formulario de categoría
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
            clearForm(); // Limpia el formulario de categoría
          }
        );
      }
    }
  };

  // Función para editar una categoría (UPDATE)
  const handleEditCategoria = (categoriaId, nombreCategoria, descripcion) => {
    setCategoriaId(categoriaId);
    setCategoriaName(nombreCategoria);
    setCategoriaDescription(descripcion);
    setNameError(""); // Restablecer el estado de error a una cadena vacía porque ya hay un dato
  };

  // Función para eliminar una categoría (DELETE)
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
          clearForm(); // Limpia el formulario de categoría
        }
      }
    );
  };

  //CRUD Etiquetas
  // Función para obtener la lista de etiquetas del servidor (READ)
  const fetchEtiquetas = () => {
    Liferay.Service("/servicio_savvy.etiqueta/get-all-etiqueta",
      function (obj) {
        // Verifica si los datos se imprimen correctamente en la consola
        console.log(obj);
        // Actualiza el estado con los datos recibidos
        setEtiquetas(obj);
      });
  }

  const handleEtiquetaAdd = () => {
    if (etiquetaId) {
      Liferay.Service(
        "/servicio_savvy.etiqueta/actualizar-etiqueta",
        {
          etiquetaId: etiquetaId,
          tituloEtiqueta: tituloEtiqueta,
        },
        function (obj) {
          fetchEtiquetas(); // Actualizamos la lista de etiquetas
          clearForm(); // Limpia el formulario de etiqueta
        }
      );
    } else {
      let isValid = true;
      if (tituloEtiqueta === "") {
        setNameError("Ingresa el Nombre de la Etiqueta");
        nameInputRef.current.focus();
        isValid = false;
      } else {
        setNameError("");
      }
      if (isValid) {
        Liferay.Service(
          "/servicio_savvy.etiqueta/crear-etiqueta",
          {
            tituloEtiqueta: tituloEtiqueta,
          },
          function (obj) {
            fetchEtiquetas(); // Actualizamos la lista de etiquetas
            clearForm(); // Limpia el formulario de etiqueta
          }
        );
      }
    }
  }

  // Función para editar una etiqueta (UPDATE)
  const handleEditEtiqueta = (etiquetaId, tituloEtiqueta) => {
    setEtiquetaId(etiquetaId);
    setituloEtiqueta(tituloEtiqueta);
    setNameError(""); // Restablecer el estado de error a una cadena vacía porque ya hay un dato
  };

  // Función para eliminar una etiqueta (DELETE)
  const handleDeleteEtiqueta = (etiquetaId) => {
    Liferay.Service(
      "/servicio_savvy.etiqueta/eliminar-etiqueta",
      {
        etiquetaId: etiquetaId,
      },
      function (obj) {
        console.log(obj);
        if (obj) {
          fetchEtiquetas(); // Actualizamos la lista de etiquetas
          clearForm(); // Limpia el formulario de etiqueta
        }
      }
    );
  };

  //CRUD Proyectos
  // Función para obtener la lista de proyectos del servidor
  const fetchProyectos = () => {
    Liferay.Service("/servicio_savvy.proyecto/get-all-proyecto",
      function (obj) {
        // Verifica si los datos se imprimen correctamente en la consola
        console.log(obj);
        // Actualiza el estado con los datos recibidos
        setProyectos(obj);
      });
  }

  const handleProyectoAdd = () => {
    if (proyectoId) {
      Liferay.Service(
        "/servicio_savvy.proyecto/actualizar-proyecto",
        {
          proyectoId: proyectoId,
          tituloProyecto: proyectoName,
          descripcion: proyectoDescription,
          fechaInicio: proyectoStartDate,
          fechaFinal: proyectoEndDate,
          estado: proyectoStatus,
        },
        function (obj) {
          fetchProyectos(); // Actualizamos la lista de proyectos
          clearForm(); // Limpia el formulario de proyecto
        }
      );
    } else {
      let isValid = true;
      if (proyectoName === "") {
        setNameError("Ingresa el Nombre del Proyecto");
        nameInputRef.current.focus();
        isValid = false;
      } else {
        setNameError("");
      }
      if (proyectoStatus === "SeleccionaStatus" || proyectoStatus === "") {
        setStatusError("Selecciona un Estado válido");
        statusInputRef.current.focus();
        isValid = false;
      } else {
        setStatusError("");
      }
      if (proyectoStartDate === "") {
        setStartDateError("Ingresa una Fecha de Inicio");
        startDateInputRef.current.focus();
        isValid = false;
      } else {
        setStartDateError("");
      }
      if (proyectoEndDate === "") {
        setEndDateError("Ingresa una Fecha de Finalización");
        endDateInputRef.current.focus();
        isValid = false;
      } else {
        setEndDateError("");
      }
      if (isValid) {
        Liferay.Service(
          "/servicio_savvy.proyecto/crear-proyecto",
          {
            tituloProyecto: proyectoName,
            descripcion: proyectoDescription,
            fechaInicio: proyectoStartDate,
            fechaFinal: proyectoEndDate,
            estado: proyectoStatus,
          },
          function (obj) {
            fetchProyectos(); // Actualizamos la lista de proyectos
            clearForm(); // Limpia el formulario de proyecto
          }
        );
      }
    }
  }

  // Función para editar un proyecto (UPDATE)
  const handleEditProyecto = (proyectoId, proyectoName, proyectoDescription, proyectoStartDate, proyectoEndDate, proyectoStatus) => {
    setProyectoId(proyectoId);
    setProyectoName(proyectoName);
    setProyectoDescription(proyectoDescription);
    setProyectoStartDate(proyectoStartDate);
    setProyectoEndDate(proyectoEndDate);
    setProyectoStatus(proyectoStatus);
  }

  // Función para eliminar un proyecto (DELETE)
  const handleDeleteProyecto = (proyectoId) => {
    Liferay.Service(
      "/servicio_savvy.proyecto/eliminar-proyecto",
      {
        proyectoId: proyectoId,
      },
      function (obj) {
        console.log(obj);
        if (obj) {
          fetchProyectos(); // Actualizamos la lista de proyectos
          clearForm(); // Limpia el formulario de proyecto
        }
      }
    );
  };

  const handleSprintAdd = () => {
    if (sprintId) {
      Liferay.Service(
        "/servicio_savvy.sprint/update-sprint",
        {
          sprintId: sprintId,
          tituloSprint: sprintName,
          fechaInicio: sprintStartDate,
          fechaFinal: sprintEndDate,
          descripcion: sprintDescription,
          estado: sprintStatus,
          proyecto: sprintProject,
        },
        function (obj) {
          fetchSprints(); // Actualizamos la lista de sprints
          clearForm(); // Limpia el formulario de sprint
        }
      );
    } else {
      let isValid = true;
      if (sprintName === "") {
        setNameError("Ingresa el Nombre del Sprint");
        nameInputRef.current.focus();
        isValid = false;
      } else {
        setNameError("");
      }
      if (sprintStatus === "SeleccionaStatus" || sprintStatus === "") {
        setStatusError("Selecciona un Estado válido");
        statusInputRef.current.focus();
        isValid = false;
      } else {
        setStatusError("");
      }
      if (sprintProject === "") {
        setSprintProjetError("Selecciona un proyecto válido");
        projectInputRef.current.focus();
        isValid = false;
      } else {
        setSprintProjetError("");
      }
      if (sprintStartDate === "") {
        setStartDateError("Ingresa una Fecha de Inicio");
        startDateInputRef.current.focus();
        isValid = false;
      } else {
        setStartDateError("");
      }
      if (sprintStartDate === "") {
        setEndDateError("Ingresa una Fecha de Finalización");
        endDateInputRef.current.focus();
        isValid = false;
      } else {
        setEndDateError("");
      }
      if (isValid) {
        Liferay.Service(
          "/servicio_savvy.sprint/create-sprint",
          {
            tituloSprint: sprintName,
            fechaInicio: sprintStartDate,
            fechaFinal: sprintEndDate,
            descripcion: sprintDescription,
            estado: sprintStatus,
            proyecto: sprintProject,
          },
          function (obj) {
            fetchSprints(); // Actualizamos la lista de sprints
            clearForm(); // Limpia el formulario de sprint
          }
        );
      }
    }
  }

  // Función para editar un sprint (UPDATE)
  const handleEditSprint = (sprintId, sprintName, sprintDescription, sprintStartDate, sprintEndDate, sprintStatus, sprintProject) => {
    setSprintId(sprintId);
    setSprintName(sprintName);
    setDescription(sprintDescription);
    setStartDate(sprintStartDate);
    setEndDate(sprintEndDate);
    setStatus(sprintStatus);
    setSprintProject(sprintProject);
  }

  // Función para eliminar un sprint (DELETE)
  const handleDeleteSprint = (sprintId) => {
    Liferay.Service(
      "/servicio_savvy.sprint/delete-sprint",
      {
        sprintId: sprintId,
      },
      function (obj) {
        console.log(obj);
        if (obj) {
          fetchSprints(); // Actualizamos la lista de sprints
          clearForm(); // Limpia el formulario de sprint
        }
      }
    );
  };

  //CRUD Sprints
  // Función para obtener la lista de sprints del servidor
  const fetchSprints = () => {
    Liferay.Service("/servicio_savvy.sprint/get-all-sprints",
      function (obj) {
        // Verifica si los datos se imprimen correctamente en la consola
        console.log(obj);
        // Actualiza el estado con los datos recibidos
        setSprints(obj);
      });
  }

  useEffect(() => {
    fetchCategorias();
    fetchEtiquetas();
    fetchProyectos();
    fetchSprints();
  }, []);

  //Función para manejar el cambio del selectfather del formulario
  const handleChange = (event) => {
    setSelectedOption(event.target.value);
    // Restablecer el estado de los campos del formulario
    clearForm();
    // Restablecer el estado de error a una cadena vacía
    clearErrors();
    setSprintProjetError("");

    if (event.target.value === "Categoria") {
      fetchCategorias();
    }
    if (event.target.value === "Etiqueta") {
      fetchEtiquetas();
    }
    if (event.target.value === "Proyecto") {
      fetchProyectos();
    }
    if (event.target.value === "Sprint") {
      fetchSprints();
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
              value={proyectoName}
              onChange={handleProjectNameChange}
              ref={nameInputRef}
            />
            <input
              name="description"
              className="input-crudcsp-textarea"
              type="textarea"
              placeholder="Descripción"
              value={proyectoDescription}
              onChange={handleProjectDescriptionChange}
            />
            <select
              name="status"
              className={`input-crudcsp ${statusError ? "input-crudcsp3" : ""}`}
              required
              value={proyectoStatus}
              onChange={handleProjectStatusChange}
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
              className={`input-crudcsp ${startDateError ? "input-crudcsp3" : ""
                }`}
              type="date"
              required
              value={proyectoStartDate}
              onChange={handleProjectStartDateChange}
              ref={startDateInputRef}
            />
            <label
              className={`label-crudcsp ${endDateError ? "error-label" : ""}`}
            >
              {endDateError ? endDateError : "Fecha de Final*"}
            </label>
            <input
              name="endDate"
              className={`input-crudcsp ${endDateError ? "input-crudcsp3" : ""
                }`}
              type="date"
              required
              value={proyectoEndDate}
              onChange={handleProjectEndDateChange}
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
              value={sprintName}
              onChange={handleSprintNameChange}
              ref={nameInputRef}
            />
            <input
              name="description"
              className="input-crudcsp-textarea"
              type="textarea"
              placeholder="Descripción"
              value={sprintDescription}
              onChange={handleSprintDescriptionChange}
            />
            <select
              name="status"
              className={`input-crudcsp ${statusError ? "input-crudcsp3" : ""}`}
              required
              value={sprintStatus}
              onChange={handleSprintStatusChange}
              ref={statusInputRef}
            >
              <option value="SeleccionaStatus">
                {statusError ? statusError : "Selecciona un Estado... *"}
              </option>
              <option value="Pendiente">Pendiente</option>
              <option value="En progreso">En progreso</option>
              <option value="Realizado">Realizado</option>
            </select>
            <select
              name="project"
              className={`input-crudcsp ${SprintProjectError ? "input-crudcsp3" : ""}`}
              required
              value={sprintProject}
              onChange={handleSprintProjectChange}
              ref={projectInputRef}
            >
              <option value="">Selecciona un Proyecto...</option>
              {proyectos.map((proyecto, index) => (
                <option key={index} value={proyecto.tituloProyecto}>
                  {proyecto.tituloProyecto}
                </option>
              ))}
            </select>
            <datalist id="projectSuggestions">
              {filteredProjects.map((proyecto, index) => (
                <option key={index} value={proyecto.tituloProyecto} />
              ))}
            </datalist>
            <label
              className={`label-crudcsp ${startDateError ? "error-label" : ""}`}
            >
              {startDateError ? startDateError : "Fecha de Inicio*"}
            </label>
            <input
              name="startDate"
              className={`input-crudcsp ${startDateError ? "input-crudcsp3" : ""
                }`}
              type="date"
              required
              value={sprintStartDate}
              onChange={handleSprintStartDateChange}
              ref={startDateInputRef}
            />
            <label
              className={`label-crudcsp ${endDateError ? "error-label" : ""}`}
            >
              {endDateError ? endDateError : "Fecha de Final*"}
            </label>
            <input
              name="endDate"
              className={`input-crudcsp ${endDateError ? "input-crudcsp3" : ""
                }`}
              type="date"
              required
              value={sprintEndDate}
              onChange={handleSprintEndDateChange}
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
              placeholder={nameError ? nameError : "Escribe el color de la Etiqueta*"}
              required
              value={tituloEtiqueta}
              onChange={handleTituloEtiquetaChange}
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
                <span className="span-crudcsp">¿Qué Deseas Registrar?</span>
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
                  onClick={clearForm}
                >
                  Cancelar
                </button>
              )}
              {selectedOption === "Etiqueta" && (
                <button
                  className="button-crudcsp"
                  type="button"
                  onClick={handleEtiquetaAdd}
                >
                  {etiquetaId ? "Actualizar Etiqueta" : "Agregar"}
                </button>
              )}
              {etiquetaId && (
                <button
                  className="button-crudcsp2"
                  type="button"
                  onClick={clearForm}
                >
                  Cancelar
                </button>
              )}
              {selectedOption === "Proyecto" && (
                <button
                  className="button-crudcsp"
                  type="button"
                  onClick={handleProyectoAdd}
                >
                  {proyectoId ? "Actualizar Proyecto" : "Agregar"}
                </button>
              )}
              {proyectoId && (
                <button
                  className="button-crudcsp2"
                  type="button"
                  onClick={clearForm}
                >
                  Cancelar
                </button>
              )}
              {selectedOption === "Sprint" && (
                <button
                  className="button-crudcsp"
                  type="button"
                  onClick={handleSprintAdd}
                >
                  {sprintId ? "Actualizar Sprint" : "Agregar"}
                </button>
              )}
              {sprintId && (
                <button
                  className="button-crudcsp2"
                  type="button"
                  onClick={clearForm}
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
                      <th>Color de Etiqueta</th>
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
              {selectedOption === "Etiqueta" && (
                <tbody>
                  {etiquetas.map((etiqueta) => (
                    <tr key={etiqueta.etiquetaId}>
                      <td>{etiqueta.tituloEtiqueta}</td>
                      {/* Otras columnas específicas de etiqueta si las hay */}
                      <td>
                        <button
                          className="btntblupd"
                          onClick={() =>
                            handleEditEtiqueta(
                              etiqueta.etiquetaId,
                              etiqueta.tituloEtiqueta
                            )
                          }
                        >
                          Editar
                        </button>
                        <button
                          className="btntbldel"
                          onClick={() =>
                            handleDeleteEtiqueta(etiqueta.etiquetaId)
                          }
                        >
                          Eliminar
                        </button>
                      </td>
                    </tr>
                  ))}
                </tbody>
              )}
              {selectedOption === "Proyecto" && (
                <tbody>
                  {proyectos.map((proyecto) => (
                    <tr key={proyecto.proyectoId}>
                      <td>{proyecto.tituloProyecto}</td>
                      <td>{proyecto.descripcion}</td>
                      <td>{proyecto.fechaInicio}</td>
                      <td>{proyecto.fechaFinal}</td>
                      <td>{proyecto.estado}</td>
                      {/* Otras columnas específicas de proyecto si las hay */}
                      <td>
                        <button
                          className="btntblupd"
                          onClick={() =>
                            handleEditProyecto(
                              proyecto.proyectoId,
                              proyecto.tituloProyecto,
                              proyecto.descripcion,
                              proyecto.fechaInicio,
                              proyecto.fechaFinal,
                              proyecto.estado
                            )
                          }
                        >
                          Editar
                        </button>
                        <button
                          className="btntbldel"
                          onClick={() =>
                            handleDeleteProyecto(proyecto.proyectoId)
                          }
                        >
                          Eliminar
                        </button>
                      </td>
                    </tr>
                  ))}
                </tbody>
              )}
              {selectedOption === "Sprint" && (
                <tbody>
                  {sprints.map((sprint) => (
                    <tr key={sprint.sprintId}>
                      <td>{sprint.tituloSprint}</td>
                      <td>{sprint.descripcion}</td>
                      <td>{sprint.fechaInicio}</td>
                      <td>{sprint.fechaFinal}</td>
                      <td>{sprint.estado}</td>
                      <td>{sprint.proyecto}</td>
                      {/* Otras columnas específicas de sprint si las hay */}
                      <td>
                        <button
                          className="btntblupd"
                          onClick={() =>
                            handleEditSprint(
                              sprint.sprintId,
                              sprint.tituloSprint,
                              sprint.descripcion,
                              sprint.fechaInicio,
                              sprint.fechaFinal,
                              sprint.estado,
                              sprint.proyecto
                            )
                          }
                        >
                          Editar
                        </button>
                        <button
                          className="btntbldel"
                          onClick={() => handleDeleteSprint(sprint.sprintId)}
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