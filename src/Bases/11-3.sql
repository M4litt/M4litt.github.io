DELETE FROM alumnos WHERE Dni = 42845014;
UPDATE Notas SET 1_trim = 1 WHERE id_alumno = 25 AND id_materia = 8;
SELECT Nombre, Cant_horas, Aula FROM Materias WHERE Curso = "3C" ORDER BY Nombre ASC;
DELETE FROM Alumnos WHERE Curso = "6C";
UPDATE alumnos SET Curso = "5C" WHERE Curso = "4C";
SELECT Dni, Nombre, fechaNacimiento FROM alumnos WHERE Curso = "4C" ORDER BY fechaNacimiento DESC;
DROP TABLE Notas;
SELECT MAX(1_trim) FROM Notas WHERE id_materia = 2;
SELECT AVG(Diciembre) FROM Notas WHERE id_materia = 3;
insert into alumnos(Dni, Nombre, Direccion, Telefono, Curso, Fecha_nacimiento) values
( 8,
"Joaquin Esteban Maier",
"caja",
123321,
"gordo",
"02-02-2022"
);
