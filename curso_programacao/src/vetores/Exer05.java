package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] number = new double[n];
		double media = 0, result = 0;
		int count = 0;

		for (int i = 0; i < n; i++) {
			number[i] = sc.nextDouble();
		}
		for (int i = 0; i < n; i++) {
			if (number[i] % 2 == 0) {
				count++;
				media += number[i];
			}
		}
		result = media / count;
		System.out.printf("%.1f%n", result);

		sc.close();
	}

}
