package aninfo;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CreacionSteps {
	
	private Empleado gestorProyectos;
	private Map<Integer, ProyectoDesarrollo> proyectos = new HashMap<Integer, ProyectoDesarrollo>();

	@Dado("^un gestor de proyecto$")
	public void un_gestor_de_proyecto() throws Throwable {
		gestorProyectos = new Empleado("Arturi");
		gestorProyectos.agregarCargo("Gestor de Proyectos");
	}

	@Cuando("^crea un proyecto con id (\\d+)$")
	public void crea_un_proyecto_con_id(int id) throws Throwable {
		if(!proyectos.containsKey(id)); {
		    ProyectoDesarrollo proyecto = new ProyectoDesarrollo(id);
		    proyectos.put(id, proyecto);
		}
	}

	@Entonces("^el proyecto se guarda con id (\\d+)$")
	public void el_proyecto_se_guarda_con_id(int id) throws Throwable {
	    assertEquals(id, proyectos.get(id).consultarId());
	}
	
	@Cuando("^crea los proyectos de la lista$")
	public void crea_los_proyectos_de_la_lista(List<Integer> listaProyectos) throws Throwable {
	    for(int id : listaProyectos) {
	    	ProyectoDesarrollo proyecto = new ProyectoDesarrollo(id);
	    	proyectos.put(id, proyecto);
	    }
	}

	@Entonces("^todos los proyectos son los de la lista$")
	public void todos_los_proyectos_son_los_de_la_lista(List<Integer> listaProyectos) throws Throwable {
	    boolean ok = true;
	    Set<Integer> guardados = proyectos.keySet();
	    for(int id : guardados) {
	    	if(!listaProyectos.contains(id)) ok = false;
	    }
	    if(guardados.size() != listaProyectos.size()) ok = false;
	    
		assertTrue(ok);
	}
	
	@Cuando("^agrega el nombre \"(.*?)\" al proyecto (\\d+)$")
	public void agrega_el_nombre_al_proyecto(String nombre, int id) throws Throwable {
	    ProyectoDesarrollo proyecto = new ProyectoDesarrollo(id);
	    proyectos.put(id, proyecto);
	    proyectos.get(id).agregarNombre(nombre);
	}

	@Entonces("^el proyecto (\\d+) tiene el nombre \"(.*?)\"$")
	public void el_proyecto_tiene_el_nombre(int id, String nombre) throws Throwable {
		assertEquals(nombre, proyectos.get(id).consultarNombre());
	}
	
	@Entonces("^el proyecto creado con id (\\d+) tiene la fase \"(.*?)\"$")
	public void el_proyecto_creado_con_id_tiene_la_fase(int id, String nombreFase) throws Throwable {
	    assertEquals(nombreFase, proyectos.get(id).consultarFaseActual().consultarNombre());
	}
	
	@Entonces("^la iteración actual de la fase \"(.*?)\" en el proyecto (\\d+) es \"(.*?)\"$")
	public void la_iteración_actual_de_la_fase_en_el_proyecto_es(String nombreFase, int id, String nombreIter) throws Throwable {
	    assertEquals(nombreIter, proyectos.get(id).consultarFaseActual().consultarIteracionActual().consultarNombre());
	}
	
	@Entonces("^la tarea actual en el proyecto (\\d+) es \"(.*?)\"$")
	public void la_tarea_actual_en_el_proyecto_es(int id, String nombreTarea) throws Throwable {
	    assertEquals(nombreTarea, proyectos.get(id).consultarFaseActual().consultarIteracionActual().consultarTareaActual().consultarNombre());
	}
}
