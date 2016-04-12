create table asignados (
	asignadosId VARCHAR(75) not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	usuarioId LONG,
	concursoId LONG,
	documento VARCHAR(75) null,
	puntuacionObtenida VARCHAR(75) null
);

create table concurso (
	concursoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	nombre VARCHAR(75) null,
	fechaInicioInscripcion DATE null,
	modifiedDate DATE null,
	descripcion VARCHAR(75) null,
	premio VARCHAR(75) null,
	fechaFinInscripcion DATE null,
	fechaPublicacionConcurso DATE null,
	fechaPublicacionGanador DATE null,
	fechaInicioEntrega DATE null,
	fechaFinEntrega DATE null,
	empresaId LONG,
	documento VARCHAR(75) null
);

create table empresa (
	empresaId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	nombre VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	sectorEmpresa VARCHAR(75) null,
	cif VARCHAR(75) null,
	pais VARCHAR(75) null,
	password1 VARCHAR(75) null,
	password2 VARCHAR(75) null,
	correoElectronico VARCHAR(75) null
);

create table usuario (
	usuarioId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	nombre VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	apellidos VARCHAR(75) null,
	correoElectronico VARCHAR(75) null,
	password1 VARCHAR(75) null,
	password2 VARCHAR(75) null,
	documento VARCHAR(75) null,
	puntuacionObtenida VARCHAR(75) null
);