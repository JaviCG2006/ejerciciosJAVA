package bucles;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame una nota");
		int nota = sc.nextInt();
		int i;
		
		int suspenso = 0;
		int aprobado = 0;
		
		for ( i=0; i!=4 && nota>=0 && nota<=10; i++) {
			
			if(nota<5) {
				suspenso++;
				}
				else {
				aprobado++;
				}
			
			System.out.println("Dame otra nota");
			nota = sc.nextInt();
			
		}
		
		if(nota>=0 && nota<=10) {
			if(nota>=5) {
				aprobado++;
			
			}else if(nota<5) {
				suspenso++;
			}
			
		System.out.println("Han suspendido " + suspenso);
		System.out.println("Han aprobado " + aprobado);
		
		}else {
			System.out.println("Fuera del rango");
		}
	}
}
