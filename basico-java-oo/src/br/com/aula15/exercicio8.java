package br.com.aula15;

import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		// Faça um programa que pergunte 3 preços e informe qual produto deve comprar,
		// sabendo que a decisão
		// é sempre pelo mais barato
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o valor do 1° produto:");
		double price1 = scan.nextDouble();

		System.out.println("Informe o valor do 2° produto:");
		double price2 = scan.nextDouble();

		System.out.println("Informe o valor do 3° produto");
		double price3 = scan.nextDouble();

		if ((price1 < price2) && (price1 < price3)) {
			System.out.println("Compre o produto 1, valor de: " + price1);
		} else if ((price2 < price1) && (price2 < price3)) {
			System.out.println("Compre o produto 2, valor de: " + price2);
		} else {
			System.out.println("Compre o produto 3, valor de: " + price3);
		}

	}

}
