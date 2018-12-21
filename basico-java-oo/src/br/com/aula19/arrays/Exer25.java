package br.com.aula19.arrays;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int result = 0;

		int[] vA = new int[10];
		int[] vB = new int[10];

		for (int i = 0; i < vA.length; i++) {
			System.out.println("Informe o" + i + "° número.");
			vA[i] = scan.nextInt();
		}
		for (int i = 0; i < vA.length; i++) {
			result = vA[i];
			if (result % 2 == 0) {
				System.out.println("Número par");
				vB[i] = 1;
			} else {
				System.out.println("Número impar");
				vB[i] = 0;
			}

		}
		for (int i = 0; i < vB.length; i++) {
			System.out.println(i + "° posição = " + vB[i]);
		}

	}

}
