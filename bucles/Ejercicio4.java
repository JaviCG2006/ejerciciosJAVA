package bucles;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero negativo");
		int num = sc.nextInt();
		int i = 1;
		
		if(num>0) {
		while (i!=num) {
			int mostrar = i;
			System.out.println(mostrar);
			i++;
			
		}
		
		System.out.println("Y por ultimo " + num);
		
		}else {
			System.out.println("Numero negativo");
		}
		
	}
}
