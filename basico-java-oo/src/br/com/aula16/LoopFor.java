package br.com.aula16;

public class LoopFor {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("i tem valo: " + i);
		}
		for (int i = 5; i >= 0; i--) {
			System.out.println("i tem valor: " + i);
		}

		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("I= " + i + ";j = " + j);
		}

	}

}
