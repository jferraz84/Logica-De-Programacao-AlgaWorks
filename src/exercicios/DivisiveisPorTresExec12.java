package exercicios;

public class DivisiveisPorTresExec12 {

	static final Integer DIVISOR = 3;

	public static void main(String[] args) {

		System.out.println("------------------------------------------------------------");
		System.out.println("=======  Verificação de Resultado de Divisão por 3   =======");
		System.out.println("------------------------------------------------------------");
		System.out.println("=====================================================================");
		System.out.println("Dado uma lista de numeros, quais são divisíveis por 3:");
		System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20");
		System.out.println("=====================================================================");

		Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };

		for (int i = 0; i < numeros.length; i++) {

			Integer numero = numeros[i];

			Integer divisivel = numero % DIVISOR;

			if (divisivel.equals(0)) {
				System.out.println("Divisível por 3: " + numero);
			}
		}

	}

}
