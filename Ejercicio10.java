package Unidad4;

public class Ejercicio10 {

	public static void main (String[] args) {
		
		amigos(184,284);
		amigos(1184,1210);
		
	}
	
	public static boolean amigos(int a, int b) {
		
		int suma_divisor1 = 0;
		int suma_divisor2 = 0;
		boolean amigos = false;
		
		for(int i = 1; i <= a; i++) {
			if(a % i == 0) {
				suma_divisor1 = suma_divisor1 + i;
			}
		}
		
		for(int j = 1; j<=b; j++) {
			if(b % j == 0) {
				suma_divisor2 = suma_divisor2 + j;
			}
		}
		if(suma_divisor2 == suma_divisor1) {
			System.out.println("Son numeros amigos");
			amigos = true;
		}else {
			System.out.println("No son numeros amigos");
		}
		System.out.println(amigos);
		
		return amigos;
	}
	
}
