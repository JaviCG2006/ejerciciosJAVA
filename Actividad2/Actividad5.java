package Actividad2;

import java.util.Scanner;

public class Actividad5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero");
		double num = sc.nextDouble();
		
		if(num<1 && num>-1 && num!=0) {
			System.out.println("El numero es casi cero");
		}else {
			System.out.println("Este numero no es casi 0");
		}
		
	}
}
