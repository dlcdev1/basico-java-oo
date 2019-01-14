package vetores;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] number = new int[n];
		int count = 0;

		for (int i = 0; i < n; i++) {
			number[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (number[i] % 2 == 0) {
				System.out.print(number[i] + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);

		sc.close();
	}

}
