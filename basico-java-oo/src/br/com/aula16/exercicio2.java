package br.com.aula16;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Boolean rodar = true;
		while (rodar != false) {
			System.out.println("Informe seu nome:");
			String nome = scan.nextLine();
			System.out.println("informe a senha:");
			String senha = scan.nextLine();

			if (nome.intern() == senha.intern()) {
				System.out.println("Erro de cadastro");
			} else if (nome.intern() != senha.intern()) {
				System.out.println("Cadastro realizado");
				rodar = false;
			}

		}

	}

}
