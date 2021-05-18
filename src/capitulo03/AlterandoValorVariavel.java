package capitulo03;

import java.util.Scanner;

public class AlterandoValorVariavel {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o valor do produto: ");
		Double valorProd = scan.nextDouble();

		System.out.print("Qual será a forma de pagamento: [1: A Vista,  2: A Prazo]: ");
		Integer formaPag = scan.nextInt();

		Boolean pagAVista = formaPag.equals(1);

		Double juros = 0.0;

		if (!pagAVista) {
			juros = 10.0;
		}

		
		Double acrescimo = valorProd * juros / 100;
		Double valorFinal = acrescimo + valorProd;
		System.out.println("O valor final do produto será de: R$ " + valorFinal );

		System.out.println("Fim");

		scan.close();

	}
}
