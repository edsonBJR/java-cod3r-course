package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite os três ultimos salários do funcionário");
		
		System.out.println("Digite o antepenúltimo: ");
		String salario1 = entrada.nextLine().replace(",", "."); // Com esse replace caso o usuario digite a virgula o método já irá converter pra ponto antes de salvar na variavel
		
		System.out.println("Digite o penúltimo: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o último: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		double salarioTotal = valor1 + valor2 + valor3;
		double mediaTotal = (valor1 + valor2 + valor3) / 3;
		
		System.out.println("O valor total dos salários é de: " + salarioTotal);
		System.out.println("A média de salarios é de: " + mediaTotal);
		
		entrada.close();
	}

}
