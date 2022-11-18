package br.com.exercicio;

public class Nome {

	public static void main(String[] args) {
		
		// ATRIBUINDO NOME
		 
	 	String nome = "fabio";
	 	System.out.println("O nome para comparação: " + nome);
	 
	 // TAMANHO DA STRING
		 System.out.println( "A quantidade de caracter em " + nome + ": " +  nome.length  ( ));
		 
		
			// verificando se existe a letra no nome
		    for (int i = 0; i < nome.length(); i++) {
		        char caractere = nome.charAt(i);

		        if (caractere == 'a'){
		            System.out.println("Sim existe a letra 'a' no nome " + nome);
		            
		        }else
					
				 if(caractere == 'a') {
		            System.out.println("Não existe a letra  'a' no nome " + nome);
		        }
		    }
		    
		 
		 
		 String letters = "";
		 int countletters = letters.split("a").length;
		 System.out.println("A quantidade de letra 'a' no nome " + nome +" é: " + countletters);
		 
		 // letra para identificar na String
		//char letra = 'a';
		
		 //System.out.println(letra);  
		 
		    
	    //verificando a letra com o nome 
	    int n = nomeLetra(nome, 'a');
		
		System.out.println("Existe um total de " + n + " letra A no nome " + nome);
		
	}// contador
	private static int nomeLetra(String s, char c) {
		if (s.equals(""))
			return 0;
		else
			if(s.charAt(0)== c)
				return nomeLetra(s.substring(1), c) + 1;
			else return nomeLetra(s.substring(1), c);
	
	
	
}
	}


