package br.com.aula19.arrays;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		/*
		 * Cria um vetores A e B cada um com 10 elementos inteiros. Construir um vetor
		 * C, onde cada elemento de C é a soma dos respectivos elementos em A e B, ou
		 * seja: C[i] = A[i] + B[i].
		 */
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o valor do vetorA. " + i + "° numero.");
			vetorA[i] = scan.nextInt();

			System.out.println("Informe o valor do vetorB. " + i + "° numero");
			vetorB[i] = scan.nextInt();
		}

		System.out.println("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.println("Vetor B = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}

		System.out.println();

		System.out.println("Vetor C A[I]+B[I].");
		for (int i = 0; i < vetorA.length; i++) {
			vetorC[i] = vetorA[i] + vetorB[i];
			System.out.print(vetorC[i] + " ");
		}

	}

}