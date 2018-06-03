package aninfo;

public class Iteracion {
	private String nombre;
	private Tarea tareaActual;
	
	public Iteracion(String nombre) {
		this.nombre = nombre;
		this.tareaActual = new Tarea("Análisis");
	}

	public String consultarNombre() {
		return nombre;
	}

	public Tarea consultarTareaActual() {
		return tareaActual;
	}
}
