package br.com.aula16;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o primeiro numero:");
		int number = scan.nextInt();

		System.out.println("Informe o segundo numero: ");
		int number2 = scan.nextInt();
		int i = number;
		int soma = 0, soma1 = 0, result = 0;

		while (i < number) {
			System.out.print(" " + i);

			i++;
		}
		do {
			i++;
			System.out.println(" + " + i);

			result = i;
			soma = result + soma;

		} while (i < number2);
		System.out.print(" resultado " + (soma + number));

	}
}
