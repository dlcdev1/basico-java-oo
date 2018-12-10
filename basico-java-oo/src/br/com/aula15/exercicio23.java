package br.com.aula15;

import java.util.Scanner;

public class exercicio23 {

	public static void main(String[] args) {

		int rodar = 1;

		while (rodar != 0) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Infome o tipo de Carne");

			System.out.println(" 1 - File Duplo");
			System.out.println(" 2 - Alcatra");
			System.out.println(" 3 - Picanha");

			int tCarne = scan.nextInt();

			switch (tCarne) {
			case 1:
				System.out.println("Informe a quantidade de File Duplo:");
				double kgF = scan.nextDouble();
				if (kgF <= 5) {
					double result = kgF * 4.90;
					System.out.println("Pagamento:");
					System.out.println("1 - dinheiro n\2 - Cartão");
					double pagamento = scan.nextDouble();
					if (pagamento == 1) {
						System.out.println("Tipos de carne File Duplo");
						System.out.println("Quantidade:" + kgF + " Kg");
						System.out.println("Valor pago dinheiro: " + result);
					} else if (pagamento == 2) {
						System.out.println("Tipos de carne File Duplo");
						System.out.println("Quantidade:" + kgF + " Kg");
						double descontoF = result * 0.05;
						System.out.println("Valor pago cartão: " + (result - descontoF));
					}
				} else if (kgF > 5) {
					double result = kgF * 5.80;
					System.out.println("Pagamento:");
					System.out.println("1 - dinheiro \n2 - Cartão");
					double pagamento = scan.nextDouble();
					if (pagamento == 1) {
						System.out.println("Tipos de carne File Duplo:");
						System.out.println("Quantidade: " + kgF + "kg:");
						System.out.println("Valor pago diheiro: " + result);
					} else if (pagamento == 2) {
						System.out.println("Tipos de carne File Duplo:");
						System.out.println("Quantidade: " + kgF + "kg:");
						double descontoF = result * 0.05;
						System.out.println("Valor pago cartão: " + (result - descontoF));
					}
				}
				break;
			case 2:
				System.out.println("Informe a quantidade de Alcatra:");
				double kgA = scan.nextDouble();
				if (kgA <= 5) {
					double resultA = kgA * 5.90;
					System.out.println("Pagamento:");
					System.out.println("1 - dinheiro \n 2 - Cartão");
					double pagamentoA = scan.nextDouble();
					if (pagamentoA == 1) {
						System.out.println("Tipos de carne Alcatra:");
						System.out.println("Quantidade: " + kgA + "kg:");
						System.out.println("Valor pago dinheiro: " + resultA);
					} else if (pagamentoA == 2) {
						System.out.println("Tipos de carne Alcatra: ");
						System.out.println("Quantidade: " + kgA + "kg:");
						double descontoA = resultA * 0.05;
						System.out.println("Valor pago cartão: " + (resultA - descontoA));
					}
				} else if (kgA > 5) {
					double resultA = kgA * 6.80;
					System.out.println("Pagamento:");
					System.out.println("1 - dinheiro \n2 - Cartão");
					double pagamentoA = scan.nextDouble();
					if (pagamentoA == 1) {
						System.out.println("Tipos de carne Alcatra:");
						System.out.println("Quantidade: " + kgA + "kg:");
						System.out.println("Valor pago dinheiro: " + resultA);
					} else if (pagamentoA == 2) {
						System.out.println("Tipos de carne Alcatra: ");
						System.out.println("Quantidade: " + kgA + "kg:");
						double descontoA = resultA * 0.05;
						System.out.println("Valor pago cartão: " + (resultA - descontoA));
					}
				}
				break;

			case 3:
				System.out.println("Informe a quantidade de Picanha:");
				double kgP = scan.nextDouble();
				if (kgP <= 5) {
					double resultP = kgP * 6.90;
					System.out.println("Pagamento:");
					System.out.println("1 - dinheiro \n2 - Cartão");
					double pagamentoP = scan.nextDouble();
					if (pagamentoP == 1) {
						System.out.println("Tipo de carne Picanha:");
						System.out.println("Quantidade: " + kgP + "kg");
						System.out.println("Valor pago dinheiro: " + resultP);
					} else if (pagamentoP == 2) {
						System.out.println("Tipo de carne Picanha:");
						System.out.println("Quantidade: " + kgP + "kg.");
						double descontoP = resultP * 0.05;
						System.out.println("Valor pago cartão " + (resultP - descontoP));
					}
				} else if (kgP > 5) {
					double resultP = kgP * 7.80;
					System.out.println("Pagamamento:");
					System.out.println("1 - dinheiro \n2 - Cartão.");
					double pagamentoP = scan.nextDouble();
					if (pagamentoP == 1) {
						System.out.println("Tipo de carne Picanha:");
						System.out.println("Quantidade: " + kgP + "kg.");
						System.out.println("Valor pago dinheiro: " + resultP);
					} else if (pagamentoP == 2) {
						System.out.println("Tipo de carne Picanha:");
						System.out.println("Quantidade: " + kgP + "kg.");
						double descontoP = resultP * 0.05;
						System.out.println("Valor pago Cartão: " + (resultP - descontoP));
					}
				}

				break;

			default:
				System.out.println("Opção invalida");

			}

		}

	}

}
