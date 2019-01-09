package uri1061;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int dia, hora, minuto, segundo, dia1, dia2, hora1, hora2, minuto1, minuto2, segundo1, segundo2, inicio, fim,
				duracao, resto;
		String s;

		s = scan.next();
		dia1 = scan.nextInt();
		hora1 = scan.nextInt();
		s = scan.next();
		minuto1 = scan.nextInt();
		s = scan.next();
		segundo1 = scan.nextInt();

		s = scan.next();
		dia2 = scan.nextInt();
		hora2 = scan.nextInt();
		s = scan.next();
		minuto2 = scan.nextInt();
		s = scan.next();
		segundo2 = scan.nextInt();

		inicio = (dia1 - 1) * 24 * 60 * 60 + hora1 * 60 * 60 + minuto1 * 60 + segundo1;
		fim = (dia2 - 1) * 24 * 60 * 60 + hora2 * 60 * 60 + minuto2 * 60 + segundo2;

		duracao = fim - inicio;

		dia = duracao / (24 * 60 * 60);
		resto = duracao % (24 * 60 * 60);

		hora = resto / (60 * 60);
		resto = resto % (60 * 60);

		minuto = resto / 60;
		segundo = resto % 60;

		System.out.println(dia + " dia(s)");
		System.out.println(hora + " hora(s)");
		System.out.println(minuto + " minuto(s)");
		System.out.println(segundo + " segundo(s)");

		scan.close();

	}

}
