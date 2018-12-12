package br.com.aula16;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		int count = 1;
		int paisA = 80000;
		int paisB = 200000;

		while (paisA < paisB) {
			if (paisA < paisB) {
				paisA = (int) (paisA * 1.03);
				paisB = (int) (paisB * 1.015);
				count++;
			}
			if (paisA == paisB) {
				paisA = (int) (paisA * 1.03);
				paisB = (int) (paisB * 1.015);

			}

			paisA++;

		}
		System.out.println("Pais A: " + paisA);
		System.out.println("Pais B: " + paisB);
		System.out.println("O pais A ira superar em:" + count + " anos.");
	}

}
