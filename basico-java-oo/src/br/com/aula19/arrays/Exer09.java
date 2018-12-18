package br.com.aula19.arrays;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		/*
		 * Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um
		 * vetor C, onde cada elemento de C é a dividido dos respectivos elementos em A
		 * e B, ou seja: C[I] = A[i] / float(BA[I);
		 */

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[10];
		float [] vetorC = new float[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o " + i + "° número do vertorA");
			vetorA[i] = scan.nextInt();

			System.out.println("Informe o " + i + "° numero do vetorB");
			vetorB[i] = scan.nextInt();
		}
		
		System.out.print("Vetor A = ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i=0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();
		System.out.println("VetorC=A[i]/float(B[i])");
		for (int i=0; i < vetorC.length; i++) {
			vetorC[i] = (float) vetorA[i] / (float) (vetorB[i]);
			
			System.out.print(vetorC[i] + " ");
		}

	}

}
