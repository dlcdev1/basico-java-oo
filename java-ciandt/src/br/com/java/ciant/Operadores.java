package br.com.java.ciant;

public class Operadores {

	public static void main(String[] args) {
		System.out.println("Operadores pós-fixado");
		int number = 2;
		int number1 = 4;
		number++;
		number1--;
		
		System.out.println(number1);
		System.out.println(number);
		
		System.out.println("unário");
		int number3 =0;
	
		++number3;
		System.out.println(number3);
		
		System.out.println("Multiplicativo");
		int result=0;
		
		result = number * number1;
		System.out.println(result);
		result = number / number1;
		
		System.out.println(result);
		
		result = number %number1;
		System.out.println(result);

	}
}
