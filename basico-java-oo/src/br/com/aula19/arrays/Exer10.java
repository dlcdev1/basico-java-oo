package br.com.aula19.arrays;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o" + i + "° numero");
			vetorA[i] = scan.nextInt();
		}

		System.out.println();
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Vetora A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");

		}
		System.out.println();
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i];
			System.out.print(vetorB[i] + " ");
		}

		System.out.println();

		System.out.print("Vetor B%2 = ");
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = vetorA[i] % 2;

			System.out.print(vetorB[i] + " ");
		}

	}

}
