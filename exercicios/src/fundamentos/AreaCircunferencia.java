package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		
		// As variaveis em Java são definidas informando tipo, nome e atribuindo um valor a ela
		double raio = 3.4;
		
		// Aqui o valor do pi pode ser alterado dentro do programa
		// double pi = 3.14159;
		
		// Aqui o valor do pi não pode ser alterado, assim ele é uma constante
		// Por convenção nome de Constantes são em letra maiúsculas
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		System.out.println(area);
		
		// Agora podemos atribuir novos valores para a area e para o raio, por eles serem variáveis e não precisa declarar o tipo delas
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área " + area + "m2."); // Aqui estamos concatenando o valor da variavel com duas Strings, graças ao sinal de +.
	}
}
