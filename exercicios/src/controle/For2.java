package controle;

/**
 * 
 * @author edsonjr
 * Criar uma laço for decrescente que decrementa de dois em dois
 */

public class For2 {
	
	public static void main(String[] args) {
		
		for(int contador = 10; contador >= 0; contador -= 2) {
			System.out.printf("Contador = %d\n", contador);
		}
	}
}
