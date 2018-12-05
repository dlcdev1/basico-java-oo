package br.com.aula15;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		// Faça um progrma que leia três números e mostre-os em ordem decrescente

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o 1° número:");
		int number1 = scan.nextInt();
		System.out.println("Informe o 2° número:");
		int number2 = scan.nextInt();
		System.out.println("Informe o 3° número:");
		int number3 = scan.nextInt();

		if ((number1 > number2) && (number1 > number3)) {
			System.out.println("1° número: " + number1);
			if (number2 > number3) {
				System.out.println("2° número: " + number2);
				System.out.println("3° número: " + number3);
			} else {
				System.out.println("3° número: " + number3);
				System.out.println("2° número: " + number2);
			}
		} else if ((number2 > number1) && (number2 > number3)) {
			System.out.println("2° número: " + number2);
			if (number1 > number3) {
				System.out.println("1° número: " + number1);
				System.out.println("3° número: " + number3);
			} else {
				System.out.println("3° número:" + number3);
				System.out.println("1° número: " + number1);
			}
		} else if ((number3 > number1) && (number3 > number2)) {
			System.out.println("3° número: " + number3);
			if (number1 > number2) {
				System.out.println("1° número: " + number1);
				System.out.println("2° número: " + number2);
			} else {
				System.out.println("2° número: " + number2);
				System.out.println("1° número: " + number1);
			}
		}

	}

}
