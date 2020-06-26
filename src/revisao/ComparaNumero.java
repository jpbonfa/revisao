package revisao;

import javax.swing.JOptionPane;

public class ComparaNumero {

	public static void main(String[] args) {

		int numero1 = 0;
		int numero2 = 0;

		try {
			numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "insira o numero1"));
			numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "insira o numero2"));
			if (numero1 != numero2) {
				System.out.println("estes numeros são diferentes");

				if (numero1 > numero2) {
					System.out.println("Maior: " + numero1);
					System.out.println("Menor: " + numero2);
				}
				if (numero1 < numero2) {

					System.out.println("Maior: " + numero2);
					System.out.println("Menor: " + numero1);
				}

			} else {
				System.out.println("estes numeros são iguais");
				System.out.println("Maior: " + numero2 + "," + numero1);

			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "insira um valor valido");
		}

	}
}