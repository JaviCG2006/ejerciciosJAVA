package Actividad2;

import java.util.Scanner;

public class Actividad11 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuanto has sacado");
		int nota = sc.nextInt();
		
		if(nota<5 && nota>=0) {
			System.out.println("Suspenso");
		}else if(nota>=5 && nota<6) {
			System.out.println("Suficiente");
		}else if(nota>=6 && nota<7) {
			System.out.println("Bien");
		}else if(nota>=7 && nota<9) {
			System.out.println("Notable");
		}else if(nota>=9 && nota<=10) {
			System.out.println("Sobresaliente");
		}else {
			System.out.println("Eso es imposible");
		}
		
	}
}
