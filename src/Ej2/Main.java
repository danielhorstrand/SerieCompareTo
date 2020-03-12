package Ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Serie> series = new ArrayList<Serie>();
		
		ArrayList<Capitulo> serial1 = new ArrayList<Capitulo>();
		Capitulo capitulo1 = new Capitulo(1,"aopdiapsodiapodiaopsdi", 30);
		serial1.add(capitulo1);
		Capitulo capitulo2 = new Capitulo(2,"aosfsdfsdfsdfsdfsdfsfpsodiapodiaopsdi", 33);
		serial1.add(capitulo2);
		
		Serie serie1 = new Serie("Juego de Tronos", serial1,"los 7 reinos y su dragones, que viene el invierno");
		series.add(serie1);
		
		ArrayList<Capitulo> serial2 = new ArrayList<Capitulo>();
		Capitulo capitulo11 = new Capitulo(1,"aocasopdfusoaduisaopdisopadisapod", 50);
		serial2.add(capitulo11);
		Capitulo capitulo12 = new Capitulo(2,"asopadisopadiposadipsoadipsadipasdipadiodi", 123);
		serial2.add(capitulo12);
		
		Serie serie2 = new Serie("Hander clander", serial2,"un señor de cuenca va a visiatar a su abuela que vive en chinchilla y le salen unso extraterrester verdes");
		series.add(serie2);
		
		Scanner sc = new Scanner(System.in);
		
		int opcion = 0;
		
		while(opcion!=4){
			
			System.out.println("Introduzca opcion\n 1) Listar Series \n 2) Ver Series \n 3) Comparar duracion Serie \n 4) Apagar");
			opcion = sc.nextInt();
			
			switch(opcion){
			
			case 1:
				for(int i=0;i< series.size();i++){
					series.get(i).MostrarResumen();
					System.out.println("*****************************");
				}
				break;
			case 2:
				System.out.println("Escoja la serie que quiere visualizar");
				for(int i=0;i< series.size();i++){
					System.out.println((i+1) + " " + series.get(i).GetNombre());
					System.out.println("*****************************");
				}
				int opcion2 = sc.nextInt();
				System.out.println("Escoja un capitulo... marque 0 para ver completa");
				int opcion3 = sc.nextInt();
				
				if(opcion3 == 0){
					
					series.get(opcion2-1).VerCompleta();
				}else
					series.get(opcion2-1).VerCapítulo(opcion3);
				break;
			case 3:
			     if (serie1.compareTo(serie2) < 0 ){
			    	 System.out.println("La serie "+serie1.nombre+" : es menor.\n"); 
			    	 }else if (serie1.compareTo(serie2) > 0 ){
			    		 System.out.println("La serie "+serie1.nombre+": es mayor.\n");
			    		 }else {
			    			 System.out.println ("La serie "+serie1.nombre+" es igual a la persona p2\n");
			    			 }
				break;
			case 4:
				System.out.println("OFF");
				break;
			default:
				break;
			}
		}
	}

}
