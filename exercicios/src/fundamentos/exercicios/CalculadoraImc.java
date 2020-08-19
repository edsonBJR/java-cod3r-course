package fundamentos.exercicios;

import java.util.Scanner;

public class CalculadoraImc {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Calculadora IMC");
		System.out.println("Digite seu peso: ");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite sua altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso  / (altura *  altura);		
		
		System.out.println("Resultado do seu IMC: " + imc);
		
		entrada.close();
		
	}

}
