# language: es
Característica: Asignación de empleados a proyectos

  Esquema del escenario: Asignar un empleado con un rol específico
    Dado un proyecto de desarrollo existente
    Cuando asigno al empleado <empleado> con rol <rol>
    Entonces el rol del empleado <empleado> para dicho proyecto es <rol>
    
  Ejemplos:
    | empleado    | rol                 |
    | "Arturi"    | "Project Manager"   |
    | "Avigliano" | "Analyst"           |
    | "Cajachuán" | "Senior consultant" |
    | "Deciancio" | "Senior programmer" |
    | "Payaslian" | "Support engineer"  |

  Esquema del escenario: Asignar una lista de empleados en el proyecto
    Dado un proyecto de desarrollo existente
  	Cuando asigno una lista de empleados con rol <rol>
  	  | "Arturi"    |
  	  | "Avigliano" |
  	  | "Cajachuán" |
  	  | "Deciancio" |
  	  | "Payaslian" |
  	Entonces la lista de empleados para dicho proyecto es la lista dada
  	  | "Arturi"    |
  	  | "Avigliano" |
  	  | "Cajachuán" |
  	  | "Deciancio" |
  	  | "Payaslian" |
  	  
  Ejemplos:
    | rol |
    | "Project Manager"   |
    | "Analyst"           |
    | "Senior consultant" |
    | "Senior programmer" |
    | "Support engineer"  |
    
  Esquema del escenario: Asignar empleado a dos proyectos con dos roles distintos
    Dado un proyecto "1" y un proyecto "2"
    Cuando asigno a <empleado> al proyecto "1" con rol <rol1>
    Y asigno a <empleado> al proyecto "2" con rol <rol2>
    Entonces el rol de <empleado> en el proyecto "1" es <rol1>
    Y el rol de <empleado> en el proyecto "2" es <rol2>
    
  Ejemplos:
    | empleado    | rol1                | rol2                |
    | "Arturi"    | "Project Manager"   | "Analyst"           |
    | "Avigliano" | "Analyst"           | "Senior consultant" |
    | "Cajachuán" | "Senior consultant" | "Senior programmer" |
    | "Deciancio" | "Senior programmer" | "Support engineer"  |
    | "Payaslian" | "Support engineer"  | "Project Manager"   |