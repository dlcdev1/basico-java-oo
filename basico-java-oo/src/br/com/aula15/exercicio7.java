package br.com.aula15;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// Faça um programa que leia três números e mostre o maio e o menor deles

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o 1° numero:");
		double number1 = scan.nextDouble();
		System.out.println("Informeo 2° número:");
		double number2 = scan.nextDouble();
		System.out.println("Informe o 3° número:");
		double number3 = scan.nextDouble();

		if ((number1 > number2) && (number1 > number3)) {
			System.out.println("1° é maior número:" + number1);
			if ((number2 < number1) && (number2 < number3)) {
				System.out.println("2° é o menor número: " + number2);
			} else {
				System.out.println("3° é o menor número: " + number3);
			}
		} else if ((number2 > number1) && (number2 > number3)) {
			System.out.println("2° é maior número: " + number2);
			if ((number1 < number2) && (number1 < number3)) {
				System.out.println("1° número é menor: " + number1);
			} else {
				System.out.println("3° número é menor: " + number3);
			}
		} else if ((number3 > number1) && (number3 > number2)) {
			System.out.println("3° é maior número: " + number3);
			if ((number1 < number3) && (number1 < number3)) {
				System.out.println("1° é o menor número: " + number1);
			} else {
				System.out.println("2° é o menor numero: " + number2);
			}
		} else {
			System.out.println("Todos os números são iguais: ");
		}
	}
}
