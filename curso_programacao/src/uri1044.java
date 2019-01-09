import java.util.Scanner;

public class uri1044 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int divisor = a / b;
		int multiplos = a * b;

		if (a % b == 0 || b % a == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não so multiplos");
		}

		sc.close();

	}

}
