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
		int maiorL5 = 0;
		int menorL5 = Integer.MAX_VALUE;
		int linha5 = 5;
		int linhaR = 0;

		for (int i = 0; i < numerosAleatorios[linha5].length; i++) {
				if(numerosAleatorios[linha5][i]  > maiorL5) {
					maiorL5 = numerosAleatorios[linha5][i];	
				}
				if(numerosAleatorios[linha5][i] < menorL5) {
					menorL5 = numerosAleatorios[linha5][i];
			}
			
		}
		
		System.out.println("");
		
		System.out.println("Maior valor = " + maiorL5);
		System.out.println("Maior valor linha = " + menorL5);
		System.out.println("Maior valor coluna = ");

	}

}
