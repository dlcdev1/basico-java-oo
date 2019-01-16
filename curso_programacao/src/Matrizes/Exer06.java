package Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[][] numeros = new double[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				numeros[i][j] = sc.nextDouble();
			}
		}
		int indice = sc.nextInt();
		int coluna = sc.nextInt();

		// soma dos positivos
		double soma = 0.0;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (numeros[i][j] > 0) {
					soma += numeros[i][j];
				}
			}
		}
		System.out.printf("SOMA DOS POSITIVOS: %.1f%n", soma);
		System.out.print("LINHA ESCOLHIDA: ");
		for (int i = 0; i < indice; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(numeros[indice][j] + " ");
			}
		}
		System.out.println();

		System.out.print("COLUNA ESCOLHIDA: ");

		for (int i = 0; i < n; i++) {
			System.out.print(numeros[i][coluna] + " ");
		}

		System.out.println();
		System.out.print("DIAGONAL PRINCIPAL:");

		for (int i = 0; i < n; i++) {
			for (int j = 0; i < n; i++) {
				System.out.print(numeros[i][i] + " ");
			}
		}
		System.out.println();
		double alterada = 0.0;
		System.out.println("MATRIZ ALTERADA:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (numeros[i][j] < 0) {
					numeros[i][j] = numeros[i][j] * numeros[i][j];
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();

	}

}
