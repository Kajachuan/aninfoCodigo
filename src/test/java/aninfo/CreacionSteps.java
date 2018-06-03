package aninfo;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

public class CreacionSteps {
	
	private Empleado gestorProyectos;
	private Map<Integer, ProyectoDesarrollo> proyectos = new HashMap<Integer, ProyectoDesarrollo>();

	@Dado("^un gestor de proyecto$")
	public void un_gestor_de_proyecto() throws Throwable {
		gestorProyectos = new Empleado("Arturi");
		gestorProyectos.agregarCargo("Gestor de Proyectos");
	}

	@Cuando("^creo un proyecto con id (\\d+)$")
	public void creo_un_proyecto_con_id(int id) throws Throwable {
	    ProyectoDesarrollo proyecto = new ProyectoDesarrollo(id);
	    proyectos.put(id, proyecto);
	}

	@Entonces("^el proyecto se guarda con id (\\d+)$")
	public void el_proyecto_se_guarda_con_id(int id) throws Throwable {
	    assertEquals(id, proyectos.get(id).consultarId());
	}
}
