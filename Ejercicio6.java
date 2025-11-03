package Unidad4;

public class Ejercicio6 {

	public static void main (String [] args) {
		
		vocal("a");
		vocal("b");
		
	}
	
	public static boolean vocal(String letra) {
		
		if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u") {
			System.out.println("La letra " + letra + " es una vocal");
			return true;
		}else {
			System.out.println("La letra " + letra + " no es una vocal");
			return false;
		}
	}
	
}
