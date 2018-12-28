package br.com.aula20;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [][] matriz = new int [3][3];
		int valor=0;
		int numberP =0;
		int numberI =0;
		for (int i=0; i  < matriz.length; i++) {
			for(int j=0; j < matriz[i].length; j++) {
				System.out.println("Informe o valor da coluna " + (i+1));
				valor = scan.nextInt();
				matriz[i][j] = valor;
			}
		}
		for(int i=0; i < matriz.length; i++) { 
			System.out.print("L" + (i+1) +" ");
			for (int j =0; j< matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " " );
				if(matriz[i][j] %2==0) {
					numberP++;
				} else {
					numberI++;
				}
			}
			System.out.println();
			

		}
		System.out.println("Quantidade números Par: " + numberP);
		System.out.println("Quantidade números Par: " + numberI);
		
	}

}
