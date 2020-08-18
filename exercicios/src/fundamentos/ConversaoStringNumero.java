package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	
	public static void main(String[] args) {
		
		
		// Aqui temos o uso do JOptionPane com o método showInputDialog, essa biblioteca cria janelas para entrada de dados
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		
		System.out.println(valor1 + valor2);
		
		// Aqui estamos pegando a String que recebemos no showInputDialog e convertendo ela para Double com o Double.parseDouble(valor1)
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println("Soma é " + soma);
		System.out.println("Média é " + soma / 2);
	}

}
