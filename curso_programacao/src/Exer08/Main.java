package Exer08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int dia = sc.nextInt();

		switch (dia) {

		case 1:
			System.out.println("domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
		case 7:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Dia invalido");
			break;
		}

	}

}
