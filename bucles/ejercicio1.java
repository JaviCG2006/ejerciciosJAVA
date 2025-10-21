package bucles;

import java.util.Scanner;

public class ejercicio1 {
		public static void main(String [] args){
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Dame un numero");
			int num = sc.nextInt();
			
		while(num!=0) {
			
			
			if(num % 2 == 0)
				System.out.println("El numero es par");
			else {
				System.out.println("El numero es impar");
			}
			
			if(num>0) {
				System.out.println("El numero es positivo");
			}
			else if(num<0) {
				System.out.println("El numero es negativo");
			}
			int cuadrado = num * num;
			System.out.println("Su cuadrado es " + cuadrado);
			
			System.out.println("Dame un numero");
			int num1 = sc.nextInt();
			num = num1;
			
		}
	}
}