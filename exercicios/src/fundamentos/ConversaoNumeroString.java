package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		// Aqui não estamos trabalhando com os tipos primitivos e sim com os Wrappers
		// Variavel utilizando o Wrapper
		Integer num1 = 10000;
		
		// Aqui queremos saber quantos caracteres tem o inteiro e para isso temos que converter para toString() e logo em seguida checar quantos caracteres ele tem como o .length()
		System.out.println(num1.toString().length());
		
		// Aqui estamos fazendo a conversão utilizando o tipo primitivo direto, usando o Wrapper com o método .toString e depois checamos o tamanho dele com o .length()
		int num2 =  100000;
		System.out.println(Integer.toString(num2).length());
		
		// Aqui podemos concatenar o tipo inteiro primitivo com uma String vazia e fazer a conversão que também funciona.
		System.out.println(("" + num2).toString().length());
		
		// Isso acontece para todos os tipos de Wrappers
		
		Double.toString(num2);
		Float.toString(num2);
	}

}
