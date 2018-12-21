package br.com.java.ciant.lista1;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String caracteres;

		String router = "exit";

		while (router != "entrar") {
			System.out.println("Digite uma palabra");
			caracteres = scan.nextLine();
			if (caracteres.equals("exit")) {
				System.out.println(router);
				router = "entrar";
				break;
			} else {
				caracteres = caracteres.toLowerCase();
				System.out.println(caracteres.replaceAll("[^a-z]", ""));
				System.out.println(caracteres.replaceAll("[^a-z]", "").length());

			}

		}

	}

}
