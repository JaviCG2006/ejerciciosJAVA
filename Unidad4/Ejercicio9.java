package Unidad4;

public class Ejercicio9 {

	public static void main (String [] args) {
		
		divisoresPrimos(42);
		
	}
	
	public static int divisoresPrimos(int n) {
		//Contador divisores primos
		int cont = 0;
		
		for(int i = 2; i < n; i++) {
			if(Ejercicio7.primo(i) && n % i == 0) {
				System.out.println(i);
				cont++;
			}
		}
		System.out.println("Hay " + cont + " divisores primos");
		
		return cont;
	}	
}


