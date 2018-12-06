package br.com.aula15;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		/*
		 * Triangulo Equilátero: três lados iguais; Triangulo Isósceles: quaisquer dois
		 * lados iguais Triângulo Escaleno: tês lados diferentes;
		 */
		Scanner scan = new Scanner(System.in);
		int rodar = 1;
		while (rodar != 0) {

			System.out.println("Infomre o 1° lado:");
			int lado1 = scan.nextInt();
			System.out.println("Informe o 2° lado:");
			int lado2 = scan.nextInt();
			System.out.println("Informe o 3° lado:");
			int lado3 = scan.nextInt();

			if ((lado1 == lado2) && (lado1 == lado3)) {
				System.out.println("Triangulo Equilatero:");
				System.out.println("Lado1: " + lado1);
				System.out.println("Lado2: " + lado2);
				System.out.println("Lado3: " + lado3);
			} else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
				System.out.println("Triangulo Isósceles:");
				System.out.println("Lado1: " + lado1);
				System.out.println("Lado2: " + lado2);
				System.out.println("Lado3: " + lado3);
			} else if ((lado1 != lado2) && (lado1 != lado3) && (lado2 != lado3)) {
				System.out.println("Triangulo Escaleno:");
				System.out.println("Lado1: " + lado1);
				System.out.println("Lado2: " + lado2);
				System.out.println("Lado3: " + lado3);
			}

		}

	}

}
