package uri1021;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double number, n1, n2, n3, n4, n5, n6, m1, m2, m3, m4, m5, m6, r1, r2, r3, r4, r5, r6, rM1, rM2, rM3, rM4, rM5,
				rM6;

		number = scan.nextDouble();

		n1 = number / 100.00 + 0.05;
		r1 = number % 100.00;

		n2 = r1 / 50.00;
		r2 = r1 % 50.00;

		n3 = r2 / 20.00;
		r3 = r2 % 20.00;

		n4 = r3 / 10.00;
		r4 = r3 % 10.00;

		n5 = r4 / 5.00;
		r5 = r4 % 5.00;

		n6 = r5 / 2.00;
		r6 = r5 % 2.00;

		m1 = r6 / 1.00;
		rM1 = r6 % 1.00;

		m2 = rM1 / 0.50;
		rM2 = rM1 % 0.50;

		m3 = rM2 / 0.25;
		rM3 = rM2 % 0.25;

		m4 = rM3 / 0.10;
		rM4 = rM3 % 0.10;

		m5 = rM4 / 0.05;
		rM5 = rM4 % 0.05;

		m6 = rM5 / 0.01;

		System.out.println("NOTAS:");
		
	
		System.out.printf("%.0f notas(s) de R$ 100.00%n", Math.floor(n1));
		System.out.printf("%.0f notas(s) de R$ 50.00%n", Math.floor(n2));
		System.out.printf("%.0f notas(s) de R$ 20.00%n", Math.floor(n3));
		System.out.printf("%.0f notas(s) de R$ 10.00%n", Math.floor(n4));
		System.out.printf("%.0f notas(s) de R$ 5.00%n", Math.floor(n5));
		System.out.printf("%.0f notas(s) de R$ 2.00%n", Math.floor(n6));
		System.out.println("MOEDAS:");
		System.out.printf("%.0f notas(s) de R$ 1.00%n", Math.floor(m1));
		System.out.printf("%.0f notas(s) de R$ 0.50%n", Math.floor(m2));
		System.out.printf("%.0f notas(s) de R$ 0.25%n", Math.floor(m3));
		System.out.printf("%.0f notas(s) de R$ 0.10%n", Math.floor(m4));
		System.out.printf("%.0f notas(s) de R$ 0.5%n", Math.floor(m5));
		System.out.printf("%.0f notas(s) de R$ 0.1%n", Math.floor(m6));

	}

}
