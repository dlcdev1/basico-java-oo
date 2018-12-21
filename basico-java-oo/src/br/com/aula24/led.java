package br.com.aula24;

public class led {

	public static void main(String[] args) {
		Lampada1 led = new Lampada1();

		led.preco = 20;
		led.voltagem = "220v";
		led.tipo = "led";
		led.durabilidade = 2;

		System.out.println(led.preco);
		System.out.println(led.voltagem);
		System.out.println(led.tipo);
		System.out.println(led.durabilidade);

	}

}
