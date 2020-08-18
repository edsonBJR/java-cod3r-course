package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	
	public static void main(String[] args) {
		
		double a = 1; // Aqui temos uma conversão implicita
		System.out.println(a);
		
		// Aqui temos um exemplo de uma conversão explícita - (CAST)
		float b = 1.0F; // Primeira opção de conversão explícita
		float c = (float) 1.2345888; // Segunda opção de conversão explícita
		// Assim não temos perda de informação
		
		System.out.println(b + " - " + c);
		
		// O JAVA NÃO ANALISA OS VALORES DA VARIÁVEIS DECLARADAS E INICIALIZADAS ELE SÓ ANALISA O TIPO
		// Exemplo abaixo comprova isso
		
		int d = 4;
		// byte e = d; // Aqui o erro é que não pode converter de int para byte
		// para armazenar o valor 4 que é do tipo int em um byte temos que fazer o seguinte:
		byte e = (byte) d; // Aqui temos uma conversão EXPLÍCITA (CAST)
		System.out.println(e);
		
		// Outro exemplo de conversão EXPLÍCITA - (CAST)
		double f = 1.999999;
		int g = (int) f;
		System.out.println(g);
		
	}

}
