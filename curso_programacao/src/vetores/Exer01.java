package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double [] vet = new double[n];
		double min = 0, maior = 0, posicao = 0, result = 0;
		for(int i=0; i<n; i++) {
			vet[i] = sc.nextDouble();
		}
		
		for(int i=0; i<n; i++) {
			if(vet[i] > maior) {
				maior = vet[i];
				posicao = i;
			} else if (vet[i] < maior){
				min = vet[i];
			}
	
		}
		System.out.println(maior);
		System.out.printf("%.0f%n", posicao);
		
		
		
		sc.close();

	}

}
