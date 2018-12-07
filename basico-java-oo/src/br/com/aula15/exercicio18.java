package br.com.aula15;

import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int rodar = 1;

		while (rodar != 0) {

			System.out.println("Informe um numero");
			int number = scan.nextInt();
			if (number % 2 == 0) {
				System.out.println(number  + " Número PAR");
			} else {
				System.out.println(number  + " Número IMPAR");
			}

			rodar++;
		}
	}

}
