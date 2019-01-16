package Matrizes;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		int numeros[][] = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				numeros[i][j] = sc.nextInt();
			}
		}

		int vet[] = new int[m];
		int negativo = 0;

		System.out.println("Valores negativos");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (numeros[i][j] < 0) {
					System.out.println(numeros[i][j]);
				}
			}
		}

		sc.close();
	}

}
