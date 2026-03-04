# Book Management API 📚

REST API desarrollada con Spring Boot para la gestión de una biblioteca, permitiendo administrar:

- Personas
- Autores
- Localidades
- Relaciones entre entidades

El proyecto sigue una arquitectura en capas y aplica buenas prácticas de desarrollo backend.

## 🚀 Tecnologías utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate Envers (auditing)
- MySQL
- Maven
- Postman (API testing)

## 🏗 Arquitectura

La aplicación sigue una arquitectura en capas:

- Controller (REST endpoints)
- Service (lógica de negocio)
- Repository (acceso a datos usando JPA)
- Entity (modelado de bases de datos con anotaciones JPA)
- Config (configuraciones personalizadas, incluido soporte de auditoría con Hibernate Envers)

## 🔄 Controlador básico genérico

El proyecto incluye un BaseControllerImpl genérico que centraliza las operaciones CRUD comunes, lo que promueve:

- Reutilización de código
- Arquitectura limpia
- Reducción de duplicaciones
- Mejor escalabilidad para futuras entidades

## 📌 Funcionalidades principales

- Operaciones CRUD para:
    * Personas
    * Autores
    * Localidades
- Relaciones entre entidades (p. ej., Persona → Localidad)
- Búsqueda dinámica por filtro
- Búsqueda paginada
- Validación básica de datos
- Auditoría automática de cambios en las entidades mediante Hibernate Envers

## 🔎 Search & Pagination

PersonaController incluye dos puntos de búsqueda:
    * GET /personas/search?filtro=value
    * GET /personas/searchPaged?filtro=value&page=0&size=10
El segundo punto de búsqueda admite la paginación a través de la interfaz Pageable de Spring, lo que permite una recuperación de datos escalable.

## 🔍 Ejemplos de endpoints

- GET     /personas
- POST    /personas
- PUT     /personas/{id}
- DELETE  /personas/{id}
- GET     /autores
- GET     /localidades

Ejemplo de búsqueda:
- GET /personas/paged?page=1&size=5&sort=id,desc
- GET /personas/searchPaged?filtro=a&page=0&size=5&sort=id,desc

## 🧾 Sistema de auditoría

La aplicación integra Hibernate Envers para rastrear automáticamente los cambios en las entidades.
Cada modificación genera una entrada de revisión que se almacena en una tabla de revisiones específica, lo que permite el seguimiento histórico de los cambios.

## 🧪 Testing

Todos los puntos finales se probaron utilizando colecciones de Postman.

## ▶️ Cómo ejecutar

1. Configurar MySQL
2. Ajustar credenciales en `application.properties`
3. Ejecutar:
```
mvn spring-boot:run
```
4. La aplicación se ejecuta de forma predeterminada en:
```
http://localhost:8080
```

## 🎯 Objetivo del proyecto

Este proyecto se desarrolló para practicar y demostrar:
- Diseño de API REST
- Arquitectura de backend en capas
- Relaciones entre entidades JPA
- Abstracción de controladores genéricos
- Paginación y consultas dinámicas
- Mecanismos de auditoría en aplicaciones empresariales
- Separación clara de responsabilidades
