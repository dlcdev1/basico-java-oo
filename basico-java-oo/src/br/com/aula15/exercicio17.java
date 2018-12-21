package br.com.aula15;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Primeira situa��o: Se o ano de 2015 ou 2016 for uma divis�o exata em
		 * rela��o a 4, deveremos verificar, em seguida, se n�o � divis�vel
		 * por 100. Se n�o for, o ano ser� bissexto;
		 * 
		 * 
		 * Segunda situa��o: Se o ano de 2015 ou 2016 n�o for divis�vel por 4,
		 * ent�o deveremos verificar se ele � divis�vel por 400. Se tamb�m n�o
		 * for divis�vel, o ano de 2015 n�o ser� bissexto;
		 * 
		 * 98536 9949
		 */

		Scanner scan = new Scanner(System.in);

		int rodar = 1;
		while (rodar != 0) {
			double result, result1, result2;

			System.out.println("Informe o ano:");
			int ano = scan.nextInt();
			// result = ano / 4;
			// result1 = ano / 100;
			// result2 = ano / 400;

			if ((ano % 400 == 0) || ((ano % 4 == 0) && ((ano % 100 != 0)))) {
				System.out.println(ano + " é um ano bissexto!");
			} else {
				System.out.println(ano + " não é um ano bissexto!");
			}

			rodar++;

		}

	}

}
