package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		// Todas as palavras que estão em roxo são palavras reservadas da Linguagem, já tem mais ou menos 50 palavras
		double a = 2.3;
		
		// String não é um tipo primitivo do Java e nem é uma palavra reservada da linguagem.
		String s = "Bom dia X";
		
		// Quando temos variáveis que não são tipos primitivos o ponto logo após a variável abre várias funções ou possibilidades associados a variavél
		// A função abaixo não altera o valor original da variável s
		// Com a variável s recebendo o seu valor alterado pelo método informando depois do ponto, agora iremos ver o conteúdo todo da variável em letra maiúsculas
		s = s.toUpperCase();
		
		// Outro método é o replace depois do ponto
		// A String "Senhora" não ficará em letras maiúsculas porque o método toUpperCase está antes do método replace, nesse caso a ordem realmente importa no algoritmo.
		s = s.replace("X", "Senhora");
		
		// Outro método é o concat, ele consegue concatenar a string com outra string informada no método.
		s = s.concat("!!!");
		
		System.out.println(s);
		
		// Podemos pegar o valor literal de uma String e associar a algum método semelhando aos métodos utilizados com a String declarada explicitamente acima.
		System.out.println("edson".toUpperCase());
		
		// Assim terá o mesmo resultado que o metódo anterior
		String x = "edson".toUpperCase();
		System.out.println(x);
		
		// Podemos quebrar uma sentaça de código onde temos um ponto nesse caso nos métodos .replace e .toUpperCase
		// Podemos utilizar o . para fazer várias chamadas em cadeia desde que o retorno seja uma String ou o tipo da variável declarado, não tem limites.
		// Assim temos vários métodos encadeados que retornam sempre uma String
		String y = "Bom dia X"
				.replace("X", "enricco")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		int b = 3;
		System.out.println(a);
		// a. -> isso não funciona por que é um tipo primitivo.
		
		// É com o ponto que temos acesso aos métodos e atributos no mundo do Java
		
		
		
		
	}

}
