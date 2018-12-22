package br.com.aula20;

import java.util.Random;
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int maiorN = 0, result = 0, count = 0, menorN = 0;
		int[][] matriz = new int[4][4];

		matriz[0][0] = 7;
		matriz[0][1] = 5;
		matriz[0][2] = 6;
		matriz[0][3] = 7;

		matriz[1][0] = 4;
		matriz[1][1] = 7;
		matriz[1][2] = 8;
		matriz[1][3] = 9;

		matriz[2][0] = 5;
		matriz[2][1] = 8;
		matriz[2][2] = 7;
		matriz[2][3] = 5;

		matriz[3][0] = 2;
		matriz[3][1] = 5;
		matriz[3][2] = 6;
		matriz[3][3] = 7;

		// Random random = new Random();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				// System.out.print(matriz[i][j] + " ");
				maiorN = matriz[i][j];

			}
			System.out.println();

		}

	}

}
