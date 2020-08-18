package fundamentos.operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97;
		// Aqui estamos gravando na variável o valor unicode do caracter a que e igual a 97
		int b = 'a';
		
		
		// Aqui estamos comprando o contéudo das variáveis.
		System.out.println(a == b);
		
		// Para imprimir utilizando o valor do inteiro tem que converter para Hexadecimal
		System.out.println('\u0061'); // 97 em Hexadecimal é 0x61
		
		System.out.println(3 > 4); // Maior que
		System.out.println(3 <= 3); // Menor que igual
		System.out.println(3 < 7); // Menor que
		System.out.println(30 >= 7); // Maior que igual
		System.out.println(30 != 7); // Diferente de
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
		
		
	}
}
