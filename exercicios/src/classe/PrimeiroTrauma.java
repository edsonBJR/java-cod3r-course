package classe;

public class PrimeiroTrauma {

	int a = 3; // Não pode retirar essa linha daqui e o código tem que funcionar
	static int b = 4; // Aqui alteramos o atributo para static
	
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);

		// Mesmo estando na própria classe você so consegue acessar um membro de instância apartir de um método estático
		// se você criar uma instância
		
		// Outra forma de ser resolvido
		System.out.println(b); // Devido o atributo ser static conseguimos acessar ele dentro de um metodo da classe

	}

}
