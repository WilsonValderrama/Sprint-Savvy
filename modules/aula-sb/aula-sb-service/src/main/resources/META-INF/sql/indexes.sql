create index IX_431C1C11 on AulaVirtual_T_Ul_Actividad (tituloActividad[$COLUMN_LENGTH:75$]);
create index IX_A925B637 on AulaVirtual_T_Ul_Actividad (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_62445E79 on AulaVirtual_T_Ul_Actividad (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_356E598 on AulaVirtual_T_Ul_AdminCurso (T_Ul_Curso_id);
create index IX_58A48007 on AulaVirtual_T_Ul_AdminCurso (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_478B5C49 on AulaVirtual_T_Ul_AdminCurso (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_155F713 on AulaVirtual_T_Ul_Administrador (nombreAdmin[$COLUMN_LENGTH:75$]);
create index IX_22C9ACB7 on AulaVirtual_T_Ul_Administrador (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E973F4F9 on AulaVirtual_T_Ul_Administrador (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_24E35A7 on AulaVirtual_T_Ul_Calificacion (puntCalificacion[$COLUMN_LENGTH:75$]);
create index IX_A24B6B7B on AulaVirtual_T_Ul_Calificacion (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_A91E94BD on AulaVirtual_T_Ul_Calificacion (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_7A224161 on AulaVirtual_T_Ul_Curso (nombreCurso[$COLUMN_LENGTH:75$]);
create index IX_2AA5C116 on AulaVirtual_T_Ul_Curso (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_73B79518 on AulaVirtual_T_Ul_Curso (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_D4AC917 on AulaVirtual_T_Ul_Estud_Curso (T_Ul_Estudiante_id);
create index IX_D9F2D7CC on AulaVirtual_T_Ul_Estud_Curso (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E1A6E14E on AulaVirtual_T_Ul_Estud_Curso (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_BA910987 on AulaVirtual_T_Ul_Estudiante (nombreEstudiante[$COLUMN_LENGTH:75$]);
create index IX_C8DE52CC on AulaVirtual_T_Ul_Estudiante (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_FB351C4E on AulaVirtual_T_Ul_Estudiante (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_5CA9A5A8 on AulaVirtual_T_Ul_MaterialEstud (tituloMaterial[$COLUMN_LENGTH:75$]);
create index IX_243F5D28 on AulaVirtual_T_Ul_MaterialEstud (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_5CCD0DAA on AulaVirtual_T_Ul_MaterialEstud (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_76FE8747 on AulaVirtual_T_Ul_PAcademico (tituloPeriodo[$COLUMN_LENGTH:75$]);
create index IX_21E9F7B2 on AulaVirtual_T_Ul_PAcademico (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_3C90C2B4 on AulaVirtual_T_Ul_PAcademico (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_B8BCA4BE on AulaVirtual_T_Ul_PrgEvaluacion (problPreguntas[$COLUMN_LENGTH:75$]);
create index IX_54F4AEC on AulaVirtual_T_Ul_PrgEvaluacion (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_99C59C6E on AulaVirtual_T_Ul_PrgEvaluacion (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_3136F277 on AulaVirtual_T_Ul_Profesor (nombreProfesor[$COLUMN_LENGTH:75$]);
create index IX_F26CCEE4 on AulaVirtual_T_Ul_Profesor (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_15E3BE66 on AulaVirtual_T_Ul_Profesor (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_9CE85667 on AulaVirtual_T_Ul_ResEvaluacion (problRespuestas[$COLUMN_LENGTH:75$]);
create index IX_1174E7A7 on AulaVirtual_T_Ul_ResEvaluacion (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_AA912BE9 on AulaVirtual_T_Ul_ResEvaluacion (uuid_[$COLUMN_LENGTH:75$], groupId);