package br.com.aula19.arrays;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int resultA=0, resultB=0;

		int[] vA = new int[4];
		int[] vB = new int[4];
		int[] cB = new int[4];

		for (int i = 0; i < vA.length; i++) {
			System.out.println("Informe o" + i + "° número para VETOR A:");
			vA[i] = scan.nextInt();
			System.out.println("Informe o" + i + "° número para VETOR B");
			vB[i] = scan.nextInt();
			
		}

		for (int i = 0; i < vA.length; i++) {
			resultA = vA[i];
			resultB = vB[i];

		}

	}

}
