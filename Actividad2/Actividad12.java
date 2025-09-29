package Actividad2;

import java.util.Scanner;

public class Actividad12 {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Dime que dia");
			int dia = sc.nextInt();
			System.out.println("Dime que mes");
			int mes = sc.nextInt();
			System.out.println("Dime que año");
			int año = sc.nextInt();
			
			if (mes==2 && dia<=28 && dia>0) {
				System.out.println("Es correcto es dia ");
			}else if(mes==3 && mes==4 && mes==9 && mes==10 && dia<=30 && dia>0) {
				System.out.println("Dime que año");
			}else if(mes<=12 && mes>0 && dia<=31 && dia>0) {
				System.out.println("Dime que año");
			}else {
				System.out.println("Esta fecha es incorrecta");
			}
		}
}