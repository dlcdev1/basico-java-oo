package Exer04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N, horas, resto, minutos, segundos;

		N = scan.nextInt();

		horas = N / 3600;
		resto = N % 3600;

		minutos = resto / 60;
		segundos = resto % 60;

		System.out.println(horas + ":" + minutos + ":" + segundos);
		scan.close();

	}

}
