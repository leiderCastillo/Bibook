
-- -----------------------------------------------------
-- Base de Datos con el nombre de mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Tabla Bibliotecario
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Bibliotecario` (
  `idBibliotecario` VARCHAR(45) NOT NULL,
  `BibliotecarioNombre` VARCHAR(150) NOT NULL,
  `BibliotecarioTelefono` VARCHAR(15) NULL,
  `BibliotecarioClave` VARCHAR(45) NULL,
  PRIMARY KEY (`idBibliotecario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Tabla Libro
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Libro` (
  `idLibro` INT NOT NULL,
  `LibroAutor` VARCHAR(150) NULL,
  `LibroNombre` VARCHAR(255) NOT NULL,
  `LibroEdicion` VARCHAR(45) NULL,
  `LibroPaginas` VARCHAR(5) NULL,
  `LibroGenero` VARCHAR(45) NULL,
  PRIMARY KEY (`idLibro`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Tabla Usuarios
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`Usuario` (
  `idUsuario` VARCHAR(45) NOT NULL,
  `UsuarioNombre` VARCHAR(255) NULL,
  `UsuarioTipoIdentificacion` VARCHAR(10) NULL,
  `UsuarioTelefono` VARCHAR(15) NULL,
  PRIMARY KEY (`idUsuario`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Tabla libros prestados
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`LibrosPrestados` (
  `idLibrosPrestados` INT NOT NULL AUTO_INCREMENT,
  `LibrosPrestadosSalida` VARCHAR(45) NULL,
  `LibrosPrestadosLlegada` VARCHAR(45) NULL,
  `Bibliotecario_idBibliotecario` VARCHAR(45) NOT NULL,
  `Usuario_idUsuario` VARCHAR(45) NOT NULL,
  `Libro_idLibro` INT NOT NULL,
  PRIMARY KEY (`idLibrosPrestados`),
  INDEX `fk_LibrosPrestados_Bibliotecario1_idx` (`Bibliotecario_idBibliotecario` ASC) VISIBLE,
  INDEX `fk_LibrosPrestados_Usuario1_idx` (`Usuario_idUsuario` ASC) VISIBLE,
  INDEX `fk_LibrosPrestados_Libro1_idx` (`Libro_idLibro` ASC) VISIBLE,
  CONSTRAINT `fk_LibrosPrestados_Bibliotecario1`
    FOREIGN KEY (`Bibliotecario_idBibliotecario`)
    REFERENCES `mydb`.`Bibliotecario` (`idBibliotecario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_LibrosPrestados_Usuario1`
    FOREIGN KEY (`Usuario_idUsuario`)
    REFERENCES `mydb`.`Usuario` (`idUsuario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_LibrosPrestados_Libro1`
    FOREIGN KEY (`Libro_idLibro`)
    REFERENCES `mydb`.`Libro` (`idLibro`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Tabla Lista Negra
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`ListaNegra` (
  `idListaNegra` INT NOT NULL AUTO_INCREMENT,
  `LibrosPrestados_idLibrosPrestados` INT NOT NULL UNIQUE,
  PRIMARY KEY (`idListaNegra`),
  INDEX `fk_ListaNegra_LibrosPrestados1_idx` (`LibrosPrestados_idLibrosPrestados` ASC) VISIBLE,
  CONSTRAINT `fk_ListaNegra_LibrosPrestados1`
    FOREIGN KEY (`LibrosPrestados_idLibrosPrestados`)
    REFERENCES `mydb`.`LibrosPrestados` (`idLibrosPrestados`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Llenar Tablas
-- -----------------------------------------------------
-- Llenando Bibliotecarios
INSERT INTO mydb.Bibliotecario (idBibliotecario, BibliotecarioNombre, BibliotecarioTelefono, BibliotecarioClave) VALUES('1', 'Martin', '12', '123');
INSERT INTO mydb.Bibliotecario (idBibliotecario, BibliotecarioNombre, BibliotecarioTelefono, BibliotecarioClave) VALUES('2', 'Jose', '13', '123');
INSERT INTO mydb.Bibliotecario (idBibliotecario, BibliotecarioNombre, BibliotecarioTelefono, BibliotecarioClave) VALUES('3', 'Lucho', '14', '123');
-- Llenando Libro
INSERT INTO mydb.Libro (idLibro, LibroAutor, LibroNombre, LibroEdicion, LibroPaginas, LibroGenero) VALUES(1, 'Luis', 'Maravillas del mundo', 'Segunda', '200', 'Aventura');
INSERT INTO mydb.Libro (idLibro, LibroAutor, LibroNombre, LibroEdicion, LibroPaginas, LibroGenero) VALUES(2, 'Daniela', 'La oscuridad', 'Primera', '134', 'Terror');
INSERT INTO mydb.Libro (idLibro, LibroAutor, LibroNombre, LibroEdicion, LibroPaginas, LibroGenero) VALUES(3, 'Pombo', 'Sin ti', 'Segunda', '40', 'Romantico');
INSERT INTO mydb.Libro (idLibro, LibroAutor, LibroNombre, LibroEdicion, LibroPaginas, LibroGenero) VALUES(4, 'Jose', 'Sombra perdida', 'Cuarta', '20', 'Romantico');
INSERT INTO mydb.Libro (idLibro, LibroAutor, LibroNombre, LibroEdicion, LibroPaginas, LibroGenero) VALUES(5, 'Pachon', 'Infinito', 'Cuarta', '140', 'Romantico');
INSERT INTO mydb.Libro (idLibro, LibroAutor, LibroNombre, LibroEdicion, LibroPaginas, LibroGenero) VALUES(6, 'Miguel', 'Caperucita', 'Cuarta', '20', 'Aventura');
-- Llenando Usuarios
INSERT INTO mydb.Usuario (idUsuario, UsuarioNombre, UsuarioTipoIdentificacion, UsuarioTelefono) VALUES('1', 'Kike', 'ID', '1');
INSERT INTO mydb.Usuario (idUsuario, UsuarioNombre, UsuarioTipoIdentificacion, UsuarioTelefono) VALUES('2', 'Jaime', 'CC', '2');
INSERT INTO mydb.Usuario (idUsuario, UsuarioNombre, UsuarioTipoIdentificacion, UsuarioTelefono) VALUES('3', 'Maverick', 'CC', '3');
-- Llenando LibrosPrestados
INSERT INTO mydb.LibrosPrestados ( LibrosPrestadosSalida, LibrosPrestadosLlegada, Bibliotecario_idBibliotecario, Usuario_idUsuario, Libro_idLibro) VALUES( '2023-03-10', '2023-04-01', '1', '2', 1);
INSERT INTO mydb.LibrosPrestados ( LibrosPrestadosSalida, LibrosPrestadosLlegada, Bibliotecario_idBibliotecario, Usuario_idUsuario, Libro_idLibro) VALUES( '2021-09-01', '2022-02-01', '1', '1', 2);
INSERT INTO mydb.LibrosPrestados ( LibrosPrestadosSalida, LibrosPrestadosLlegada, Bibliotecario_idBibliotecario, Usuario_idUsuario, Libro_idLibro) VALUES( '2023-02-01', '2023-06-12', '1', '3', 3);


-- -----------------------------------------------------
-- Procedimientos
-- -----------------------------------------------------
-- Devuelve el usuario que contenga esa contraseña y clave
CREATE PROCEDURE loginBibliotecario(in clave varchar(45),in id varchar(45))
SELECT  * FROM Bibliotecario
WHERE BibliotecarioClave=clave
AND  idBibliotecario=id
CALL  loginBibliotecario("123",1)

-- Obtener todos los libros prestados sin excepcion
CREATE PROCEDURE librosPrestados()
SELECT LibrosPrestados.LibrosPrestadosSalida, LibrosPrestados.LibrosPrestadosLlegada,Usuario.UsuarioNombre, Libro.LibroNombre, Bibliotecario.BibliotecarioNombre
FROM LibrosPrestados
INNER JOIN Libro
ON LibrosPrestados.Libro_idLibro  = Libro.idLibro
INNER JOIN Usuario
ON LibrosPrestados.Usuario_idUsuario = Usuario.idUsuario
INNER JOIN Bibliotecario
ON LibrosPrestados.Bibliotecario_idBibliotecario  = Bibliotecario.idBibliotecario
CALL librosPrestados()

-- Agregar Libro
CREATE PROCEDURE ingresarLibro(in id int(11),in autor varchar(150), in nombre varchar(255), in edicion varchar(45), in paginas varchar(5), in genero varchar(45))
INSERT INTO mydb.Libro (idLibro, LibroAutor, LibroNombre, LibroEdicion, LibroPaginas, LibroGenero)
VALUES (id, autor, nombre, edicion, paginas, genero);

-- Agregar Usuario
CREATE PROCEDURE ingresarUsuario(in id varchar(45),in nombre varchar(255),in cc varchar(10),in tel varchar(15))
INSERT INTO mydb.Usuario (idUsuario, UsuarioNombre, UsuarioTipoIdentificacion, UsuarioTelefono)
VALUES(id, nombre, cc, tel);

-- Agregar Bibliotecario
CREATE PROCEDURE ingresarBibliotecario(in id varchar(45),in nombre varchar(150), in telefono varchar(15), in clave varchar(15))
INSERT INTO mydb.Bibliotecario (idBibliotecario, BibliotecarioNombre, BibliotecarioTelefono, BibliotecarioClave)
VALUES(id, nombre, telefono, clave);

-- Obtener el nombre y telefono de usuario
CREATE PROCEDURE consultarUsuario(in id varchar(45))
SELECT Usuario.UsuarioNombre,Usuario.UsuarioTelefono
FROM Usuario
WHERE idUsuario = id

-- Obtener solo los libros que no han sido prestados
CREATE PROCEDURE consultarLibrosDisponibles()
SELECT Libro.LibroNombre, Libro.LibroAutor, Libro.idLibro, Libro.LibroEdicion ,Libro.LibroPaginas ,Libro.LibroGenero
FROM Libro
WHERE Libro.idLibro NOT IN (SELECT Libro_idLibro FROM LibrosPrestados)

-- Prestar un nuevo Libro
CREATE PROCEDURE prestarLibro(in fsalida varchar(45),in fingreso varchar(45),in idBibli varchar(45),idUser varchar(45), id int(11))
INSERT INTO mydb.LibrosPrestados(LibrosPrestadosSalida, LibrosPrestadosLlegada, Bibliotecario_idBibliotecario, Usuario_idUsuario, Libro_idLibro)
VALUES(fsalida,fingreso,idBibli,idUser,id);

-- Obtener libro, usuario, idLibroPrestados de libros prestados
CREATE PROCEDURE obtenerValoresEntrega(in id int(11))
SELECT Libro.LibroNombre, Usuario.UsuarioNombre, LibrosPrestados.idLibrosPrestados
FROM LibrosPrestados
INNER JOIN Libro
ON LibrosPrestados.Libro_idLibro = Libro.idLibro
INNER JOIN Usuario
ON LibrosPrestados.Usuario_idUsuario = Usuario.idUsuario
WHERE idLibrosPrestados=id

-- Se obtiene todas las fechas maximas de entrega
CREATE PROCEDURE fechaLimiteEntrega()
SELECT LibrosPrestados.idLibrosPrestados, LibrosPrestados.LibrosPrestadosLlegada
From LibrosPrestados

-- Entregar un nuevo libro
CREATE PROCEDURE entregarLibro(in id int(11))
BEGIN
DELETE FROM ListaNegra WHERE ListaNegra.LibrosPrestados_idLibrosPrestados=id;
DELETE FROM LibrosPrestados WHERE LibrosPrestados.idLibrosPrestados=id;
END;

-- Agregar a la lista negra
CREATE PROCEDURE AgregarAListaNegra(in id int(11))
INSERT INTO mydb.ListaNegra(LibrosPrestados_idLibrosPrestados) VALUES(id);

-- Obtener la lista para la tabla de lista negra
CREATE PROCEDURE obtenerValoresListaNegra()
	SELECT  Usuario.UsuarioNombre,Libro.LibroNombre ,LibrosPrestados.LibrosPrestadosSalida ,LibrosPrestados.LibrosPrestadosLlegada
	From LibrosPrestados
	Inner Join ListaNegra
	on ListaNegra.LibrosPrestados_idLibrosPrestados=LibrosPrestados.idLibrosPrestados
	Inner Join Usuario
	on Usuario.idUsuario=LibrosPrestados.Usuario_idUsuario
	Inner JOIN Libro
	ON Libro.idLibro = LibrosPrestados.Libro_idLibro








