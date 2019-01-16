package vetores;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Exer09 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] produto = new String[n];
		double [] precoProduto = new double[n];
		double [] valorProduto = new double[n];
		
		
		double lucro=0, acima=0, entre=0, abaixo=0;
		
		for (int i=0; i< n; i++) {
			produto[i] = sc.next();
			precoProduto[i] = sc.nextDouble();
			valorProduto[i] = sc.nextDouble();
			
		}
		
		for(int i=0; i< n; i++) {
			lucro = (((precoProduto[i] * 100) / valorProduto[i]) - 100 );
			System.out.println(lucro);
			
			if(lucro < 10) {
				abaixo++;
			} else if(lucro <= 20 ) {
				entre++;
			} else if(lucro >20) {
				acima++;
			} 
		}
		System.out.println("Lucro abaixo de 10%: " + abaixo);
		System.out.println("Lucro entre 10% e 20%: " + entre);
		System.out.println("Lucro acima de 20%: " + acima);
		
		
		sc.close();

	}

}
