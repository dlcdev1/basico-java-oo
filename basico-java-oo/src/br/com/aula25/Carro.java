package br.com.aula25;

public class Carro {

	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() { // metodo exibirAutnonima
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}

}
