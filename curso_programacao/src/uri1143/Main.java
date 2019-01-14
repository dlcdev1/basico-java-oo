package uri1143;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int inicio = 1;

		for (int i = 0; i < n; i++) {
			int segundo = inicio * inicio;
			int terceiro = inicio * segundo;

			System.out.print(inicio);
			System.out.print(" " + segundo);
			System.out.print(" " + terceiro);
			System.out.println();
			inicio = inicio + 1;

		}

		sc.close();

	}

}
