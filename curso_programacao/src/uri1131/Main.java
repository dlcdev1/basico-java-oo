package uri1131;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int novoGrenal = 1, grenal = 0, gremio, resultGremio = 0, resultInter = 0, inter, empate = 0, resultado;

		while (novoGrenal != 2) {
			grenal++;

			gremio = sc.nextInt();
			inter = sc.nextInt();

			if (inter > gremio) {
				resultInter++;
			} else if (inter < gremio) {
				resultGremio++;
			} else {
				empate++;
			}

			System.out.printf(grenal + "grenais");
			System.out.println(resultInter + "Inter");
			System.out.println(resultGremio + "Gremio");
			System.out.println(empate + "Empates");

			if (resultInter > resultGremio) {
				System.out.println("Inver venceu mais");
			} else {
				System.out.println("Gremio venceu mais");
			}
			System.out.println("novo calculo (1-sim 2-nao)");
			novoGrenal = sc.nextInt();
			while (novoGrenal != 1 && novoGrenal != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				novoGrenal = sc.nextInt();
			}

		}

		sc.close();

	}

}
