package aninfo;

public class Fase {
	private String nombre;
	private Iteracion iterActual;
	
	public Fase(String nombre) {
		this.nombre = nombre;
		this.iterActual = new Iteracion("Iteración 1");
	}

	public String consultarNombre() {
		return nombre;
	}

	public Iteracion consultarIteracionActual() {
		return iterActual;
	}

}
