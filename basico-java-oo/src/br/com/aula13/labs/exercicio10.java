package br.com.aula13.labs;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// Faça um programa que pega a temperatura em graus Celsius, transforme e mostre em graus Farenheit
		//C * 1,8 +32
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a temperatura: ");
		double celsius = scan.nextDouble();
		
		double farenheit = (celsius * 9/5) +32;
		//float farenheit = (float) (celsius * 1.8 + 32); é o mesmo codigo reduzido
		
		System.out.println("A temperatura é: "  + farenheit+"°F");
		
		
		

	}

}
