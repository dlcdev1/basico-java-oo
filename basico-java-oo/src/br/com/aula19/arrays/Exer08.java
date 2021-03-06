package br.com.aula19.arrays;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Exer08 {

	public static void main(String[] args) {
		/*
		 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um
		 * vetor C, onde cada elemento de C é a multiplicação dos respectivos
		 * elementos em A e B, ou seja: C[I] = A[I]*B[I]
		 */
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		int[] vetorC = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o " + i + "° numero do Vetor A.");
			vetorA[i] = scan.nextInt();

			System.out.println("Informe o " + i + " ° numero do Vetor B.");
			vetorB[i] = scan.nextInt();
		}
		System.out.println();

		System.out.print("Vetor A =");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();

		System.out.println("Vetor C = A[I] * B[I]");
		for (int i = 0; i < vetorC.length; i++) {
			vetorC[i] = vetorA[i] * vetorB[i];
			System.out.print(vetorC[i] + " ");
		}

	}

}
