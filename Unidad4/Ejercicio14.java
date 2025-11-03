package Unidad4;

public class Ejercicio14 {

	public static void main (String [] args) throws Exception {
		
		System.out.println(Fobinacci(9));
		
	}
	
	public static int Fobinacci(int n) throws Exception {
		if(n < 0) {
			throw new Exception("n no puede ser negativo");
		}
		
		if(n == 0 || n == 1) {
			return 1;
			
		}else {
			return Fobinacci(n - 1) + Fobinacci(n - 2);
		}
		
	}
	
}
