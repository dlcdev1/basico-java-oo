package nivelamento;

public class condicao_ternaria {

	public static void main(String[] args) {
		// condi��o ternaria
		double preco = 34.5;
		double desconto = (preco < 20.0)? preco * 0.1 : preco * 0.05;
		
		System.out.println(desconto);
				
	}

}


