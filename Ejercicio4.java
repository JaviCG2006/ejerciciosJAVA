package Unidad4;

public class Ejercicio4 {


	public static void main (String [] args) {
		
		mayor(1,6);
		mayor(3,1);
		
	}
	
	public static int mayor(int num1, int num2) {
		
		int max = 0;
		
		if(num1>num2) {
			 max = num1;
			  System.out.println("Numero " + max + " es mayor");
		}
		if(num2>num1) {
			  max = num2;
			  System.out.println("Numero " + max + " es mayor");
		}
		return max;

	}
	
}
