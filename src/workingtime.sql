-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-06-2023 a las 02:06:13
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `workingtime`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamentos`
--

CREATE TABLE `departamentos` (
  `Id` int(11) NOT NULL,
  `Departamento` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `PuestoTrabajo` varchar(50) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `departamentos`
--

INSERT INTO `departamentos` (`Id`, `Departamento`, `PuestoTrabajo`) VALUES
(1, 'Finanzas', 'Controller'),
(2, 'Finanzas', 'Asesor fiscal'),
(3, 'Finanzas', 'Asesor financiero'),
(4, 'Finanzas', 'Contable'),
(5, 'Finanzas', 'Analista'),
(6, 'Finanzas', 'Tasador'),
(7, 'RRHH', 'Director'),
(8, 'RRHH', 'Técnico de selección del personal'),
(9, 'RRHH', 'Técnico de formación'),
(10, 'RRHH', 'Técnico de relaciones laborales y nómina'),
(11, 'RRHH', 'Técnico de comunicación interna'),
(12, 'Marketing', 'Digital marketing manager '),
(13, 'Marketing', 'Social media manager'),
(14, 'Marketing', 'Community manager'),
(15, 'Marketing', 'PR manager '),
(16, 'Marketing', 'Content manager'),
(17, 'Marketing', 'Experto en SEO y SEM'),
(18, 'Marketing', 'Analista web'),
(19, 'Marketing', 'Diseñador web'),
(20, 'Comercial', 'Director'),
(21, 'Comercial', 'Gerente'),
(22, 'Comercial', 'Analista de inteligencia comercial'),
(23, 'Comercial', 'Ejecutivo comercial'),
(24, 'Comercial', 'Vendedor'),
(25, 'Comercial', 'Asistente comercial'),
(26, 'Ventas', 'Director'),
(27, 'Ventas', 'Gerente'),
(28, 'Ventas', 'Community manager'),
(29, 'Ventas', 'Supervisor'),
(30, 'Ventas', 'Vendedor'),
(31, 'Logistica', 'Técnico de cadena de suministro'),
(32, 'Logistica', 'Técnico de comercio exterior'),
(33, 'Logistica', 'Técnico de gestión de stocks'),
(34, 'Logistica', 'Analista de sistemas'),
(35, 'Logistica', 'Técnico en Lean Management'),
(36, 'Logistica', 'Director'),
(37, 'Logistica', 'Técnico en e-commerce'),
(38, 'Logistica', 'Técnico de control de calidad'),
(39, 'IT', 'Desarrollador de software'),
(40, 'IT', 'Programador'),
(41, 'IT', 'Ingeniero de DevOps'),
(42, 'IT', 'Especialista en Redes'),
(43, 'IT', 'Gerente'),
(44, 'IT', 'Profesional de seguridad'),
(45, 'IT', 'Administrador de red'),
(46, 'IT', 'Administrador de sistemas'),
(47, 'IT', 'Analista de datos'),
(48, 'Dirección', 'Director general');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `documentos_empleado`
--

CREATE TABLE `documentos_empleado` (
  `IdDocumento` int(11) NOT NULL,
  `IdEmpleado` int(11) NOT NULL,
  `TipoDocumento` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `NombreDoc` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `RutaArchivo` text COLLATE utf8_spanish_ci NOT NULL,
  `FechaSubida` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `IdEmpleado` int(11) NOT NULL,
  `Nombre` varchar(20) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Apellidos` varchar(100) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `DNI` varchar(9) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Usuario` varchar(15) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Password` varchar(12) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `FechaNac` date NOT NULL,
  `Departamento` varchar(20) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `PuestoTrabajo` varchar(30) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Ciudad` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Pais` varchar(30) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Email` text CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `Telefono` int(9) NOT NULL,
  `NumeroSeguridadSocial` bigint(12) NOT NULL,
  `GrupoProfesional` varchar(50) CHARACTER SET utf8 COLLATE utf8_spanish_ci NOT NULL,
  `GrupoCotizacion` int(4) NOT NULL,
  `FechaAntiguedad` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`IdEmpleado`, `Nombre`, `Apellidos`, `DNI`, `Usuario`, `Password`, `FechaNac`, `Departamento`, `PuestoTrabajo`, `Ciudad`, `Pais`, `Email`, `Telefono`, `NumeroSeguridadSocial`, `GrupoProfesional`, `GrupoCotizacion`, `FechaAntiguedad`) VALUES
(1, 'ADMIN', 'ADMIN', '12345678A', 'admin', 'admin1234', '1995-06-10', 'IT', 'ADMINISTRADOR', 'MADRID', 'ESPANIA', 'admin@workingtime.com', 657812450, 1254787955, 'INGENIEROS Y LICENCIADOS', 1, '2022-04-25'),
(10, 'MARINA', 'ROMERO TALLIDO', '56998741M', 'mromero', 'L9WWdEryOJ7j', '1993-06-17', 'LOGISTICA', 'ANALISTA DE SISTEMAS', 'LA HABANA', 'CUBA', 'mromero@workingtime.com', 623147780, 123415269541, 'OFICIALES ADMINISTRATIVOS', 5, '2014-06-18'),
(11, 'RUBEN', 'JIMENEZ ROBERTO', '56320014R', 'rjimenez', 'oyP7HX43AgC7', '1995-06-21', 'COMERCIAL', 'GERENTE', 'WASHINGTON D.C', 'ESTADOS UNIDOS', 'rjimenez@workingtime.com', 651473200, 123487459120, 'AYUDANTES NO TITULADOS', 4, '2020-11-04'),
(12, 'JOSE ANGEL', 'MARTIN HERRERO', '54126630J', 'jamartin', 'TV7DtzVAvXTA', '2014-06-18', 'VENTAS', 'COMMUNITY MANAGER', 'QUITO', 'ECUADOR', 'jamartin@workingtime.com', 632147894, 123547896521, 'JEFES ADMINISTRATIVOS Y DE TALLER', 3, '2021-09-15'),
(13, 'LIDIA', 'KLKJNJKBJKKJNK', '315645654', 'lmklnk', '6e4fSPG65Jbb', '1995-06-14', 'LOGISTICA', 'TÉCNICO DE GESTIÓN DE STOCKS', 'BRASILIA', 'BRASIL', 'lmklnk@workingtime.com', 659784521, 125789641785, 'AYUDANTES NO TITULADOS', 4, '2021-09-15'),
(14, 'ELENA', 'PEREZ HERNANDEZ', '56987458E', 'eperez', 'WOS5BS35cpZ5', '1997-06-18', 'COMERCIAL', 'EJECUTIVO COMERCIAL', 'TEGUCIGALPA', 'HONDURAS', 'eperez@workingtime.com', 658261489, 123589620145, 'SUBALTERNOS', 6, '2014-11-19'),
(15, 'ROBERTO', 'GIRON MENDEZ', '56321485R', 'rgiron', 'rYWzvFvSsaPL', '1995-06-14', 'LOGISTICA', 'ANALISTA DE SISTEMAS', 'OTTAWA', 'CANADA', 'rgiron@workingtime.com', 632014598, 125896300145, 'AYUDANTES NO TITULADOS', 4, '2021-12-02'),
(16, 'PABLO', 'GOMEZ SAENZ', '52144789P', 'pgomez', 'y9bwo4dwKdQr', '1996-02-14', 'LOGISTICA', 'TÉCNICO DE GESTIÓN DE STOCKS', 'LA HABANA', 'CUBA', 'pgomez@workingtime.com', 652143022, 258947896302, 'OFICIALES DE TERCERA Y ESPECIALISTAS', 9, '2018-06-13');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nominas`
--

