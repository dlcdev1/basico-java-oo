package br.com.aula16;

import java.util.Scanner;

public class execicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero:");
		int number = scan.nextInt();
		System.out.println("Informe o segundo numero:");
		int expoente = scan.nextInt();
		//int i=1;
		int result=0, result1=0, multi=0, total=0;
		System.out.println(Math.pow(number, expoente));
		for(int i=number; i <= number; i++) {
					
			expoente = i;
			result = expoente * expoente;
		
		}
		System.out.println(result);
		
			
		}
		
	}


