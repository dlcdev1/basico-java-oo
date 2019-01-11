package uri1071;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int min, max, soma = 0;
		if( x < y) {
			min = x;
			max = y;
		} else {
			min = y;
			max = x;		
		}
		for(int i=min+1; i < max; i++) {
			soma = soma + i;
		}
		System.out.println(soma);
		sc.close();
	}

}
