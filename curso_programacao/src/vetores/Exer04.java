package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] number = new double[n];
		double soma = 0, media, abaixo;

		for (int i = 0; i < n; i++) {
			number[i] = sc.nextDouble();
		}
		for (int i = 0; i < n; i++) {
			soma = soma + number[i];
		}

		media = soma / n;
		System.out.printf("%.3f%n", media);

		for (int i = 0; i < n; i++) {
			if (number[i] < media) {
				abaixo = number[i];
				System.out.println(abaixo);
			}
		}

		sc.close();

	}

}
