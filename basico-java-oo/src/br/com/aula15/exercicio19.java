package br.com.aula15;

import java.util.Scanner;

public class exercicio19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int result = 0;

		 int rodar=1;
		while(rodar!=0){

		
		System.out.println("Informe o 1°numero:");
		int number1 = scan.nextInt();
		System.out.println("Informe o 2° numero");
		int number2 = scan.nextInt();

		System.out.println("Informe uma operação:");
		String operacao = scan.next();
		
		
	
		//result = number1

		switch (operacao) {

		case "-":
			result = (number1 - number2);
			System.out.println(result);
			break;
		case "+":
			result = (number1 + number2);
			System.out.println(result);
			break;
		case "/":
			result = (number1 / number2);
			System.out.println(result);
			break;
		case "*":
			result = (number1 * number2);
			System.out.println(result);
			break;
		default: System.out.println("Operação invalida");

		}

		 }
	}

}
