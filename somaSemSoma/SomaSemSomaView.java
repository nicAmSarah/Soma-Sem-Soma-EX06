package somaSemSoma;

import javax.swing.JOptionPane;

public class SomaSemSomaView {
	
	public static void main(String[] args) {
		
		int num1, num2;
		
		num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do numero 1:"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do numero 2:"));

		if( num1 == 0 || num2 == 0) {
			JOptionPane.showConfirmDialog(null, "tem que ser maior que 0");
		}
		else {
			SomaSemSomaController soma = new SomaSemSomaController();
			
			int resultSoma = soma.somaSS(num1, num2);
			JOptionPane.showConfirmDialog(null, resultSoma);
		}
		
	}
	
}
