package uri1040;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		float n1, n2, n3, n4, nE, mediaFinal, media;

		System.out.println("Nota1");
		n1 = sc.nextFloat();
		System.out.println("Nota2 ");
		n2 = sc.nextFloat();
		System.out.println("Nota3 ");
		n3 = sc.nextFloat();
		System.out.println("Nota4 ");
		n4 = sc.nextFloat();

		media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10;
		System.out.println("Media: " + media);

		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else if (media >= 5.0 && media < 7.0) {
			System.out.println("Aluno em exame.");
			System.out.println("Informe a nota do exame");
			nE = sc.nextFloat();
			System.out.println("Nota do exame: " + nE);
			mediaFinal = (nE + media) / 2;

			if (mediaFinal >= 5.0) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.println("Media final: " + mediaFinal);

		} else {
			System.out.println("Aluno reprovado.");
		}

	}

}
