package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		// Instanciando um Array de notas de um aluno
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 7.8;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		// Calculando a média das notas do Aluno
		
		double totalAlunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println(totalAlunoA / notasAlunoA.length);
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		// Abaixo temos um erro de ArrayIndexOutOfBoundsException
		// System.out.println(notasAlunoA[4]);
		
		
		// Também podemos inicializar o array diretamente com os elementos
		// Recebendo os dados de uma variável
		final double notaArmazenada = 5.9; // Uma constante esse valor não muda
		double [] notasAlunoB = { 6.5, 9.8, notaArmazenada, 6.7};
		
		double totalAlunoB = 0;
		// Estamos utilizando a variável i novamente, não problema porque ela está dentro do escopo do laço for
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(totalAlunoB / notasAlunoB.length);
	}

}
