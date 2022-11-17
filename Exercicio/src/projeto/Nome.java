package projeto;



	// ATRIBUIR NOME E IMPRIMIR
	// VERIFICAR SE A LETRA "A" CONSTA NO NOME, SE SIM IMPRIMIR EXISTE, SENÃO IMPRIMIR NÃO EXISTE.
	// EXIBIR QUANTAS VEZES APARECE A LETRA "A" EM MEU NOME E IMPRIMIR.

	public class Nome {

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
		
			 // TAMANHO DA STRING
			 System.out.println( " Quantidade de caracter em " + nome + " são " +  nome.length  ( )+ " caracteres");
			 
			
			 String letters = "fabio";
			 int countletters = letters.split("a").length;
			 System.out.println(" A quantidade de letra A no nome mencionado é de " + countletters +" letra");
			 
			 // letra para identificar na String
			char letra = 'a';
			
			 System.out.println(letra);  
			 
			 
			// quantidade de posições.
		           int contador = 0;
		           while(contador <= 1) {
		           System.out.println(letra);
		                    contador = contador + 1;
		                }
		                System.out.println(contador);	                            
		}
	}


