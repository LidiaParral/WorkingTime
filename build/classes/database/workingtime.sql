-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3307
-- Tiempo de generación: 10-05-2024 a las 00:38:34
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

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
  `IdDepartamento` int(11) NOT NULL,
  `Departamento` varchar(50) NOT NULL,
  `Posicion` varchar(100) NOT NULL,
  `Trabajo` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `departamentos`
--

INSERT INTO `departamentos` (`IdDepartamento`, `Departamento`, `Posicion`, `Trabajo`) VALUES
(1, 'FINANZAS', 'DIRECTOR', 'DIRECTOR FINANCIERO'),
(2, 'FINANZAS', 'GERENTE', 'GERENTE DE FINANZAS'),
(3, 'FINANZAS', 'CONTROLLER', 'CONTROLLER FINANCIERO'),
(4, 'FINANZAS', 'CONTABLE', 'CONTABLE DE FINANZAS'),
(5, 'FINANZAS', 'TESORERO', 'TESORERO FINANCIERO'),
(6, 'FINANZAS', 'REPONSABLE FISCAL', 'RESPONSABLE FISCAL'),
(7, 'FINANZAS', 'AUDITOR INTERNO', 'AUDITOR INTERNO FINANCIERO'),
(8, 'FINANZAS', 'RESPONSABLE ', 'RESPONSABLE DE SERVICIOS AUXILIARES'),
(9, 'RRHH', 'DIRECTOR', 'DIRECTOR DE RRHH'),
(10, 'RRHH', 'TECNICO DE SELECCION', 'TECNICO DE SELECCION'),
(11, 'RRHH', 'TECNICO DE FORMACION', 'TECNICO DE FORMACION'),
(12, 'RRHH', 'TECNICO DE COMUNICACION INTERNA', 'TECNICO DE COMUNICACION INTERNA'),
(13, 'RRHH', 'ADMINISTRADOR DE PERSONAL', 'ADMINISTRADOR DE PERSONAL'),
(14, 'MARKETING', 'DIRECTOR', 'DIRECTOR DE MARKETING'),
(15, 'MARKETING', 'GERENTE', 'GERENTE DE MARKETING'),
(16, 'MARKETING', 'COORDINADOR', 'COORDINADOR DE MARKETING'),
(17, 'MARKETING', 'ASISTENTE', 'ASISTENTE DE MARKETING'),
(18, 'MARKETING', 'ANALISTA', 'ANALISTA DE MARKETING'),
(19, 'MARKETING', 'MANAGER DE CONTENIDO', 'MANAGER DE CONTENIDO'),
(20, 'MARKETING', 'ESPECIALISTA', 'ESPECIALISTA DE MARKETING DIGITAL'),
(21, 'MARKETING', 'GESTOR DE RRSS', 'GESTOR DE REDES SOCIALES'),
(22, 'COMERCIAL', 'DIRECTOR', 'DIRECTOR DE COMERICAL'),
(23, 'COMERCIAL', 'GERENTE', 'GERENTE COMERCIAL'),
(24, 'COMERCIAL', 'ANALISTA', 'ANALISTA DE INTELIGENCIA COMERICAL'),
(25, 'COMERCIAL', 'EJECUTIVO', 'EJECUTIVO COMERCIAL'),
(26, 'COMERCIAL', 'VENDEDOR', 'VENDEDOR COMERICAL'),
(27, 'COMPRAS', 'DIRECTOR', 'DIRECTOR DE COMPRAS'),
(28, 'COMPRAS', 'GERENTE', 'GERENTE DE COMPRAS'),
(29, 'COMPRAS', 'GERENTE', 'GERENTE DE CALIDAD'),
(30, 'COMPRAS', 'GERENTE', 'GERENTE DE LOGISTICA Y ALMACEN'),
(31, 'COMPRAS', 'GERENTE', 'GERENTE DE PRODUCCION'),
(32, 'COMPRAS', 'GERENTE', 'GERENTE DE FINANZAS'),
(33, 'COMPRAS', 'INGENIERO', 'INGENIERO DE COMPRAS'),
(34, 'COMPRAS', 'DESARROLLADOR', 'DESARROLLADOR DE PROVEEDORES'),
(35, 'COMPRAS', 'SUPERVISOR', 'SUPERVISOR'),
(36, 'LOGISTICA', 'DIRECTOR', 'DIRECTOR DE LOGISTICA'),
(37, 'LOGISTICA', 'GERENTE', 'GERENTE DE LOGISTICA'),
(38, 'LOGISTICA', 'COORDINADOR', 'COORDINADOR DE ALMACEN'),
(39, 'LOGISTICA', 'ANALISTA', 'ANALISTA DE INVENTARIO'),
(40, 'LOGISTICA', 'TECNICO', 'TECNICO DE TRANSPORTE'),
(41, 'LOGISTICA', 'OPERADOR', 'OPERADOR DE MONTACARGAS'),
(42, 'IT', 'DIRECTOR', 'DIRECTOR DE IT'),
(43, 'IT', 'DESARROLLADOR', 'DESARROLLADOR WEB'),
(44, 'IT', 'DESARROLLADOR', 'DESARROLLADOR DE APLICACIONES'),
(45, 'IT', 'ARQUITECTO', 'ARQUITECTO DE INTELIGENCIA ARTIFICIAL'),
(46, 'IT', 'ANALISTA', 'ANALISTA DE BIG DATA'),
(47, 'IT', 'ANALISTA', 'ANALISTA PROGRAMADOR'),
(48, 'IT', 'TESTER', 'QA'),
(49, 'IT', 'CIBERSEGURIDAD', 'EXPERTO DE CIBERSEGURIDAD'),
(50, 'IT', 'INGENIERO', 'INGENIERO DEVOPS'),
(51, 'IT', 'ADMINISTRADOR', 'ADMINISTRADOR DE SISTEMAS');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `documentos_empleados`
--

