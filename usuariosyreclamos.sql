-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               8.0.31 - MySQL Community Server - GPL
-- Server OS:                    Win64
-- HeidiSQL Version:             12.2.0.6576
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for usuariosyreclamos
CREATE DATABASE IF NOT EXISTS `usuariosyreclamos` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `usuariosyreclamos`;

-- Dumping structure for table usuariosyreclamos.logins
CREATE TABLE IF NOT EXISTS `logins` (
  `idlogin` int NOT NULL AUTO_INCREMENT,
  `date` date DEFAULT NULL,
  `time` time DEFAULT NULL,
  `personaid2` int NOT NULL,
  PRIMARY KEY (`idlogin`,`personaid2`),
  UNIQUE KEY `idlogin_UNIQUE` (`idlogin`),
  KEY `personaid2_idx` (`personaid2`),
  CONSTRAINT `personaid2` FOREIGN KEY (`personaid2`) REFERENCES `personas` (`personaid`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table usuariosyreclamos.logins: ~49 rows (approximately)
INSERT INTO `logins` (`idlogin`, `date`, `time`, `personaid2`) VALUES
	(1, '2020-10-02', '15:30:00', 1),
	(2, '2020-11-01', '16:30:00', 2),
	(3, '2021-03-04', '17:45:00', 2),
	(4, '2020-10-06', '19:30:00', 3),
	(5, '2020-11-05', '20:30:00', 3),
	(6, '2021-03-08', '21:18:00', 3),
	(9, '2022-11-19', '10:45:52', 2),
	(10, '2022-11-19', '12:00:30', 1),
	(11, '2022-11-19', '12:05:11', 2),
	(12, '2022-11-19', '12:06:26', 2),
	(13, '2022-11-19', '12:08:27', 2),
	(14, '2022-11-19', '12:08:50', 1),
	(15, '2022-11-19', '12:30:32', 2),
	(16, '2022-11-19', '12:49:32', 2),
	(17, '2022-11-19', '12:57:26', 3),
	(18, '2022-11-19', '13:07:33', 3),
	(19, '2022-11-19', '14:53:31', 3),
	(20, '2022-11-19', '14:55:14', 1),
	(21, '2022-11-19', '16:55:18', 2),
	(22, '2022-11-19', '16:58:43', 2),
	(23, '2022-11-19', '17:00:07', 2),
	(24, '2022-11-19', '17:02:25', 2),
	(25, '2022-11-19', '17:02:51', 3),
	(26, '2022-11-19', '17:08:03', 2),
	(27, '2022-11-19', '17:12:32', 2),
	(28, '2022-11-22', '15:48:16', 2),
	(29, '2022-11-22', '15:48:28', 3),
	(30, '2022-11-22', '15:50:44', 1),
	(31, '2022-11-22', '15:57:54', 2),
	(32, '2022-11-22', '16:44:08', 2),
	(33, '2022-11-22', '17:00:21', 2),
	(34, '2022-11-22', '21:27:34', 2),
	(35, '2022-11-23', '14:38:07', 2),
	(36, '2022-11-23', '14:40:50', 2),
	(37, '2022-11-23', '15:05:33', 2),
	(38, '2022-11-23', '16:26:39', 2),
	(39, '2022-11-23', '16:27:58', 1),
	(40, '2022-11-23', '16:32:32', 2),
	(41, '2022-11-23', '16:37:57', 3),
	(42, '2022-11-23', '16:38:10', 2),
	(43, '2022-11-23', '16:38:38', 3),
	(44, '2022-11-23', '16:41:17', 3),
	(45, '2022-11-23', '16:43:13', 2),
	(46, '2022-11-23', '16:43:38', 3),
	(47, '2022-11-23', '18:15:57', 2),
	(48, '2022-11-23', '18:16:35', 3),
	(49, '2022-11-23', '18:18:53', 2),
	(50, '2022-11-23', '18:19:30', 2),
	(51, '2022-11-23', '18:19:59', 3),
	(52, '2022-11-23', '18:20:41', 3),
	(53, '2022-11-23', '18:23:26', 3),
	(54, '2022-11-23', '18:29:54', 2),
	(55, '2022-11-28', '17:48:55', 2),
	(56, '2022-11-28', '17:53:13', 3),
	(57, '2022-11-28', '17:57:09', 3),
	(58, '2022-11-28', '18:47:09', 2);

-- Dumping structure for table usuariosyreclamos.personas
CREATE TABLE IF NOT EXISTS `personas` (
  `personaid` int NOT NULL AUTO_INCREMENT,
  `dni` varchar(15) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `mail` varchar(50) NOT NULL,
  `telefonoMovil` varchar(40) NOT NULL,
  `nombre_usuario` varchar(40) NOT NULL,
  `contrasenia` varchar(50) NOT NULL,
  `esAdmin` tinyint DEFAULT NULL,
  PRIMARY KEY (`personaid`),
  UNIQUE KEY `nombreUsuario_UNIQUE` (`nombre_usuario`),
  UNIQUE KEY `personaid_UNIQUE` (`personaid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table usuariosyreclamos.personas: ~7 rows (approximately)
INSERT INTO `personas` (`personaid`, `dni`, `nombre`, `apellido`, `mail`, `telefonoMovil`, `nombre_usuario`, `contrasenia`, `esAdmin`) VALUES
	(1, '55487621', 'romeo', 'santos', 'romeosantos@gmail.com', '00000000', 'romeoSantito', '1234', 0),
	(2, '33421675', 'ricky', 'martin', 'rickymartin@gmail.com', '11111111', 'rickyElMartin', '12345', 0),
	(3, '65123458', 'alejandro', 'sanz', 'alesanz@outlook.com', '02316554', 'AleSanz', '123456', 1),
	(5, '42548987', 'dante', 'zalazar', 'dante.zalazar@gmail.com', '1124896815', 'danteZalazar', '123456789', NULL),
	(9, '51385942', 'Juan', 'Carlos', 'juancarlos@gmail.com', '555000666', 'juan2020', '1234', NULL),
	(10, '11282864', 'Doña', 'Florinda', 'doña.florinda@hotmail.com', '555666777', 'doñaFlorinda', '1234', NULL),
	(11, '43054666', 'Dante', 'Nishi', 'dante1204@gmail.com', '1134386000', 'DanteLin', '2103', NULL);

-- Dumping structure for table usuariosyreclamos.reclamos
CREATE TABLE IF NOT EXISTS `reclamos` (
  `reclamoid` int NOT NULL AUTO_INCREMENT,
  `fechaSeCreo` date DEFAULT NULL,
  `fechaSeResolvio` date DEFAULT NULL,
  `categoria` varchar(20) NOT NULL,
  `calle` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `altura` int DEFAULT NULL,
  `descripcion` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `personaid1` int NOT NULL,
  PRIMARY KEY (`reclamoid`,`personaid1`),
  UNIQUE KEY `reclamoid_UNIQUE` (`reclamoid`),
  KEY `personaid1_idx` (`personaid1`),
  CONSTRAINT `personaid1` FOREIGN KEY (`personaid1`) REFERENCES `personas` (`personaid`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- Dumping data for table usuariosyreclamos.reclamos: ~16 rows (approximately)
INSERT INTO `reclamos` (`reclamoid`, `fechaSeCreo`, `fechaSeResolvio`, `categoria`, `calle`, `altura`, `descripcion`, `personaid1`) VALUES
	(1, '2020-10-02', '2020-10-06', 'ALUMBRADO', 'Lope de Vega', 3600, 'luz calle rota', 2),
	(2, '2020-11-01', '2020-11-05', 'PLUVIAL', 'Lope de Vega', 3700, 'Arbol callo sobre mi', 2),
	(3, '2021-03-04', '2021-03-08', 'LIMPIEZA', 'Jonte', 1233, 'tacho basura roto', 1),
	(13, '2022-12-14', '2022-12-15', 'ALUMBRADO', 'Mercedes', 444, NULL, 3),
	(14, '2022-12-14', NULL, 'ALUMBRADO', 'Marianito', 2, NULL, 3),
	(15, '2022-12-14', '2022-12-15', 'PLUVIAL', 'Mariano', 6, NULL, 3),
	(18, '2022-12-15', NULL, 'ALUMBRADO', 'Tinogasta', 1246, NULL, 3),
	(19, '2022-12-15', NULL, 'ARBOLADO', 'Moron', 1856, NULL, 3),
	(20, '2022-12-15', NULL, 'LIMPIEZA', 'Ituzaingo', 1225, NULL, 3),
	(21, '2022-12-15', NULL, 'PLUVIAL', 'Posadas', 1052, NULL, 3),
	(22, '2022-12-15', NULL, 'ALUMBRADO', 'Av Independencia ', 1326, NULL, 3),
	(23, '2022-12-15', NULL, 'ALUMBRADO', 'Av Doctor Honorio Pueyrredón', 924, NULL, 3),
	(24, '2022-12-15', NULL, 'ARBOLADO', 'Av Santa Fe', 702, NULL, 3),
	(25, '2022-12-15', NULL, 'LIMPIEZA', 'Av L. Lugones', 395, NULL, 3),
	(26, '2022-12-15', NULL, 'PLUVIAL', 'Adolfo Alsina', 2369, NULL, 3),
	(27, '2022-12-15', NULL, 'PLUVIAL', 'Avellaneda', 300, NULL, 3);

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
