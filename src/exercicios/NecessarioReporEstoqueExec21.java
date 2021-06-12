package exercicios;

import java.util.Scanner;

import capitulo09POO.Produto;

public class NecessarioReporEstoqueExec21 {

	static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("----------------------------------------------------------------");
		System.out.println("======= Verificação de Quantidade de produtos em Estoque =======");
		System.out.println("----------------------------------------------------------------");

		char resposta = 's';

		do {
			recebeInformacoesDoProduto(scan);

			
			System.out.print("Deseja realizar outra Operação ? [ s, n ]");
			resposta = scan.next().charAt(0);
			imprimirTraco();

		} while (resposta == 's' || resposta == 'S');

		encerraPrograma();

		scan.close();

	}

	static void imprimirTraco() {
		imprimiEPulaLinha("----------------------------------------------------------------");

	}

	static Produto recebeInformacoesDoProduto(Scanner scan) {
		Produto produto = new Produto();

		imprimir("Digite o nome do Produto: ");
		produto.setNome(scan.next());
		imprimir("Digite valor unitário do Produto: ");
		produto.setPrecoUnitario(scan.nextDouble());
		imprimir("Digite a quantidade de estoque do Produto: ");
		produto.setQuantidade(scan.nextInt());
		imprimirTraco();

		verificaNecessidadedeReporEstoque(produto);

		return produto;
	}

	static void verificaNecessidadedeReporEstoque(Produto produto) {

		Boolean precisaReporEstoque = produto.getQuantidade() < QUANTIDADE_MINIMA_ESTOQUE;

		if (!precisaReporEstoque) {
			imprimiEPulaLinha("O estoque ainda está tranquilo com " + produto.getQuantidade() + " Produtos");
			imprimirTraco();
		} else {
			imprimiEPulaLinha("O estoque precisa ser reposto urgente só temos: " + produto.getQuantidade()
					+ " produtos em estoque");
			imprimirTraco();
		}

	}

	static void imprimir(String texto) {
		System.out.print(texto);
	}

	static void imprimiEPulaLinha(String texto) {
		System.out.println(texto);
	}

	static void encerraPrograma() {
		System.out.println("==============================================================");
		System.out.println("FIM do Programa !!");
		System.out.println("==============================================================");
	}

}
