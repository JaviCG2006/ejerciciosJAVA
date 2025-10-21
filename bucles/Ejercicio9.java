package bucles;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime la altura del arbol 0");
		int arbol = sc.nextInt();
		int max = 0;
		int etiqueta = 0;
		int etiquetamax = 0;
		
		while(arbol!=-1) {
			
			if(arbol>max) {
				max = arbol;
				etiquetamax = etiqueta;
			}
			etiqueta++;
			System.out.println("Dime la altura del arbol " + etiqueta);
			arbol = sc.nextInt();
		}
		
		System.out.println("El arbol mas alto mide " + max + " y su etiqueta es " + etiquetamax);
		
	}
}
