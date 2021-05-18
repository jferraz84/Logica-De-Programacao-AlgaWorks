package exercicios;

import java.util.Scanner;

public class AprovacaoDeConcursoExec09 {

	static final Integer NOTA_MINIMA_PARA_APROVACAO = 150;
	static final Integer NOTA_MINIMA_MATERIAS = 60;
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("------------------------------------------------------------");
		System.out.println("======= Verificação de Resultado de Concurso publico =======");
		System.out.println("------------------------------------------------------------");
		System.out.println("Digite o nome do candidato: ");
		System.out.print("R: ");
		String nome = scan.nextLine();
		System.out.print("Digite a note de Matematica: ");
		Integer notaMatem = scan.nextInt();
		System.out.print("Digite a nota de Português: ");
		Integer notaPortg = scan.nextInt();
		System.out.println("==============================================================");
		
		Boolean aprovadoMatem = notaMatem >= NOTA_MINIMA_MATERIAS;
		Boolean aprovadoPortug = notaPortg >= NOTA_MINIMA_MATERIAS;

		Boolean ResultadoFinal = (notaMatem + notaPortg) > +NOTA_MINIMA_PARA_APROVACAO;

		Boolean aprovado = aprovadoMatem && aprovadoPortug && ResultadoFinal;

		if (aprovado) {
			System.out.println("O candidato " + nome + " está aprovado no concurso !");
		} else {
			System.out.println("O candidato " + nome + " NÃO está aprovado no concurso !");
		}

		System.out.println("==============================================================");
		System.out.println("FIM do Programa !!");
		System.out.println("--------------------------------------------------------------");

		scan.close();

	}

}
