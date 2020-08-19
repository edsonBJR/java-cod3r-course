package controle;

import java.util.Scanner;

/**
 * 
 * @author edsonjr
 * Objetivo é permitir que possa digitar quantos textos quiser até digitar a palavra Sair e finalizar o programa
 */

public class WhileIndeterminado {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String condicao = "";
		while(!condicao.equalsIgnoreCase("sair")) { // Enquanto não for digitada a palavra sair faça o bloco de código abaixo
			System.out.println("Digite um texto: ");
			condicao = entrada.nextLine();
			System.out.println("Texto digitado foi: " + condicao);
		}
		
		entrada.close();
	}

}
