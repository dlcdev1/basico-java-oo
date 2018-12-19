package br.com.aula19.arrays;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[20];
		int soma = 0, count = 0, result = 0;
		for (int i = 0; i < 20; i++) {

			vetorA[i] = i;
			if (vetorA[i] % 2 == 1) {
				System.out.println("Contador " + (count++));
				System.out.println("Recebendo o valor" + (soma = vetorA[i]));
				System.out.println("Realizando a soma" + (result = soma + result));

			}

		}
		System.out.println(result / count);

	}

}
