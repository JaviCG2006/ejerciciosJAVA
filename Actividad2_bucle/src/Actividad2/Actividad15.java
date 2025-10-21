package Actividad2;

import java.util.Scanner;

public class Actividad15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero entre el 1 y el siete");
		int dia = sc.nextInt();
		
		if(dia>7 && dia<1) {
		System.out.println("Se sale del rango");
		}else if(dia == 1) {
		System.out.println("Es Lunes");
		}else if(dia == 2) {
		System.out.println("Es Martes");
		}else if(dia == 3) {
		System.out.println("Es Miercoles");
		}else if(dia == 4) {
		System.out.println("Es Jueves");
		}else if(dia == 5) {
		System.out.println("Es Viernes");
		}else if(dia == 6) {
		System.out.println("Es Sabado");
		}else if(dia == 7) {
		System.out.println("Es Domingo");
		}
		
	}
}
