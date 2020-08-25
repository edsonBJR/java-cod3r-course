package controle.exercicios;

import java.util.Scanner;

/**
 * 
 * @author edsonjr
 * Verificar se o ano é Bissexto
 */

public class AnoBissexto {
	
	public static void main(String[] args) {
		
		// Regras para o ano bissexto
		// O ano deve ser divisível por 4 com resto 0
		// O ano não pode ser divisível por 100
		// Se for divisível por 400 a divisão deve ser exata deixando o resto igual a zero
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		int ano = entrada.nextInt();
		
		if (ano % 4 == 0) {
			if(ano % 100 != 0) System.out.printf("O ano, %d é bissexto!", ano);
		} else {
			System.out.printf("O ano, %d não é bissexto", ano);
		}

		entrada.close();
		
	}
	

}
