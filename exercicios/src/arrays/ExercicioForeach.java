package arrays;

public class ExercicioForeach {
	
	public static void main(String[] args) {
		
		// Notas dos Alunos A e B
		
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 9.5;
		notasAlunoA[1] = 7.8;
		notasAlunoA[2] = 6.9;
		
		double[] notasAlunoB = { 8.6, 9.6, 4.5 };
		
		for(double nota: notasAlunoA) {
			System.out.print(nota + " ");
		}
		
		System.out.println();
		
		for(double nota: notasAlunoB) {
			System.out.print(nota + " ");
		}
		
	}

}
