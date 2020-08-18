package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		
		// Aqui temos uma variável do tipo não primitivo, com isso podemos acesar métodos e atributos dessa variável.
		String s = "Texto";
		s.toUpperCase();
		
		// Wrappers são a versão objetos  dos tipos primitivos em Java
		int a = 123;
		System.out.println(a);
	}
}
