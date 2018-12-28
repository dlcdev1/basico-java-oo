package br.com.aula20;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][][] compromisso = new String[12][31][24];
		boolean sair = false;
		int opcao;

		while (!sair) {
			System.out.println("1 - Adicionar compromisso");
			System.out.println("2 - Verificar compromisso");
			System.out.println("3 - Sair");

			opcao = scan.nextInt();

			if (opcao == 1) {
				boolean anoValido = false;
				int ano = 0;
				int dia = 0;
				int hora = 0;
				while (!anoValido) {
					System.out.println("Informe o ano");
					ano = scan.nextInt();

					if (ano > 0 && ano <= 12) {
						anoValido = true;
					} else {
						System.out.println("Digite um ano valido.");
					}
				}
				boolean diaValido = false;
				while (!diaValido) {

					System.out.println("Informe o dia");
					dia = scan.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Digite um dia valido");
					}
				}
				boolean horaValida = false;
				while (!horaValida) {

					System.out.println("Informe a hora");
					hora = scan.nextInt();
					if (hora > 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Digite uma hora valida");
					}
				}
				ano--;
				System.out.println("Digite um compromisso:");
				compromisso[ano][dia][hora] = scan.next();

			}
			if (opcao == 2) {
				boolean anoValido = false;
				int ano = 0;
				int dia = 0;
				int hora = 0;
				while (!anoValido) {
					System.out.println("Informe o ano");
					ano = scan.nextInt();

					if (ano > 0 && ano <= 12) {
						anoValido = true;
					} else {
						System.out.println("Digite um ano valido.");
					}
				}
				boolean diaValido = false;
				while (!diaValido) {

					System.out.println("Informe o dia");
					dia = scan.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Digite um dia valido");
					}
				}
				boolean horaValida = false;
				while (!horaValida) {

					System.out.println("Informe a hora");
					hora = scan.nextInt();
					if (hora > 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Digite uma hora valida");
					}
				}
				ano--;
				System.out.println("Compromisso");
				System.out.println(compromisso[ano][dia][hora]);

			}

			if (opcao == 3) {
				System.out.println("Programa encerrado");
				sair = true;

			}
		}

	}

}
