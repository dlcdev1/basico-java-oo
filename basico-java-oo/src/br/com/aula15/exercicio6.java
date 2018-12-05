package br.com.aula15;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o 1° numero:");
		double number1 =scan.nextDouble();
		System.out.println("Informe o 2° numero:");
		double number2 = scan.nextDouble();
		System.out.println("Informe o 3° numero:");
		double number3 = scan.nextDouble();
		
		if((number1 > number2) && (number1 > number3)){
			System.out.println("O 1° número: " + number1 + " è maior que os demais:" + "\n2° numero: "+ number2 + "\n3° numero:" + number3);
		} else if((number2 > number1) && (number2 > number3)) {
			System.out.println("O 2° número: " + number2 + " é maior que os demais:" + "\n1° número: "+ number1 + "\n3° número " + number3);
		} else if((number3 > number1) && (number3 > number2)){
			System.out.println("O 3° número: " + number3 + " é maior que os demais:" + "\n1° número: " +number1 + "\n2° número: "+ number2);
		} else {
			System.out.println("Todos os numeros são iguais!");
		}

	}

}
