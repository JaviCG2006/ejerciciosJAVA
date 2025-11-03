package Unidad4;

public class Ejercicio13 {

	public static void main (String [] args) throws Exception {
		
		Factorial(4);
		System.out.println(FactorialRecursivo(5));
		System.out.println(FactorialRecursivo(0));
		System.out.println(FactorialRecursivo(-4));
	}
	
	public static int Factorial(int n) {
		int factor = 1;
		
		for(int i = n; i > 0; i--) {
			factor = factor * i;
		}
		System.out.println(factor);
		
		return factor;
	}
	
public static int FactorialRecursivo(int n) throws Exception {
		
	if(n < 0) {
		throw new Exception("n no puede ser negativo");
	}
		
		if(n == 0) {
			return 1;
		}else {
			return n * FactorialRecursivo(n-1);
		}
	
	}
} 