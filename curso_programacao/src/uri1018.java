import java.util.Locale;
import java.util.Scanner;

public class uri1018 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n, n1, n2, n3, n4, n5, n6, n7, resto, resto1, resto2, resto3, resto4, resto5, resto6, resto7;

		n = scan.nextInt();

		n1 = n / 100;
		resto = n % 100;

		n2 = resto / 50;
		resto1 = resto % 50;

		n3 = resto1 / 20;
		resto2 = resto1 % 20;

		n4 = resto2 / 10;
		resto3 = resto2 % 10;

		n5 = resto3 / 5;
		resto4 = resto3 % 5;

		n6 = resto4 / 2;
		resto5 = resto4 % 2;

		n7 = resto5 / 1;

		System.out.println(n);
		System.out.println(n1 + " nota(s) de R$ 100,00");
		System.out.println(n2 + " nota(s) de R$ 50,00");
		System.out.println(n3 + " nota(s) de R$ 20,00");
		System.out.println(n4 + " nota(s) de R$ 10,00");
		System.out.println(n5 + " nota(s) de R$ 5,00");
		System.out.println(n6 + " nota(s) de R$ 2,00");
		System.out.println(n7 + " nota(s) de R$ 1,00");

	}

}
