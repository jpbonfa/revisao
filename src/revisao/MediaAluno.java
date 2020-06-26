package revisao;

import javax.swing.JOptionPane;

public class MediaAluno {

	public int notas[];

	public void adcionarNotas() {
		int nota = 0;
		notas = new int[10];
		for (int i = 0; i < this.notas.length; i++) {
			boolean valido = true;
			while (valido) {
				try {
					nota = Integer.parseInt(JOptionPane.showInputDialog("insira uma nota"));
					if (nota <= 100) {
						valido = false;
					} else {
						JOptionPane.showMessageDialog(null, "insira um valor valido");
					}
					this.notas[i] = nota;
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "insira um valor valido");
				}
			}

		}
		for (int i = 0; i < notas.length; i++) {
			System.out.println("nota " + (i + 1) + ": " + notas[i]);
		}
	}

	public void CalculaMedia() {
		int media = 0;
		int somaNota = 0;

		for (int i = 0; i < notas.length; i++) {
			somaNota += notas[i];

		}
		media = somaNota / notas.length;
		System.out.println("A media das notas do aluno é: " + media);
	}

	public MediaAluno() {
		adcionarNotas();
		CalculaMedia();

	}

	public static void main(String[] args) {
		new MediaAluno();
	}

}
