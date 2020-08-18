package fundamentos.operadores;

public class Aritmeticos {
	
	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 34.56;
		double y = 2.2;
		// Aqui teremos os resultados com casas decimais por causa do tipo da variável
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		int a = 8;
		int b = 3;
		// Aqui teremos os resultados sem as casas decimais e o valor será arredondado, por causa do tipo da variável que é inteiro.
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		
		// Podemos fazer um cast para um tipo double da variavel b para pegarmos o resultado com casas decimais
		System.out.println(a / (double) b);
		
		// Podemos fazer um cast para um tipo float da variavel b para pegarmos o resultado com casas decimais com precisão menor
		System.out.println(a / (float) b);
		
		// Agora estamos obtendo o resto da divisão
		System.out.println(a % b);
		System.out.println(8 % 3);
		
		// Aqui estamos vendo a prescedencia das operações aritméticas
		System.out.println(x + y - a * b);
	}

}
