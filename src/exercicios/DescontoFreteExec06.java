package exercicios;

import java.util.Scanner;

public class DescontoFreteExec06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		char resposta = 's';

		do {

			System.out.print("Digite o valor do produto: R$ ");
			Double valorProduto = scan.nextDouble();

			Boolean freteGratis = valorProduto >= 100;

			if (!freteGratis) {
				Double valorFinalProduto = valorProduto + 15;
				System.out.println("O valor final da sua compra com o frete será de: R$ " + valorFinalProduto);
			} else {
				System.out.println("O valor final da sua compra com o frete grátis será de: R$ " + valorProduto);
			}
			System.out.println("-----------------------------------------------------------------");
			System.out.print("Deseja consultar outro pedido ? [s , n]: ");
			resposta = scan.next().charAt(0);

			System.out.println("-----------------------------------------------------------------");

		} while (resposta == 's' || resposta == 'S');
		
		System.out.println("Obrigado por comprar conosco ! ");
		
		scan.close();
	}

}
