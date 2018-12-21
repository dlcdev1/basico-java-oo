package br.com.aula21;

import java.util.Random;

public class forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] notas = new int[10];
		
		Random random = new Random();
		
		for(int i=0; i< notas.length; i++) {
			notas[i] = random.nextInt(10);
		}
		
	/*	for(int i=0; i<notas.length; i++) {
			System.out.println(notas[i]);
		}*/
		
		for(int nota : notas) {
			
			System.out.println(nota);
		}

	}

}
