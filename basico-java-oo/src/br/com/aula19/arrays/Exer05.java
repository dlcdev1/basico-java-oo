package br.com.aula19.arrays;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		/*
		 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo
		 * tipo e tamanho sendo que cada elemento do vetor B deverá ser o respectivo
		 * elemento de A multiplicado por sua posiação (ou indice)B[i] = A[i]*i
		 */

		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o " + i + " ° número:");
			vetorA[i] = scan.nextInt();
		}

		System.out.println("VetorA:");
		for (int i = 0; i < vetorA.length; i++) {
			// vetorA[i] = i;
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.println("VetorB:");
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] * i;

			System.out.print(vetorB[i] + " ");
		}

	}

}
