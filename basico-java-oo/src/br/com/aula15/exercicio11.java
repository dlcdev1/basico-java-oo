package br.com.aula15;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo
		 * o seguinte crit�rio, baseado no sal�rio atual: Salario at� R$280,00
		 * (incluindo): aumento de 20% Sal�rio entre R$280,00 e R$700,00: aumento de 15%
		 * Sal�rio entre R$700,00 e R$1500,00 : aumento de 10% Sal�rio de R$1500,00 em
		 * diante: aumento de 5% Ap�s o aumento ser realizado, informe na tela: o
		 * sal�rio antes do reajuste; o percentual de aumento aplicado: o valor do
		 * aumento: o novo sal�rio, ap�s o aumento
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o sal�rio:");
		double salario = scan.nextDouble();
		double result;
		
		if (salario <= 280) {
			result = salario * 20 / 100;
			System.out.println("O salario antes do reajuste era de: R$" + salario);
			System.out.println("O percentual do reajuste � 20%:");
			System.out.println("O valor do aumento � de: R$" + result);
			System.out.println("O valor com o reajuste � de: R$" + (result + salario));
		} else if ((salario > 280) || (salario < 700)) {
			result = salario * 15 / 100;
			System.out.println("O salario antes do reajuste era de: R$" + salario);
			System.out.println("O percentual do reajuste � 15%:");
			System.out.println("O valor do aumento � de: R$" + result);
			System.out.println("O valor com o reajuste � de: R$" + (result + salario));
		} else if ((salario > 700) || (salario < 1500)) {
			result = salario * 10 / 100;
			System.out.println("O salario antes do reajuste era de: R$" + salario);
			System.out.println("O percentual do reajuste � 10%:");
			System.out.println("O valor do aumento � de: R$" + result);
			System.out.println("O valor com o reajuste � de: R$" + (result + salario));
		} else if (salario > 1500) {
			result = salario * 5 / 100;
			System.out.println("O salario antes do reajuste era de: R$" + salario);
			System.out.println("O percentual do reajuste � 5%:");
			System.out.println("O valor do aumento � de: R$" + result);
			System.out.println("O valor com o reajuste � de: R$" + (result + salario));
		}

	}

}
