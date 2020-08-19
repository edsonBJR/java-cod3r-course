package fundamentos.exercicios;

import java.util.Scanner;

public class CaculadoraDePotencia {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o número quer será exponenciado: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Escolha qual o valor do expoente: ");
		int exp1 = entrada.nextInt();
		
		double resultado = Math.pow(num1, exp1);
		System.out.println("O resultado é: " + resultado);
	}

}
