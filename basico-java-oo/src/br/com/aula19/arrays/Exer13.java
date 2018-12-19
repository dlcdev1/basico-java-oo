package br.com.aula19.arrays;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[10];
		int soma = 0, result = 0, count = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe o " + i + "° numero");
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {
			soma += vetorA[i];

			if (soma % 5 == 0) {
				System.out.println("recebendo o valor" + (result = soma));
				System.out.println("Realizando a conta" + (count = result + count));

				System.out.println("Resultado " + count);

			}

		}

	}

}
