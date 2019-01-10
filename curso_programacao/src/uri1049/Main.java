package uri1049;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String animal = sc.next();
		String tipo = sc.next();
		String especie = sc.next();

		if (animal.equals(animal) == animal.equals("vertebrado")) {
			if (tipo.equals(tipo) == tipo.equals("ave")) {
				if (especie.equals(especie) == especie.equals("carnivoro")) {
					System.out.println("aguia");
				} else if (especie.equals(especie) == especie.equals("onivoro")) {
					System.out.println("pomba");
				}
			} else if (tipo.equals(tipo) == tipo.equals("mamifero")) {
				if (especie.equals(especie) == especie.equals("onivoro")) {
					System.out.println("homem");
				} else if (especie.equals(especie) == especie.equals("herbivoro")) {
					System.out.println("vaca");
				}
			}
		} else if (animal.equals(animal) == animal.equals("invertebrado")) {
			if (tipo.equals(tipo) == tipo.equals("inseto")) {
				if (especie.equals(especie) == especie.equals("hematofao")) {
					System.out.println("pulga");
				} else if (especie.equals(especie) == especie.equals("herbivoro")) {
					System.out.println("largata");
				}
			} else if (tipo.equals(tipo) == tipo.equals("anelideo")) {
				if (especie.equals(especie) == especie.equals("hematofago")) {
					System.out.println("sanguessuga");
				} else if (especie.equals(especie) == especie.equals("onivoro")) {
					System.out.println("minhoca");
				}
			}
		}

		sc.close();
	}

}
