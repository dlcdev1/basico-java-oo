package br.com.aula19.arrays;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String aluno[] = new String[10];
		float vetorA[] = new float [10];
		float vetorB[] = new float [10];
		
		for(int i = 0; i< aluno.length; i++) {
			System.out.println("Informe o nome do " + i + " Aluno");
			aluno[i] = scan.next();
			System.out.println("informe a 1° nota do " + aluno[i]);
			vetorA[i] = scan.nextFloat();
			System.out.println("Informe a 2° nota do " + aluno[i]);
			vetorB[i] = scan.nextFloat();
		}
		for (int i=0; i < aluno.length; i++) {
			System.out.println(aluno[i]);
			System.out.println(vetorA[i]);
			System.out.println(vetorB[i]+"\n");
		}

	}

}
