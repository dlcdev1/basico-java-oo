package uri1038;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		double qtd = sc.nextInt();
		switch (codigo) {

		case 1:
			qtd *= 4.00;
			System.out.printf("Total: R$ %.2f%n", qtd);
			break;
		case 2:
			qtd *= 4.50;
			System.out.printf("Total: R$ %.2f%n", qtd);
			break;
		case 3:
			qtd *= 5.00;
			System.out.printf("Total: R$ %.2f%n", qtd);
			break;
		case 4:
			qtd *= 2.00;
			System.out.printf("Total: R$ %.2f%n", qtd);
			break;
		case 5:
			qtd *= 1.50;
			System.out.printf("Total: R$ %.2f%n", qtd);
			break;
		default:
			System.out.println("Codigo invalido");

		}

		sc.close();

	}

}
