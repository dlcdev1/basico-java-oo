package br.com.aula15;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		/*
		 * ax² + bx + c = 0 Baschara = x = -b =/- Rais de delta sobre 2 * a Delta é
		 * igual = b² -4 * a * c x¡ = resultado1¹¹ x
		 * 
		 * x¡¡ = resultado
		 *
		 * a. Informar o valor de a, b e c Se o valor de A for igual a zero a equação
		 * não é do segundo grau, encerrar o programa
		 * 
		 * b. se delta for negativo a equação não possui raizes reais. Infomre ao
		 * usuário e encerre o programa;
		 *
		 * d. se o delta for positivo, a equação possui duas raiz reais; informe-as ao
		 * usuário;
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o coificiente a");
		double coifA = scan.nextDouble();
		System.out.println("Informe o coificiente b");
		double coifB = scan.nextDouble();
		System.out.println("Infomre o coificiente c");
		double coifC = scan.nextDouble();
		double delta, linha1, linha2;

		if (coifA == 0) {
			System.out.println("O valor do coificiente A é zero, programa encerrada:");
		} else {
			delta = Math.pow(coifB, 2) - 4 * (coifA) * (coifC);
			if (delta < 0) {
				System.out.println("Valor negativo, não possui raizes reais");
				System.out.println("Programa encerrado");
			} else if (delta > 0) {
				linha1 = ((-coifB + (Math.sqrt(delta))) / (2 * coifA));
				linha2 = ((-coifB - (Math.sqrt(delta))) / (2 * coifA));

				System.out.println("Linha¡: " + linha1);
				System.out.println("Linha¡¡: " + linha2);

			}
		}

	}

}
