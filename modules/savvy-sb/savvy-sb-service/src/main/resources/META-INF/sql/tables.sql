create table Servicio_Savvy_Categoria (
	uuid_ VARCHAR(75) null,
	categoriaId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nombreCategoria VARCHAR(500) null,
	descripcion VARCHAR(999) null
);

create table Servicio_Savvy_Etiqueta (
	uuid_ VARCHAR(75) null,
	etiquetaId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	tituloEtiqueta VARCHAR(75) null
);

create table Servicio_Savvy_Proyecto (
	uuid_ VARCHAR(75) null,
	proyectoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	tituloProyecto VARCHAR(75) null,
	descripcion VARCHAR(75) null,
	fechaInicio VARCHAR(75) null,
	fechaFinal VARCHAR(75) null,
	estado VARCHAR(75) null
);

create table Servicio_Savvy_Sprint (
	uuid_ VARCHAR(75) null,
	sprintId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	tituloSprint VARCHAR(75) null,
	fechaInicio VARCHAR(75) null,
	fechaFinal VARCHAR(75) null,
	descripcion VARCHAR(999) null,
	estado VARCHAR(75) null,
	proyecto VARCHAR(75) null
);

create table Servicio_Savvy_Tarea (
	uuid_ VARCHAR(75) null,
	tareaId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nombreTarea VARCHAR(75) null,
	proyecto VARCHAR(75) null,
	responsable VARCHAR(75) null,
	prioridad VARCHAR(75) null,
	sprint VARCHAR(75) null,
	estado VARCHAR(75) null,
	fechaLimite VARCHAR(75) null,
	resumen VARCHAR(75) null,
	descripcion VARCHAR(999) null,
	categoria VARCHAR(75) null,
	etiqueta VARCHAR(75) null
);