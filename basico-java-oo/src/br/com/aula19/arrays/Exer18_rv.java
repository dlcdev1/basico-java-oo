package br.com.aula19.arrays;

import java.util.Scanner;

public class Exer18_rv {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetorA = new int[11];
		int idadeMenor = 0, resultMenor = 0, idadeMaior = 0, posicao = 0, posicaoM = 0, resultMaior = 0, result = 0;

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Informe a " + i + " ° idade:");
			vetorA[i] = scan.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] > idadeMaior) {
				idadeMaior = vetorA[i];
				if (vetorA[i] > idadeMaior) {
					idadeMaior = vetorA[i];
				}
				posicao = i;
			}

		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i]);
			if (vetorA[i] < idadeMenor && vetorA[i]>0) {
				idadeMenor = vetorA[i];
				if (vetorA[i] < idadeMenor) {
					idadeMenor = vetorA[i];
				}
			}

		}
		System.out.println("Maior idade = " + idadeMaior + " posição = " + posicao);
		System.out.println("Menor idade = " + idadeMenor + " posicão = " + posicaoM);
	}
}
