package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		// A String é um valor imutável, depois de atribuido um valor não conseguimos altera-lo.
		
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		s = s.toUpperCase();
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("BOA"));
		
		// Aqui estamos alterando para LowerCase a String e não mudando seu contéudo e depois verificando se ela começa com a string boa
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		// Aqui estamos verificando o tamanho da String
		System.out.println(s.length());
		
		// Aqui estamo verificando se a String termina com a String informanda
		System.out.println(s.endsWith("dia!"));
		
		// Aqui estamos comparando se duas Strings tem o mesmo conteúdo, lembrando que ele leva em consideração se é maiuscula ou minusculas
		System.out.println(s.equals("boa tarde"));
		
		// Aqui estamos comparando se as duas String tem o mesmo conteúdo sem levar em consideração se as letras são maíusculas ou minusculas
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Edson";
		var sobrenome = "Barbosa Junior";
		var idade  = 36;
		var salario = 12345.67;
		
		// Forma de concatenar uma String que não é o ideal
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade" + idade + "\nSalario: " + salario + "\n\n");
		
		// Forma de concatenar uma String que seria mais interessante no dia a dia
		System.out.printf("O senhor %s %s tem %d e ganha R$ %.2f.", 
				nome, sobrenome, idade, salario);
		
		// Agora colocando dentro de uma String o conteúdo que da String que foi concatenado e usando o método "String.format"
		String frase = String.format("\nO senhor %s %s tem %d e ganha R$ %.2f.", 
				nome, sobrenome, idade, salario);
		
		// Agora podemos imprimir a String que foi gerada apartir do método String.format
		System.out.println(frase);
		
		
		// Mais algumas funcionalidade da String que podem ser exploradas
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
		
	}
}
