package Matrizes;

import java.util.Scanner;

public class Exer03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] numeros = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				numeros[i][j] = sc.nextInt();
			}
		}

		int[] vet = new int[n];

		for (int i = 0; i < n; i++) {
			int maior = 0;
			for (int j = 0; j < n; j++) {
				if (numeros[i][j] > maior) {
					maior = numeros[i][j];
				}

				vet[i] = maior;
			}
		}

		System.out.println("Exit");

		for (int i = 0; i < n; i++) {
			System.out.println(vet[i]);
		}

		sc.close();
	}

}
