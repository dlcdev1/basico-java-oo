package uri1020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int idade, ano, mes, dia, resto, resto1;

		idade = scan.nextInt();

		ano = idade / 365;
		resto = idade % 365;

		mes = resto / 30;
		resto1 = resto % 30;

		dia = resto1 / 1;

		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");

	}

}
