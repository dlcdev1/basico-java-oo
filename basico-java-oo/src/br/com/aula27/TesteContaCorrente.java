package br.com.aula27;

public class TesteContaCorrente {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limitEspecial = 500;
		conta.valorEscpecialUsado = 0;
		conta.saldo = -10;

		boolean saqueEfetuado = conta.realizarSaque(500);

		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso.");
			System.out.println("Saldo atual da conta = " + conta.saldo);
		} else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println("Deposito de 500 reais");
		conta.depositar(500);
		conta.consultarSalto();

		if (conta.verificarUsoEspecial()) {
			System.out.println("Esta usuando cheque especial");
		} else {
			System.out.println("Não esta usuando cheque especial");
		}
		conta.realizarSaque(600);
		conta.consultarSalto();

		if (conta.verificarUsoEspecial()) {
			System.out.println("Esta usuando cheque especial");
		} else {
			System.out.println("Não esta usuando cheque especial");
		}

	}

}