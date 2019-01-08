import java.util.Locale;
import java.util.Scanner;


public class Exer01Resolvido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.UK);
		double area;

		System.out.println("Infomer largura: ");
		double largura = sc.nextDouble();
		System.out.println("Informe o comprimento");
		double comprimento = sc.nextDouble();
		System.out.println("Infomre o preço do Metro:");
		double preco = sc.nextDouble();

		area = (largura * comprimento);

		System.out.println("Saída");
		System.out.printf("Aréa é de: %.2f%n", (area));
		System.out.printf("Preço é de: %.2f%n ", (preco * area));
		
		sc.close();

	}

}
