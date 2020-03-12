package Ej2;

public class Capitulo {

	int numero;
	String contenido;
	int duracion;
	
	
	public Capitulo(int numero, String contenido, int duracion) {
		super();
		this.numero = numero;
		this.contenido = contenido;
		this.duracion = duracion;
	}


	@Override
	public String toString() {
		return "Capitulo [numero=" + numero + ", contenido=" + contenido + ", duracion=" + duracion + "]";
	}


	public int getDuracion() {
		return duracion;
	}
	
	
	
}
