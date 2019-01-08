package uri1005;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		double media, total;

		double notaA = scan.nextDouble();
		double notaB = scan.nextDouble();

		media = (notaA * 3.5 + notaB * 7.5) / 11.0;
		
		System.out.printf("MEDIA = %.5f\n", media);
		
		scan.close();

	}

}
