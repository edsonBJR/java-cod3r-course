package controle;

public class WhileDeterminado {

	public static void main(String[] args) {
		
		// Aqui temos um While que tem determinado a quantidade de vezes que será executado
		
		int contador = 1;
		
		while(contador <= 10) {
			System.out.printf("\ni = %d", contador);
			contador++; // Incremento de 1 em 1
		}
		
		contador = 0;
		
		while(contador <= 10) {
			System.out.printf("\ni = %d", contador);
			contador += 2; // Incremento com adição do valor a ser incrementado, podemos colocar o rangue que quisermos
		}
	}
}
