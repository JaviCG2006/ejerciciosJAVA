package Actividad2;

import java.util.Scanner;

public class Actividad6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero");
		double num1 = sc.nextInt();
		System.out.println("Dame otro numero");
		double num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println(num1);
			System.out.println(num2);
		} else {
			System.out.println(num2);
			System.out.println(num1);
		}
		
	}
}
