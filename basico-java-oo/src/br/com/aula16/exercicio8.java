package br.com.aula16;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero = 0, soma = 0, result = 0;

		for (int i = 0; i < 5; i++) {
			System.out.println("Informe um numero");
			numero = scan.nextInt();
			if (numero >= 0) {
				result = numero;
				soma = result + soma;
			}

		}
		System.out.println("Soma é: " + soma);
		System.out.println("Media é: " + (soma / 5));

	}

}
