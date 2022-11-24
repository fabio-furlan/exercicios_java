package br.com.matriz;

public class LetraH {
	
	public static void main(String[] args) {

		int[][] baseH = new int[10][10];

		for (int linha = 0; linha < baseH.length; linha++) {

			for (int coluna = 0; coluna < baseH.length; coluna ++) {

				if (coluna > 2 && coluna < 7 && linha < 3 || linha > 6 && linha > 6 && linha < 10 && coluna > 2 && coluna < 7) {

					System.out.print("- ");

				} else {

					System.out.print("X ");
				}

			}

			System.out.println();
		}

	}

		
}
