package capitulo08Metodos;

import java.util.Scanner;

public class RecebendoParametros {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		imprimirTraco();

		String[] cursos = new String[] { "Java EE", "Spring", "Java OO Avançado" };

		imprimir("Escolha dentre os cursos abaixo: ");

		iterarExibirPosicaoDoVetorString(cursos);

		Integer posCursoEscolhido = receberNumeroInteiroUsuario("O curso que você deseja é o: ", scan);

		if (!validaPosicaoEscolhida(posCursoEscolhido, cursos)) {
			posicaoInvalida();
		}

		imprimirTraco();

		String[] formasDePagamento = new String[] { "Cartão", "Boleto" };

		imprimir("Escolha dentre as formas de pagamento abaixo: ");

		iterarExibirPosicaoDoVetorString(formasDePagamento);

		Integer posicaoFormaDePagEscolhida = receberNumeroInteiroUsuario("Sua forma de pagamento será: ", scan);

		if (!validaPosicaoEscolhida(posicaoFormaDePagEscolhida, formasDePagamento)) {
			posicaoInvalida();
		}

		String cursoEScolhido = cursos[posCursoEscolhido];
		String formadDePagamEscolhida = formasDePagamento[posicaoFormaDePagEscolhida];

		imprimirTraco();
		imprimir("O curso ecolhido foi " + cursoEScolhido + " e a forma de pagamento será " + formadDePagamEscolhida);

		imprimirTraco();
		imprimir("FIM do Programa !!");
		imprimirTraco();

		scan.close();

	}

	static void imprimir(String texto) {
		System.out.println(texto);
	}

	static void imprimirTraco() {
		System.out.println("*************************************************************");
	}

	static void posicaoInvalida() {
		System.err.println("Posição Inválida !");
		System.exit(1);
	}

	static void iterarExibirPosicaoDoVetorString(String[] vetor) {
		iterarExibirPosicaoDoVetorString(vetor, 0);

	}

	// UTILIZANDO RECURSIVIDADE NESSE MÉTODO
	static void iterarExibirPosicaoDoVetorString(String[] vetor, Integer i) {
		imprimir("[" + i + "] " + vetor[i]);

		if (++i < vetor.length) {
			iterarExibirPosicaoDoVetorString(vetor, i);
		}

	}

	static Boolean validaPosicaoEscolhida(Integer posicao, String[] vetor) {

		Boolean valida = posicao >= 0 && posicao < vetor.length;

		return valida;

	}

	static void imprimiEContinuaNaMesmaLinha(String texto) {
		System.out.print(texto);
	}

	static Integer receberNumeroInteiroUsuario(String texto, Scanner scan) {
		imprimiEContinuaNaMesmaLinha(texto);
		Integer numero = scan.nextInt();

		return numero;
	}

}
