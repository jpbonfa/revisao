package revisao;

public class SomaImparMultiplicaPar {

	public static void main(String[] args) {
		int numero;
		int somaImpar = 0;
		int par = 0;
		int totalPar  = 0;

		for (numero = 0; numero <= 30; numero++) {
			if (numero % 2 == 1) {
				numero = +numero;
				somaImpar += numero;

			}

		}
		System.out.println("A soma dos numeros impares de 0 � 30 �: "+ somaImpar);

		for (numero = 0; numero <= 30; numero++) {
			if (numero % 2 == 0) {
				if (numero > 0) {
					par = numero * numero;
					totalPar = par * numero;
				}

			}
		}
		System.out.println("A multiplica��o dos numeros pares de 1 � 30 �: "+ totalPar);

	}

}
