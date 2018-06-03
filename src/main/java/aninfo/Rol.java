package aninfo;

public class Rol {
	private Empleado empleado;
	private ProyectoDesarrollo proyecto;
	private String nombre;
	
	public Rol(Empleado empleado, ProyectoDesarrollo proyecto, String nombre) {
		this.empleado = empleado;
		this.proyecto = proyecto;
		this.nombre = nombre;
	}

	public String consultarNombre() {
		return empleado.consultarNombre();
	}

	public String colsultarRol() {
		return nombre;
	}
}