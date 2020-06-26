package revisao;

import javax.swing.JOptionPane;

public class MaiorNumero {
	private int numero;
	private int numero2;

	public void imprimiMaior() {

		try {

			numero = Integer.parseInt(JOptionPane.showInputDialog(null, "informe os numeros"));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "informe os numeros"));
			if (numero > numero2) {

				JOptionPane.showMessageDialog(null, numero);

			} else {
				JOptionPane.showMessageDialog(null, numero2);
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "insira um valor valido");
		}

	}

	public static void main(String[] args) {
		new MaiorNumero().imprimiMaior();
	}
}
