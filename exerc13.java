package atividades;

import java.util.Scanner;

public class exerc13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int horas, minutos, horaNS;
		System.out.println("Digite a hora: ");
		horas = ler.nextInt();
		System.out.println("Digite os minutos: ");
		minutos = ler.nextInt();
		
		if(horas<=24 & horas>=0 & minutos>=0 & minutos<=60) {			
		horaNS=troca(horas);
		System.out.println("\n\nHorário/24: " +horas +":" +minutos +"\nHorário/12: " +horaNS +":" +minutos);
		}else {
			System.out.println("Horário inválido!");
		}
		
	}
	
	static int troca(int horas) {
		int horaNS;
		
		if(horas>12) {
			horaNS=horas-12;
		}else {
			horaNS=horas;
		}
		
		return horaNS;
	}
}
