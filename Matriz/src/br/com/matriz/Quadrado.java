package br.com.matriz;

public class Quadrado {
	
	public static void main(String[] args) {
		
		int [][] basequadrado = new int[10][10];
		
		for (int linha = 0; linha < basequadrado.length; linha++) {
			
			for (int coluna = 0; coluna < basequadrado.length; coluna ++) {
				
				if (coluna > 1 && coluna < 8 && linha < 8 && linha >1 || linha > 10 && linha > 6 && linha < 10 && coluna > 2 && coluna < 7) {
					
					System.out.print("- ");
				}else {
					System.out.print("| ");
				}
			}
			System.out.println();
		}
	}

}