CREATE TABLE `nominas` (
  `IdNomina` int(11) NOT NULL,
  `IdEmpleado` int(11) NOT NULL,
  `PuestoTrabajo` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `Mes` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `FechaInicio` date NOT NULL,
  `FechaFin` date NOT NULL,
  `SalarioBase` float NOT NULL DEFAULT 0,
  `TotalDevengado` float NOT NULL DEFAULT 0,
  `TotalDeducciones` float NOT NULL DEFAULT 0,
  `LiquidoTotal` float NOT NULL DEFAULT 0,
  `DiasTrabajados` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paises`
--

CREATE TABLE `paises` (
  `Id` int(11) NOT NULL,
  `Pais` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `Capital` varchar(20) COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `paises`
--

INSERT INTO `paises` (`Id`, `Pais`, `Capital`) VALUES
(1, 'Afganistan', 'Kabul'),
(2, 'Albania', 'Tirana'),
(3, 'Alemania', 'Berlin'),
(4, 'Andorra', 'Andorra la vieja'),
(5, 'Argentina', 'Buenos Aires'),
(6, 'Australia', 'Camberra'),
(7, 'Austria', 'Viena'),
(8, 'Bahamas', 'Nassau'),
(9, 'Belgica', 'Bruselas'),
(10, 'Bolivia', 'Sucre,La Paz'),
(11, 'Brasil', 'Brasilia'),
(12, 'Bulgaria', 'Sofia'),
(13, 'Canada', 'Ottawa'),
(14, 'Chile', 'Santiago de Chile'),
(15, 'Republica Popular Ch', 'Pekin'),
(16, 'Colombia', 'Bogota'),
(17, 'Costa de Marfil', 'Yamusukro, Abiyun'),
(18, 'Cuba', 'La Habana'),
(19, 'Croacia', 'Zagreb'),
(20, 'Dinamarca', 'Copenhague'),
(21, 'Republica Dominicana', 'Santo Domingo'),
(22, 'Ecuador', 'Quito'),
(23, 'San Salvador', 'San Salvador'),
(24, 'Emiratos Arabes Unid', 'Abu Dabi'),
(25, 'Eslovaquia', 'Bratislava'),
(26, 'Eslovenia', 'Lublijana'),
(27, 'Espania', 'Madrid'),
(28, 'Estados Unidos', 'Washington D.C'),
(29, 'Estonia', 'Tallin'),
(30, 'Filipinas', 'Manila'),
(31, 'Finlandia', 'Helsinki'),
(32, 'Francia', 'Paris'),
(33, 'Grecia', 'Atenas'),
(34, 'Guinea', 'Conakry'),
(35, 'Haiti', 'Puerto Principe'),
(36, 'Honduras', 'Tegucigalpa'),
(37, 'Hungria', 'Budapest'),
(38, 'India', 'Nueva Delhi'),
(39, 'Indonesia', 'Yakarta'),
(40, 'Irak', 'Bagdad'),
(41, 'Iran', 'Teheran'),
(42, 'Irlanda', 'Dublin'),
(43, 'Islandia', 'Reikiavik'),
(44, 'Italia', 'Roma'),
(45, 'Jamaica', 'Kingston'),
(46, 'Japon', 'Tokio'),
(47, 'Kenia', 'Nairobi'),
(48, 'Laos', 'Vientian'),
(49, 'Letonia', 'Riga'),
(50, 'Libia', 'Tripoli'),
(51, 'Lituania', 'Vilna'),
(52, 'Luxemburgo', 'Luxemburgo'),
(53, 'Madagascar', 'Antananarivo'),
(54, 'Malasia', 'Kuala Lumpur'),
(55, 'Maldivas', 'Male'),
(56, 'Malta', 'La Valeta'),
(57, 'Marruecos', 'Rabat'),
(58, 'Mexico', 'Mexico D.F'),
(59, 'Moldavia', 'Chisinau'),
(60, 'Montecarlo', 'Monaco'),
(61, 'Mongolia', 'Ijlan Bator'),
(62, 'Mozambique', 'Maputo'),
(63, 'Namibia', 'Windhoek'),
(64, 'Nepal', 'Katmandu'),
(65, 'Nicaragua', 'Managua'),
(66, 'Medellin', 'Abuya'),
(67, 'Noruega', 'Oslo'),
(68, 'Nueva Zelanda', 'Wellington'),
(69, 'Oman', 'Mascate'),
(70, 'Paises Bajos', 'Amsterdam'),
(71, 'Pakistan', 'Islamabad'),
(72, 'Panama', 'Ciudad de Panama'),
(73, 'Papua Nueva Guinea', 'Port Moresby'),
(74, 'Paraguay', 'Asuncion'),
(75, 'Peru', 'Lima'),
(76, 'Polonia', 'Varsovia'),
(77, 'Portugal', 'Lisboa'),
(79, 'Rumania', 'Bucarest'),
(80, 'Rusia', 'Moscu'),
(81, 'Senegal', 'Dakar'),
(82, 'Serbia', 'Belgrado'),
(83, 'Suecia', 'Estocolmo'),
(84, 'Suiza', 'Berna'),
(85, 'Tailandia', 'Bangkok'),
(86, 'Turquia', 'Ankara'),
(87, 'Ucrania', 'Kiev'),
(88, 'Uruguay', 'Montevideo'),
(89, 'Venezuela', 'Caracas'),
(90, 'Zambia', 'Lusaka');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro_ausencia`
--

CREATE TABLE `registro_ausencia` (
  `IdAusencia` int(11) NOT NULL,
  `IdEmpleado` int(10) NOT NULL,
  `Departamento` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `Responsable` varchar(30) COLLATE utf8_spanish_ci NOT NULL,
  `FechaInicio` date NOT NULL,
  `FechaFin` date NOT NULL,
  `TipoSolicitud` varchar(20) COLLATE utf8_spanish_ci NOT NULL,
  `MotivoAusencia` longtext COLLATE utf8_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro_horas`
--

CREATE TABLE `registro_horas` (
  `IdRegistro` int(11) NOT NULL,
  `IdEmpleado` int(11) NOT NULL,
  `FechaActual` varchar(10) COLLATE utf8_spanish_ci NOT NULL,
  `HoraInicio` time NOT NULL,
  `HoraFin` time NOT NULL,
  `OtrasRazones` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `HoraInicioRazones` time NOT NULL,
  `HoraFinRazones` time NOT NULL,
  `HorasImputadas` int(2) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `documentos_empleado`
--
ALTER TABLE `documentos_empleado`
  ADD PRIMARY KEY (`IdDocumento`),
  ADD KEY `IdEmpleado_FK_DOC` (`IdEmpleado`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`IdEmpleado`);

--
-- Indices de la tabla `nominas`
--
ALTER TABLE `nominas`
  ADD PRIMARY KEY (`IdNomina`);

--
-- Indices de la tabla `registro_ausencia`
--
ALTER TABLE `registro_ausencia`
  ADD PRIMARY KEY (`IdAusencia`),
  ADD KEY `IdEmpleado_FK_AUS` (`IdEmpleado`);

--
-- Indices de la tabla `registro_horas`
--
ALTER TABLE `registro_horas`
  ADD PRIMARY KEY (`IdRegistro`),
  ADD KEY `IdEmpleado_FK` (`IdEmpleado`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `documentos_empleado`
--
ALTER TABLE `documentos_empleado`
  MODIFY `IdDocumento` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `IdEmpleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT de la tabla `nominas`
--
ALTER TABLE `nominas`
  MODIFY `IdNomina` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `registro_ausencia`
--
ALTER TABLE `registro_ausencia`
  MODIFY `IdAusencia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `registro_horas`
--
ALTER TABLE `registro_horas`
  MODIFY `IdRegistro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `documentos_empleado`
--
ALTER TABLE `documentos_empleado`
  ADD CONSTRAINT `IdEmpleado_FK_DOC` FOREIGN KEY (`IdEmpleado`) REFERENCES `empleados` (`IdEmpleado`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `registro_ausencia`
--
ALTER TABLE `registro_ausencia`
  ADD CONSTRAINT `IdEmpleado_FK_AUS` FOREIGN KEY (`IdEmpleado`) REFERENCES `empleados` (`IdEmpleado`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `registro_horas`
--
ALTER TABLE `registro_horas`
  ADD CONSTRAINT `IdEmpleado_FK` FOREIGN KEY (`IdEmpleado`) REFERENCES `empleados` (`IdEmpleado`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
