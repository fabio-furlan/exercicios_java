package br.com.matriz;

public class Letras {

	public static void main(String[] args) {

		int[][] Base = new int[10][10];

		for (int i = 0; i < Base.length; i++) {

			for (int j = 0; j < Base.length; ++j) {

				if ((j + 1) % 2 == 0) {

					System.out.print("x");

				} else {
					System.out.print("o");
				}

			}

			System.out.println();
		}

	}

}
