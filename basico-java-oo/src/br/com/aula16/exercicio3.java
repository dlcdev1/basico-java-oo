package br.com.aula16;

import java.util.Scanner;

import javax.sound.sampled.Line;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Boolean rodar = true;

		while (rodar != false) {

			System.out.println("Nome:");
			String nome = scan.next();
			System.out.println("Idade:");
			int idade = scan.nextInt();
			System.out.println("Salário:");
			double salario = scan.nextDouble();
			System.out.println("Sexo. 'f' ou 'm'");
			String sexo = scan.next();
			System.out.println("Estado Civil: 's', 'c', 'v', 'd'");
			String estadoCivil = scan.next();

			if (nome.length() <= 3) {
				System.out.println("Nome invalido");
				rodar = true;
			} else if ((idade >= 150) && (idade <= 0)) {
				System.out.println("Idade invalida");
				rodar = true;
			}
			if (salario <= 0) {
				System.out.println("Salario invalido");
				rodar = true;
			}

			if ((sexo.equalsIgnoreCase("f")) || (sexo.equalsIgnoreCase("m"))) {

			} else {
				System.out.println("sexo invalido");
				rodar = true;
			}
			if ((estadoCivil.equalsIgnoreCase("c")) || (estadoCivil.equalsIgnoreCase("s"))
					|| (estadoCivil.equalsIgnoreCase("v")) || (estadoCivil.equalsIgnoreCase("d"))) {

			} else {
				System.out.println("Estado civil invalido");
				rodar = true;
			}

		}

	}

}
