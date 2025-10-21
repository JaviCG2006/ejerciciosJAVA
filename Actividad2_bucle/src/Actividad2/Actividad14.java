package Actividad2;

import java.util.Scanner;

public class Actividad14 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime que dia");
		int dia = sc.nextInt();
		System.out.println("Dime que me"
				+ ""
				+ "s");
		int mes = sc.nextInt();
		System.out.println("Dime que año");
		int año = sc.nextInt();
		
		
		if (mes==2 && dia<=28 && dia>0) {
			dia = (dia+1);
			if(dia > 28) {
				mes = (mes+1);
				dia = 1;
			}
			
			System.out.println("Mañana es " + dia + " del " + mes + " del año " + año );
	

		}else if (mes==3 || mes==4 || mes==9 || mes==10 || dia<=30 && dia>0) {
			dia = (dia+1);
			if(dia > 30) {
				mes = (mes+1);
				dia = 1;
			}
			
			System.out.println("Mañana es " + dia + " del " + mes + " del año " + año );
	
		}else if (mes<=12 && mes>0 && dia<=31 && dia>0) {
			dia = (dia+1);
			if(dia > 31) {
				mes = (mes+1);
				dia = 1;
			}
			if (mes > 12) {
				año = año + 1;
				mes = 1;
			}
			
			System.out.println("Mañana es " + dia + " del " + mes + " del año " + año );
	}else {
		System.out.println("Es incorrecto");
	}
}
}