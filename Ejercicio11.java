package Unidad4;

public class Ejercicio11 {

	public static void main (String[] args)throws Exception {
		
	System.out.println(potenciaRecursiva(2.0, 6));
		
	}
	
	public static double potenciaIterativa(double a, int n)throws Exception {
		if(n < 0) {
			throw new Exception("n entero no puede ser negativo");
		}
		
		
		double resultado = 1;
		for( int i = 1; i<= n; i++) {
			resultado = resultado * a;
			System.out.println("El resultado de la Iterativa es " + resultado);
		}
		return resultado;
	}
	
	public static double potenciaRecursiva(double a, int n) throws Exception {
		
		if(n < 0) {
			throw new Exception("n no puede ser negativo");
		}
		if(n == 0) {
			return 1;
		}else {
			return a * potenciaRecursiva(a, n-1);
		}
	}
	
}