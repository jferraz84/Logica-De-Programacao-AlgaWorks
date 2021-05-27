package exercicios;

import java.util.Scanner;

public class VetorMaiorFaturamentoExec15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("=========== Verificação de Resultado de Maior Faturamento  ============");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("=======================================================================");
		System.out.println("Dado uma lista de numeros, com faturamentos semanais:");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("|semanaUm     = { 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 }|\n"
				+ "|semanaDois   = { 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 }|\n"
				+ "|semanaTres   = { 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 }|\n"
				+ "|semanaQuatro = { 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 }|");
		System.out.println("-----------------------------------------------------------------------");

		System.out.println("Crie um algoritmo que encontre qual a semana teve o maior faturamento. \n"
				+ "No final mostre qual foi essa semana e de quanto foi esse faturamento");
		System.out.println("=======================================================================");

		Double[] semanaUm = new Double[] { 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
		Double[] semanaDois = new Double[] { 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
		Double[] semanaTres = new Double[] { 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
		Double[] semanaQuatro = new Double[] { 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

		Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };

		Double maiorValor = 0.0;
		Integer semanaVencedora = null;

		for (int i = 0; i < mes.length; i++) {

			Double[] semana = mes[i];

			Double maiorValorSemana = 0.0;

			for (int j = 0; j < semana.length; j++) {
				maiorValorSemana += semana[j];

			}
			
			System.out.println("Faturamento da "+ (i + 1)+ "° semana foi de: R$ " + maiorValorSemana);

			Boolean esseFaturamentoEOMaior = maiorValorSemana > maiorValor;

			
			if (esseFaturamentoEOMaior) {
				maiorValor = maiorValorSemana;
				semanaVencedora = i + 1; // ESTOU SOMANDO COM 1 PQ NÃO QUERO MOSTAR DE 0 A 3 E SIM DE 1 A 4
			}
			

		}
		
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("A semana mais lucrativa foi a " + semanaVencedora + " que foi de R$ " + maiorValor);
		System.out.println("-----------------------------------------------------------------------");

		scan.close();

	}

}
