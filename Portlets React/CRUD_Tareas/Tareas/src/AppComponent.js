import React from 'react';
import ReactDOM from 'react-dom';
import Task from './components/Task';

export default class extends React.Component {
	render() {
		return (
            <div>
				<h1>Lista de Tareas</h1>
				<div className="task-list">
					<Task />

				</div>
				
			</div>
		);
	}	
}