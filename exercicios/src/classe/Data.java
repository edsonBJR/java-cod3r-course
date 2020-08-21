package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data() {
		// dia = 01;
		// mes = 01;
		// ano = 1970;
		this(1, 1, 1970); // Aqui estamos utilizando o this como método, so pode ser chamado assim quando é um construtor dentro de outr construtor
		
		// Padrões na hora de criar variaveis de instancia por tipo
		// byte, short, int, long --> valor padrão 0
		// float, double --> valor padrão 0
		// boolean --> false
		// char --> \U0000
		
	}
	
	Data(int dia, int mes, int ano) {
		this.dia = dia; // Aqui estamos referênciando ao atributo dia da classe que está fora do construtor
		this.mes = mes; // O this é uma instancia da classe, não é aceito em metodos estáticos da classe
		this.ano = ano;
	}
	
	String obterDataFormatada() {
		// Aqui estamos usando um método da String o .format()
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	// Esse método não server para utilizar em aplicação desktop, web e mobile
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}
}
