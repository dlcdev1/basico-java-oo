package uri1154;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double idade = sc.nextDouble();
		double count = 0, media = 0;

		while (idade > 0) {
			media += idade;
			count++;
			idade = sc.nextInt();
		}

		System.out.printf("%.2f%n", media / count);
		sc.close();
	}

}
