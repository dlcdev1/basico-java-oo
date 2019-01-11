package uri1134;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int alcool = 0, gasolina = 0, diesel = 0;
		int combustivel = sc.nextInt();

		while (combustivel != 4) {

			if (combustivel == 1) {
				alcool++;
			} else if (combustivel == 2) {
				gasolina++;
			} else if (combustivel == 3) {
				diesel++;
			}
			combustivel = sc.nextInt();

		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		sc.close();
	}

}
