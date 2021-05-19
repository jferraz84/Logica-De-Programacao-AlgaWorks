package capitulo05;

import java.util.Scanner;

public class UtilizandoIfEncadeado {

	static final Double PESO_LEVE = 60.0;
	static final Double PESO_MEDIO = 90.0;
	static final Double PESO_PESADO = 110.0;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite o peso do lutador: ");
		Double peso = scan.nextDouble();

		Boolean pesoLeve = peso <= PESO_LEVE;
		Boolean pesoMedio = (peso > PESO_LEVE) && (peso <= PESO_MEDIO);
		Boolean pesoPesado = peso > PESO_MEDIO;

		if (pesoLeve) {
			System.out.println("O luta dor deve lutar na categoria de Peso Leve");
		} else if (pesoMedio) {
			System.out.println("O luta dor deve lutar na categoria de Peso Medio");
		} else if (pesoPesado) {
			System.out.println("O luta dor deve lutar na categoria de Peso Pesado");
		}

		scan.close();

	}

}
