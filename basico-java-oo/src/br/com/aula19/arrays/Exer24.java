package br.com.aula19.arrays;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];
		int ultimo = 0, invert = 0, primeiro = 0, count = 0, result = 0, result1 = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o " + i + "° número");
			vetorA[i] = scan.nextInt();

		}
		for (int i = 0; i < vetorA.length; i++) {

			count++;
		}
		System.out.println();
		for (int i = 0; i < vetorA.length; i++) {

			result = count--;

			primeiro = vetorA[i];
			ultimo = vetorA[result - 1];
			if (primeiro == ultimo) {

				System.out.print(primeiro + " ");
				System.out.print(ultimo + " ");
				System.out.println("São polindromos");
			} else {
				System.out.println("Não são polindromos");
				break;
			}

		}

	}

}
