# 1. escritor: id_escritor (primaria)
#    poema: id_poema (primaria)
#	 libros: id_libro (primaria)
#	 poema_libro: tiene 2 claves foraneas, id_poema [POEMA] y id_libro [LIBROS]

insert into escritor(nombre, apellido, direccion) values(
	"Charly",
    "Garcia",
    "caja"
);

update poema set titulo = "Mis mejores poemas", descripcion = "Una seleccion de los mejores poermas del autor" where id_poema = 1;

delete from libros where id_libro = 10;

select max(precio)
from libros;

select min(precio), avg(precio)
from libros;


select id_libro, count(id_poema) as cant
from poema_libros
having cant > 10;

#select id_libro from poema_libro where count(id_poema) > 10 group by id_libro;

select id_libro, count(id_poema)
from poema_libro
group by id_libro;

select poemas.titulo, poemas.descripcion, escritores.nombre, escritores.apellido from poemas 
inner join escritores on escritores.id_escritor = poemas.id_escritor;

select libros.titulo, poemas.descripcion from libros 

