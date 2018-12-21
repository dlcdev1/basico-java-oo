package br.com.aula19.arrays;

public class teste {

	public static void main(String[] args) {
		int[] idades = new int[10];
		int count=0, result=1, ultimo=0;
	    for (int i = 0; i < 10; i++) {
	        idades[i] = i * 10;
	    }

		for (int i = 0; i < idades.length; i++) {
	        System.out.print(idades[i]+ " ");
	        count++;
	    }
	System.out.println();
		for(int j=0; j < idades.length; j++) {
			result = count--;
			//System.out.print(idades[result -1]);
			ultimo = idades[result-1];
			System.out.print(ultimo + " ");
		}
		
	}

}
