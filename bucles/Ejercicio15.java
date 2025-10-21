package bucles;

import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		do {
		System.out.println("Dime un numero");
		n = sc.nextInt();
		}while(n<0);
		
		
		for(int i = 2; i<=n ; i++) {
			if(esPrimo(i)) {
				imprime(i + "-> primo");
			}else {
				imprime(i + "-> no primo");
			}
		}
	}
	
	
	public static boolean esPrimo(int n) {
		boolean dev = true;
		
		for(int i = 2; i < n-1; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return dev;
	}
	public static void imprime(String cadena) {
		System.out.println(cadena);
	}
}
