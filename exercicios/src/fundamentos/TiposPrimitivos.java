package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		//Informações de um funcionário
		
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; // Aqui estamos especificando que o literal é maior que um inteiro com o L no final do valor
		
		// Tipos numéricos reais, com ponto flutuante
		float salario = 11_445.44F; // Aqui o valor tem caracteristicas de Double e precisamos informar que estamos colocando na verdade um Float com F no final do valor
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // Ou true
		
		// Tipo caractere
		char status = 'A';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de Viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}
