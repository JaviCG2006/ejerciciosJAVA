package Unidad4;

public class Ejercicio12 {

	
	public static void main (String [] args) {

		calculadora(1,3,7);
		calculadora(2,3,7);
		calculadora(3,3,7);
		calculadora(4,8,0);
	}
	
	public static double calculadora(int opcion, double n1, double n2) {
		
		if(opcion == 1) {
			double suma = n1 + n2;
			System.out.println(suma);
			
		}else if(opcion == 2) {
			double resta = n1-n2;
			System.out.println(resta);

		}else if(opcion == 3) {
			double multiplicacion = n1*n2;
			System.out.println(multiplicacion);
			
		}else if(opcion == 4) {
			if(n2 == 0) {
				System.out.println("No es posible, seria infinito");
			}else {
			double division = n1/n2;
			System.out.println(division);
			}
		}
		
		return opcion;
	}
}
