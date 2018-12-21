package br.com.aula15;

import java.util.Scanner;

public class exervicio22 {

	public static void main(String[] args) {

		int rodar = 1;

		while (rodar != 0) {
			Scanner scan = new Scanner(System.in);

			// System.out.println("Infomre quantos KG de frutas:");

			System.out.println("Morango");
			double morango = scan.nextDouble();
			System.out.println("Maçã");
			double maca = scan.nextDouble();
			double kg = morango + maca;
			System.out.println(kg);

			if (kg <= 5) {
				morango = morango * 2.50;
				maca = maca * 1.80;
				double total1 = (morango + maca);
				if (total1 >= 25) {
					System.out.println("Total é de 1: " + total1);
					double result = total1 * 0.10;
					System.out.println("Total com desconto é de 1: " + (total1 - result));
				} else {
					System.out.println("Total é de 1.1: " + total1);
				}

			} else if ((kg > 6)) {
				morango = morango * 2.20;
				maca = maca * 1.50;
				double total = morango + maca;
				if (total >= 25) {
					System.out.println("Total é de 2: " + total);
					double result = total * 0.10;
					System.out.println("Total com desconto é de 2: " + (total - result));
				} else {
					System.out.println("Total é de: " + total);
				}
			}

		}

	}
}
