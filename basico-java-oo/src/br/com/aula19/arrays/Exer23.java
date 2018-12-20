package br.com.aula19.arrays;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		int[] vetorA = new int[10];
		int result = 0;
		boolean flag = true;

		while (flag != false) {
			Scanner scan = new Scanner(System.in);
			for (int i = 0; i < vetorA.length; i++) {
				System.out.println("Informe um numero:");
				vetorA[i] = scan.nextInt();
				result = vetorA[i];

				System.out.println(result);
				if (result % 2 == 0 && result > 0) {
					// numero par

					System.out.println("numero par" + result);
					flag = true;
				} else {

					System.out.println("numero ipar" + result);
					System.out.println("programa encerrado");
					flag = false;
					break;
				}
			}

		}
	}

}
