package bucles;

import java.util.Scanner;

public class Ejercicio5 {

	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el rango minimo");
		int minimo = sc.nextInt();
		System.out.println("Dame el rango maximo");
		int maximo = sc.nextInt();
		
		if(maximo>minimo) {
			
		System.out.println("Dame un numero dentro de ese rango");
		int num = sc.nextInt();
		
	
			
		while(num<minimo || num>maximo) {
			
			System.out.println("intentalo de nuevo");
			num = sc.nextInt();
			
			}	
		
		System.out.println("Numero dentro de rango");
		
		}else {
			System.out.println("Datos mal introducidos");
		}
		
		
	}
}
