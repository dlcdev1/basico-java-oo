package uri1016;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int x, km;

		x = scan.nextInt();
		km = x * 2;

		System.out.println(km + " minutos");

		scan.close();
	}

}
