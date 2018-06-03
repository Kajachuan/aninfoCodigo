# language: es
Característica: Creación de proyecto de desarrollo

  Esquema del escenario: Crear un proyecto de desarrollo
    Dado un gestor de proyecto
    Cuando creo un proyecto con id <id>
    Entonces el proyecto se guarda con id <id>
    
  Ejemplos:
    | id    |
    | 1     |
    | 10    |
    | 100   |
    | 51548 |