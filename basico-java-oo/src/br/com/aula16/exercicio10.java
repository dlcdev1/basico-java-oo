package br.com.aula16;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o primeiro numero:");
		int number = scan.nextInt();

		System.out.println("Informe o segundo numero: ");
		int number2 = scan.nextInt();
		int i = number;

		while (i < number) {
			System.out.print(" " + i);
			i++;
		}
		do {
			i++;
			System.out.print(" " + i);
		} while (i < number2);
		
	}

}
