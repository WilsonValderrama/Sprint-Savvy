create index IX_9F6E63E on Servicio_Savvy_Categoria (nombreCategoria[$COLUMN_LENGTH:500$]);
create index IX_7D36A250 on Servicio_Savvy_Categoria (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_91A37CD2 on Servicio_Savvy_Categoria (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_4A535578 on Servicio_Savvy_Etiqueta (tituloEtiqueta[$COLUMN_LENGTH:75$]);
create index IX_86E73D0B on Servicio_Savvy_Etiqueta (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E2A18A4D on Servicio_Savvy_Etiqueta (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_9F5195DA on Servicio_Savvy_Proyecto (tituloProyecto[$COLUMN_LENGTH:75$]);
create index IX_F5BC13FC on Servicio_Savvy_Proyecto (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E5F1697E on Servicio_Savvy_Proyecto (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_744814C4 on Servicio_Savvy_Sprint (tituloSprint[$COLUMN_LENGTH:75$]);
create index IX_EC36EBD1 on Servicio_Savvy_Sprint (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_1B7A3293 on Servicio_Savvy_Sprint (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_19D12FFE on Servicio_Savvy_Tarea (nombreTarea[$COLUMN_LENGTH:75$]);
create index IX_3E24EE9E on Servicio_Savvy_Tarea (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_52B484A0 on Servicio_Savvy_Tarea (uuid_[$COLUMN_LENGTH:75$], groupId);