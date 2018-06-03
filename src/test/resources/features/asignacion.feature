# language: es
Característica: Asignación de empleados a proyectos

  Esquema del escenario: Asignar un empleado con un rol específico
    Dado un proyecto de desarrollo existente
    Cuando asigno al empleado <empleado> con rol <rol>
    Entonces el rol del empleado <empleado> para dicho proyecto es <rol>
    
	Ejemplos:
    | empleado | rol |
    | "Arturi" | "Project Manager" |
    | "Avigliano" | "Analyst" |
    | "Cajachuán" | "Senior consultant" |
    | "Deciancio" | "Senior programmer" |
    | "Payaslian" | "Support engineer" |