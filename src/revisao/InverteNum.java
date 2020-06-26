package revisao;

import javax.swing.JOptionPane;

public class InverteNum {

	public static void main(String[] args) {
		int numero1 = 0;
		int numero2 = 0;

		try {
			numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "insira o numero1"));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "insira o numero2"));
			System.out.println("numero1: " + numero2);
			System.out.println("numero2: " + numero1);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "insira um valor valido");
		}

	}

}
