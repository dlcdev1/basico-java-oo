package uri1010;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int A, B, C, D;
		double P1, P2, Total;

		A = sc.nextInt();
		B = sc.nextInt();
		P1 = sc.nextDouble();

		C = sc.nextInt();
		D = sc.nextInt();
		P2 = sc.nextDouble();

		Total = P1 * B + P2 * D;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", Total);

		sc.close();

	}

}
