package br.com.aula15;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Primeira situa��o: Se o ano de 2015 ou 2016 for uma divis�o exata em rela��o
		 * a 4, deveremos verificar, em seguida, se n�o � divis�vel por 100. Se n�o for,
		 * o ano ser� bissexto;
		 * 
		 * 
		 * Segunda situa��o: Se o ano de 2015 ou 2016 n�o for divis�vel por 4, ent�o
		 * deveremos verificar se ele � divis�vel por 400. Se tamb�m n�o for divis�vel,
		 * o ano de 2015 n�o ser� bissexto;
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
					System.out.println("� um ano bissesto");
				} else {
					System.out.println(ano + ": N�o � um ano bissesto 0");
				}
			} else if((result % 2) !=0){
				if((result2 % 2)!=0) {
					System.out.println(ano + ": N�o � um ano biscesto 2� op��o");
				} else {
					System.out.println("� um ano biscesto 2 op��o");
				}
				
			} 
			rodar++;
			
		}
		
	}

}
