package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		// Média Aluno para aprovar ou reprovar
		double media = 5.6;
		// Uso de um ternário, ele retornar uma String e tem a ? para definir a condição e o : para definir o true e depois o false de acordo com a condição
		String resultadoFinal = media >= 7.0 ? 
				"Aprovado" : "Recuperação";
		System.out.println("O aluno está " + resultadoFinal);
		
		// Avaliação da nota e do comportamento para dar Desconto
		double nota = 9.9;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		// Uso de um ternário, ele retornar uma String e tem a ? para definir a condição e o : para definir o true e depois o false de acordo com a condição
		// Aqui estamos passando a condicional através de uma variável
		String resultado = temDesconto ? 
				"Sim." : "Não.";
		System.out.println("Tem desconto: " + resultado);
	}
}
