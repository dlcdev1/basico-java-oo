package br.com.aula19.arrays;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] vetorA = new int [5];
		int ultimo = 0, invert=0, primeiro=0 ;
		
		for(int i=0; i<vetorA.length; i++) {
			System.out.println("Informe o " + i + "° número");
			//vetorA[i] = i;
			vetorA[i] = scan.nextInt();
		
		}
		
		for(int i=0; i < vetorA.length; i++) {
			//System.out.println(vetorA[i]);
			primeiro = vetorA[i];
			//System.out.print(primeiro);
			
		}
		System.out.println();
		for(int i=0; i < vetorA.length; i++) {
			primeiro =vetorA[i];
			ultimo = vetorA[i];
			System.out.print(ultimo);
			while(ultimo < vetorA.length) {
				invert *=10;
				invert +=(ultimo%10);
				ultimo/=10;
				
				if(invert == primeiro) {
					
				} else {
					System.out.println("fim da execulção");
				}
				System.out.println(invert);
			} 
			
		}
		
		
		
		System.out.println();
		
		
		/*for(int i=0; i< invert; i++) {
			//invert--;
			ultimo = vetorA[vetorA.length -1];
			System.out.println(ultimo);
		}*/
		
		
		
		
		
		
	}

}
