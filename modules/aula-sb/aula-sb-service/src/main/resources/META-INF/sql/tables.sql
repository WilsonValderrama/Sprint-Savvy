create table AulaVirtual_T_Ul_Actividad (
	uuid_ VARCHAR(75) null,
	idActividad LONG not null primary key,
	tituloActividad VARCHAR(75) null,
	tipoActividad VARCHAR(75) null,
	descriActividad VARCHAR(75) null,
	estadoEntrActividad VARCHAR(75) null,
	fCreacActividad DATE null,
	fCierrActividad DATE null,
	porcActividad VARCHAR(75) null,
	T_Ul_Califi_id LONG,
	T_Ul_PAcademico_id LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table AulaVirtual_T_Ul_AdminCurso (
	uuid_ VARCHAR(75) null,
	T_Ul_Admin_id LONG not null,
	T_Ul_Curso_id LONG not null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	primary key (T_Ul_Admin_id, T_Ul_Curso_id)
);

create table AulaVirtual_T_Ul_Administrador (
	uuid_ VARCHAR(75) null,
	idAdmin LONG not null primary key,
	nombreAdmin VARCHAR(75) null,
	CorreoAdmin VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table AulaVirtual_T_Ul_Calificacion (
	uuid_ VARCHAR(75) null,
	idCalificacion LONG not null primary key,
	puntCalificacion VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table AulaVirtual_T_Ul_Curso (
	uuid_ VARCHAR(75) null,
	idCurso LONG not null primary key,
	nombreCurso VARCHAR(75) null,
	fInicioCurso DATE null,
	fFinCurso DATE null,
	T_Ul_Califi_id LONG,
	T_Ul_Profesor_id LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table AulaVirtual_T_Ul_Estud_Curso (
	uuid_ VARCHAR(75) null,
	T_Ul_Curso_id LONG not null,
	T_Ul_Estudiante_id LONG not null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	primary key (T_Ul_Curso_id, T_Ul_Estudiante_id)
);

create table AulaVirtual_T_Ul_Estudiante (
	uuid_ VARCHAR(75) null,
	idEstudiante LONG not null primary key,
	nombreEstudiante VARCHAR(75) null,
	correoEstudiante VARCHAR(75) null,
	profesEstudiante VARCHAR(75) null,
	sedeEstudiante VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table AulaVirtual_T_Ul_MaterialEstud (
	uuid_ VARCHAR(75) null,
	idMaterial LONG not null primary key,
	tituloMaterial VARCHAR(75) null,
	fCreacionMaterial DATE null,
	urlArchMaterial VARCHAR(75) null,
	descripMaterial VARCHAR(75) null,
	T_Ul_PAcademico_id LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table AulaVirtual_T_Ul_PAcademico (
	uuid_ VARCHAR(75) null,
	idPeriodo LONG not null primary key,
	tituloPeriodo VARCHAR(75) null,
	fInicioPeriodo DATE null,
	fFinPeriodo DATE null,
	porcPeriodo VARCHAR(75) null,
	T_Ul_Curso_id LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table AulaVirtual_T_Ul_PrgEvaluacion (
	uuid_ VARCHAR(75) null,
	idPreguntas LONG not null primary key,
	problPreguntas VARCHAR(75) null,
	opcPreguntas VARCHAR(75) null,
	puntajePreguntas VARCHAR(75) null,
	intentoPreguntas VARCHAR(75) null,
	limiteTPreguntas VARCHAR(75) null,
	T_Ul_Actividad_id LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table AulaVirtual_T_Ul_Profesor (
	uuid_ VARCHAR(75) null,
	idProfesor LONG not null primary key,
	nombreProfesor VARCHAR(75) null,
	correoProfesor VARCHAR(75) null,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table AulaVirtual_T_Ul_ResEvaluacion (
	uuid_ VARCHAR(75) null,
	idRespuestas LONG not null primary key,
	problRespuestas VARCHAR(75) null,
	opcionRespuestas VARCHAR(75) null,
	puntajeRespuestas VARCHAR(75) null,
	T_Ul_Estudiante_id LONG,
	T_Ul_PrgEvaluacion_id LONG,
	T_Ul_Califi_id LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);