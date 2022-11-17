package projeto;

public class Name {

	
	public static void main(String[] args) {
		
		// ATRIBUINDO NOME
		 
		 	String nome = "fabio";
		 	System.out.println(nome);
		 

		    for (int i = 0; i < nome.length(); i++) {
		        char caractere = nome.charAt(i);

		        if (caractere == 'a'){
		            System.out.println(" Existe a letra A no nome mencionado.");
		            
		        }else
					
				 if(caractere == 'a') {
		            System.out.println(" Não existe a letra  A no nome mencionado.");
		        }
		    }
			    
		    //verificando a letra com o nome 
		    int n = nomeLetra("fabio", 'a');
			
			System.out.println(" Existe um total de " + n + " letra A no nome");
			
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
