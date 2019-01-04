package br.com.br.labs27;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Aluno {

	int matricula;
	String nomeAluno;
	String cursoAluno;
	String[] disciplina = new String[3];
	double[][] notas = new double[3][4];
	boolean aprovado;
	double result = 0;
	double media = 0;

	Random nRandom = new Random();
	Scanner scan = new Scanner(System.in);

	void nMatricula() {
		System.out.println("N° matricula");
		System.out.println(matricula = nRandom.nextInt(100));

		System.out.println("Informe o nome do aluno");
		nomeAluno = scan.next();

		System.out.println("Infome o curso do Aluno");
		cursoAluno = scan.next();

		for (int i = 0; i < disciplina.length; i++) {
			System.out.println("Informe a " + (i + 1) + "° displina");
			disciplina[i] = scan.next();
		}

		for (int i = 0; i < disciplina.length; i++) {
			System.out.println("Informe a nota da disciplina: " + disciplina[i]);
			for (int j = 0; j < notas.length; j++) {
				System.out.println("Nota: " + (j + 1));
				notas[i][j] = scan.nextDouble();

			}

		}

	}

	void resultadoDisciplinas() {
		System.out.println("Matricula: " + matricula);
		System.out.println("Nome aluno: " + nomeAluno);
		System.out.println("Curso: " + cursoAluno);

		for (int i = 0; i < disciplina.length; i++) {
			System.out.println("Disciplina: " + disciplina[i]);
			for (int j = 0; j < notas.length; j++) {
				System.out.print("Nota: " + notas[i][j] + " - ");
				result += notas[i][j];
			}
			System.out.println("Total: " + result);

			media = result / 3;
			
			if(media >= 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}

			System.out.println();

		}

	}

	void aprovacao() {

	}

}
