package br.com.aula19.arrays;

import java.util.Scanner;

public class InvertNumero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int rodar = 1;
		int inverte=0;

		while (rodar != 0) {
			System.out.println("Imput number:");
			int number = scan.nextInt();
			if (number < 9999) {
				System.out.println(number);
				rodar = 0;
				while(number >0) {
					System.out.println(number);
					System.out.println("primeiro passo - " + (inverte *=10));
					System.out.println("segundo passo - " + (inverte +=(number%10)));
					System.out.println("terceiro passo - " + (number /=10));
					System.out.println("\n");
				}
				System.out.println(inverte);

			} else {
				System.out.println("O numero não pode ser maior que 4 digitos");
				rodar = 1;
			}

		}

	}

}
