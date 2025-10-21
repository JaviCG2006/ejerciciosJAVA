package Actividad2;

import java.util.Scanner;

public class Actividad9 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero entero");
		int num = sc.nextInt();
		
		if(num>=1 && num<10) {
		System.out.println("Este numero tiene 1 cifra");
		}
		else if(num>=10 && num<100) {
		System.out.println("Este numero tiene 2 cifra");
		}
		else if(num>=100 && num<1000) {
		System.out.println("Este numero tiene 3 cifra");
		}
		else if(num>=1000 && num<10000) {
		System.out.println("Este numero tiene 4 cifra");	
		}
		else if(num>=10000 && num<100000) {
		System.out.println("Este numero tiene 5 cifra");
		}
		else if(num>100000) {
		System.out.println("Este numero tiene 6 cifra");
		}
		else if(num>100000) {
		System.out.println("Este numero se pasa de lo comprendido");
		}
		else if(num<0){
		System.out.println("Este numero es menor de lo comprendido");
		}
	}
}
