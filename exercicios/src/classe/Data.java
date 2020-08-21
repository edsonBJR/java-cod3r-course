package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data() {
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String obterDataFormatada() {
		// Aqui estamos usando um método da String o .format()
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	// Esse método não server para utilizar em aplicação desktop, web e mobile
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
}
