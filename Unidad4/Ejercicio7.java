package Unidad4;

public class Ejercicio7 {

	public static void main (String [] args) {
		
		primo(7);
		primo(13);
		primo (4);
		
	}
	
	public static boolean primo(int n) {
		
			boolean dev = true;
			
			for(int i = 2; i < n-1; i++) {
				if(n % i == 0) {
					//System.out.println("El numero " + n + " no es primo");
					dev = false;
				}
			}
			return dev;
		}
		
	}
