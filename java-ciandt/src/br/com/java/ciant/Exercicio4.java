package br.com.java.ciant;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		int router = 1;
		while (router != 0) {

			Scanner scan = new Scanner(System.in);
			System.out.println("Input number");
			int number = scan.nextInt();

			switch (number) {

			case 1:
				System.out.println("Sunday.");
				break;
			case 2:
				System.out.println("Monday.");
				break;
			case 3:
				System.out.println("Tuesday.");
				break;
			case 4:
				System.out.println("Wednesday.");
				break;
			case 5: 
				System.out.println("Thursday.");
				break;
			case 6:
				System.out.println("Friday.");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("invalid day");

				if (number == 0) {
					router = number;
					System.out.println("Program closed");
				}

			}

		}

	}

}
