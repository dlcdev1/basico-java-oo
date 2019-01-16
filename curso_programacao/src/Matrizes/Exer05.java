package Matrizes;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();

		int[][] matA = new int[m][n];
		int[][] matB = new int[m][n];
		int[][] matC = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matA[i][j] = sc.nextInt();
				matB[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < m; i++) {
			int somaA = 0;
			for (int j = 0; j < n; j++) {
				somaA += matA[i][j];
				matC[i][j] += somaA;
			}
	
			int somaB = 0;
			
			for(int j =0; j<n; j++) {
				somaB += matB[i][j];
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matC[i][j] + " ");
			}
			System.out.println();
		}


		sc.close();

	}

}
