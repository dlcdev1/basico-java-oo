package br.com.aula20;

public class matrizTri {

	public static void main(String[] args) {
		int[][][] matrizTri = new int[3][3][3];

		for (int i = 0; i < matrizTri.length; i++) {
			for (int j = 0; j < matrizTri[i].length; j++) {
				for (int k = 0; k < matrizTri[j].length; k++) {
					matrizTri[i][j][k] = i + j + k;

				}
			}
		}
		int soma = 0, somaPares =0, somaImpares =0;
		for (int i = 0; i < matrizTri.length; i++) {
			for (int j = 0; j < matrizTri[i].length; j++) {
				for (int k = 0; k < matrizTri[j].length; k++) {
				soma+=matrizTri[i][j][k]; 
				if(matrizTri[i][j][k]%2 ==0) {
					somaPares +=matrizTri[i][j][k];
				} else {
					somaImpares += matrizTri[i][j][k];
				}
				
				}
			}
		}
		System.out.println("Soma total = " + soma);
		System.out.println("Soma pares = " + somaPares);
		System.out.println("Soma impares = " + somaImpares);

	}

}
