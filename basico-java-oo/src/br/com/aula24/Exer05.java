package br.com.aula24;

public class Exer05 {

	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.limiteEspecial = 500;
		conta.saldo = -10;
		
		System.out.println("Numero da conta" + conta.numero);

	}

}
