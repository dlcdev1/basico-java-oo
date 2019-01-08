
public class Exer01 {

	public static void main(String[] args) {

		String product1 = "Computer";
		String product2 = "Office desk";

		int age = 30;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("Office desk, which price is  $ %.2f%n", price2);
		/*
		 * %f = ponto flutuante %d = inteiro %s = texto %n = quebra de linha
		 */
		System.out.printf("Record: %d years old, code %d and gender: %s\n", age, code, gender);
		System.out.println("Measue with eight decimal place: " + measure);
		System.out.printf("Rouded (three decimal place): %.3f%n", measure);
		System.out.printf("US decimal point: %.3f%n", measure);
 
	}

}
