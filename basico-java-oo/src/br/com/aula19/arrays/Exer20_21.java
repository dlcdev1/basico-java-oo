package br.com.aula19.arrays;

import java.util.Scanner;

public class Exer20_21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float[] vetorA = new float[20];
		float dolar = 0, real = 0;
		System.out.println("Informe o valor do dolar");
		dolar = scan.nextFloat();
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = dolar * i;
		}

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Variação é de: " + i + " é " + vetorA[i]);
		}

	}

}
