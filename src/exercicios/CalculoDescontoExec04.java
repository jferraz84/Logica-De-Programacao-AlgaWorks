package exercicios;

import java.util.Scanner;

public class CalculoDescontoExec04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o valor do Produto: ");
		Double valorProduto = scan.nextDouble();
		System.out.print("Qual a quantidade do produto: ");
		Integer qntProd = scan.nextInt();
		
		Double subTotal = valorProduto * qntProd;
		
		Boolean maiorIgualDez = qntProd > 10;
		
		Double valorDesc = 0.0;
		
		if (maiorIgualDez) {
			valorDesc = 10.0;
		} 
		
		Double descontoProd = subTotal * valorDesc / 100;
		Double valorFinalProd = subTotal - descontoProd;
		
		System.out.println("Valor Total: R$ " + valorFinalProd);
		
		scan.close();

	}

}
