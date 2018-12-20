package br.com.aula19.arrays;

public class Exer22 {

	public static void main(String[] args) {
		int[] vetorA = new int[20];
		
		int result0=0, result1=0, result=0;
		float percent=0;
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = (int) Math.round(Math.random() * 1);
		}
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Resultado = " + vetorA[i]);
			percent++;
			result = vetorA[i];
			if(result > 0) {
				result1++;
			} else {
				result0++;
			}
			
		}
		System.out.println("Percentual do 1 = " + ((float)result1 / percent * 100)+"%");
		System.out.println("Percentual do 0 = " + ((float)result0 / percent * 100)+"%");
	}

}
