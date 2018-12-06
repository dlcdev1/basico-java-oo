package br.com.aula15;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor hora:");
		double valorHora = scan.nextDouble();
		
		System.out.println("Informe qtd horas mes");
		double qtdHora = scan.nextDouble();
		
		double salarioBruto = valorHora * qtdHora;
		double salarioDesc, fgts, ir;
		
		if(salarioBruto <= 900) {
			System.out.println("Salario Bruto:( "+qtdHora+ " * " + valorHora + ")	:R$" + salarioBruto );
			System.out.println("(-) IR (ISENTO) 			:ISENTO ") ;
			System.out.println("(-) INSS (10%) 			:R$" + (salarioDesc =  salarioBruto* 10 /100));
			System.out.println("FGTS (11%)			:R$" + (fgts = salarioBruto * 11/100));
			System.out.println(("Total de descontos		:R$" + salarioDesc)); 
			System.out.println("Salario Liquido			:R$" + (salarioBruto - salarioDesc));

			
		} else if((salarioBruto > 900)&&(salarioBruto <=1500)) {
			System.out.println("Salario Bruto:( "+qtdHora+ " * " + valorHora + ")	:R$" + salarioBruto );
			System.out.println("(-) IR (5%) 			:R$ " + (ir = salarioBruto * 5 / 100)) ;
			System.out.println("(-) INSS (10%) 			:R$" + (salarioDesc =  salarioBruto* 10 /100));
			System.out.println("FGTS (11%)			:R$" + (fgts = salarioBruto * 11/100));
			System.out.println("Total de descontos		:R$" + (salarioDesc + ir)); 
			System.out.println("Salario Liquido			:R$" + (salarioBruto - salarioDesc - ir));
			
		} else if((salarioBruto > 1500)&&(salarioBruto <=2500)) {
			System.out.println("Salario Bruto:( "+qtdHora+ " * " + valorHora + ")	:R$" + salarioBruto );
			System.out.println("(-) IR (10%) 			:R$ " + (ir = salarioBruto * 10 / 100)) ;
			System.out.println("(-) INSS (10%) 			:R$" + (salarioDesc =  salarioBruto* 10 /100));
			System.out.println("FGTS (11%)			:R$" + (fgts = salarioBruto * 11/100));
			System.out.println("Total de descontos		:R$" + (salarioDesc + ir)); 
			System.out.println("Salario Liquido			:R$" + (salarioBruto - salarioDesc - ir));
					
		} else if(salarioBruto > 2500) {
			System.out.println("Salario Bruto:( "+qtdHora+ " * " + valorHora + ")	:R$" + salarioBruto );
			System.out.println("(-) IR (20%) 			:R$ " + (ir = salarioBruto * 20 / 100)) ;
			System.out.println("(-) INSS (10%) 			:R$" + (salarioDesc =  salarioBruto* 10 /100));
			System.out.println("FGTS (11%)			:R$" + (fgts = salarioBruto * 11/100));
			System.out.println("Total de descontos		:R$" + (salarioDesc + ir)); 
			System.out.println("Salario Liquido			:R$" + (salarioBruto - salarioDesc - ir));
		}
	}

}
