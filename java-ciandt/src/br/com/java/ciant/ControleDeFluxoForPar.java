package br.com.java.ciant;

public class ControleDeFluxoForPar {

	public static void main(String[] args) {
		int number = 0;
		for (int i = 0; i < 100; i++) {
			number++;
			if (number % 2 == 0) {
				continue; 
			}
			System.out.println(number);
		}

	}

}
