package br.com.aula15;

import java.util.Scanner;

public class exercicio4 {
	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe uma letra");
		String letter = scan.nextLine();
		
		
		if((letter.contains("a")) || (letter.contains("A")) || (letter.contains("e")) || (letter.contains("E")) ||
(letter.contains("i")) || (letter.contains("I")) || (letter.contains("o")) || (letter.contains("O")) || (letter.contains("u")) || (letter.contains("U"))) {
			System.out.println("Esta letra é vogal");
		} else {
			System.out.println("Esta letra é uma consoante");
		}
				
	}

}
