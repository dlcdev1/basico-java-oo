import java.util.Locale;
import java.util.Scanner;

public class Exer03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		String nome = scan.next();
		int idade1 = scan.nextInt();
		String nome2 = scan.next();
		int idade2 = scan.nextInt();

		double media = (double)(idade1 + idade2) / 2;

		System.out.printf("A idade média de %s e %s é de %.1f anos", nome, nome2, media);
		
		scan.close();

	}

}
