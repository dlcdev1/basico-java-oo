package br.com.aula16;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor[] = new int[4];
		int maior = 0, menor =0;
		
		for(int i=0; i < valor.length; i++) {
			System.out.println("Informe o " + (i+1) +"° numero." );
			valor[i] = scan.nextInt();
			if(valor[i]>maior) {
				maior = valor[i];
			}
		}
		for (int j=0; j< valor.length; j++) {
			if(valor[j] < menor) {
				menor = valor[j];
			}
		}
		System.out.println("O maior numero é" + maior);
		System.out.println("O menor numero é" + menor);

	}

}
