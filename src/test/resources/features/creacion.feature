# language: es
Característica: Creación de proyecto de desarrollo

  Esquema del escenario: Crear un proyecto de desarrollo
    Dado un gestor de proyecto
    Cuando crea un proyecto con id <id>
    Entonces el proyecto se guarda con id <id>
    
  Ejemplos:
    | id    |
    | 1     |
    | 10    |
    | 100   |
    | 51548 |
    
  Escenario: Consultar los proyectos actuales
    Dado un gestor de proyecto
  	Cuando crea los proyectos de la lista
  	  | 5  |
  	  | 15 |
  	  | 25 |
  	Entonces todos los proyectos son los de la lista
  	  | 5  |
  	  | 15 |
  	  | 25 |
  	  
  Esquema del escenario: Asignar nombre al proyecto
    Dado un gestor de proyecto
    Cuando agrega el nombre <nombre> al proyecto <id>
    Entonces el proyecto <id> tiene el nombre <nombre>
    
  Ejemplos:
    | id | nombre      |
    | 1  | "Proyecto1" |
    | 2  | "Sarasa"    |
    | 3  | "PSA"       |
    
  Esquema del escenario: Crear el proyecto con fase inicial
    Dado un gestor de proyecto
    Cuando crea un proyecto con id <id>
    Entonces el proyecto creado con id <id> tiene la fase "Inicio"
    
  Ejemplos:
    | id   |
    | 1    |
    | 5    |
    | 48   |
    | 1848 |
  	
  Esquema del escenario: Crear el proyecto con la primera iteración
    Dado un gestor de proyecto
    Cuando crea un proyecto con id <id>
    Entonces el proyecto creado con id <id> tiene la fase "Inicio"
    Y la iteración actual de la fase "Inicio" en el proyecto <id> es "Iteración 1"
    
  Ejemplos:
    | id |
    | 2  |
    | 4  |
    | 6  |
    
  Esquema del escenario: Crear el proyecto con la primera tarea
    Dado un gestor de proyecto
    Cuando crea un proyecto con id <id>
    Entonces el proyecto creado con id <id> tiene la fase "Inicio"
    Y la iteración actual de la fase "Inicio" en el proyecto <id> es "Iteración 1"
    Y la tarea actual en el proyecto <id> es "Análisis"
    
  Ejemplos:
    | id    |
    | 484   |
    | 51848 |
    | 2848  |