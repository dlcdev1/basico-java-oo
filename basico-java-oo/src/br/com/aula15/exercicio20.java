package br.com.aula15;

import java.util.Scanner;

public class exercicio20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int pergunta = 1;
		while (pergunta != 0) {
			System.out.println("Telefonou para a vítima?");
			String pergunta1 = scan.next();

			System.out.println("Esteve no local do crime?");
			String pergunta2 = scan.next();

			System.out.println("Mora perto da vítima:");
			String pergunta3 = scan.next();

			System.out.println("Devia para a vítima:");
			String pergunta4 = scan.next();

			System.out.println("Já trabalho com a vitima?");
			String pergunta5 = scan.next();

			
			int cont = 0;

			
			if (pergunta1.equalsIgnoreCase("S")) {
			 cont++;
			}
			if (pergunta2.equalsIgnoreCase("S")) {
				 cont++;
				}
			if (pergunta3.equalsIgnoreCase("S")) {
				 cont++;
				}
			if (pergunta4.equalsIgnoreCase("S")) {
				 cont++;
				}
			if (pergunta5.equalsIgnoreCase("S")) {
				 cont++;
				}
			 
			if (cont == 2) {
				System.out.println("Suspeita");
			} else if ((cont == 3) || (cont == 4)) {
				System.out.println("Cúmplice");
			} else if (cont >= 5) {
				System.out.println("Assassino");
			} else {
				System.out.println("Inocente");
			}

		}

	}

}
