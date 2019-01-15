package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double [] altura = new double[n];
		char [] sexo = new char[n];
		double menor=0, maior=0, media=0, result=0, totalH=0;
		int count=0;
		
		for(int i=0; i<n; i++) {
			altura[i] = sc.nextDouble();
			sexo[i] = sc.next().charAt(0);
		}
		
		menor = altura[0];
		for(int i=0; i<n; i++) {
			if(altura[i] < menor) {
				menor = altura[i];
			} 
		}
		
		maior = altura[0];
		for(int i=0; i<n; i++) {
			if(altura[i] > maior) {
				maior = altura[i];
			}
		}
		
		for(int i=0; i<n; i++) {
			if(sexo[i] == 'F') {
				media += altura[i];
				count++;
			} else {
				totalH++;
				
			}
		}
		
	
		System.out.printf("Menor altura %.2f%n", menor);
		System.out.printf("Maior altura %.2f%n", maior);
		System.out.printf("Media das alturas das mulhres = %.2f%n", (media/count));
		System.out.printf("Maior altura %.0f%n", totalH);
		
		
		
		sc.close();

	}

}
