package bucles;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int multiplo = 7;
		int numero = 0;
		int operacion = 0;
		
		while(operacion<100) {
			
			operacion = multiplo * numero;
			
			if(operacion<100) {
				System.out.println("7 x " + numero + " = " + operacion);
				}
			numero++;	
		}
	}
}
