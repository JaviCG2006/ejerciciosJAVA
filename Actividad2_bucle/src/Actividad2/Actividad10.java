package Actividad2;

import java.util.Scanner;

public class Actividad10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dame un numero entero");
		int num = sc.nextInt();
		int unidades = 0;
		int centenas = 0;
		int decenas = 0;
		int mil = 0;

		if (num < 10 && num > 0) {
			System.out.println("Este numero solo tiene una cifra");

		} else if (num <= 100 && num > 0) {
			unidades = num % 10;
			decenas = num / 10;
			
			if(unidades == decenas) {
			System.out.println("El numero " + num + " es capicua");
			
			} else {
				System.out.println("El numero " + num + " no es capicua");
			}
			
			

		} else if (num <= 1000 && num > 0) {
			unidades = num % 10;
			centenas = num / 100;
			
			if(unidades == centenas) {
				System.out.println("El numero " + num + " es capicua");
				
			} else {
				System.out.println("El numero " + num + " no es capicua");
			}
		} else if (num <= 10000 && num > 0) {
			unidades = num % 10;
			decenas = num / 10;
			centenas = num / 100;
			mil = num / 1000;
			
			if(unidades == mil && decenas == centenas) {
				System.out.println("El numero " + num + " es capicua");

		} else {
			System.out.println("El numero se pasa de rango");
		}
			
		}else if(num<0) {
			System.out.println("El numero se pasa de rango");
			}
			
/**
		if (unidades == centenas || unidades == decenas || unidades == mil && !(num > 10000) && !(num < 10)) {
			System.out.println("El numero " + num + " es capicua");

		} else if (unidades != centenas || unidades != decenas || unidades != mil && !(num > 10000) && !(num < 10)) {
			System.out.println("El numero " + num + " no es capicua");
		}*/
}
}