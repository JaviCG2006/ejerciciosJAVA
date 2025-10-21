package Unidad4;

public class Ejercicio12 {

	
	public static void main (String [] args) {

		calculadora(1,3,7);
		
	}
	
	public static int calculadora(int opcion, int n1, int n2) {
		
		if(opcion == 1) {
			int suma = n1 + n2;
			System.out.println(suma);
			
		}else if(opcion == 2) {
			int resta = n1-n2;
			System.out.println(resta);

		}else if(opcion == 3) {
			int multiplicacion = n1-n2;
			System.out.println(multiplicacion);
			
		}else if(opcion == 4) {
			int division = n1-n2;
			System.out.println(division);
			
		}
		
		return opcion;
	}
}
