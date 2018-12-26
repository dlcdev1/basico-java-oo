package br.com.aula20;

import java.util.Random;

public class Exer2 {
	public static void main(String args[]) {
		int[][] numerosAleatorios = new int[10][10];

		Random ramdom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = ramdom.nextInt(100);
			}
		}
		int linha = 0;
		int coluna = 0;
		int maior = 0;
		int linhaR = 0;

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				//System.out.print((numerosAleatorios[5][j]) + " ");
				if(numerosAleatorios[5][j]  > maior) {
					maior = numerosAleatorios[5][j];
					linha = i;
					coluna = j;
				}
			}
			
		}
		
		System.out.println("");
		

		System.out.println(); 
		for(int i = 0; i< numerosAleatorios.length; i++) {
			for(int j = 0; j <numerosAleatorios[i].length; j++) {
			System.out.print("L" + i + " "+ (numerosAleatorios[i][j]) + " ");
				
			}
			System.out.println();
		}
		
		
		System.out.println("Maior valor = " + maior);
		System.out.println("Maior valor linha = " + linha);
		System.out.println("Maior valor coluna = " + coluna);

	}

}
