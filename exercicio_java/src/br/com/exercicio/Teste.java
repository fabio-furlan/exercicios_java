package br.com.exercicio;



public class Teste {

	public static void main(String[] args) {
		char alfabeto[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','x','z'	};
		
		String nome = "fabio";
		
			
		
		
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
		
		
		
		//String[] output = nome.split("");
		//System.out.println(output[0]);
		//System.out.println(output[1]);
		//assertEquals(2,output.length);
		
		//	int contador = 0;
		
			//for (String string :alfabeto) {
		//	if (string.equalsIgnoreCase(nome)) {
			//	contador ++;
		//	}
	//	}
		//System.out.println("Nome " + nome +" foi encontrada " + contador + " vez na lista");
		//System.out.println(alfabeto[1]);
		}
	    
	   
	}



