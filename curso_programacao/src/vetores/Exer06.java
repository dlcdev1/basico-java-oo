package vetores;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
		String nome = null;
		int maior = 0;

		for (int i = 0; i < n; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
		}

		for (int i = 0; i < n; i++) {
			if (idades[i] > maior) {
				maior = idades[i];
				nome = nomes[i];
			}

		}
		System.out.println("Pessoa mais velha: " + nome);

		sc.close();

	}

}
