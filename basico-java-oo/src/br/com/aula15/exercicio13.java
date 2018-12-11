package br.com.aula15;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Infomre um numero de 1 a 7 ");
		int number1 = scan.nextInt();

		switch (number1) {

		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quart");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("sabado");
			break;

		default:
			System.out.println("Valor inválido.");

		}

	}

}
