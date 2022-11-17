package projeto;


public class Vogais {
		
	public static void main(String[] args) {
		
		int n = ocorrencia("fabio furlan", 'a');
		
		System.out.println("numero da ocorrencia " + n);
		
	}
	private static int ocorrencia(String s, char c) {
		if (s.equals(""))
			return 0;
		else
			if(s.charAt(0)== c)
				return ocorrencia(s.substring(1), c) + 1;
			else return ocorrencia(s.substring(1), c);
	}
}
