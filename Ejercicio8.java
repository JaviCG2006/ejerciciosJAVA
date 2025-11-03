package Unidad4;

public class Ejercicio8 {

	public static void main (String [] args) {
		
		System.out.println(divisores(14));
		System.out.println(divisores(25));
		System.out.println(divisores(500));
	}
	
	public static int divisores(int n) {
		
		int cont = 0;
		
		for(int i = 2; i < n; i++) {
			if(Ejercicio7.primo(i) && n % i == 0) {
				cont++;

			}
		}
		return cont;
	}	
}
