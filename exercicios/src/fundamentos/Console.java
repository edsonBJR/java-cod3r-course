package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		// Abaixo algumas formas que temos de imprimr alguma mensagem no console
		
		// Aqui não temos uma quebra de linha
		System.out.print("Bom");
		System.out.print(" dia!!!\n");
		
		// Aqui informamos a quebra de linha mas ela ocorre apenas depois de escrever a String no console
		System.out.println("Bom");
		System.out.println("dia!");
		
		// Aqui temos um printf que utiliza de caracteres próprios para fazer a interpolação dos dados passados em sequência na mesma ordem
		System.out.printf("Numeros da Megasena: %d %d %d %d %d %d %n", 1,2,3,4,5,6);
		
		// Aqui temos um caractere próprio para impressão de número com casas decimais, so que arredondado.
		System.out.printf("Salário: %.1f %n", 1234.5678);
		
		// Aqui temos um caractere próprio para impressão de String com do printf
		System.out.printf("Nome: %s%n", "Edson Junior");
		
		// Agora iremos ver como permitir que dados sejam enviados apartir do console para dentro do programa com o Scanner
		Scanner entrada = new Scanner(System.in); // Aqui é passado a entrada do sistema, tudo que for digitado será monitorador pelo Scanner
		
		System.out.print("Digite seu nome: ");
		// Aqui estamos recebendo dados do tipo String
		String nome = entrada.nextLine();
		System.out.print("Digite seu sobrenome: ");
		// Aqui estamos recebendo dados do tipo String
		String sobrenome = entrada.nextLine();
		System.out.print("Digite a sua idade: ");
		// Aqui estamos recebendo dados do tipo Inteiro
		int idade = entrada.nextInt();
		
		System.out.println("\nNome: " + nome + " " + sobrenome + ", tem: " + idade + " anos.");
		// Aqui estamos imprimindo no console com o printf, formatado.
		System.out.printf("%s %s tem %d anos.", nome, sobrenome, idade);
		
		// Aṕos o uso do Scanner é necessário fecha-lo.
		entrada.close();		
	}
	
}
