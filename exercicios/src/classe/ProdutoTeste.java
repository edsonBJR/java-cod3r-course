package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		// Não precisa fazer nenhum import quanto a classe está no mesmo pacote da classe que será utilizada
		// Assim como não fazemos o import da classe java.lang

		// Com o construtor explicito com todos os parametros conseguimos instanciar um objeto com apenas uma linha
		Produto p1 = new Produto("Notebook", 4356.89);
		
		var p2 = new Produto(); // Aqui tempos o objeto p2 por inferência de tipo
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		//p2.desconto = 0.29;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		// Aqui estamos calculando o preço final dos produtos
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		
		// Aqui estamos calculando a média dos preços dos produtos com o desconto incluido
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2; 
		System.out.printf("Média do Carrinho = R$ %.2f", mediaCarrinho);
			
	}
}
