package fundamentos;

import java.util.Scanner;

/**
 * 
 * @author edsonjr
 * Objetivo do Desafio
 * Ler o número 1 e o numero 2 digitados pelo usuário
 * Pedir para o usuario informar qual a operação ele quer fazer
 * as operações podem ser: + - * / %
 */
public class DesafioCalculadora {

	public static void main(String[] args) {
		
		// Vamos inicializar Scanner para entrada de dados
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = entrada.nextDouble();
				
		System.out.println("Digite o segundo número: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite o sinal da operação que deseja fazer: ");
		String operacao = entrada.next();

		
		// Lógica
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		

		System.out.printf("Equação: %.2f %s %.2f  = %.2f", num1, operacao, num2, resultado);

		entrada.close();
	}	
}
