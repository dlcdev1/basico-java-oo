package br.com.aula15;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double media, result;

		System.out.println("Informe a 1° nota:");
		double nota1 = scan.nextDouble();
		System.out.println("Informe a 2° nota:");
		double nota2 = scan.nextDouble();
		System.out.println("Informe a 3° nota:");
		double nota3 = scan.nextDouble();
		System.out.println("Informe a 4° nota:");
		double nota4 = scan.nextDouble();
		System.out.println("Informe a 5° nota:");
		double nota5 = scan.nextDouble();
		System.out.println("Informe a 6° nota:");
		double nota6 = scan.nextDouble();

		result = nota1 + nota2 + nota3 + nota4 + nota5 + nota6;
		media = result / 6;

		System.out.println("1° nota: " + nota1);
		System.out.println("2° nota: " + nota2);
		System.out.println("3° nota: " + nota3);
		System.out.println("4° nota: " + nota4);
		System.out.println("5° nota: " + nota5);
		System.out.println("6° nota: " + nota6);

		System.out.println("media: " + media);

		if (media > 9) {
			System.out.println("Conceito 'A' - APROVADO");
		} else if ((media > 7.5) && (media < 9)) {
			System.out.println("Conceito 'B' - APROVADO");
		} else if ((media > 6) && (media < 7.5)) {
			System.out.println("Conceito 'C' - APROVADO");
		}

	}

}
