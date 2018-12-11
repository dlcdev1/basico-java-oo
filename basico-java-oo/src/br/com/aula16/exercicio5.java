package br.com.aula16;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		boolean rodar = true;
		while (rodar != false) {
			Scanner scan = new Scanner(System.in);
			int count = 1;
			System.out.println("Informe a população do pais A: ");
			int paisA = scan.nextInt();
			System.out.println("Informe a população do pais B: ");
			int paisB = scan.nextInt();
			System.out.println("Informe a media de crecimento da população do pais A: %");
			double percenteA = scan.nextDouble();
			System.out.println("Informe a media de crecimento da população do pais B: %");
			double percenteB = scan.nextDouble();

			if (paisA > 0) {

				percenteA = (percenteA / 100) + 1;
				percenteB = (percenteB / 100) + 1;
				System.out.println(percenteA);
				System.out.println(percenteB);

				while (paisA < paisB) {
					if (paisA < paisB) {
						paisA = (int) (paisA * percenteA);
						paisB = (int) (paisB * percenteB);
						count++;
					}
					if (paisA == paisB) {
						paisA = (int) (paisA * percenteA);
						paisB = (int) (paisB * percenteB);

					}

					paisA++;

				}
				System.out.println("Pais A: " + paisA);
				System.out.println("Pais B: " + paisB);
				System.out.println("O pais A ira superar em:" + count + " anos.");

			} else {
				System.out.println("Opação invalida:");
				rodar = false;
			}

		}

	}

}
