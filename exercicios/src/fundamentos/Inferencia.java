package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5; // Variavel declara e inicializada ao mesmo tempo
		System.out.println(a);
		
		// Aqui temos um erro de atribuir a uma variavel um tipo diferente ao qual ela foi declarada
		// Linha de código abaixo esta com erro
		// a = "...";
		
		// Aqui estamos trabalhando com inferencia de tipo
		// informamos uma variavel com o tipo var e o Java se encarrega de saber qual o conteúdo dela e assim definir o seu tipo.
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		c = "Outro Texto";
		System.out.println(c);
		
		// Linha de código abaixo esta com erro
		// c = 4.5; // Embora estamos trabalhando com inferencia aqui também temos um erro onde estamos atribuinto um tipo diferente ao qual foi inferido na variavel
		
		double d; // Variável foi declarada
		d = 123.65; // Variável foi inicializada
		System.out.println(d); // Variável foi usada
		
		// Exemplo abaixo não funciona porque quando criamos uma variável por inferencia o Java precisa saber qual o tipo dela
		// var e;
		// e = 123.45;
		
		var f = 12;
		// f = 12.01; Aqui temos um erro, porque por inferencia a variavel é do tipo inteiro, e estamos querendo atribuir um valor do tipo double
		System.out.println(f);
		
	}

}
