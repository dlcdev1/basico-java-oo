package br.com.java.ciant;

import java.util.Scanner;

public class ControleFluxoIfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Numero:");
		int number = scan.nextInt();

		if (number == 1) {
			System.out.println("Janeiro");
		} else if (number == 2) {
			System.out.println("Fevereiro");
		} else if (number == 3) {
			System.out.println("Março");
		} else if (number == 4) {
			System.out.println("Abril");
		} else if (number == 5) {
			System.out.println("Maio");
		} else if (number == 6) {
			System.out.println("Junho");
		} else if (number == 7) {
			System.out.println("Julho");
		} else if (number == 8) {
			System.out.println("Agosto");
		} else if (number == 9) {
			System.out.println("Setembro");
		} else if (number == 10) {
			System.out.println("Outubro");
		} else if (number == 11) {
			System.out.println("Novembro");
		} else if (number == 12) {
			System.out.println("Dezembro");
		} else {
			System.out.println("Valor invalido");
		}

	}

}
