package uri1011;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double pi = 3.14159;
		double raio = scan.nextDouble();

		double volume = (4 / 3.0) * pi * Math.pow(raio, 3);

		System.out.printf("VOLUME = %.3f%n", volume);

	}

}
