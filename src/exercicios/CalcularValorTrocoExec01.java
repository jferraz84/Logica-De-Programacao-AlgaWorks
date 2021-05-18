package exercicios;

import java.util.Scanner;

public class CalcularValorTrocoExec01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do Produto: R$ ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Dinheiro recebido: R$ ");
		Double valorRecebido = scanner.nextDouble();
		
		Double valorTroco = valorRecebido - valorProduto;
		
		System.out.println("===============================");
		System.out.print("Valor do troco é R$ " + valorTroco);

		scanner.close();
	}

}
