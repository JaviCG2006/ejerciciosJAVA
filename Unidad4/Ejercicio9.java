package Unidad4;

public class Ejercicio9 {

	public static void main (String [] args) {
		
		divisores(56);
		
	}
	
	public static int divisores(int n) {
		
		int cont = 0;
		
		for(int i = 2; i < n-1; i++) {
			if(n % i == 0) {
				cont++;
				System.out.println(i);
			}
		}
		return cont;
	}	
}
	

