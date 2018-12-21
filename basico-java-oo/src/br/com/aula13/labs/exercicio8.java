package br.com.aula13.labs;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// Faça um programa que pergunte quanto você ganha por hora e o número de
		// horas trabalhadas no mês
		// Calcule e mostre o total do seu salario no feferido mês.

		Scanner scan = new Scanner(System.in);

		System.out.println("===========Salario total mês============");
		System.out.println("Valor recebido por hora: ");
		double valorHoras = scan.nextDouble();

		System.out.println("Qtd horas trabalhadas:");
		double horasTrab = scan.nextDouble();

		double resultado = valorHoras * horasTrab;

		System.out.println("O seu salário será de:" + resultado);

	}

}
