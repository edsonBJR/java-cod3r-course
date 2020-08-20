package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		String texto = ""; // Mesmo que a condição está válida para termino do programa o bloco do while vai executar pelo menos uma vez
		
		do {
			System.out.println("Digite as palavras sábias: ");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
		} while(!texto.equalsIgnoreCase("por favor"));
		
		
		System.out.println("Obrigado!");
		entrada.close();
		
	}
}
