package exerc;

import java.util.Scanner;

public class exerc12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor;
		
		System.out.println("Digite um valor: ");
		valor = ler.nextInt();
		
		matriz(valor);
		
	}
	
	static void matriz(int x) {
		int contador=x;
		
		System.out.printf("*");
		for(int i=0;i<x*6; i++) {
			System.out.printf("=");
		}
		System.out.printf("*");
		
		
		while(contador>0) {
			for(int i=0; i<x; i++) {
				System.out.printf("\n* ");
				for(int j=0; j<contador*2+1; j++) {
					if(j==contador) {
						System.out.printf("* ");
					}else {						
						System.out.printf(contador +" ");
					}
				}
				if(contador>0) {					
					System.out.printf("*");
				}
				contador--;
			}
		}
		
		
		System.out.printf("\n*");
		for(int i=0;i<x*6; i++) {
			System.out.printf("=");
		}
		System.out.printf("*");
		
	}

}
