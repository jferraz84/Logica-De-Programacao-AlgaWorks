package exercicios;

import java.util.Scanner;

public class CalculoAposentadoriaExec08 {

	static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;

	static final Integer TEMPO_MINIMA_DE_CONTRIBUICAO = 25;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("-----------------------------------------------------------");
		System.out.println("======= Verificação de Aposentadoria =======");
		System.out.println("-----------------------------------------------------------");
		System.out.print("Digite seu nome: ");
		String nome = scan.nextLine();
		System.out.print("Digite a sua idade: ");
		Integer idade = scan.nextInt();
		System.out.print("Digite o seu tempo de contribuiação do INSS: ");
		Integer tempoContrib = scan.nextInt();
		System.out.println("============================================================");

		// FIZ ASSIM ANTES DE VER A CORREÇÃO
//		Boolean idadeMaiorque55 = idade > 55;
//		Boolean contribMaiorQue25 = tempoContrib > 25;
//
//		Boolean temDiretoAposentadoria = idadeMaiorque55 && contribMaiorQue25;

		// FIZ ASSIM COM A CORREÇÃO
		Boolean idadeMaiorque55 = idade >= IDADE_MINIMA_PARA_APOSENTAR;
		Boolean contribMaiorQue25 = tempoContrib >= TEMPO_MINIMA_DE_CONTRIBUICAO;

		Boolean temDiretoAposentadoria = idadeMaiorque55 && contribMaiorQue25;

		if (temDiretoAposentadoria) {
			System.out.println("O Usuario " + nome + " tem direito a se Aposentar imediantamente");
		} else {
			System.out.println("O usuario " + nome + " ainda não tem direito a Aposentadoria");
		}

		System.out.println("============================================================");
		System.out.println("FIM do Programa !!");
		System.out.println("------------------------------------------------------------");

		scan.close();
	}

}
