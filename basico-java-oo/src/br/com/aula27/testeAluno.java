package br.com.aula27;

import java.util.Scanner;

public class testeAluno {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Entre com o nome do aluno");
		aluno.nome = scan.next();
		System.out.println("Entre com o nome do curso");
		aluno.nomeCurso = scan.next();
		System.out.println("Entre com a matricula");
		aluno.matricula = scan.next();
		
		//aluno.nomeDisciplina = new String[3];
		for (int i=0; i <aluno.nomeDisciplina.length; i++) {
			System.out.println("Entre com o nome da disciplina " + i);
			aluno.nomeDisciplina[i] = scan.next();
		}
		for (int i=0; i<aluno.notasDisplicinas.length; i++) {
			System.out.println("Obtendo notdas da disciplinas " + aluno.nomeDisciplina[i]);
			for(int j=0; j<aluno.notasDisplicinas[i].length; j++) {
				System.out.println("Entre com a nota " + (j+1));
				aluno.notasDisplicinas[i][j] = scan.nextDouble();
			}
		}
		aluno.mostrarInfo();		
	}

}
