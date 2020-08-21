package controle;

public class BreakRotulado {
	
	public static void main(String[] args) {
		
		externo: for (int i = 0; i < 3; i++) { // Aqui estamos dando nome para o laço for - Rótulo
			interno: for (int j = 0; j < 3; j++) { // Aqui estamos dando nome para o laço for - Rótulo
				
				if(i == 1) {
					break externo; // Aqui estamos usando o break rótulado para sair do laço for externo
				}
				
				System.out.printf("[%d %d]", i, j);
			}
			
			System.out.println();
		}
	
		System.out.println("Fim!");
	}
}
