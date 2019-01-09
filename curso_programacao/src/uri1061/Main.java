package uri1061;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		int dia1, dia2, dia, diaF, resto, result;
		
		dia1  = scan.nextInt();
		dia2 = scan.nextInt();
		
		result = ((dia1 * 1440) - (dia2 * 1440)) / 1440;
		resto = result % 1440;
		
		
		System.out.println(result);
		System.out.println(resto);
		
		
		
		
	}

}
