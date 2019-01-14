package uri1132;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int y = sc.nextInt();

		int min = x, maior = y;

		if (x > y) {
			min = y;
			maior = x;
		}

		int soma = 0;

		for (int i = min; i <= maior; i++) {

			if (i % 13 != 0) {
				soma = soma + i;
			}

		}
		System.out.println(soma);
		sc.close();

	}

}


