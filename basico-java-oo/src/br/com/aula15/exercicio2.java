package br.com.aula15;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um numero:");
		int number = scan.nextInt();

		if (number >= 0) {
			System.out.println("Este numero:" + number + " é positivo.");
		} else {
			System.out.println("Este numero:" + number + " é negativo.");
		}

	}

}
