package br.com.java.ciant.lista1;

public class teste {

	public static void main(String[] args) {
		String str = "David 1235458 Leandro";
		str = str.toLowerCase();
		System.out.println(str.replaceAll("[^a-z]","")); // comando ignorar as strings
	}

}
