package bucles;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Dame un numero");
		int numero = sc.nextInt();
		
		for (int i = numero; 0<i; i--) {
			int e = 0;
			
			while(e<i) {
				System.out.print("* ");
				e++;
			}
			System.out.println("");
		}
		
		
	}
}
