package br.com.aula15;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a 1° nota:");
		double note1 = scan.nextDouble();
		System.out.println("Informe a 2° nota:");
		double note2 = scan.nextDouble();

		double resultado = (note1 + note2) / 2;

		if (resultado == 10) {
			System.out.println("Aprovado com dinstição " + resultado);
		} else if (resultado < 7) {
			System.out.println("Reprovado com a nota: " + resultado);
		} else if (resultado >= 7) {
			System.out.println("Aprovado com a nota: " + resultado);
		}
	}

}
