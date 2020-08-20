package controle;

/**
 * 
 * @author edsonjr
 * Fazer um laço for sem utilizar um valor numerico para contrar o laço
 * O resultado deve ser o abaixo
 * #
 * ##
 * ###
 * ####
 * #####
 */

public class DesafioFor {

	public static void main(String[] args) {
		
		for(String valor = "#"; !valor.equals("########"); valor += "#") {
			System.out.println(valor);
		}
		
	}
}
