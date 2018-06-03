package aninfo;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;
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
}