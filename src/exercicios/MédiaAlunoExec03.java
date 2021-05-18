package exercicios;

import java.util.Scanner;

public class MédiaAlunoExec03 {

	static final Integer MEDIA_ALUNO = 70;
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a nota do 1° bimestre: ");
		Double primNota = scan.nextDouble();
		System.out.print("Digite a nota do 2° bimestre: ");
		Double segNota = scan.nextDouble();
		System.out.print("Digite a nota do 3° bimestre: ");
		Double terNota = scan.nextDouble();
		System.out.print("Digite a nota do 4° bimestre: ");
		Double quarNota = scan.nextDouble();
		System.out.println("-------------------------------------------");

		Double somaNotas = (primNota + segNota + terNota + quarNota) / 4;
		
		Boolean aprovado = somaNotas >= MEDIA_ALUNO;

		if (aprovado) {
			System.err.println("O Aluno está APROVADO com uma media final de: " + somaNotas);
		} else {
			System.out.println("O Aluno está REPROVADO com media final de: " + somaNotas);
		}

	}

}
