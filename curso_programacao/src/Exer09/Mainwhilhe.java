package Exer09;

import java.util.Scanner;

public class Mainwhilhe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int result = 0;

		while (x != 0) {
			result += x;
			x = sc.nextInt();
		}
		System.out.println(result);

		sc.close();

	}

}
