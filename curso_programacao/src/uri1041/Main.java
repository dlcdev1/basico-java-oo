package uri1041;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x = sc.nextDouble();
		double y = sc.nextDouble();

		if (y == 0 && x == 0) {
			System.out.println("Origem");
		} else if (y > 0 && x > 0) {
			System.out.println("Q1");
		} else if (y > 0 && x < 0) {
			System.out.println("Q2");
		} else if (y < 0 && x < 0) {
			System.out.println("Q3");
		} else if (y < 0 && x > 0) {
			System.out.println("Q4");
		}
		sc.close();
	}

}
