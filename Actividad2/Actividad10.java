package Actividad2;

import java.util.Scanner;

public class Actividad10 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero entero");
		int num = sc.nextInt();
		int original = num;
		int invertido = 0;
		
		int digito = num % 10;
		invertido = invertido * 10 + digito;
		num = num / 10;
		
		if (num>10 && num<100) {
		
		digito = num % 10;
		invertido = invertido * 10 + digito;
		num = num / 10;
		return;
		}	
		
		if (num>10000 || num<0) {
			System.out.println("Este numero no esta dentro del rango");
		}else if (original == invertido){
			System.out.println("El numero es capicua");
		}else {
			System.out.println("El numero no es capicua");
		}
	}	
}
