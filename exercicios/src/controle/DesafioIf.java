package controle;

import java.util.Scanner;

public class DesafioIf {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a média: ");
		
		double media = entrada.nextDouble();
		
		if(media <= 7); { // Aqui temos um erro de código onde temos uma virgula entre o teste da condicional e o bloco de código da condicional
			System.out.println("Está acima da média.");
		}
		
		entrada.close();
	}

}
