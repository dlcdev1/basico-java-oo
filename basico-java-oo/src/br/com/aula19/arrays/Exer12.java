package br.com.aula19.arrays;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int soma = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o " + i + "° número");
			vetorA[i] = scan.nextInt();
		}
		System.out.println();

		System.out.println("VetorA");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " + ");
		}

		System.out.println("A soma do VetorA");
		for (int i = 0; i < vetorA.length; i++) {
			soma += vetorA[i];
			System.out.print(soma + " ");
		}

	}
}
