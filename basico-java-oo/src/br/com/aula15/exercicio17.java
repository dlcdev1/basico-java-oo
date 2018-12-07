package br.com.aula15;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Primeira situação: Se o ano de 2015 ou 2016 for uma divisão exata em relação
		 * a 4, deveremos verificar, em seguida, se não é divisível por 100. Se não for,
		 * o ano será bissexto;
		 * 
		 * 
		 * Segunda situação: Se o ano de 2015 ou 2016 não for divisível por 4, então
		 * deveremos verificar se ele é divisível por 400. Se também não for divisível,
		 * o ano de 2015 não será bissexto;
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		
		
		
		int rodar = 1;
		while(rodar!=0) {
			double result, result1, result2;

			System.out.println("Informe o ano:");
			int ano = scan.nextInt();
			result = ano / 4;
			result1 = ano / 100;
			result2 = ano / 400;
			
			if ((result % 2) == 0) {
				if ((result1 % 2) != 0) {
					System.out.println("É um ano bissesto");
				} else {
					System.out.println(ano + ": Nâo é um ano bissesto 0");
				}
			} else if((result % 2) !=0){
				if((result2 % 2)!=0) {
					System.out.println(ano + ": Nâo é um ano biscesto 2° opção");
				} else {
					System.out.println("É um ano biscesto 2 opção");
				}
				
			} 
			rodar++;
			
		}
		
	}

}
