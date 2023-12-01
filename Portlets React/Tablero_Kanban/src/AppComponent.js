import React from 'react';
import ReactDOM from 'react-dom';
import { FaUser } from "react-icons/fa";
import { FaFolder } from "react-icons/fa";
import { FaRegStickyNote } from "react-icons/fa";
import { FaExclamationCircle } from "react-icons/fa";
import { FaWalking } from "react-icons/fa";
import { FaProjectDiagram } from "react-icons/fa";
import { FaCalendarAlt } from "react-icons/fa";
import { FaTrash } from "react-icons/fa";
import { FaEdit } from "react-icons/fa";




export default class KanbanBoard extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            activeForm: null,
            tareaEnEdicion: null,
            tareas: [],
            proyectos: [],
            sprints: [],
            categorias: [],
            etiquetas: [],
            form: {
                nombreTarea: '',
                proyecto: '',
                responsable: '',
                prioridad: '',
                sprint: '',
                estado: '',
                fechaLimite: '',
                resumen: '',
                descripcion: '',
                categoria: '',
                etiqueta: ''
            }
        };
        this.formRef = React.createRef(); // Referencia para el formulario
    }

    handleInputChange = (event) => {
        const { name, value } = event.target;
        this.setState(prevState => ({
            form: {
                ...prevState.form,
                [name]: value
            }
        }));
    }


    handleKeyPress = (event) => {
        if (event.key === 'Enter') {
            this.handleSubmit();
        }
    }



    handleClickOutside = (event) => {
        if (this.formRef.current && !this.formRef.current.contains(event.target)) {
            this.handleSubmit();
        }
    }

    componentDidMount() {
        document.addEventListener('mousedown', this.handleClickOutside);
        Liferay.Service(
            '/servicio_savvy.tarea/get-all-tareas',
            (response) => {
                this.setState({ tareas: response });
            }
        );

        Liferay.Service('/servicio_savvy.proyecto/get-all-proyecto', (response) => {
            this.setState({ proyectos: response });
        });
        Liferay.Service('/servicio_savvy.sprint/get-all-sprints', (response) => {
            this.setState({ sprints: response });
        });
        Liferay.Service('/servicio_savvy.categoria/get-all-categorias', (response) => {
            this.setState({ categorias: response });
        });
        Liferay.Service('/servicio_savvy.etiqueta/get-all-etiqueta', (response) => {
            this.setState({ etiquetas: response });
        });
    }

    componentWillUnmount() {
        document.removeEventListener('mousedown', this.handleClickOutside);
    }

    showForm = (taskState) => {
        this.setState({
            activeForm: taskState,
            form: {
                ...this.state.form,
                estado: taskState
            }
        });
    }

    handleDragStart = (e, tarea) => {
        this.draggedTask = tarea; // Guarda la tarea que se está arrastrando
    };


    handleEdit = (tarea) => {
        this.setState({
            tareaEnEdicion: tarea,
            form: { ...tarea },
            activeForm: tarea.estado
        });
    }

    handleSubmit = () => {
        const { tareaEnEdicion, form, activeForm } = this.state;

        // Verifica si el nombre de la tarea está vacío y asigna "Sin título" si es necesario
        const nombreTareaActualizado = form.nombreTarea.trim() === '' ? 'Sin título' : form.nombreTarea;

        if (tareaEnEdicion) {
            // Actualizar tarea existente
            Liferay.Service(
                '/servicio_savvy.tarea/update-tarea',
                { tareaId: tareaEnEdicion.tareaId, ...form, nombreTarea: nombreTareaActualizado },
                (response) => {
                    console.log(response);
                    // Actualizar la lista de tareas en el estado
                    this.setState(prevState => ({
                        tareas: prevState.tareas.map(t => t.tareaId === tareaEnEdicion.tareaId ? response : t),
                        tareaEnEdicion: null,
                        activeForm: null,
                        form: { // Restablecer el formulario
                            nombreTarea: '',
                            proyecto: '',
                            responsable: '',
                            prioridad: '',
                            sprint: '',
                            estado: '',
                            fechaLimite: '',
                            resumen: '',
                            descripcion: '',
                            categoria: '',
                            etiqueta: ''
                        }
                    }));
                }
            );
        } else {
            // Crear nueva tarea
            const updatedForm = {
                ...form,
                nombreTarea: nombreTareaActualizado,
                estado: activeForm
            };

            Liferay.Service(
                '/servicio_savvy.tarea/create-tarea',
                updatedForm,
                (response) => {
                    console.log(response);
                    this.setState(prevState => ({
                        tareas: [...prevState.tareas, response],
                        activeForm: null,
                        form: { // Restablecer el formulario
                            nombreTarea: '',
                            proyecto: '',
                            responsable: '',
                            prioridad: '',
                            sprint: '',
                            estado: '',
                            fechaLimite: '',
                            resumen: '',
                            descripcion: '',
                            categoria: '',
                            etiqueta: ''
                        }
                    }));
                }
            );
        }
    }

    handleDelete = (tareaId) => {
        Liferay.Service(
            '/servicio_savvy.tarea/delete-tarea',
            { tareaId },
            (response) => {
                console.log(response);
                // Elimina la tarea del estado
                this.setState(prevState => ({
                    tareas: prevState.tareas.filter(tarea => tarea.tareaId !== tareaId)
                }));
            }
        );
    }

    handleDrop = (e, newState) => {
        // Actualiza el estado local de la tarea arrastrada
        const updatedTask = { ...this.draggedTask, estado: newState };

        // Hacer una llamada al servicio para actualizar la tarea en el backend
        Liferay.Service(
            '/servicio_savvy.tarea/update-tarea',
            {
                tareaId: this.draggedTask.tareaId,
                ...updatedTask
            },
            (response) => {
                console.log('Tarea actualizada: ', response);
                // Actualiza el estado local con la tarea actualizada
                this.setState(prevState => ({
                    tareas: prevState.tareas.map(t =>
                        t.tareaId === this.draggedTask.tareaId ? response : t),
                }));
            }
        );
    };

    handleClickFormCrudPSCE() {
        window.location.href = 'http://localhost:8080/web/guest/crear-entidad';
    }

    renderForm() {
        if (!this.state.activeForm) return null;

        const { form } = this.state;

        return (
            <div className="task-form" ref={this.formRef} onKeyPress={this.handleKeyPress}>
                {/* Campos del formulario */}
                <input
                    name="nombreTarea"
                    value={form.nombreTarea}
                    onChange={this.handleInputChange}
                    className="input-task-form"
                    type="text"
                    placeholder="Nombre de la Tarea"
                />
                <select
                    name="prioridad"
                    value={form.prioridad}
                    onChange={this.handleInputChange}
                    className="input-task-form"
                >
                    <option value="">Selecciona una Prioridad...</option>
                    <option value="Alta">Alta</option>
                    <option value="Media">Media</option>
                    <option value="Baja">Baja</option>
                </select>
                <select
                    name="responsable"
                    value={form.responsable}
                    onChange={this.handleInputChange}
                    className="input-task-form"
                >
                    <option value="">Selecciona un Responsable...</option>
                    <option value="Wilson Valderrama">Wilson Valderrama</option>
                    <option value="Jaider Pineda">Jaider Pineda</option>
                    <option value="Juan Ospina">Juan Ospina</option>
                    <option value="Sergio Rincon">Sergio Rincon</option>
                    <option value="Jhonny Álvarez">Jhonny Álvarez</option>
                    <option value="Frederick Bosa">Frederick Bosa</option>
                </select>
                <div className="contenedorinputs">
                    <input list="categorias-list" name="categoria" value={form.categoria} onChange={this.handleInputChange} className="input-task-form2" placeholder='Escribe el Nombre de Tu Categoría' />
                    <button type="button" className="add-button" onClick={this.handleClickFormCrudPSCE}>➕</button>
                </div>
                <datalist id="categorias-list">
                    {this.state.categorias.map((categoria) => (
                        <option key={categoria.categoriaId} value={categoria.nombreCategoria} />
                    ))}
                </datalist>
                <input
                    name="fechaLimite"
                    value={form.fechaLimite}
                    onChange={this.handleInputChange}
                    className="input-task-form"
                    type="date"
                    placeholder="Fecha Límite"
                />
                <div className="contenedorinputs">
                    <input list="proyectos-list" name="proyecto" value={form.proyecto} onChange={this.handleInputChange} className="input-task-form2" placeholder='Escribe el Nombre de Tu proyecto' />
                    <button type="button" className="add-button" onClick={this.handleClickFormCrudPSCE}>➕</button>
                </div>
                <datalist id="proyectos-list">
                    {this.state.proyectos.map((proyecto) => (
                        <option key={proyecto.proyectoId} value={proyecto.tituloProyecto} />
                    ))}
                </datalist>
                <div className="contenedorinputs">
                    <input list="sprints-list" name="sprint" value={form.sprint} onChange={this.handleInputChange} className="input-task-form2" placeholder='Escribe el Nombre de Tu Sprint' />
                    <button type="button" className="add-button" onClick={this.handleClickFormCrudPSCE}>➕</button>
                </div>
                <datalist id="sprints-list">
                    {this.state.sprints.map((sprint) => (
                        <option key={sprint.sprintId} value={sprint.tituloSprint} />
                    ))}
                </datalist>
                <div className="contenedorinputs">
                    <input list="etiquetas-list" name="etiqueta" value={form.etiqueta} onChange={this.handleInputChange} className="input-task-form2" placeholder='Escribe el Nombre de Tu Etiqueta' />
                    <button type="button" className="add-button" onClick={this.handleClickFormCrudPSCE}>➕</button>
                </div>
                <datalist id="etiquetas-list">
                    {this.state.etiquetas.map((etiqueta) => (
                        <option key={etiqueta.etiquetaId} value={etiqueta.tituloEtiqueta} />
                    ))}
                </datalist>
                <input
                    name="resumen"
                    value={form.resumen}
                    onChange={this.handleInputChange}
                    className="input-task-form"
                    type="text"
                    placeholder="Resumen"
                />
                <input
                    name="descripcion"
                    value={form.descripcion}
                    onChange={this.handleInputChange}
                    className="input-task-form"
                    type="text"
                    placeholder="Descripción"
                />

            </div>
        );
    }

    renderTareas(estado) {
        const { tareas, tareaEnEdicion } = this.state;
        const getColorFromEtiqueta = (etiqueta) => {
            const colors = {
                "Rojo": "#FF000040",
                "Verde": "#00800040",
                "Azul": "#0000FF40",
                "Amarillo": "#FFFF0040",
                "Rosa": "#FFC0CB40",
                "Negro": "#00000040",
                "Blanco": "#FFFFFF40",
                "Morado": "#80008040",
                "Naranja": "#FFA50040",
                "Gris": "#80808040",
                "Turquesa": "#40E0D040",
                "Marrón": "#A52A2A40",
                "Violeta": "#8A2BE240",
                "Oro": "#FFD70040",
                "Plata": "#C0C0C040",

                "rojo": "#FF000040",
                "verde": "#00800040",
                "azul": "#0000FF40",
                "amarillo": "#FFFF0040",
                "rosa": "#FFC0CB40",
                "negro": "#00000040",
                "blanco": "#FFFFFF40",
                "morado": "#80008040",
                "naranja": "#FFA50040",
                "gris": "#80808040",
                "turquesa": "#40E0D040",
                "marrón": "#A52A2A40",
                "violeta": "#8A2BE240",
                "oro": "#FFD70040",
                "plata": "#C0C0C040",
            };
            return colors[etiqueta] || "#000"; // color por defecto si no se encuentra la etiqueta
        }
        return tareas
            .filter(tarea => tarea.estado === estado)
            .map(tarea => {
                // Si la tarea está siendo editada, no la renderices
                if (tareaEnEdicion && tarea.tareaId === tareaEnEdicion.tareaId) {
                    return null;
                }

                const etiquetaStyle = {
                    backgroundColor: getColorFromEtiqueta(tarea.etiqueta),
                };

                return (
                    <div
                        key={tarea.tareaId}
                        className="task-card"
                        draggable="true"
                        onDragStart={(e) => this.handleDragStart(e, tarea)}>
                        <span className='titulos-column'> <FaRegStickyNote /> {tarea.nombreTarea}</span><br />
                        <span> <FaExclamationCircle /> Prioridad: {tarea.prioridad}</span><br />
                        <span> <FaUser /> Responsable: {tarea.responsable}</span><br />
                        <span> <FaFolder /> Categoría: {tarea.categoria}</span><br />
                        <div className="task-details">
                            <span> <FaCalendarAlt /> Fecha Límite: {tarea.fechaLimite}</span><br />
                            <span> <FaProjectDiagram /> Proyecto: {tarea.proyecto}</span><br />
                            <span> <FaWalking /> Sprint: {tarea.sprint}</span><br />
                            {tarea.etiqueta && (
                                <div className="conetendor-etiqueta" style={etiquetaStyle}>
                                    {tarea.etiqueta}
                                </div>
                            )}
                            <br />
                            <span>Resumen: {tarea.resumen}</span><br />
                            <span>Descripción: {tarea.descripcion}</span><br />
                        </div>
                        <button
                            onClick={() => this.handleDelete(tarea.tareaId)}
                            className="delete-task-button"
                            title="Eliminar Tarea"
                        >
                            <FaTrash />
                        </button>
                        <button
                            onClick={() => this.handleEdit(tarea)}
                            className="edit-task-button"
                            title="Editar Tarea"
                        >
                            <FaEdit />
                        </button>
                    </div>
                );
            });
    }

    handleClickFormTareas() {
        window.location.href = 'http://localhost:8080/web/guest/form-tareas';
    }

    render() {
        return (
            <div>
                <header className='header-kanban'>
                    <h3 className='titulo-general'>Tablero Kanban Sprint Savvy</h3>
                    <button className='boton-crear-tarea-redir' onClick={this.handleClickFormTareas}>
                        Crear Tarea
                    </button>
                </header>
                <div className="kanban-board">
                    <div className="kanban-column_not-started"
                        onDragOver={(e) => e.preventDefault()}
                        onDrop={(e) => this.handleDrop(e, 'Sin empezar')}>
                        <div className="contenedor-titulo-se">
                            <span className="titulos-column">Sin empezar</span>
                        </div>
                        {this.renderTareas('Sin empezar')}
                        {this.state.activeForm === 'Sin empezar' && this.renderForm()}
                        <button onClick={() => this.showForm('Sin empezar')} className="create-task-se">
                            + Nuevo ítem
                        </button>
                    </div>

                    <div className="kanban-column_in-progress"
                        onDragOver={(e) => e.preventDefault()}
                        onDrop={(e) => this.handleDrop(e, 'En curso')}>
                        <div className="contenedor-titulo-ec">
                            <span className="titulos-column">En curso</span>
                        </div>
                        {this.renderTareas('En curso')}
                        {this.state.activeForm === 'En curso' && this.renderForm()}
                        <button onClick={() => this.showForm('En curso')} className="create-task-ec">
                            + Nuevo ítem
                        </button>
                    </div>

                    <div className="kanban-column_completed"
                        onDragOver={(e) => e.preventDefault()}
                        onDrop={(e) => this.handleDrop(e, 'Finalizada')}>
                        <div className="contenedor-titulo-f">
                            <span className="titulos-column">Finalizada</span>
                        </div>
                        {this.renderTareas('Finalizada')}
                        {this.state.activeForm === 'Finalizada' && this.renderForm()}
                        <button onClick={() => this.showForm('Finalizada')} className="create-task-f">
                            + Nuevo ítem
                        </button>
                    </div>
                </div>
            </div>
        );
    }
}