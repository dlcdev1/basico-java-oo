package br.com.aula24;

import java.util.Date;

public class Exer04 {
	
	public static void main(String [] args) {
		
		LivroBiblioteca livro = new LivroBiblioteca();
		
		livro.nome = "Matering ";
		livro.autor = "Loiane Grone";
		livro.anoLancamento = 2015;
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "Loaine";
		
		System.out.println("nome do livro = " + livro.nome);
		System.out.println("Data" + livro.dataEntrega);
		
	}
	

}
