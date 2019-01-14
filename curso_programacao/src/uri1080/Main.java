package uri1080;


import java.util.Scanner;

import javafx.scene.control.RadioMenuItem;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int maior = sc.nextInt();
		int posicao = 1;

		// agora vamos ler o segundo até o centésimo
		for (int i = 2; i <= 100; i++) {
			int x = sc.nextInt();
			if (x > maior) {
				maior = x;
				posicao = i;
			}
		}

		System.out.println(maior);
		System.out.println(posicao);

	}

}
