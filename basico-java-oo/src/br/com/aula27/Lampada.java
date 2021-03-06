package br.com.aula27;

public class Lampada {
	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;

	boolean ligada;
	boolean desligar;

	void ligar() {
		ligada = true;
	}

	void desligar() {
		ligada = false;
	}

	void mostrarEstado() {
		if (ligada) {
			System.out.println("A lampada esta ligada");
		} else {
			System.out.println("Lâmpada está desligada");
		}
	}

	void mudarEstado() {
		if (ligada) {
			desligar();
		} else {
			ligar();
		}
	}

}
