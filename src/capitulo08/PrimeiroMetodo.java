package capitulo08;

import java.util.Scanner;

public class PrimeiroMetodo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		imprimirTraco();
		
		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

		System.out.println("Escolha dentre os cursos abaixo: ");

		for (int i = 0; i < cursos.length; i++) {
			System.out.println("[" + i + "] " + cursos[i]);
		}

		System.out.print("O curso que você deseja é o: ");
		Integer posCursoEscolhido = scan.nextInt();

		Boolean posicaoValida = posCursoEscolhido >= 0 && posCursoEscolhido < cursos.length;

		if (!posicaoValida) {
			posicaoInvalida();
		}

		imprimirTraco();

		String[] formasDePagamento = new String[] { "Cartão", "Boleto" };

		System.out.println("Escolha dentre as formas de pagamento abaixo: ");

		for (int i = 0; i < formasDePagamento.length; i++) {
			System.out.println("[" + i + "] " + formasDePagamento[i]);
		}

		System.out.print("Sua forma de pagamento será: ");
		Integer posicaoFormaDePagEscolhida = scan.nextInt();

		Boolean formaPagValida = posicaoFormaDePagEscolhida >= 0
				&& posicaoFormaDePagEscolhida < formasDePagamento.length;

		if (!formaPagValida) {
			posicaoInvalida();
		}

		String cursoEScolhido = cursos[posCursoEscolhido];
		String formadDePagamEscolhida = formasDePagamento[posicaoFormaDePagEscolhida];

		imprimirTraco();

		System.out.println(
				"O curso ecolhido foi " + cursoEScolhido + " e a forma de pagamento será " + formadDePagamEscolhida);

		imprimirTraco();
		System.out.println("FIM do Programa !!");
		imprimirTraco();

		scan.close();

	}

	static void imprimirTraco() {
		System.out.println("*************************************************************");
	}
	
	static void posicaoInvalida() {
		System.err.println("Posição Inválida !");
		System.exit(1);
	}

}
