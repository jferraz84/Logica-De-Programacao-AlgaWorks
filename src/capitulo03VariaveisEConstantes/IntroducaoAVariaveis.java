package capitulo03VariaveisEConstantes;

import java.util.Scanner;

public class IntroducaoAVariaveis {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do Produto: R$ ");
		Double valorProduto = scanner.nextDouble();
		System.out.println("Valor do produto: R$ " + valorProduto);
		
		Double valorProdutoComFrete = valorProduto + 2;
		
		System.out.println("Valor do produto com frete: R$ " + valorProdutoComFrete);
		
		scanner.close();
		
		
	}

}
