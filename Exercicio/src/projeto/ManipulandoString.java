package projeto;

public class ManipulandoString {

	public static void main(String[] args) {
		
		// atribuindo uma string
		String x = "   Ola mundo, esse é o novo mundo";
		
		// imprimindo a frase
		System.out.println(x);
		
		// imprimindo a quantidade de caracter que tem na frase, usado para contar senhas
		System.out.println(x.length());
		
		//concatenação
		System.out.println(x + " teste teste");
		
		//verificando se existe uma palavra no texto e imprime true ou false
		System.out.println(x.contains("novo"));
		
		// para saber em qual letra ou indice aquela palavra começa 
		System.out.println(x.indexOf("mundo"));
		
		// qual foi o ultimo indice, posição dessa palavra na frase 
		System.out.println(x.lastIndexOf("mundo"));
		
		// deixando com letra maiuscula
		System.out.println(x.toUpperCase());
		
		// deixando com letra minuscula
		System.out.println(x.toLowerCase());
		
		//removendo os espaços entre as palavras
		System.out.println(x.trim());
		
		// descobrindo o conjunto de frase prlo indice
		System.out.println(x.substring(9));
		
		// comparando a palavra digitada e vendo se tem na frase, imprimi true ou false
		System.out.println(x.equals("fabio"));
		
		
		
		
		
	}

}
