package br.com.aula15;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Infome uma letra(F) OU (M)");
		String letter = scan.nextLine();

		System.out.println("valor é igual:" + letter);

		if (letter.equalsIgnoreCase("m")) {
			System.out.println("Masculino:");
		} else if (letter.equalsIgnoreCase("f")) {
			System.out.println("Feminino");
		} else {
			System.out.println("Sexo invalido");
		}

	}

}
