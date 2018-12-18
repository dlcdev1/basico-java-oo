package br.com.java.ciant;

public class Exercicio8 {

	public static void main(String[] args) {
		int router = 1, comp = 0;


		for (int j = 1; j <= 10; j++) {

			for (int i = 1; i <= 10; i++) {
				comp = j;

				if (comp == i) {
					break;
				}
				System.out.println("Lacoj " + j + " Lacoi " + i);

			}

		}

	}

}
