package br.com.aula19.arrays;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String aluno[] = new String[5];
		float vetorA[] = new float[5];
		float vetorB[] = new float[5];
		float result[] = new float[5];

		for (int i = 0; i < aluno.length; i++) {
			System.out.println("Informe o nome do " + i + " Aluno");
			aluno[i] = scan.next();
			System.out.println("informe a 1° nota do " + aluno[i]);
			vetorA[i] = scan.nextFloat();
			System.out.println("Informe a 2° nota do " + aluno[i]);
			vetorB[i] = scan.nextFloat();
			result[i] = vetorA[i] + vetorB[i];

		}

		int menu = 0, router = 1;
		while (router != 0) {

			System.out.println("1 - Listar alunos:");
			System.out.println("2 - Aterar Notas");
			System.out.println("3 - Exibir a média total das notas");
			System.out.println("4 - Exibir a média do aluno");
			System.out.println("5  - Encerrar programa");
			menu = scan.nextInt();

			switch (menu) {

			case 1:
				for (int i = 0; i < aluno.length; i++) {
					System.out.println("Posicão " + i + " - " + aluno[i]);
				}
				System.out.println("Consultar nota aluno:");
				int consult = scan.nextInt();

				System.out.println("Aluno: " + aluno[consult]);
				System.out.println("1° nota: " + vetorA[consult]);
				System.out.println("2° nota: " + vetorB[consult]);

				break;
			case 2:
				for (int i = 0; i < aluno.length; i++) {
					System.out.println("Aluno: " + i + aluno[i]);
					System.out.println("1° nota: " + vetorA[i]);
					System.out.println("2° nota: " + vetorB[i]);
				}

				System.out.println("Informe o Aluno a ser alterado:");
				int alter = scan.nextInt();
				System.out.println(aluno[alter]);
				System.out.println("Informe a 1° nota");
				vetorA[alter] = scan.nextInt();
				System.out.println("Informe a 2° nota");
				vetorB[alter] = scan.nextInt();

				System.out.println("nota alterada:");
				System.out.println("Nome aluno: " + aluno[alter]);
				System.out.println("Primeira nota: " + vetorA[alter]);
				System.out.println("Seunda nota: " + vetorB[alter]);
				result[alter] = vetorA[alter] + vetorB[alter];

				break;
			case 3:

				float recebV = 0, media = 0, soma = 0, count = 0, mediaA = 0;
				for (int i = 0; i < result.length; i++) {
					count++;
					System.out.print(aluno[i] + " = " + (recebV = result[i]));
					System.out.println((soma = recebV + soma));
				}
				System.out.println("O total das notas é de: " + soma);
				System.out.println("A média total dos alunos é de: " + (soma / count));
				break;
			case 4:
				for (int i = 0; i < result.length; i++) {
					System.out.println("Aluno: " + aluno[i] + ". Nota real = " + result[i]);
					mediaA = result[i] / 2;
					if (mediaA > 7) {
						System.out.println("Aluno: " + aluno[i] + ". média = " + mediaA);
						System.out.println("APROVADO!!!\n");

					} else {
						System.out.println("Aluno: " + aluno[i] + ". média = " + mediaA);
						System.out.println("REPROVADO!!!\n");

					}

				}
				break;
			case 5:
				System.out.println("Programa encerrado");
				router = 0;
				break;
			default:
				System.out.println("Opção invalidae.");
			}

		}
		for (int i=0; i < aluno.length; i++) {
			System.out.println(aluno[i]);
			System.out.println(vetorA[i]);
			System.out.println(vetorB[i]+"\n");
		}

	}

}
