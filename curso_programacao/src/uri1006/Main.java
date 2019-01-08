package uri1006;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double A, B, C, media;

		A = scan.nextDouble();
		B = scan.nextDouble();
		C = scan.nextDouble();

		media = (A * 2 + B * 3 + C * 5) / 10;

		System.out.printf("MEDIA = %.1f\n", media);

	}

}
