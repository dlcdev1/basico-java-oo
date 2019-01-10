package uri1045;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		double A = 0, B = 0, C = 0;

		if (a > b && a > c) {
			A = a;
			if (b > c) {
				B = b;
				C = c;
			} else {
				b = c;
				c = b;
			}
		} else if (b > c) {
			A = b;
			if (a > c) {
				B = a;
				C = c;
			} else {
				B = c;
				C = a;
			}
		} else {
			A = c;
			if (a > b) {
				B = a;
				C = b;
			} else {
				B = b;
				C = a;
			}
		}

		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {

			if (Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if (Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			} else {
				System.out.println("TRIANGULO ACUTANGULO");
			}

			if (A == B && B == C) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if (A == B || A == C || B == C) {
				System.out.println("TRIANGULO ISOCELES");
			}
		}

	}

}
