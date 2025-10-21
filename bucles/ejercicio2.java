package bucles;

import java.util.Scanner;

public class ejercicio2 {
		public static void main(String [] args){
			Scanner sc = new Scanner(System.in);
			int menor = 0;
			int mayor = 0;
			int media = 0;
			int suma = 0;
			int num_media = 0 ;
			
			System.out.println("Dame la edad de un alumno");
			int edad = sc.nextInt();
			
			while(edad>=1) {
				
				suma = suma + edad;
				
			    num_media = ++num_media;
			    media = suma / num_media;
				
			    if(edad>=18) {
			    	mayor++;
			    }else {
			    	menor++;
			    }
				
			    System.out.println("Todas las edades sumadas dan: " + suma);
			    System.out.println("Todas las media dan " + media);
			    System.out.println("Hay " + mayor + " alumnos mayes de edad");
			    System.out.println("Hay " + menor + " alumnos menores de edad");
			    System.out.println("Hay " + num_media + " alumnos registrados");
			    
				System.out.println("Dame la edad de otro");
				int edad1 = sc.nextInt();
				edad = edad1;
			    
			}
			
		}
}