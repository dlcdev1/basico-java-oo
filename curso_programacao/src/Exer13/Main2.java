package Exer13;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] altura = new double[n];
		double mediaAltura = 0;
		int menor=0;
		
		
		for (int i = 0; i < n; i++) {

			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			altura[i] = sc.nextDouble();

		}
		for (int i =0; i<n; i++) {
			mediaAltura = mediaAltura + altura[i];
			if(idades[i] < 16) {
				menor++;
			}
		}
		
		System.out.println(menor);
		System.out.println(n);
		double x = menor * 100.0 / n;
		System.out.printf("Altura média: %.2f%n", mediaAltura / n);
		System.out.println("Pesssoas com menos de 16 anos: " + x);

		sc.close();
	}

}
