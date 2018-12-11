package br.com.aula16;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		//www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-16-17
		Scanner scan = new Scanner(System.in);
		
		int rodar = 0;
		while(rodar < 10) {

			System.out.println("Informe uma nota:");
			int nota =scan.nextInt();
			
			if(nota > 10) {
				System.out.println("Valor Invalido");
				
			} else {
				System.out.println("Valor valido");
				rodar = nota;
				System.out.println("Programa encerrado");
			}
			
		}
		

	}

}
