package br.com.aula15;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {

		int rodar=1;
		
		while(rodar !=0) {
			Scanner scan = new Scanner(System.in);

			System.out.println("Escolha o tipo de combustível:");
			System.out.println("A-álcool:\nG-gasolina:");
			String combustivel = scan.nextLine();

			switch (combustivel.toUpperCase()) {
			case "A":
				System.out.print("Quantos litros de alcool:");
				double alcool = scan.nextDouble();
				double totalA;
				if (alcool <= 20) {
					alcool = alcool * 1.90;
					totalA = alcool * 0.03;
					System.out.println("O total é de: " + (alcool - totalA));
				} else if (alcool > 20) {
					alcool = alcool * 1.90;
					totalA = alcool * 0.05;
					System.out.println("O total é de: " + (alcool - totalA));
				}
				break;
			case "G":
				System.out.println("Qantos litros de Gasolina");
				double gasolina = scan.nextDouble();
				double totalG;
				if (gasolina <= 20) {
					gasolina = gasolina * 2.50;
					totalG = gasolina * 0.04;
					System.out.println("O total é de: " + (gasolina - totalG));
				} else if (gasolina > 20) {
					gasolina = gasolina * 2.50;
					totalG = gasolina * 0.06;
					System.out.println("O total é de: " + (gasolina - totalG));
				}
				break;
			default:
				System.out.println("Opção invalida:");
			}
			
			
		}
		
		

	}

}
