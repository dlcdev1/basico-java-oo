package br.com.aula16;

import java.util.Scanner;

public class execicio13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero:");
		int number = scan.nextInt();
		System.out.println("Informe o segundo numero:");
		int expoente = scan.nextInt();
		//int i=1;
		int result=0, result1=0, multi=0, total=0;
		
		for(int i=1; i <= expoente; i++) {
			//System.out.println(i);
			if(number >=0) {
				number = i;
				multi = number * number;
				
				System.out.println(multi);
				
				
			}
			
			
		}
		
	}

}
