package uri1009;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		String nome = scan.next();
		double salary = scan.nextDouble();
		double vendas = scan.nextDouble();

		double totalVendas = vendas * 0.15 + salary;

		System.out.printf("TOTAL = R$ %.2f%n", totalVendas);

		scan.close();
	}

}
