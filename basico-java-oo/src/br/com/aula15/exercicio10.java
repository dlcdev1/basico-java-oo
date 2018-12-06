package br.com.aula15;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("M-matutino | V-vespetino | N-noturno");
		System.out.println("Informe o turno que você estuda");
		
		String letter = scan.nextLine();
		
		switch(letter) {
		
		case "M": System.out.println("Bom dia"); break;
		case "m": System.out.println("Bom dia"); break;
		case "V": System.out.println("Boa tarde!"); break;
		case "v": System.out.println("Boa tarde!"); break;
		case "N": System.out.println("Boa noite!"); break;
		case "n": System.out.println("Boa noite!"); break;
		default: System.out.println("VAlor invalido!");
		
		}

	}

}
