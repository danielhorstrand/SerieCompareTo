package Ej2;

import java.util.ArrayList;

public class Serie implements Comparable<Serie>{
	
	double valoracion;
	String nombre;
	ArrayList<Capitulo> capitulos;
	String sinopsis;
	
	
	
	public Serie(String nombre, ArrayList<Capitulo> capitulos, String sinopsis,double valoracion) {
		super();
	
		this.nombre = nombre;
		
		this.capitulos = new ArrayList<Capitulo>();
		this.capitulos = capitulos;
		
		this.sinopsis = sinopsis;
		this.valoracion = valoracion;
	}
	
	
	public void MostrarResumen(){
		
		System.out.println("Serie [nombre=" + nombre + ", capitulos=" + capitulos + ", sinopsis=" + sinopsis + "Numero capitulos: " + NumeroCapitulos() + "Duracion Total: " + DuracionTotal() + "]");
		
	}
	

	
	public void VerCompleta(){
		
		for(int i = 0; i<this.capitulos.size();i++ ){
			
			System.out.println(this.capitulos.get(i).toString());
		}
		
	}
	
	public void VerCapítulo(int numCap){
		
		if(numCap <= this.capitulos.size()){
			System.out.println(this.capitulos.get(numCap-1).toString());
		}
		else
			System.out.println("No existe ese capítulo");
	}
	
	public int NumeroCapitulos(){
		
		return this.capitulos.size();
		
	}
	
	public int DuracionTotal(){
		int duraciontotal = 0;
		for(int i = 0; i<this.capitulos.size();i++ ){
			
			duraciontotal += this.capitulos.get(i).duracion;
		}
		return duraciontotal;
	}
	
	public String GetNombre(){
		return this.nombre;
	}

	
	public double getValoracion() {
		return valoracion;
	}


	public int compareTo(Serie x) {

		int resultado=0;	
		if(this.valoracion<x.valoracion){
			resultado=-1;
		}else if (this.valoracion>x.valoracion){
				resultado=1;
			}else {   resultado = 0;   }
		return resultado;
	}


	@Override
	public String toString() {
		return "Serie [nombre=" + nombre + ", capitulos=" + capitulos + ", sinopsis="
				+ sinopsis +" valoracion=" + valoracion + "]\n";
	}
	
}
