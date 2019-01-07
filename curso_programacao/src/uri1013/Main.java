package uri1013;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x, y, z, k, t;
		
		x = scan.nextInt();
		y = scan.nextInt();
		z = scan.nextInt();
		
		k = (x + y + Math.abs(x - y)) / 2;
		t = (k + z + Math.abs(k - z)) / 2;
		
		System.out.println(t + " eh o maior");
		
		scan.close();

	}

}
