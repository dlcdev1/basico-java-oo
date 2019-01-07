package uri1014;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int x;
		double y, total;

		x = scan.nextInt();
		y = scan.nextDouble();

		total = x / y;

		System.out.printf("%.3f km/l%n", total);

	}

}
