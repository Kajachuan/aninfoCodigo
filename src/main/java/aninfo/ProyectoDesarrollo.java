package aninfo;

import java.util.ArrayList;
import java.util.List;

public class ProyectoDesarrollo {
	private int id;
	private List<Rol> roles;
    
	public ProyectoDesarrollo(int id) {
		this.id = id;
		this.roles = new ArrayList<Rol>();
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
}