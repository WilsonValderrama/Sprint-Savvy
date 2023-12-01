import React, { useState, useEffect } from 'react';
import ReactDOM from 'react-dom';

function AppComponent(props) {
  // Estados para almacenar la información de la tarea
  const [tareaId, setTareaId] = useState(null);
  const [nombreTarea, setNombreTarea] = useState('');
  const [proyecto, setProyecto] = useState('');
  const [responsable, setResponsable] = useState('');
  const [prioridad, setPrioridad] = useState('');
  const [sprint, setSprint] = useState('');
  const [estado, setEstado] = useState('');
  const [fechaLimite, setFechaLimite] = useState('');
  const [resumen, setResumen] = useState('');
  const [descripcion, setDescripcion] = useState('');
  const [categoria, setCategoria] = useState('');
  const [etiqueta, setEtiqueta] = useState('');
  const [tareas, setTareas] = useState([]);
  const [searchValue, setSearchValue] = useState('');

  // Estados para las opciones de los select
  const [proyectos, setProyectos] = useState([]);
  const [sprints, setSprints] = useState([]);
  const [etiquetas, setEtiquetas] = useState([]);
  const [categorias, setCategorias] = useState([]);

  // Estado para el mensaje de error
  const [statusError, setStatusError] = useState("");

  // Funciones para manejar cambios en los campos de texto del formulario
  const handleInputChange = (setter) => (event) => setter(event.target.value);

  // Función para agregar o actualizar una tarea
  const handleAddOrUpdate = () => {
    if (!nombreTarea) {
      //setear nombre de tarea por Sin titulo
      setNombreTarea('Sin titulo');
      if (!estado) {
        setStatusError("Selecciona un Estado Valido..");
        return; // Detiene la función si la validación falla
      }
      return;
    }

    const payload = {
      tareaId,
      nombreTarea,
      proyecto,
      responsable,
      prioridad,
      sprint,
      estado,
      fechaLimite,
      resumen,
      descripcion,
      categoria,
      etiqueta
    };

    const serviceUrl = tareaId
      ? '/servicio_savvy.tarea/update-tarea'
      : '/servicio_savvy.tarea/create-tarea';

    Liferay.Service(serviceUrl, payload, function (obj) {
      console.log(obj);
      fetchTareas();
      clearForm();
    });
  };

  // Función para obtener la lista de tareas desde el servidor
  const fetchTareas = () => {
    Liferay.Service('/servicio_savvy.tarea/get-all-tareas', function (obj) {
      setTareas(obj);
    });
  };

  // Efecto secundario para cargar la lista de tareas al cargar la página
  useEffect(() => {
    fetchTareas();

    // Cargar proyectos
    Liferay.Service('/servicio_savvy.proyecto/get-all-proyecto', function (obj) {
      setProyectos(obj);
    });

    // Cargar sprints
    Liferay.Service('/servicio_savvy.sprint/get-all-sprints', function (obj) {
      setSprints(obj);
    });

    // Cargar etiquetas
    Liferay.Service('/servicio_savvy.etiqueta/get-all-etiqueta', function (obj) {
      setEtiquetas(obj);
    });

    // Cargar categorías
    Liferay.Service('/servicio_savvy.categoria/get-all-categorias', function (obj) {
      setCategorias(obj);
    });

  }, []);

  // Función para eliminar una tarea
  const handleDelete = (id) => {
    Liferay.Service('/servicio_savvy.tarea/delete-tarea', { tareaId: id }, function (obj) {
      console.log(obj);
      fetchTareas();
    });
  };

  // Función para editar una tarea
  const handleEdit = (id) => {
    const tareaToEdit = tareas.find((tarea) => tarea.tareaId === id);
    if (tareaToEdit) {
      setTareaId(id);
      setNombreTarea(tareaToEdit.nombreTarea);
      setProyecto(tareaToEdit.proyecto);
      setResponsable(tareaToEdit.responsable);
      setPrioridad(tareaToEdit.prioridad);
      setSprint(tareaToEdit.sprint);
      setEstado(tareaToEdit.estado);
      setFechaLimite(tareaToEdit.fechaLimite);
      setResumen(tareaToEdit.resumen);
      setDescripcion(tareaToEdit.descripcion);
      setCategoria(tareaToEdit.categoria);
      setEtiqueta(tareaToEdit.etiqueta);
    }
  };

  // Función para limpiar el formulario
  const clearForm = () => {
    setTareaId(null);
    setNombreTarea('');
    setProyecto('');
    setResponsable('');
    setPrioridad('');
    setSprint('');
    setEstado('');
    setFechaLimite('');
    setResumen('');
    setDescripcion('');
    setCategoria('');
    setEtiqueta('');
    setStatusError(""); // Restablecer el estado de error a una cadena vacía
  };

  // Función para realizar la búsqueda de tareas
  const handleSearch = () => {
    Liferay.Service('/servicio_savvy.tarea/get-tarea-by-nombre', { nombreTarea: searchValue }, function (obj) {
      console.log(obj);
      setTareas([obj]);
    });
  };

  return (
    <>
      <div className="container-center">
        <div className="body">
          <div className="container-form">
            <form className="form-formTask">
              <div className="head">
                <span className="span-formTask">Registrar Tarea</span>
                <p>Ingresa los datos de tu tarea</p>
              </div>
              <div className="inputs">
                <input
                  className="input-formTask"
                  type="text"
                  placeholder="Nombre de la Tarea"
                  value={nombreTarea}
                  onChange={handleInputChange(setNombreTarea)}
                  required
                />
                <select
                  className="input-formTask"
                  value={proyecto}
                  onChange={handleInputChange(setProyecto)}
                >
                  <option value="">Seleccione un Proyecto</option>
                  {proyectos.map((proyecto) => (
                    <option value={proyecto.tituloProyecto} key={proyecto.tituloProyecto}>
                      {proyecto.tituloProyecto}
                    </option>
                  ))}
                </select>
                <select
                  name="responsable"
                  placeholder="Responsable"
                  value={responsable}
                  onChange={handleInputChange(setResponsable)}
                  className="input-formTask"
                >
                  <option value="">Selecciona un Responsable...</option>
                  <option value="Wilson Valderrama">Wilson Valderrama</option>
                  <option value="Jaider Pineda">Jaider Pineda</option>
                  <option value="Juan Ospina">Juan Ospina</option>
                  <option value="Sergio Rincon">Sergio Rincon</option>
                  <option value="Jhonny Álvarez">Jhonny Álvarez</option>
                  <option value="Frederick Bosa">Frederick Bosa</option>
                </select>

                <select
                  name="prioridad"
                  value={prioridad}
                  onChange={handleInputChange(setPrioridad)}
                  className="input-formTask"
                >
                  <option value="">Selecciona una Prioridad...</option>
                  <option value="Alta">Alta</option>
                  <option value="Media">Media</option>
                  <option value="Baja">Baja</option>
                </select>
                <select
                  className="input-formTask"
                  value={sprint}
                  onChange={handleInputChange(setSprint)}
                >
                  <option value="">Seleccione un Sprint</option>
                  {sprints.map((sprint) => (
                    <option value={sprint.tituloSprint} key={sprint.tituloSprint}>
                      {sprint.tituloSprint}
                    </option>
                  ))}
                </select>
                <select
                  name="status"
                  className={`input-crudcsp ${statusError ? "input-crudcsp3" : ""}`}
                  required
                  value={estado}
                  onChange={handleInputChange(setEstado)}
                >
                  <option value="SeleccionaStatus">
                    {statusError ? statusError : "Selecciona un Estado... *"}
                  </option>
                  <option value="Sin empezar">Sin Empezar</option>
                  <option value="En curso">En Curso</option>
                  <option value="Finalizada">Finalizada</option>
                </select>
                <input
                  className="input-formTask"
                  type="date"
                  placeholder="Fecha Límite"
                  value={fechaLimite}
                  onChange={handleInputChange(setFechaLimite)}
                />
                <textarea
                  className="input-formTask"
                  type="text"
                  placeholder="Resumen"
                  value={resumen}
                  onChange={handleInputChange(setResumen)}
                />
                <textarea
                  className="input-formTask"
                  placeholder="Descripción"
                  value={descripcion}
                  onChange={handleInputChange(setDescripcion)}
                />
                <select
                  className="input-formTask"
                  value={categoria}
                  onChange={handleInputChange(setCategoria)}
                >
                  <option value="">Seleccione una Categoría</option>
                  {categorias.map((categoria) => (
                    <option value={categoria.nombreCategoria} key={categoria.nombreCategoria}>
                      {categoria.nombreCategoria}
                    </option>
                  ))}
                </select>
                <select
                  className="input-formTask"
                  value={etiqueta}
                  onChange={handleInputChange(setEtiqueta)}
                >
                  <option value="">Seleccione una Etiqueta</option>
                  {etiquetas.map((etiqueta) => (
                    <option value={etiqueta.tituloEtiqueta} key={etiqueta.tituloEtiqueta}>
                      {etiqueta.tituloEtiqueta}
                    </option>
                  ))}
                </select>
              </div>
              <button type="button" className="button-formTask" onClick={handleAddOrUpdate}>
                {tareaId ? 'Actualizar' : 'Agregar'}
              </button>
              {tareaId && (
                <button type="button" className="button-formTask2" onClick={clearForm}>
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
                  <h2>Tabla de tareas</h2>
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
            <table className="table table-striped table-hover">
              <thead>
                <tr>
                  <th>Nombre</th>
                  <th>Proyecto</th>
                  <th>Responsable</th>
                  <th>Prioridad</th>
                  <th>Sprint</th>
                  <th>Estado</th>
                  <th>Fecha Límite</th>
                  <th>Resumen</th>
                  <th>Descripción</th>
                  <th>Categoría</th>
                  <th>Etiqueta</th>
                  <th>Acciones</th>
                </tr>
              </thead>
              <tbody>
                {tareas.map((tarea) => (
                  <tr key={tarea.tareaId}>
                    <td>{tarea.nombreTarea}</td>
                    <td>{tarea.proyecto}</td>
                    <td>{tarea.responsable}</td>
                    <td>{tarea.prioridad}</td>
                    <td>{tarea.sprint}</td>
                    <td>{tarea.estado}</td>
                    <td>{tarea.fechaLimite}</td>
                    <td>{tarea.resumen}</td>
                    <td>{tarea.descripcion}</td>
                    <td>{tarea.categoria}</td>
                    <td>{tarea.etiqueta}</td>
                    <td>
                      <button className="btntblupd" onClick={() => handleEdit(tarea.tareaId)}>Editar</button>
                      <button className="btntbldel" onClick={() => handleDelete(tarea.tareaId)}>Eliminar</button>
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