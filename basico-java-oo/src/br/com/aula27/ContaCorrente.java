package br.com.aula27;

public class ContaCorrente {

	String numero;
	String agencia;
	boolean especial;
	double limitEspecial;
	double valorEscpecialUsado;
	double saldo;

	boolean realizarSaque(double quantiaASacar) {
		if (saldo >= quantiaASacar) {
			saldo -= quantiaASacar;
			return true;
		} else {
			if (especial) {

				double limite = limitEspecial + saldo;
				if (limite >= quantiaASacar) {
					saldo -= quantiaASacar;
					return true;
				} else {
					return false;
				}

			} else {
				return false;
			}
		}

	}

	void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}

	void consultarSalto() {
		System.out.println("Saldo atual da conta = " + saldo);

	}

	boolean verificarUsoEspecial() {
		return saldo < 0;
	}

}
