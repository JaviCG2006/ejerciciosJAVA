package Actividad2;

import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero");
		int numero1 = sc.nextInt();
		System.out.println("Dame otro numero numero");
		int numero2 = sc.nextInt();
		
		if(numero1 == numero2) {
			System.out.println("Los numeros son los mismos");
			
		}else {
			System.out.println("Los numeros no son iguales");
		}
	}
}
