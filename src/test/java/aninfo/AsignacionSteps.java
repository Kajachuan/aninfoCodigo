package aninfo;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//import static org.junit.Assert.assertTrue;

//import static org.junit.Assert.assertFalse;

public class AsignacionSteps {
	
	private ProyectoDesarrollo proyecto;
	private Empleado empleado;
	private final int idProyecto = 153;

	@Dado("^un proyecto de desarrollo existente$")
	public void un_proyecto_de_desarrollo_existente() throws Throwable {
		proyecto = new ProyectoDesarrollo(idProyecto);
	}

	@Cuando("^asigno al empleado \"(.*?)\" con rol \"(.*?)\"$")
	public void asigno_al_empleado_con_rol(String nombreEmpleado, String nombreRol) throws Throwable {
	    empleado = new Empleado(nombreEmpleado);
	    proyecto.asignarEmpleadoConRol(empleado, nombreRol);
	}

	@Entonces("^el rol del empleado \"(.*?)\" para dicho proyecto es \"(.*?)\"$")
	public void el_rol_del_empleado_para_dicho_proyecto_es(String nombreEmpleado, String nombreRol) throws Throwable {
	    assertEquals(nombreRol, proyecto.consultarRolDe(nombreEmpleado));
	}
	
	@Cuando("^asigno una lista de empleados con rol \"(.*?)\"$")
	public void asigno_una_lista_de_empleados_con_rol(String nombreRol, List<String> listaEmpleados) throws Throwable {
		List<Empleado> empleados = new ArrayList<Empleado>();
		for(String nombre : listaEmpleados) {
			Empleado nuevoEmpleado = new Empleado(nombre);
			empleados.add(nuevoEmpleado);
		}
		proyecto.asignarListaDeEmpleadosConRol(empleados, nombreRol);
	}

	@Entonces("^la lista de empleados para dicho proyecto es la lista dada$")
	public void la_lista_de_empleados_para_dicho_proyecto_es_la_lista_dada(List<String> empleados) throws Throwable {
		assertEquals(empleados, proyecto.consultarListaDeEmpleados());
	}
	
	private Map<Integer, ProyectoDesarrollo> proyectos = new HashMap<Integer, ProyectoDesarrollo>();
	private Map<String, Empleado> empleados = new HashMap<String, Empleado>();
	
	@Dado("^un proyecto \"(.*?)\" y un proyecto \"(.*?)\"$")
	public void un_proyecto_y_un_proyecto(int id1, int id2) throws Throwable {
		ProyectoDesarrollo proyecto1 = new ProyectoDesarrollo(id1);
		proyectos.put(id1, proyecto1);
		ProyectoDesarrollo proyecto2 = new ProyectoDesarrollo(id2);
		proyectos.put(id2, proyecto2);
	}

	@Cuando("^asigno a \"(.*?)\" al proyecto \"(.*?)\" con rol \"(.*?)\"$")
	public void asigno_a_al_proyecto_con_rol(String nombreEmpleado, int id, String nombreRol) throws Throwable {
	    if(!empleados.containsKey(nombreEmpleado)) {
	    	Empleado nuevoEmpleado = new Empleado(nombreEmpleado);
	    	empleados.put(nombreEmpleado, nuevoEmpleado);
	    }
	    
	    proyectos.get(id).asignarEmpleadoConRol(empleados.get(nombreEmpleado), nombreRol);
	}

	@Entonces("^el rol de \"(.*?)\" en el proyecto \"(.*?)\" es \"(.*?)\"$")
	public void el_rol_de_en_el_proyecto_es(String nombreEmpleado, int id, String nombreRol) throws Throwable {
	    assertEquals(nombreRol, proyectos.get(id).consultarRolDe(nombreEmpleado));
	}
}