package uri1008;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int NUMBER, H;
		double VT, SALARY;
		
		NUMBER = sc.nextInt();
		H = sc.nextInt();
		VT = sc.nextDouble();
		
		SALARY = H * VT;
		
		System.out.println("NUMBER = " + NUMBER);
		System.out.printf("SALARY = U$ %.2f%n", SALARY);

	}

}
