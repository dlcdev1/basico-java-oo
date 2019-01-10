package uri1048;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salary = sc.nextDouble();

		double reajuste;
		double percent;
		double novoSalario;

		if (salary <= 400) {
			percent = 15.0;
		} else if (salary <= 800.0) {
			percent = 12.0;
		} else if (salary <= 1200.0) {
			percent = 10.0;
		} else if (salary <= 2000.0) {
			percent = 7.0;
		} else {
			percent = 4.0;
		}

		reajuste = percent * salary / 100;
		novoSalario = salary + reajuste;

		System.out.printf("Novo salario: %.2f%n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f%n", reajuste);
		System.out.printf("Em percentual: %.0f %%%n", percent);

		sc.close();

	}

}
