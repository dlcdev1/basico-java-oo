package br.com.aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		double [][] notasAlunos = new double [3][4];
		
		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 7;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 9.5;
			
		notasAlunos[1][0] = 9;
		notasAlunos[1][1] = 8;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 9;
		
		notasAlunos[2][0] = 8;
		notasAlunos[2][1] = 9;
		notasAlunos[2][2] = 10;
		notasAlunos[2][3] = 7;
			/* inicializar matriz 
			 double[] notaAluno= {7, 8, 9, 10}
			 double[][] notasAlunos2  {{7, 8, 9, 10}, {8,6, 7, 10}}			 
			 * 
			 * 
			 */
		for(int i=0; i< notasAlunos.length; i++) {
			for(int j=0; j < notasAlunos[i].length; j++) {
				System.out.print(notasAlunos[i][j] + " - ");
			}
			System.out.println();
		}

	}

}
