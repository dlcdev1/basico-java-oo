package br.com.aula15;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aulas-14-15
		// Faça um programa que peça dois numeros e imprima o maior deles.
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o primeiro numero:");
		int number1 = scan.nextInt();

		System.out.println("Informe o segundo numero:");
		int number2 = scan.nextInt();

		if (number1 > number2) {
			System.out.println("O maior numero :" + number1);

		} else {
			System.out.println("O maior nmero :" + number2);
		}

	}

}
