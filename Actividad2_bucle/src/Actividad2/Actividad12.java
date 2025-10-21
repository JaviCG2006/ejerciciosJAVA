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
				System.out.println("Es correcta esta fecha");
			}else if(mes==6 || mes==4 || mes==9 || mes==11 && dia<=30 && dia>0) {
				System.out.println("Es correcta esta fecha");
			}else if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes == 10 || mes==12 && dia<=31 && dia>0) {
				System.out.println("Es correcta esta fecha");
			}else {
				System.err.println("Esta fecha es incorrecta");
			}
		}
}