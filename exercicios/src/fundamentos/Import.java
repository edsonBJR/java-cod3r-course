package fundamentos;

import java.util.Date;

import javax.swing.JButton;

public class Import {

	public static void main(String[] args) {
		
		// Aqui estamos testando os importes em Java, alguns métodos precisamos antes fazer os imports dos pacotes que os contém
		// Por padrão todos os pacotes que estão em java.lang já estão diponiveis em todas as classes Java		
		java.lang.String b = "Boa tarde!";
		System.out.println(b);
		
		String s = "Bom dia!";
		System.out.println(s);
		
		Date d = new Date();
		System.out.println(d);
		
		JButton botao = new JButton();
	}
}
