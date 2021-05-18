package exercicios;

import java.util.Scanner;

public class CalculadoraSimplesExec05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char resposta = 's';

		do {
			
			System.out.println("------------------------");
			System.out.println("Calculadora Jorge !!");
			System.out.println("------------------------");
			System.out.print("Digite o primeiro numero: ");
			Integer primNumero = scan.nextInt();

			System.out.println("======================================");
			System.out.println("|Digite qual operação deseja realizar|");
			System.out.println("|1 - Adição                          | \n" 
							 + "|2 - Subtração                       | \n" 
							 + "|3 - Multiplicação                   | \n" 
							 + "|4 - Divisão                         |");
			System.out.println("======================================");
			
			System.out.print("R: ");
			Integer operacao = scan.nextInt();

			System.out.println("Digite o segundo numero: ");
			Integer segNUmero = scan.nextInt();

			if (operacao == 1) {
				Integer soma = primNumero + segNUmero;
				System.out.println("Resultado da Soma: " + soma);

			} else if (operacao == 2) {
				Integer subtracao = primNumero - segNUmero;
				System.out.println("Resultado da Subtração: " + subtracao);

			} else if (operacao == 3) {
				Integer multiplicacao = primNumero * segNUmero;
				System.out.println("Resultado da Multiplicação: " + multiplicacao);

			} else {
				Integer divisao = primNumero / segNUmero;
				System.out.println("Resultado da Divisão: " + divisao);

			}

			System.out.println("-----------------------------------");
			System.out.print("Deseja realizar outra Operação ? [ s, n ]");
			resposta = scan.next().charAt(0);

		} while (resposta == 's' || resposta == 'S');
		
		System.out.println("---------------------------------");
		System.out.println("|Calculadora Jorge Finalizada !!|");
		System.out.println("---------------------------------");

		scan.close();
	}

}
