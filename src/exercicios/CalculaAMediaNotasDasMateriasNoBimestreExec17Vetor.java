package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaAMediaNotasDasMateriasNoBimestreExec17Vetor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		DecimalFormat saida = new DecimalFormat("0.00");

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("=========== Verificação da Média das Notas Por Bimestre ===============");
		

		Double[] primBimestre = new Double[6];
		Double[] segBimestre = new Double[6];
		Double[] terBimestre = new Double[6];
		Double[] quartoBimestre = new Double[6];

		Double[][] notasAluno = new Double[][] { primBimestre, segBimestre, terBimestre, quartoBimestre };

		Double maiorMedia = 0.0;
		Integer bimVencedor = null;

		for (int i = 0; i < notasAluno.length; i++) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Notas do " + (i + 1)+"° Bimestre: ");
			Double[] notas = notasAluno[i];

			Double maiorNotaBim = 0.0;

			for (int j = 0; j < notas.length; j++) {
				System.out.print("Digite a nota: ");
				notas[j] = scan.nextDouble();
				maiorNotaBim += notas[j];

				Double media = maiorNotaBim / 6;

				Boolean esseMediaEAMaior = media > maiorMedia;

				if (esseMediaEAMaior) {
					maiorMedia = media;
					bimVencedor = i + 1;
				}

			}
		}

		System.out.println("-----------------------------------------------------------------------");
		System.out.println("O bimestre mais produtivo foi " + bimVencedor + " que foi da Media = " + saida.format(maiorMedia));
		System.out.println("-----------------------------------------------------------------------");

		scan.close();

	}

}
