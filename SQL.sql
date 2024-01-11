-- Adminer 4.8.1 MySQL 8.0.26 dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

CREATE DATABASE `banco` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `banco`;

DROP TABLE IF EXISTS `Personas`;
CREATE TABLE `Personas` (
  `Rut` varchar(20) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Apellido` varchar(20) NOT NULL,
  `Telefono` varchar(20) NOT NULL,
  `FechaIngreso` varchar(20) NOT NULL,
  PRIMARY KEY (`Rut`),
  UNIQUE KEY `Rut` (`Rut`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `Personas` (`Rut`, `Nombre`, `Apellido`, `Telefono`, `FechaIngreso`) VALUES
('24980047',	'David',	'Castillo',	'04148176793',	'12/12/2021');

DROP TABLE IF EXISTS `Usuarios`;
CREATE TABLE `Usuarios` (
  `Username` varchar(20) NOT NULL,
  `Password` varchar(20) NOT NULL,
  `Persona` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  KEY `Persona` (`Persona`),
  CONSTRAINT `Usuarios_ibfk_1` FOREIGN KEY (`Persona`) REFERENCES `Personas` (`Rut`) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `Usuarios` (`Username`, `Password`, `Persona`) VALUES
('vikruzdavid',	'12345',	'24980047');

-- 2021-10-18 19:51:29