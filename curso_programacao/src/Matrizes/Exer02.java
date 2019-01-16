package Matrizes;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[][] numeros = new int[n][n];

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				numeros[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Exit");
	
		
		int [] vet = new int[n];
		for(int i=0; i<n; i++) {
			int soma=0;
			for(int j=0; j<n; j++) {
				soma += numeros[i][j]; 
			}
			vet[i] = soma;
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(vet[i]);
		}

		sc.close();

	}

}
