package controle;

import java.util.Scanner;

/**
 * 
 * @author edsonjr
 * Objetivo do desafio é permitir que várias notas sejam digitadas
 * Depois que for digitado -1 o programa deve para a execução
 * Antes de sair deve calcular a média das notas, o total de notas válidas digitadas e total de notas inválidas digitadas
 * Exibir a média das notas
 */

public class DesfioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		// Digitar as notas
		// Para sair digitar -1
		// Gravar as notas Validas e ir incrementando o valor
		// Calcular a média das notas

		double notas = 0;
		int notasInseridas = 0;
		double totalNotas = 0;
		
		while(notas != -1) {
			
			System.out.println("Digite a nota: ");
			notas = entrada.nextDouble();
			
			if(notas >= 0 && notas <= 10) {
				totalNotas += notas;
				notasInseridas++;
			} else {
				System.out.println("Nota inválida!");
			}

		}
		
		double media = totalNotas / notasInseridas;
		System.out.println("A média das notas é: " + media);
		
		entrada.close();	
	}

}
