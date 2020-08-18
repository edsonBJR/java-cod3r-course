package fundamentos.operadores;

public class Unarios {
	
	public static void main(String[] args) {
	
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		a--; // a = a - 1
		
		++b; // b = b + 1
		--b; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		
		// Aqui temos uma comparação onde a ordem de precedência está alterando o valor da comparação
		// ++ vem antes da comparação == e depois temos o --
		// Por isso temos um resultado true, pra depois a variável b decrementar o 
		// seu valor em uma unidade
		System.out.println(++a == b--);
		System.out.println(a);
		System.out.println(b);
		
	}

}
