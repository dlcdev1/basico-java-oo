package br.com.java.ciant;

public class Conversao {

	public static void main(String[] args) {
		int x = 10;
		byte y = (byte) x;
		double z = y;
		float w = (float) z;
		long y1 = (long) w;

		System.out.println(x);
		System.out.println(y1);
		System.out.println(z);
		System.out.println(w);
		System.out.println(y1);

	}

}
