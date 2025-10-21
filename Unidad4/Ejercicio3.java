package Unidad4;

public class Ejercicio3 {

	public static void main (String [] args) {
		
		calculo(3,5,1);
		calculo(5,3,0);
		
	}
		public static double calculo(double radio, double altura, int elegido) {
			double pi = 3.14;
			
			if(elegido == 1) {
			double area = 2 * pi * radio * (altura + radio);
			System.out.println(area);
			return area;
			}else {
			double volumen = pi * (radio * radio) * altura;
			System.out.println(volumen);
			return volumen;
		}
		}
	}

