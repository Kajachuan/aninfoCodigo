package aninfo;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
	private String nombre;
	private String cargo;
	private List<Rol> roles;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
		this.roles = new ArrayList<Rol>();
	}

	public String consultarNombre() {
		return nombre;
	}

	public void añadirRol(Rol rol) {
		roles.add(rol);
	}

	public void agregarCargo(String cargo) {
		this.cargo = cargo;
	}
}