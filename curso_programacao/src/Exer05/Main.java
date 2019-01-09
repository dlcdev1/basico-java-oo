package Exer05;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a primeira nota: ");
		double nota1 = scan.nextDouble();

		System.out.println("Infomre a segunda nota: ");
		double nota2 = scan.nextDouble();

		double result = nota1 + nota2;

		System.out.printf("Nota final = %.1f%n", result);

		if (result < 60.0) {
			System.out.println("Reprovado!");
		} else {
			System.out.println("Aprovado");
		}

	}

}
