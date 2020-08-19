package controle;

import java.util.Scanner;

/**
 * 
 * @author edsonjr
 * Programa para mostra qual o número do dia da semana
 * Domingo 1, Segunda 2, Terça 3, Quarta 4, Quinta 5, Sexta 6, Sábado 7
 * 
 */

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o nome do dia da Semana: ");
		String diaSemana = entrada.nextLine(); // nextLine() pega multiplas palavras enquanto que o next() pega apenas uma palavra.
		
		if(diaSemana.equalsIgnoreCase("domingo")) { // Aqui estou utilizando um método da String que é o equalsIgnoreCase(), para que ele ignore se é maiusculo ou minúsculo o que foi digitado
			System.out.println("Domingo é o dia: 1");
		} else if(diaSemana.equalsIgnoreCase("segunda")) {
			System.out.println("Segunda é o dia: 2");
		} else if(diaSemana.equalsIgnoreCase("terca")
				|| diaSemana.equalsIgnoreCase("terça")) {
			System.out.println("Terça é o dia: 3");
		} else if(diaSemana.equalsIgnoreCase("quarta")) {
			System.out.println("Quarta é o dia: 4");
		} else if(diaSemana.equalsIgnoreCase("quinta")) {
			System.out.println("Quinta é o dia: 5");
		} else if(diaSemana.equalsIgnoreCase("sexta")) {
			System.out.println("Sexta é o dia: 6");
		} else if(diaSemana.equalsIgnoreCase("sabado")
				|| diaSemana.equalsIgnoreCase("sábado")) {
			System.out.println("Sábado é o dia: 7");
		} else {
			System.out.println("Não é um dia da Semana!");
		}
		
		entrada.close();
	}

}
