package br.com.aula16;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o numero da tabuada: ");
		int number = scan.nextInt();
		int i = 1;
		System.out.println("Tabuada do: " + number);
		while (i < 11) {
			System.out.println(number + " X " + i + " = " + (number * i));
			i++;
		}

	}

}
