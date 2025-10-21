package bucles;

import java.util.Scanner;

public class Ejercicio11 {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
	
		int num = 1;
		
		
		while(num!=11) {
			
		int i = 0;
		
			while(i!=11) {
				
			int respuesta = num * i;
			System.out.println(num + " x " + i + " = " + respuesta);
			i++;
			}
			num++;
		}
	}
}