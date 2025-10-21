package bucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		//Pide un numero para hacer la tabla
		
		System.out.println("Dime un numero y te dire la tabla");
		int num = sc.nextInt();
		
		//Variable para salir del bucle y para la tabla
		
		int i;
		
		for(i=0; i!=11 && num>1 && num<11; i++) {
		
		int resultado = num * i;
		System.out.println(num + " x " + i + " = " + resultado);
		
		}
		//Para mostrarlo en caso de que no entre en el rango el num
		
		if(num<1 || num>10) {
			System.out.println("Fuera de rango");
		}
	}
}