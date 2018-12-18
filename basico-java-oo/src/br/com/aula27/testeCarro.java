package br.com.aula27;

import br.com.aula27.Carro;

public class testeCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		 van.marca = "Fiat";
		 van.modelo = "Ducato";
		 van.numPassageiros = 10;
		 van.capCombustivel = 100;
		 van.consumoCombustivel = 0.2;
		 
		 System.out.println(van.marca);
		 System.out.println(van.modelo);
		 
		 van.exibirAutonomia();
		 
		 double autonomia = van.obertAutonomia();
		 System.out.println("A autonomia do carro é: " + autonomia);
		 System.out.println("A autonomia do carro é: " + van.obertAutonomia());
		 
		 double qtdCombustivel10 = van.calcularCombustivel(10);
		 double qtdCombustivel15 = van.calcularCombustivel(15);
		 double qtdCombustivel20 = van.calcularCombustivel(20);
		 
		 System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
		 System.out.println("qtdCombustivel15 = " + qtdCombustivel15);
		 System.out.println("qtdCombustivel20 = " + qtdCombustivel20);

	}

}