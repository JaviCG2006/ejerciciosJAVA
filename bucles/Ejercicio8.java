package bucles;

import java.util.Scanner;

public class Ejercicio8 {

	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero y te dar su factorial");
		int num = sc.nextInt();
		
		while (num > 0) {
			int num1 = num - 1;
			int resultado = num * num1;
			num--;
			System.out.print(num + "x" + num1 + " = " + resultado);
		}
	}
}
