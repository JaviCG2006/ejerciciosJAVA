package Actividad2;

import java.util.Scanner;

public class Actividad4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero");
		int numero1 = sc.nextInt();
		System.out.println("Dame otro numero numero");
		int numero2 = sc.nextInt();
		
		if(numero1 > numero2) {
			System.out.println("El numero " + numero1 + "es mayor que el numero " + numero2);
		}else if(numero2 > numero1) {
			System.out.println("El numero " + numero2 + "es mayor que el numero " + numero1);
		}else {
			System.out.println("Los numeros son iguales");
		}
		
	}

}


