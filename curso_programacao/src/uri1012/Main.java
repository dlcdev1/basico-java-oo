package uri1012;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		double pi = 3.14159;

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();

		double areaTriangulo = a * c / 2;
		double areaCirculo = Math.pow(c, 2) * pi;
		double areaTrapezio = (((a + b) / 2)) * c;
		double areaQuadrado = Math.pow(b, 2);
		double areaRetangulo = a * b;

		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

		scan.close();

	}

}
