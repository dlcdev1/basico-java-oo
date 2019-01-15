package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer07 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] nomes = new String[n];
		double[] n1 = new double[n];
		double[] n2 = new double[n];
		double soma = 0, media = 0, result = 0;
		int count = 0;

		for (int i = 0; i < n; i++) {
			nomes[i] = sc.next();
			n1[i] = sc.nextDouble();
			n2[i] = sc.nextDouble();
		}
		System.out.println("Alunos aprovados");
		for (int i = 0; i < n; i++) {
			soma = n1[i] + n2[i];
			media = soma / 2;
			if (media >= 6) {
				System.out.println(nomes[i]);
			}
		}

		sc.close();
	}

}
