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
		System.out.print("  C");
		for (int i = 0; i < 10; i++) {
			System.out.print("  " + i);
		}
		System.out.println();
		for (int i = 0; i < numerosAleatorios.length; i++) {
			System.out.print("L " + i + " ");
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}

		int maiorL5 = 0;
		int menorL5 = Integer.MAX_VALUE;
		int linha5 = 5;
		int linhaR = 0;

		int col7 = 7;
		int maiorC = 0;
		int menorC = Integer.MAX_VALUE;

		for (int i = 0; i < numerosAleatorios[linha5].length; i++) {

			if (numerosAleatorios[linha5][i] > maiorL5) {
				maiorL5 = numerosAleatorios[linha5][i];
			}
			if (numerosAleatorios[linha5][i] < menorL5) {
				menorL5 = numerosAleatorios[linha5][i];
			}

		}

		for (int i = 0; i < numerosAleatorios.length; i++) {
			if (numerosAleatorios[i][col7] > maiorC) {
				maiorC = numerosAleatorios[i][col7];
			}
			if (numerosAleatorios[i][col7] < menorC) {
				menorC = numerosAleatorios[i][col7];
			}
		}

		System.out.println("");

		System.out.println("Maior valor da linha 5= " + maiorL5);
		System.out.println("Menor valor linha = " + menorL5);
		System.out.println("Maior valor da coluna  7 = " + maiorC);
		System.out.println("Menor valor da coluna 7 = " + menorC);

	}

}
