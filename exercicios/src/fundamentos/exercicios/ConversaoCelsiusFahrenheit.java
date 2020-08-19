package fundamentos.exercicios;

import java.util.Scanner;

public class ConversaoCelsiusFahrenheit {
	
	public static void main(String[] args) {

		// Fórmula da conversão de temperatura de °C para °F
		// (°C × 9/5) + 32 = °F
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em graus °C");
		
		double fator1 = 9.0 / 5.0;
		double fator2 = 32;
		double temperaturaCelsius = entrada.nextDouble();
		
		double temperaturaFahrenheit = temperaturaCelsius * fator1 + fator2;
		
		System.out.println("A temperatura de " + temperaturaCelsius + " °C é igual a " + temperaturaFahrenheit + " °F" );
		
		entrada.close();
	}
	

}
