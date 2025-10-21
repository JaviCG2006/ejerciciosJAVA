package Unidad4;

public class Ejercicio5 {

	public static void main (String [] args) {
		
		mayor(1,6,0);
		mayor(3,1,7);
		
	}
	
	public static int mayor(int num1, int num2, int num3) {
		
		int max = 0;
		
		if(num1>num2 && num2>num3) {
			 max = num1;
			  System.out.println("Numero " + max + " es mayor");
		}
		else if(num2>num1 && num1>num3) {
			  max = num2;
			  System.out.println("Numero " + max + " es mayor");
			  
		}else if (num2>num3 && num3>num1) {
			 max = num2;
			  System.out.println("Numero " + max + " es mayor");
			
		}else if (num1>num3 && num3>num2) {
			 max = num1;
			  System.out.println("Numero " + max + " es mayor");
			
		}else if (num3>num1 && num1>num2) {
			 max = num3;
			  System.out.println("Numero " + max + " es mayor");
			
		}else if (num3>num2 && num2>num1) {
			 max = num3;
			  System.out.println("Numero " + max + " es mayor");
			
		}
		return max;

	}
	
}
