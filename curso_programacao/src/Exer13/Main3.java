package Exer13;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] nomes = new String[n];
		
		for(int i=0; i<n; i++) {
			nomes[i] = sc.next();
		}
		System.out.println("Nomes lidos:");
		for(int i=0; i<n; i++) {
			System.out.println(nomes[i]);
		}
		
		for(String names : nomes) {
			System.out.println(names);
		}
		
		
		
	}

}
