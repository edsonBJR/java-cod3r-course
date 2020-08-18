package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		// Essas duas expressões abaixo são iguais
		c = c + b;
		c += b; // Atribuição aditiva
		
		// Essas duas expressões abaixo são iguais
		c = c - a;
		c -= a; // Atribuição subtrativa
		
		c = c * b;
		c *= b; // Atribuição multiplicativa
		
		c = c / a;
		c /= a; // Atribuição divisiva
		
		c = c % 2;
		c %= 2; // Atribuição de modular
		
		c++;
		c = c + 1;
	}
}
