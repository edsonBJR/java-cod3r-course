package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// Formula da conversão de temperatura de °F para °C
		// (°F - 32) x 5/9 = °C
		
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		
		double TemperaturaF = 71;
		double TemperaturaC;
		
		TemperaturaC = (TemperaturaF - AJUSTE) * FATOR;
		
		System.out.println("O resultado é: " + TemperaturaC + "°C");
		
		TemperaturaF = 140;
		TemperaturaC = (TemperaturaF - AJUSTE) * FATOR;
		
		System.out.println("O resultado é: " + TemperaturaC + "°C");
		
	}

}
