package br.com.matriz;

public class LetraX {
		
public static void main(String[] args) {
		
		int [][] baseX = new int[10][10];
		
		for (int linha = 0; linha < baseX.length; linha++) {
			
			for (int coluna = 0; coluna < baseX.length; coluna ++) {
				
				if (coluna > 0 && coluna < 9 && linha < 9 && linha >0 || linha > 10  && linha < 10 && coluna > 2 && coluna < 7) {
					
					System.out.print("* ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}
}
