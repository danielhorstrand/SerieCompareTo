package Ej2;

import java.util.ArrayList;

public class Serie implements Comparable<Serie>{
	
	String nombre;
	ArrayList<Capitulo> capitulos;
	String sinopsis;
	
	
	
	public Serie(String nombre, ArrayList<Capitulo> capitulos, String sinopsis) {
		super();
		this.nombre = nombre;
		
		this.capitulos = new ArrayList<Capitulo>();
		this.capitulos = capitulos;
		
		this.sinopsis = sinopsis;
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

	public int compareTo(Serie x) {
		int duraciontotal = 0;
		for(int i = 0; i<this.capitulos.size();i++ ){			
			duraciontotal += this.capitulos.get(i).duracion;
		}
		int resultado=0;
		if(duraciontotal<x.DuracionTotal()){
			resultado=-1;
		}else if (duraciontotal<x.DuracionTotal()){
				resultado=1;
			}else {   resultado = 0;   }
		return resultado;
	}
}
