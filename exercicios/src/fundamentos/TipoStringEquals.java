package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		// Sempre compara String utilizando o .equals()
		
		System.out.println("2" == "2"); // Aqui estamos comparando string com string
		
		String s = new String("2");
		System.out.println("2" == s); // Aqui não estamos comparando pelo conteúdo
		System.out.println("2".equals(s)); // Aqui estamos comparando pelo conteúdo da variável
		
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.next(); // Esta entrada de dados retirar os espaços em branco
		System.out.println("2" == s2.trim()); // .trim() -> retira os espaços em branco da String
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
	}

}
