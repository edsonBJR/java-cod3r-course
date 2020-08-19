package controle;

public class For1 {

	public static void main(String[] args) {
		
		// Aqui temos um laço for, onde determinamos uma quantidade de repetições	
		for(int contador = 1; contador <= 10; contador++){
			System.out.printf("\ni = %d", contador);
		}
		
		// Tambem pode ser feito da seguinte forma
		int x = 1;
		for(; x <= 10;) {
			System.out.println("\nX = " + x);
			x++;
		}
		
		// Laço for infinito
		for(;true;) {
			System.out.println("Inifinito!");
		}
		
		
	}
}
