package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data data1 = new Data();
//		
		data1.dia = 10; // Embora a data tenha valores padrões, ainda conseguimos alterar para o valor que quisermos com o construtor padrão
//		data1.mes = 05;
//		data1.ano = 1998;
		
		var data2 = new Data(30, 04, 1984);
		
//		data2.dia = 30;
//		data2.mes = 04;
//		data2.ano = 1984;
		
		System.out.printf("Data aleatoria: %d/%d/%d", data1.dia, data1.mes, data1.ano);
		System.out.printf("\nData nascimento Edson: %d/%d/%d\n", data2.dia, data2.mes, data2.ano);
		
		System.out.println(data1.obterDataFormatada());
		System.out.println(data2.obterDataFormatada());

		data1.imprimirDataFormatada();
		data2.imprimirDataFormatada();
	}

}
