package controle.exercicios;

import java.util.Scanner;

/**
 * 
 * @author edsonjr
 * Verificar se um número é par e estã entre 0 e 10
 * 
 */

public class VerificarNumeroPar {
	
	public static void main(String[] args) {
		
		int x;
		Scanner entrada = new Scanner(System.in);
		System.out.printf("Digite um número: ");
		x = entrada.nextInt();
		
		if (0 == (x % 2) && x >= 0 && x <= 10) {
			System.out.println("O numéro " + x + " é par e está entre 0 e 10");
		} else {
			System.out.println("O numero " + x + " não é par e não está entre 0 e 10");
		}

		entrada.close();
		
	}

}