CREATE TABLE `documentos_empleados` (
  `IdDocumento` int(11) NOT NULL,
  `IdEmpleado` int(11) NOT NULL,
  `TipoDocumento` varchar(10) NOT NULL,
  `NombreDoc` varchar(30) NOT NULL,
  `FechaSubida` date NOT NULL,
  `Archivo` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nominas`
--

CREATE TABLE `nominas` (
  `IdNomina` int(11) NOT NULL,
  `IdEmpleado` int(11) NOT NULL,
  `Posicion` varchar(30) NOT NULL,
  `Mes` varchar(10) NOT NULL,
  `FechaInicio` date NOT NULL,
  `FechaFin` date NOT NULL,
  `SalarioBase` decimal(6,2) NOT NULL,
  `TotalDevengado` decimal(6,2) NOT NULL,
  `TotalDeducciones` decimal(6,2) NOT NULL,
  `LiquidoTotal` decimal(6,2) NOT NULL,
  `DiasTrabajados` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paises`
--

CREATE TABLE `paises` (
  `IdPais` int(11) NOT NULL,
  `Pais` varchar(50) NOT NULL,
  `Capital` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `paises`
--

INSERT INTO `paises` (`IdPais`, `Pais`, `Capital`) VALUES
(1, 'ANGOLA', 'LUANDA'),
(2, 'ARGELIA', 'ARGEL'),
(3, 'BENIN', 'PORTO NOVO'),
(4, 'BOTSWANA', 'GABORONE'),
(5, 'BURKINA FASO', 'OUAGADUGU'),
(6, 'BURUNDI', 'BUJUMBURA'),
(7, 'CABO VERDE', 'PRAIA'),
(8, 'CAMERUN', 'YAUNDE'),
(9, 'CHAD', 'YAMENA'),
(10, 'COSTA DE MARFIL', 'YAMUSUKRO'),
(11, 'COMORAS', 'MORONI'),
(12, 'EGIPTO', 'EL CAIRO'),
(13, 'ERITREA', 'ASMARA'),
(14, 'ETIOPIA', 'ADDIS ABEBA'),
(15, 'GABON', 'LIBREVILLE'),
(16, 'GAMBIA', 'BANJUL'),
(17, 'GHANA', 'ACCRA'),
(18, 'GUINEA', 'CONAKRY'),
(19, 'GUINEA ECUATORIAL', 'MALABO'),
(20, 'KENIA', 'NAIROBI'),
(21, 'LESOTO', 'MASERU'),
(22, 'LIBERIA', 'MONROVIA'),
(23, 'LIBIA', 'TRIPOLI'),
(24, 'MADAGASCAR', 'ANTANANARIVO'),
(25, 'MALAWI', 'LILONGWE'),
(26, 'MALI', 'BAMAKO'),
(27, 'MARRUECOS', 'RABAT'),
(28, 'MAURICIO', 'PORT LOUIS'),
(29, 'MAURITANIA', 'NUAKCHOT'),
(30, 'MOZAMBIQUE', 'MAPUTO'),
(31, 'NAMIBIA', 'WINDHOEK'),
(32, 'NIGERIA', 'ABUJA'),
(33, 'REP.DEM DEL CONGO', 'KINSHASA'),
(34, 'REPUBLICA DEL CONGO', 'BRAZZAVILLE'),
(35, 'RUANDA', 'KIGALI'),
(36, 'SENEGAL', 'DAKAR'),
(37, 'SEYCHELLES', 'VICTORIA'),
(38, 'SIERRA LEONA', 'FREETOWN'),
(39, 'SOMALIA', 'MOGADISCIO'),
(40, 'SUDAFRICA', 'PRETORIA'),
(41, 'SUDAN', 'JARTUM'),
(42, 'TANZANIA', 'DODOMA'),
(43, 'TOGO', 'LOME'),
(44, 'TUNEZ', 'TUNEZ'),
(45, 'UGANDA', 'KAMPALA'),
(46, 'YIBUTI', 'YIBUTI'),
(47, 'ZAMBIA', 'LUSAKA'),
(48, 'ZIMBABWE', 'HARARE'),
(49, 'ARGENTINA', 'BUENOS AIRES'),
(50, 'BAHAMAS', 'NASSAU'),
(51, 'BELICE', 'BELICE'),
(52, 'BOLIVIA', 'LA PAZ'),
(53, 'BRASIL', 'BRASILIA'),
(54, 'CANADA', 'OTTAWA'),
(55, 'CHILE', 'SANTIAGO'),
(56, 'COLOMBIA', 'BOGOTA'),
(57, 'COSTA RICA', 'SAN JOSE'),
(58, 'CUBA', 'LA HABANA'),
(59, 'ECUADOR', 'QUITO'),
(60, 'EL SALVADOR', 'SAN SALVADOR'),
(61, 'ESTADOS UNIDOS', 'WASHINGTON'),
(62, 'GUATEMALA', 'GUATEMALA'),
(63, 'GUYANA', 'GEORGETOWN'),
(64, 'HAITI', 'PUERTO PRINCIPE'),
(65, 'HONDURAS', 'TEGUCIGALPA'),
(66, 'JAMAICA', 'KINGSTON'),
(67, 'MEXICO', 'MEXICO F.C.'),
(68, 'NICARAGUA', 'MANAGUA'),
(69, 'PANAMA', 'PANAMA'),
(70, 'PARAGUAY', 'ASUNCION'),
(71, 'PERU', 'LIMA'),
(72, 'REP. DOMINICANA', 'SANTO DOMINGO'),
(73, 'SURINAM', 'PARAMARIBO'),
(74, 'URUGUAY', 'MONTEVIDEO'),
(75, 'VENEZUELA', 'CARACAS'),
(76, 'AFGANISTAN', 'KABUL'),
(77, 'ARABIA SAUDITA', 'RIAD'),
(78, 'BAHREIN', 'MANAMA'),
(79, 'BANGLADESH', 'DHAKA'),
(80, 'BUTAN', 'TIMBU'),
(81, 'CAMBOYA', 'PHON PHEN'),
(82, 'CHINA', 'PEKIN'),
(83, 'COREA DEL NORTE', 'PYONGYANG'),
(84, 'COREA DEL SUR', 'SEUL'),
(85, 'EMIRATOS ARABES UNIDOS', 'ABU DABI'),
(86, 'FILIPINAS', 'MANILA'),
(87, 'INDIA', 'NUEVA DELHI'),
(88, 'INDONESIA', 'YAKARTA'),
(89, 'IRAQ', 'BAGDAD'),
(90, 'IRAN', 'TEHERAN'),
(91, 'ISRAEL', 'TEL-AVIV'),
(92, 'JAPON', 'TOKIO'),
(93, 'JORDANIA', 'AMMAN'),
(94, 'KUWAIT', 'AL-KUWAIT'),
(95, 'LAOS', 'VIENTIANE'),
(96, 'LIBANO', 'BEIRUT'),
(97, 'MALASIA', 'KUALA LUMPUR'),
(98, 'MALDIVAS', 'MALE'),
(99, 'MONGOLIA', 'ULAN BATOR'),
(100, 'NEPAL', 'KATMANDU'),
(101, 'OMAN', 'MASCATE'),
(102, 'PAKISTAN', 'ISLAMABAD'),
(103, 'QATAR', 'DOHA'),
(104, 'SINGAPUR', 'SINGAPUR'),
(105, 'SIRIA', 'DAMASCO'),
(106, 'SRI LANKA', 'COLOMBO'),
(107, 'TAILANDIA', 'BANGKOK'),
(108, 'TAIWAN', 'TAIPEI'),
(109, 'UZBEKISTAN', 'TASHKENT'),
(110, 'VIETNAM', 'HANOI'),
(111, 'YEMEN', 'SANAA'),
(112, 'KOSOVO', 'PRISTINA'),
(113, 'LETONIA', 'RIGA'),
(114, 'LITUANIA', 'VILNA'),
(115, 'LUXEMBURGO', 'LUXEMBURGO'),
(116, 'MACEDONIA', 'SKOPJE'),
(117, 'MALTA', 'LA VALETTA'),
(118, 'MOLDAVIA', 'CHISNAU'),
(119, 'MONACO', 'MONACO'),
(120, 'NORUEGA', 'OSLO'),
(121, 'HOLANDA', 'AMSTERDAM'),
(122, 'POLONIA', 'VARSOVIA'),
(123, 'PORTUGAL', 'LISBOA'),
(124, 'REINO UNIDO', 'LONDRES'),
(125, 'REPUBLICA CHECA', 'PRAGA'),
(126, 'RUMANIA', 'BUCAREST'),
(127, 'RUSIA', 'MOSCU'),
(128, 'SERBIA', 'BELGRADO'),
(129, 'SUECIA', 'ESTOCOLMO'),
(130, 'SUIZA', 'BERNA'),
(131, 'TURQUIA', 'ANKARA'),
(132, 'UCRANIA', 'KIEV'),
(133, 'AUSTRALIA', 'CAMBERRA'),
(134, 'NUEVA ZELANDA', 'WELLINGTON'),
(135, 'PAPUA NUEVA GUINEA', 'PORT MORESBY'),
(136, 'TUVALU', 'FONGAFALE'),
(137, 'FIYI', 'SUVAC'),
(138, 'SAMOA', 'APIA'),
(139, 'NAURU', 'YAREN'),
(140, 'ALBANIA', 'TIRANA'),
(141, 'ALEMANIA', 'BERLIN'),
(142, 'ANDORRA', 'ANDORRA LA VELLA'),
(143, 'AUSTRIA', 'VIENA'),
(144, 'BELGICA', 'BRUSELAS'),
(145, 'BIELORRUSIA', 'MINSK'),
(146, 'BULGARIA', 'SOFIA'),
(147, 'CHIPRE', 'NICOSIA'),
(148, 'CROACIA', 'ZAGRED'),
(149, 'DINAMARCA', 'COPENHAGUE'),
(150, 'ESLOVAQUIA', 'BRATISLAVA'),
(151, 'ESLOVENIA', 'LIUBLIANA'),
(152, 'ESPANIA', 'MADRID'),
(153, 'ESTONIA', 'TALLIN'),
(154, 'FINLANDIA', 'HELSINKI'),
(155, 'FRANCIA', 'PARIS'),
(156, 'GRECIA', 'ATENAS'),
(157, 'HUNGRIA', 'BUDAPEST'),
(158, 'IRLANDA', 'DUBLIN'),
(159, 'ISLANDIA', 'REIKIAVIK'),
(160, 'ITALIA', 'ROMA');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro_ausencia`
--

CREATE TABLE `registro_ausencia` (
  `IdRegAus` int(11) NOT NULL,
  `IdEmpleado` int(11) NOT NULL,
  `Departamento` varchar(30) NOT NULL,
  `Manager` varchar(30) NOT NULL,
  `FechaInicio` date NOT NULL,
  `FechaFin` date NOT NULL,
  `TipoSolicitud` varchar(30) NOT NULL,
  `AusenciaDesc` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `registro_ausencia`
--

INSERT INTO `registro_ausencia` (`IdRegAus`, `IdEmpleado`, `Departamento`, `Manager`, `FechaInicio`, `FechaFin`, `TipoSolicitud`, `AusenciaDesc`) VALUES
(1, 1, 'IT', 'LIDIA', '2024-04-16', '2024-04-16', 'CITA MEDICA', 'Cita medica'),
(2, 1, 'IT', 'LIDIA', '2024-05-07', '2024-05-22', 'BAJA', 'Baja Laboral'),
(3, 1, 'IT', 'JUAN', '2024-05-15', '2024-05-16', 'VACACIONES', '2 dias');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro_horas`
--

CREATE TABLE `registro_horas` (
  `IdRegHora` int(11) NOT NULL,
  `IdEmpleado` int(11) NOT NULL,
  `FechaActual` varchar(10) NOT NULL,
  `HoraInicio` time DEFAULT NULL,
  `HoraFin` time DEFAULT NULL,
  `Razon` varchar(20) NOT NULL,
  `HoraInicioRaz` time DEFAULT NULL,
  `HoraFinRaz` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `registro_horas`
--

INSERT INTO `registro_horas` (`IdRegHora`, `IdEmpleado`, `FechaActual`, `HoraInicio`, `HoraFin`, `Razon`, `HoraInicioRaz`, `HoraFinRaz`) VALUES
(2, 1, '07-05-2024', '00:54:45', '00:54:46', 'DESCANSO', '00:54:49', '00:54:51');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `IdEmpleado` int(11) NOT NULL,
  `Usuario` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `FechaNac` date DEFAULT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Apellidos` varchar(120) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `DNI` varchar(20) NOT NULL,
  `Ciudad` varchar(50) NOT NULL,
  `Pais` varchar(50) NOT NULL,
  `Telefono` varchar(20) NOT NULL,
  `GrupoCotizacion` int(2) NOT NULL,
  `CategoriaProfesional` varchar(50) NOT NULL,
  `FechaAntiguedad` date DEFAULT NULL,
  `NumeroSeguridadSocial` bigint(12) NOT NULL,
  `Posicion` varchar(100) NOT NULL,
  `Departamento` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`IdEmpleado`, `Usuario`, `Password`, `FechaNac`, `Nombre`, `Apellidos`, `Email`, `DNI`, `Ciudad`, `Pais`, `Telefono`, `GrupoCotizacion`, `CategoriaProfesional`, `FechaAntiguedad`, `NumeroSeguridadSocial`, `Posicion`, `Departamento`) VALUES
(1, 'admin', 'Admin1234', '1995-01-09', 'ADMIN', 'ADMINISTRADOR', 'admin@workingtime.com', '58996451A', 'MADRID', 'ESPANIA', '651485269', 1, 'INGENIERO Y LICENCIADO', '2016-06-13', 123456789254, 'ADMINISTRADOR', 'IT'),
(2, 'lmparral', '0tG2RGmu6X8V', '1995-06-10', 'LIDIA', 'PARRAL', 'lmparral@workingtime.com', '53664585L', 'MADRID', 'ESPANIA', '659774820', 2, 'INGENIEROS TECNICOS, PERITOS Y AYUDANTES TITULADOS', '2022-03-16', 1236547859, 'DESARROLLADOR', 'IT'),
(3, 'egutierrez', 'Qr21fVYTeMai', '1992-03-14', 'ELENA', 'GUTIERREZ', 'egutierrez@workingtime.com', '56332147E', 'BRUSELAS', 'BELGICA', '620147522', 4, 'AYUDANTES NO TITULADOS', '2024-01-04', 1255786254, 'DIRECTOR', 'COMERCIAL');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `departamentos`
--
ALTER TABLE `departamentos`
  ADD PRIMARY KEY (`IdDepartamento`);

--
-- Indices de la tabla `documentos_empleados`
--
ALTER TABLE `documentos_empleados`
  ADD PRIMARY KEY (`IdDocumento`),
  ADD KEY `fk_idEmpleado` (`IdEmpleado`);

--
-- Indices de la tabla `nominas`
--
ALTER TABLE `nominas`
  ADD PRIMARY KEY (`IdNomina`),
  ADD KEY `IdEmpleado` (`IdEmpleado`);

--
-- Indices de la tabla `paises`
--
ALTER TABLE `paises`
  ADD PRIMARY KEY (`IdPais`);

--
-- Indices de la tabla `registro_ausencia`
--
ALTER TABLE `registro_ausencia`
  ADD PRIMARY KEY (`IdRegAus`),
  ADD KEY `IdEmpleado` (`IdEmpleado`);

--
-- Indices de la tabla `registro_horas`
--
ALTER TABLE `registro_horas`
  ADD PRIMARY KEY (`IdRegHora`),
  ADD KEY `IdEmpleado` (`IdEmpleado`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`IdEmpleado`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `documentos_empleados`
--
ALTER TABLE `documentos_empleados`
  MODIFY `IdDocumento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `nominas`
--
ALTER TABLE `nominas`
  MODIFY `IdNomina` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `registro_ausencia`
--
ALTER TABLE `registro_ausencia`
  MODIFY `IdRegAus` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `registro_horas`
--
ALTER TABLE `registro_horas`
  MODIFY `IdRegHora` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `IdEmpleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `documentos_empleados`
--
ALTER TABLE `documentos_empleados`
  ADD CONSTRAINT `fk_idEmpleado` FOREIGN KEY (`IdEmpleado`) REFERENCES `usuarios` (`IdEmpleado`);

--
-- Filtros para la tabla `nominas`
--
ALTER TABLE `nominas`
  ADD CONSTRAINT `nominas_ibfk_1` FOREIGN KEY (`IdEmpleado`) REFERENCES `usuarios` (`IdEmpleado`);

--
-- Filtros para la tabla `registro_ausencia`
--
ALTER TABLE `registro_ausencia`
  ADD CONSTRAINT `registro_ausencia_ibfk_1` FOREIGN KEY (`IdEmpleado`) REFERENCES `usuarios` (`IdEmpleado`);

--
-- Filtros para la tabla `registro_horas`
--
ALTER TABLE `registro_horas`
  ADD CONSTRAINT `registro_horas_ibfk_1` FOREIGN KEY (`IdEmpleado`) REFERENCES `usuarios` (`IdEmpleado`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
