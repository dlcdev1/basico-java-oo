package br.com.aula20;

import java.util.Scanner;

public class jogoVelhaExer06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] jogoVelha = new String[3][3];

		jogoVelha[0][0] = "  ";
		jogoVelha[0][1] = "  ";
		jogoVelha[0][2] = "  ";

		jogoVelha[1][0] = "  ";
		jogoVelha[1][1] = "  ";
		jogoVelha[1][2] = "  ";

		jogoVelha[2][0] = "  ";
		jogoVelha[2][1] = "  ";
		jogoVelha[2][2] = "  ";

		boolean sair = false;

		while (!sair) {
			int j1Linha;
			int j2Linha;
			int j1Coluna;
			int j2Coluna;

			System.out.println("--- --- ---");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {

					System.out.print(jogoVelha[i][j] + " ");

				}
				System.out.println();
				System.out.println("--- --- ---");
			}

			System.out.println("Iniciando o jogo;");
			System.out.println("Jogador 1 - informa a linha:");
			j1Linha = scan.nextInt();
			System.out.println("Jogador 1 - informe a coluna");
			j1Coluna = scan.nextInt();
		
				for (int i = 0; i < jogoVelha[j1Linha].length; i++) {
					for (int j = 0; j < jogoVelha[j1Linha].length; j++) {
						if(jogoVelha[j1Linha][j1Coluna] == "  ") {
							jogoVelha[j1Linha][j1Coluna] = " X ";
							break;
						} else {
							System.out.println("Jogada invalida, jogue novamente!");
						}
						
					}
				}
			


		}

	} // ultima linha void main

}
