package fundamentos.operadores;

public class Logicos {
	
	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2); // E
		System.out.println(condicao1 || condicao2); // Ou
		System.out.println(condicao1 ^ condicao2); // Ou Exclusivo
		System.out.println(!condicao2); // Negação
		System.out.println(!condicao1); // Negação
		
		System.out.println("\nTabela verdade do E (AND)"); // Operador binário
		System.out.println(true && true);
		System.out.println(true && false);
//		System.out.println(false && true);
//		System.out.println(false && false);
		
		System.out.println("\nTabela verdade do OU (OR)"); // Operador binário
//		System.out.println(true || true);
//		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\nTabela verdade do Exclusivo OU (XOR)"); // Operador binário
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\nTabela verdade da NEGAÇÃO (NOT)"); // Operador unário
		System.out.println(!true);
		System.out.println(!false);
		System.out.println(!!true);
		System.out.println(!!false);
		
	}

}
