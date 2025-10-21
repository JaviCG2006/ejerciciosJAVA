package Actividad2;

import java.util.Scanner;

public class Actividad8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero");
		double a = sc.nextDouble();
		System.out.println("Dame un numero");
		double b = sc.nextDouble();
		System.out.println("Dame un numero");
		double c = sc.nextDouble();
		
		double raiz_comprobar = (b*b)-(4*a*c);
		double raiz =Math.sqrt(raiz_comprobar);
		double ecuacion_negativo = (-b - raiz)/(2*a);
		double ecuacion_positivo = (-b + raiz)/(2*a);
		
		if(a==0 || raiz<0) {
			System.out.println("No es posible hacer la ecuacion de segundo grado");
		}else if(raiz == 0){
			
			System.out.println("Su resultado es " + ecuacion_negativo);
			
		}else {
			System.out.println("uno de sus resultados son: " + ecuacion_negativo);
			System.out.println("Su otro resultado es: " + ecuacion_positivo);
		}
		
	}

}