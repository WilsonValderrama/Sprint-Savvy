import React, { useState } from 'react';

function Task(){
    const [title, setTitle] = useState('');
    const [properties, setProperties] = useState([{name: '', description: ''} ]);
    const [content, setContent] = useState('');
    const [tasks, setTasks] = useState([]); //Estado para almacenar las tareas
    const [selectedTaskIndex, setSelectedTaskIndex] = useState(null); // Estado para el índice de la tarea seleccionada



    //Esta función se encarga de actualizar el estado del componente titulo que se le pasa
    const handleTitleChange = (e) => {
        setTitle(e.target.value);
    }

    //Esta función se utiliza para agregar una cadena vacía al final de un array para agregar elementos a una lista 
    const handlePropertyAdd = () => {
        setProperties([...properties, { name: '', description: '' }]); 
    }

    // Esta función se utiliza para actualizar dinámicamente el estado de un componente React cuando el 
    //usuario cambia el valor de un elemento en una lista 
    const handlePropertyChange = (e, index) => {
        const updatedProperties = [...properties];
        updatedProperties[index] = e.target.value;
        setProperties(updatedProperties);
    }

    const handleContentChange = (e) => {
        setContent(e.target.value);
      };

    const handleAddTask = () => {
      const newTask = {
        title,
        properties,
        content,
      };
      setTasks([...tasks, newTask]);
      // Limpia los campos después de agregar la tarea
      setTitle('');
      setProperties([{ name: '', description: '' }]);
      setContent('');
    };

    const handleQueryTasks = () => {
      console.log(tasks); 
      
    };

    const handleEditTask = (index) => {
      setSelectedTaskIndex(index); // Establece el índice de la tarea seleccionada
      const selectedTask = tasks[index];
      setTitle(selectedTask.title);
      setProperties(selectedTask.properties);
      setContent(selectedTask.content);
    };
  
    const handleDeleteTask = (index) => {
      const updatedTasks = [...tasks];
      updatedTasks.splice(index, 1);
      setTasks(updatedTasks);
    };

      return (
        <div className="task">
            <input
                type="text"
                placeholder="Título de la tarea"
                value={title}
                onChange={handleTitleChange}
            />
        <div className="properties">
        {properties.map((property, index) => (
          <div className="property" key={index}>
            <div>
              <input
                type="text"
                placeholder="Propiedad"
                name="name"
                value={property.name}
                onChange={(e) => handlePropertyChange(e, index)}
              />
            </div>
            <div>
              <input
                type="text"
                placeholder="Descripción de la propiedad"
                name="description"
                value={property.description}
                onChange={(e) => handlePropertyChange(e, index)}
              />
            </div>
          </div>
        ))}
        </div>
            <button onClick={handlePropertyAdd}>Agregar Propiedad</button>

            <div className='text-area'>
                <textarea
                        placeholder="Contenido de la tarea"
                        value={content}
                        onChange={handleContentChange}
                /> 
            </div>

            <div>
              <button onClick={handleAddTask}>Agregar Tarea</button>
              <button onClick={handleQueryTasks}>Consultar Tareas</button> {/* Botón para consultar tareas */}
            </div>

            <div className="task-list">
                {tasks.map((task, index) => (
                <div className="task-card" key={index}>
                <h3>{task.title}</h3>
                <p>{task.content}</p>
                <button onClick={() => handleEditTask(index)}>Editar</button>
                <button onClick={() => handleDeleteTask(index)}>Eliminar</button>
              </div>
              ))}
            </div>
            
        </div>
    
      );



}

export default Task;