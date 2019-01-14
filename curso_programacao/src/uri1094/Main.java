package uri1094;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
//		int qtd;
		double qtd = 0, qtdC = 0, qtdS = 0, qtdR = 0, totalC = 0;
		String cobais;
		// C = coelho, S= sapo e R = ratos

		for (int i = 0; i < n; i++) {
			qtd = sc.nextInt();
			cobais = sc.next();

			if (cobais.equals("C")) {
				qtdC += qtd;
			} else if (cobais.equals("R")) {
				qtdR += qtd;
			} else if (cobais.equals("S")) {
				qtdS += qtd;
			}
		}

		totalC = qtdC + qtdR + qtdS;

		System.out.printf("Total: %.0f cobaias%n", totalC);
		System.out.printf("Total de coelhos: %.0f%n", qtdC);
		System.out.printf("Total de ratos: %.0f%n", qtdR);
		System.out.printf("Total de sapos: %.0f%n", qtdS);
		System.out.printf("Percentual de coelhos: %.2f %%%n", ((qtdC / totalC) * 100));
		System.out.printf("Percentual de ratos: %.2f %%%n", ((qtdR / totalC) * 100));
		System.out.printf("Percentual de sapos: %.2f %%%n", ((qtdS / totalC) * 100));

		sc.close();
	}

}
