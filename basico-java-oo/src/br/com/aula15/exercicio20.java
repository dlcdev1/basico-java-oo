package br.com.aula15;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int pergunta = 1;
		while (pergunta != 0) {
			System.out.println("Telefonou para a vítima?");
			Boolean pergunta1 = scan.nextBoolean();

			System.out.println("Esteve no local do crime?");
			Boolean pergunta2 = scan.nextBoolean();

			System.out.println("Mora perto da vítima:");
			Boolean pergunta3 = scan.nextBoolean();

			System.out.println("Devia para a vítima:");
			Boolean pergunta4 = scan.nextBoolean();

			System.out.println("Já trabalho com a vitima?");
			Boolean pergunta5 = scan.nextBoolean();

			
			int total1, total2, total3, total4, total5, result;

			
			if (pergunta1 == true) {
				total1 = 1;
			} else {
				total1 = 0;
			}
			if (pergunta2 == true) {
				total2 = 1;
			} else {
				total2 = 0;
			}
			if (pergunta3 == true) {
				total3 = 1;
			} else {
				total3 = 0;
			}
			if (pergunta4 == true) {
				total4 = 1;
			} else {
				total4 = 0;
			}
			if (pergunta5 == true) {
				total5 = 1;
			} else {
				total5 = 0;
			}
			System.out.println("Resultado positivo: " + (result = total1 + total2 + total3 + total4 + total5));
			if (result == 2) {
				System.out.println("Suspeita");
			} else if ((result >= 3) && (result < 5)) {
				System.out.println("Cúmplice");
			} else if (result >= 5) {
				System.out.println("Assassino");
			} else {
				System.out.println("Inocente");
			}

		}

	}

}
