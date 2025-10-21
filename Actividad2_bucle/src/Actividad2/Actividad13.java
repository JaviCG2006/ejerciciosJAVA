package Actividad2;

import java.util.Scanner;

public class Actividad13 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Dime las horas");
		int hora = sc.nextInt();
		System.out.println("Dime los minutos");
		int minuto = sc.nextInt();
		System.out.println("Dime los segundos");
		int segundo = sc.nextInt();
		segundo = (segundo+1);
		
		if (segundo == 60) {
			minuto = minuto + 1;
			segundo = 0;
		}
		if (minuto == 60) {
			hora = hora + 1;
			minuto = 0;
		}
		if (hora == 24 && minuto == 0 && segundo ==0 ) {
		hora = 0;
		System.out.println("Son las 0" + hora + ":0" + minuto + ":0" + segundo );
		
		}else if(minuto<10 && segundo<10 && hora<10 && hora<=24 && minuto<=60 && segundo<=60){
		System.out.println("Son las 0" + hora + ":0" + minuto + ":0" + segundo );
		
	}else if(minuto<10 && segundo<10 && hora>=10 && hora<=23 && minuto<=60 && segundo<=60) {
		System.out.println("Son las " + hora + ":0" + minuto + ":0" + segundo );
	}else if(segundo<10 && hora<10 && minuto>=10 && hora<=23 && minuto<=60 && segundo<=60) {
		System.out.println("Son las 0" + hora + ":" + minuto + ":0" + segundo );
	}else if(hora<10 && minuto<10 && segundo>=10 && hora<=23 && minuto<=60 && segundo<=60) {
		System.out.println("Son las 0" + hora + ":0" + minuto + ":" + segundo );
	}else if(hora>=10 && minuto<10 && segundo>=10 && hora<=23 && minuto<=60 && segundo<=60) {
		System.out.println("Son las " + hora + ":0" + minuto + ":" + segundo );
	}else if(hora>=10 && minuto>=10 && segundo<10 && hora<=23 && minuto<=60 && segundo<=60) {
		System.out.println("Son las " + hora + ":" + minuto + ":0" + segundo );
	}else if (hora<=23 && minuto<=60 && segundo<=60){
		System.out.println("Son las " + hora + ":" + minuto + ":" + segundo );
	}else {
		System.out.println("Datos mal introducidos");
	}
}
}
