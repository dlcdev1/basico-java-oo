package uri1017;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int tempoGasto, velocidadeMedia;
		double total, km = 12;

		tempoGasto = scan.nextInt();
		velocidadeMedia = scan.nextInt();

		total = tempoGasto * velocidadeMedia / km;

		System.out.printf("%.3f%n", total);

	}

}

