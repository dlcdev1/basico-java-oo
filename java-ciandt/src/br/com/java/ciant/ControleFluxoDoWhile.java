package br.com.java.ciant;

public class ControleFluxoDoWhile {

	public static void main(String[] args) {
		//String texto=  (String) "Eu passei por aqui";
		char texto[] = new char[20];
	//	int i = texto.length();
		texto[0] = 'E' ;
		texto[1] = 'u' ;
		texto[2] = ' ' ;
		texto[3] = 'p' ;
		texto[4] = 'a' ;
		texto[5] = 's' ;
		texto[6] = 's' ;
		texto[7] = 'e' ;
		texto[8] = 'i' ;
		texto[9] = ' ' ;
		texto[10] = 'p' ;
		texto[11] = 'o' ;
		texto[12] = 'r' ;
		texto[13] = ' ' ;
		texto[14] = 'a' ;
		texto[15] = 'q' ;
		texto[16] = 'u' ;
		texto[17] = 'i' ;
		
		int i=0;
		while(i <=texto[i]) {
			
			System.out.println("while");
			System.out.println(texto[i]);
			i++;
		} 
		do {
			i++;
			System.out.println("do-while");
			System.out.println(texto[i]);
		}while(i <= texto[i]);

	}

}
