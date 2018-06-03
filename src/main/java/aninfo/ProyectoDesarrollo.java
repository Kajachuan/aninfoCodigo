package aninfo;

import java.util.ArrayList;
import java.util.List;

public class ProyectoDesarrollo {
	private int id;
	private List<Rol> roles;
	private String nombre;
	private Fase faseActual;
    
	public ProyectoDesarrollo(int id) {
		this.id = id;
		this.roles = new ArrayList<Rol>();
		this.faseActual = new Fase("Inicio");
	}

	public void asignarEmpleadoConRol(Empleado empleado, String nombreRol) {
		Rol rol = new Rol(empleado, this, nombreRol);
		empleado.añadirRol(rol);
		roles.add(rol);
	}

	public String consultarRolDe(String nombreEmpleado) {
		for(Rol rol : roles) {
			if(rol.consultarNombre() == nombreEmpleado) {
				return rol.colsultarRol();
			}
		}
		
		return "Empleado no asignado";
	}

	public void asignarListaDeEmpleadosConRol(List<Empleado> empleados, String nombreRol) {
		for(Empleado empleado : empleados) {
			asignarEmpleadoConRol(empleado, nombreRol);
		}
	}

	public List<String> consultarListaDeEmpleados() {
		List<String> empleados = new ArrayList<String>();
		for(Rol rol : roles) {
			empleados.add(rol.consultarNombre());
		}
		return empleados;
	}

	public int consultarId() {
		return id;
	}

	public void agregarNombre(String nombre) {
		this.nombre = nombre;
	}

	public String consultarNombre() {
		return nombre;
	}

	public Fase consultarFaseActual() {
		return faseActual;
	}
}