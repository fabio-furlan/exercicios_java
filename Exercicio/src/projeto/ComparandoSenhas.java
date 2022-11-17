package projeto;

import java.util.Scanner;

public class ComparandoSenhas {

	public static void main(String[] args) {
		String password = "123456";
		System.out.println("Digite sua senha");
		
		Scanner scanner = new Scanner(System.in);
		String pass = scanner.nextLine();
		
		System.out.println(password.equals(pass));
		
	}

}
