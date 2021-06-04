package exercicios;

import java.util.Scanner;

public class LendoEMultiplicandoElementosEmVetorExec16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char resposta = 's';

		do {

			System.out.println("-----------------------------------------------------------------------");
			System.out.println("================  Calculo de valores entre Vetores ====================");
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Vamos iniciar a operação !!");
			System.out.println("-----------------------------------------------------------------------");

			Integer vetorA[] = new Integer[6];
			Integer vetorB[] = new Integer[6];

			for (int i = 0; i < vetorA.length; i++) {
				System.out.print("Digite o " + (i + 1) + "° valor: ");
				vetorA[i] = scan.nextInt();

			}
			System.out.println("-----------------------------------------------------------------------");
			System.out.print("Digite o valor do multiplicador: ");
			Integer mult = scan.nextInt();
			
			System.out.println("Os valores multiplicados por " + mult + " são: ");
			System.out.println("-----------------------------------------------------------------------");

			for (int i = 0; i < vetorB.length; i++) {
				vetorB[i] = vetorA[i] * mult;
				System.out.println("O valor da posição " + (i + 1) + "° é: " + vetorB[i]);
			}

			System.out.println("-----------------------------------------------------------------------");
			System.out.print("Deseja realizar outra Operação ? [ s, n ]");
			resposta = scan.next().charAt(0);

		} while (resposta == 's' || resposta == 'S');

		System.out.println("=================  Fim Do Programa  ====================================");

		scan.close();

	}

}
