package br.com.aula24;

public class Exer01 {

	public static void main(String[] args) {
		Lampada1 lampada = new Lampada1();
		
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoAbajur =  true;
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeões";
		
		

	}

}
