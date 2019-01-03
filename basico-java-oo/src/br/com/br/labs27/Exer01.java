package br.com.br.labs27;
// https://www.slideshare.net/loianeg/curso-java-basico-exercicios-aula-25-a-27

public class Exer01 {
	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.modelo = "XBB";
		lampada.preco = 20.0;
		lampada.cor = "Branca";
		lampada.potencia = 10;
		lampada.tipos = new String[4];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Pendente";
		
		System.out.println("Modelos: " + lampada.modelo);
		System.out.println("Preço: " + lampada.preco);
		System.out.println("Potencia " + lampada.potencia + " V");
		System.out.println("Tipos: " + lampada.tipos[0] );
		System.out.println("Tipos: " + lampada.tipos[1] );
		
		lampada.mostrarEstado();
		lampada.ligar();
		lampada.mostrarEstado();
		lampada.desligar();
		lampada.mostrarEstado();
	
	}
}
