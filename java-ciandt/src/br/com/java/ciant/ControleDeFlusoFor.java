package br.com.java.ciant;



public class ControleDeFlusoFor {

	public static void main(String[] args) {
		char[] nome = new char[36];
		nome[0] = 'd';
		nome[1]  = 'a';
		nome[2] = 'v';
		nome[3] = 'i';
		nome[4] = 'd';
		nome[5] = 'i';
	
		/*for (int i=0; i <nome[i]; i++) {
			System.out.println(nome[i]);
		}*/
	//	int i;
		for(char nome1 : nome){
			System.out.print(nome1);
		}

	}

}
