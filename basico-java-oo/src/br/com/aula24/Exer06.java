package br.com.aula24;

public class Exer06 {

	public static void main(String[] args) {
		Contato agenda = new Contato();
		
		agenda.nome = "David";
		agenda.endereco = "R. A";
		agenda.email = "abc@com.br";
		agenda.telefones = new String[5];
		
		agenda.telefones[0] = "9999-9999";
		agenda.telefones[1] = "9999-9998";
		agenda.telefones[2] = "9999-9997";

	}

}
