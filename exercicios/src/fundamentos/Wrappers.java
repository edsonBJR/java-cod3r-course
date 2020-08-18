package fundamentos;

import java.util.Scanner;

public class Wrappers {
	
	public static void main(String[] args) {
		
		// Wrappers - Envolcro uma classe, objeto que envolve um tipo primitivo em Java
		// Aqui temos um tipo primitivo sendo criado apartir de uma classe
		// Essa é a versão orientada a objetos dos tipos primitivos em Java
		// byte
		
		Scanner entrada = new Scanner(System.in);
		
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000"); //int
		Integer j  = Integer.parseInt(entrada.next()); // Convertendo uma String que entrou no programa para um Inteiro
		Long l = 100000L;
		
		// O valor que está dentro do byte
		System.out.println(b.byteValue());
		
		// Imprimir o valor short como String
		System.out.println(s.toString());
		
		// Aqui estamos imprimindo o valor de i, que altera uma String "10000" para um tipo inteiro
		System.out.println(i);
		
		// Aqui estamos impriminto o valor de j, que é uma String que foi entrada no programa e convertida para um inteiro e depois impressa em tela
		System.out.println(j * 3);
		
		// Aqui estamos fazendo uma operação com um Long
		System.out.println(l / 3);
		
		// Agora trabalhando com Wrapper de Boolean, nessa caso estamos recebendo uma string com o contéudo true e fazendo parser ou convertendo para o tipo Boolean que não é primitivo
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		// Agora estamos convertendo de Boolean para String e depois imprimindo em letras maiúsculas, lembrando que o boolean não tem o método de toUpperCase, porque ele não é uma String
		System.out.println(bo.toString().toUpperCase());
		
		// Character um tipo não primitivo que refere-se ao char
		Character c = '#'; // Nesse caso tem que ser em aspas simples, aspas duplas é usada apenas quanto é um tipo String
		System.out.println(c + "...");
		
		// Aqui temos o tipo Float, com f maiusculo
		Float f = 123.0F; // É preciso passar o F, porque o número é um double e assim o Java irá entender que queremos armazena-lo como Float com F maiusculo
		System.out.println(f);
		
		// Aqui temos o Double, que é declarado com o D maiusculo, Double
		Double d = 1234.56789;
		System.out.println(d);
		
		entrada.close();
	}

}
