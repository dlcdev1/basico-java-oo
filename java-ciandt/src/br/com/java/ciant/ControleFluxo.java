package br.com.java.ciant;

import java.util.Scanner;

public class ControleFluxo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um numero:");
		int number = scan.nextInt();

		if (number % 2 == 0) {
			System.out.printf("O número %d é par", number);
		} else {
			System.out.printf("O número %d é impar", number);
		}

	}

}
