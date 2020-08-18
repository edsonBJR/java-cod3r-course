package fundamentos.operadores;

/**
 * 
 * @author edsonjr
 * Descrição do Desafio
 * Certa pessoa irá fazer dois trabalhos na semana um na terça feira e outro na quinta feira
 * Eles podem ou não ser confirmados
 * Se os dois trabalhos derem certos irá comprar um TV de 50"
 * Se apenas um trabalho der certo irá comprar uma TV de 32"
 * Se comprando uma TV de 50" ou de 32" irá tormar sorvete
 * Se nenhum trabalhor der certo não comprará a TV e nem irá tomar sorvete
 * Fazer a negação lógica em cima do sorvete
 *
 */

public class DesafioLogicos {

	public static void main(String[] args) {
		
		// Aqui temos um operado binário
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean tv1 = trabalho1 && trabalho2;
		boolean tv2 = trabalho1 ^ trabalho2;
		
		boolean sorvete = tv1 || tv2;
		
		// Aqui temos um operador Unário
		boolean casa = !sorvete;
		
		System.out.println("Comprou TV de 50\" ? " + tv1);
		System.out.println("Comprou TV de 32\" ? " + tv2);
		System.out.println("Comprou o Sorvete? " + sorvete);
		
		System.out.println("Ficou em casa, mais saudável? " + casa);
		
	}
}
