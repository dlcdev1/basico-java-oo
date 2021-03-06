package br.com.br.labs27;

public class ContaCorrente {

	String numero;
	String agencia;
	double saldo;
	boolean especial;
	double limite = -500;
	double saque;
	double deposito;

	void sEspecial() {
		especial = true;
	}

	void nEspecial() {
		especial = false;
	}

	void statusEspecial() {

		if (especial) {
			System.out.println("Conta especial.");
		} else {
			System.out.println("Conta comum");
		}
	}


	void statusLimite() {
		System.out.println("Limite disponivel: " + (limite-saldo));
	}

	double depositar(double din) {
		return saldo += din;
		
	}
	
	double sacarDinheiro(double sac) {
		if(saldo <= limite) {
			System.out.println("Você não tem limite");
		} else {
			saldo -= sac;
			
		}
		return sac;
		
		
	}

	void verificarSaldo() {
		System.out.println("Saldo: " + saldo + "\n");
	}

	double realizarSaque() {
		double verificaSaldo = saldo - saque;

		if (verificaSaldo < limite) {
//			double vSaldoLimit = limite;

			System.out.println("Você não tem limite.");
			System.out.println("Saque bloqueado");
			System.out.println("Limite atual: " + limite);

		} else {

			saldo -= verificaSaldo;
			System.out.println("Verificar saldo: " + verificaSaldo);
			System.out.println("Realizar saque: ");
			System.out.println(saque);
		}
		return verificaSaldo;
		

	}

	void saldoAtual() {
		double saldoAnt = (saldo - saque);

		if (saldoAnt < limite) {
			System.out.println("Sem limite na conta");
		} else {
			System.out.println("Saldo atual: " + saldoAnt);
			if(saldoAnt > 0) {
				System.out.println("Saque realizdo");
				
			} else {
				System.out.println("Você esta utilizando o cheque especial");
			}

		}

	}

}
