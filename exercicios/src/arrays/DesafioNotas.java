package arrays;

import java.util.Scanner;

/**
 * 
 * @author edsonjr
 * Perguntar quantas notas serão digitadas
 * Imprimir a notas que foram digitadas
 * 
 */

public class DesafioNotas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o total de notas a ser lançado: ");
		int totalNotas = entrada.nextInt();
		
		// Aqui criamos uma array apartir do total de notas que serão lançadas
		double[] notas = new double[totalNotas];
			
		// Aqui recebemos as notas e guardamos dentro do array nos respectivos indices
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Agora digite as notas: ");
			notas[i] = entrada.nextDouble();			
		}
		
		// Aqui imprimimos as notas lançadas
		for(double nota: notas) {
			System.out.println("As notas lançadas foram: " + nota);
		}
		
		// Calculo da média das notas
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		double media = total / notas.length;
		System.out.println(media);
		
		entrada.close();
		
	}
}
