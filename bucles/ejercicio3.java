package bucles;

import java.util.Scanner;
import java.util.Random;

public class ejercicio3 {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		Random r = new Random();
		int numero_aleatorio = r.nextInt(100) + 1;
		
		System.out.println("Intenta adivinar el numero");
		int num = sc.nextInt();
		
		while(num != numero_aleatorio) {
		
		if(num<numero_aleatorio) {
			System.out.println("mayor");
		}else {
			System.out.println("menor");
		}
		
		System.out.println("intentalo de nuevo");
		int num1 = sc.nextInt();
		num = num1;
		
	}
		if(num<0)
		System.out.println("el numero aleatorio era " + numero_aleatorio);
		else {
			System.out.println("acertaste el numero es " + numero_aleatorio);
		}
	}
}