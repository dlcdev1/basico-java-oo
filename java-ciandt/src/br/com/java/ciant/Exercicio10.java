package br.com.java.ciant;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa em Java que calcula e imprime na tela o salário
		 * proporcional de um funcionário que trabalhou apenas N dias num mês de 22 dias
		 * úteis. O número de dias trabalhados bem como o salário integral do
		 * funcionário devem ser lidos do teclado. O resultado deve ser um número
		 * ponto-flutuante.
		 */

		Scanner scan = new Scanner(System.in);
		int router = 1;

		while (router != 0) {
			float result = 0, total = 0;
			int qDay = 22;

			System.out.println("Input you salary");
			float salary = scan.nextFloat();
			System.out.println("Input day jobs");
			int day = scan.nextInt();
			if (day > 22) {
				System.out.println("number of days wrong ");
				router = 1;
			} else {
				result = salary / 22;
				total = result * day;
				System.out.println("Salary month" + salary);
				System.out.println("Salary proportional	" + total);

			}

		}

	}

}
