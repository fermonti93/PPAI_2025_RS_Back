# PPAI 2025 - Backend

Este proyecto es el backend de una aplicación académica para gestión de proyectos red sismica de la catedra de diseño de softwar 2025

#### 1. **Tecnologías usadas**
  Este proyecto contara con el uso de lombock springboot posgressql y el lenguaje de programacion java y postman

#### 2. **Arquitectura**
se utilisara una ARQUITECTURA MULTICAPA

DTO (Data Transfer Object): Se utilizan para desacoplar la
representación de datos (la vista) de los objetos del
modelo.

Controller: Encargada de atender una solicitud desde el
momento en que es interceptada hasta la generación de la
respuesta y su transmisión. Cada clase de controlador debe
estar marcada con la anotación @RestController.

Service: Se encarga de contener la lógica de negocio de la
aplicación. Cada clase de servicio debe marcarse con la
anotación @Service.

Repository: Es la capa de persistencia de datos. Facilitan el
trabajo con diferentes tecnologías de acceso a datos como
JDBC, Hibernate o JPA de manera consistente. Cada clase
de repositorio debe estar marcada con la anotación
@Repository.
  
Entity (o Model): Una entidad representa una tabla
almacenada en una base de datos. Cada instancia de una
entidad representa una fila en la tabla. Cada clase de
entidad debe estar marcada con la anotación @Entity

#### 3. **Arquitectura**
se utilisara la rama main como produccion y se aran las pruebas y verciones inestables a aprtir de la rama prototipo
