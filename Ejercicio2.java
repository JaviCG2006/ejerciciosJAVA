package Unidad4;

public class Ejercicio2 {

	public static void main (String [] args) {
		numeros(7,1);
		
		
	}
	/**
	 * 
	 * @param n1 un numero del rango
	 * @param n2 un numero del rango
	 * @return
	 */
	public static int numeros(int n1, int n2) {
	
			while(n1 >(n2 + 1)) {
				if(n1>n2) {
					n1--;
					System.out.println(n1);
				}
				else if (n2>(n1+1)) {
					n1--;
					System.out.println(n1);
	
			}
		
	}
			return n1;
}
}
