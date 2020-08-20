package controle;

/**
 * 
 * @author edsonjr
 * Entendendo o Escopo das variáveis e temos um laço for um dentro do outro
 */


public class For3 {
	
	public static void main(String[] args) {
		
		for(int i = 0;i < 10; i++) {
			System.out.println(i);
		}
		
		int i = 0;
		System.out.println("Saiu do laço For...");
		System.out.println(i);//Assim temos a variável i fora do escopo do laço for
		
		// Laço for um dentro do outro
		// Aqui temos um laço for utilizado para Criar uma tabuada
		
		for(int j = 0; j < 10; j++) {
			for(int k = 0; k < 10; k++) {
				int result = j * k;
				System.out.println(j + " x " +k + " = " + result);
			}
			System.out.println(j);
		}
	}

}
