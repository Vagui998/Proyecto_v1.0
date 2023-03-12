# Proyecto Final - Primera Entrega

Este proyecto corresponde a la primera entrega del proyecto final de la asignatura Desarrollo Web, bajo la dirección del profesor John Faber Ramírez Castillo, desarrollado por Juan Manuel Aguiar y Andrés Felipe Duarte.

## Descripción del proyecto

El proyecto consiste en el desarrollo de una aplicación web para un gremio de ferreterías a nivel nacional que busca realizar un proceso de transformación digital. La aplicación tiene como objetivo publicitar los diferentes tipos de herramientas con los que cuentan a nivel nacional, mostrando la imagen de la herramienta, el nombre, descripción, marca, precio de referencia, ciudades en las que se encuentra ubicada y cantidad disponible.

Dicho contenido estará abierto a todo público, pero la administración del inventario de herramientas será exclusiva de un grupo de usuarios determinado por la junta del gremio.

### Requerimientos No Funcionales:

- Autenticación y Autorización: El módulo de administración de inventario y usuarios (Consulta, Creación, Modificación, Eliminación) debe ser accedido únicamente por usuarios registrados y autenticados en la aplicación.

### Requerimientos Funcionales:

- Debe contar con un módulo para gestión de usuarios (Listar, Crear, Modificar, Inactivar). Para los usuarios se debe contemplar la identificación, nombres y apellidos, fecha de nacimiento y ciudad de ubicación.
- Módulo para gestión de inventario de herramientas (Listar, Crear, Modificar, Eliminar).
- Vista principal que puede ser accedida por todo público donde se muestran las herramientas disponibles, adicionalmente se pueda realizar una búsqueda por nombre y aplicar un filtro de búsqueda por marca.
- La funcionalidad de listar, en los módulos de gestión de usuarios y herramientas debe ser paginada, con el fin de mejorar la experiencia de usuario y desempeño de la aplicación.

### Restricciones Técnicas:

- La aplicación debe ser desarrollada siguiendo los principios SOLID.
- La layer de presentación de la aplicación o Frontend debe ser desarrollada haciendo uso del framework de Angular en versión 15 (https://angular.io/). La aplicación debe ser responsive.
- La layer de negocio o backend debe ser desarrollada siguiendo una arquitectura basada en microservicios haciendo uso del framework SpringBoot preferiblemente versión 3.0.2 con el lenguaje de programación Java versión 11 o superior.
- Se deben construir mínimo 3 microservicios.
- Se puede utilizar bases de datos SQL o NoSQL.
- Los proyectos sobre los cuales se trabaje el desarrollo deben incluir pruebas unitarias que garanticen al menos un cubrimiento del 75%.

## Primera Entrega

Para la primera entrega del proyecto, se deben desarrollar los siguientes elementos:

- Microservicios con Gestión de Usuarios y Herramientas expuestos a través de Rest Services.
- Postman Collection que permita validar los servicios.

## Autores

- Juan Manuel Aguiar
- Andrés Felipe Duarte
