package classe;

public class Produto {
	
	String nome;
	double preco;
	//double desconto;
	static double desconto = 0.25;

	// Declarado de forma explicita o Construtor com um parametro
	Produto(String nomeInicial, double precoInicial ){
		nome = nomeInicial;
		preco = precoInicial;
//		desconto = descontoInicial; No consturtor o atributo não precisa ser informado já que ele está definido
	}
	
	// Declarada de forma explicita o Construtor padrão, ele não tem parametro e nem tem retorno
	Produto() {
		
	}
	
	// Aqui criamos um outro método, muito embora tenha o mesmo nome so que a sua assinatura é diferente
	// O que defini a assinatura do método é o seu nome e os seu parametros por tipo e não por nome
	float precoComDesconto() {	
		return (float) (preco * (1 - desconto));
	}
	
	// Criar um método para retornar o preço com desconto
	// Não preciso de parametros porque dentro da classe eu já tenho os atributos que preciso para calcular o preço com desconto
	double precoComDesconto(double descontoDoGerente) {	
		return  preco * (1 - desconto + descontoDoGerente);
	}
	
	
}
