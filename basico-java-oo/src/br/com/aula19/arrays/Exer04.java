package br.com.aula19.arrays;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 25 elementos inteiros. Construir um vetor B de mesmo
		 * tamanho , sendo que cada elemento do vetoB deverá ser a raiz quadrada do
		 * respectivo elemento de A, ou seja: B[I] = sqrt(A[I])
		 */
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];

		System.out.print("Vetor A=");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o " + i + "° numero");
			vetorA[i] = scan.nextInt();

		}
		System.out.println();

		System.out.println("Vetor A= ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}

		System.out.println();
		System.out.print("Vetor B= ");

		for (int i = 0; i < 15; i++) {
			vetorB[i] = (int) Math.sqrt(vetorA[i]);
			System.out.print(vetorB[i] + " ");
		}

	}

}
