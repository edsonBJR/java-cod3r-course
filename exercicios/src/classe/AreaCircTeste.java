package classe;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		// a1.pi = 10;
		
		AreaCirc a2 = new AreaCirc(5);
		// a2.pi = 5; // Essa não é a forma correta de acessar o atributo, porque estamos acessando pela Instancia da classe
		
		// Aqui temos uma Constante que foi declarada com os modificadores static final, isso faz com que o valor da constante não possa ser alterado
		// AreaCirc.PI = 3.1415; // Aqui temos a forma correta de acessar, pela Classe e não pela instancia
		
		System.out.println(a1.area());
		System.out.println(a2.area());
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI); // Valor de PI da classe Math
		System.out.println(Math.E); // Valor de E da classe Math
		System.out.println(AreaCirc.area(100));
	}

}
