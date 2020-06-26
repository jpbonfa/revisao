package revisao;

import javax.swing.JOptionPane;

public class NumeroDecrescente {

	public static void main(String[] args) {

		int numero;
		try {
			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "insira um numero"));
			for (numero = numero; numero >= 0; numero--) {
				System.out.println(numero);

			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "insira um valor valido");
		}
	}
}
