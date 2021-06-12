package capitulo09POO;

import java.util.Scanner;

public class ProdutoRefatorado {

	static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;

	String nome;
	Double precoUnitario;
	Integer quantidade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return " Produto nome = " + nome + "\n Preço Unitario = " + precoUnitario + "\n Quantidade = " + quantidade;
	}

	public ProdutoRefatorado recebeInformacoesDoProduto(Scanner scan) {
		Scanner scan1 = new Scanner(System.in);
		ProdutoRefatorado produtoRefactor = new ProdutoRefatorado();

		imprimir("Digite o nome do Produto: ");
		produtoRefactor.setNome(scan1.next());
		imprimir("Digite valor unitário do Produto: ");
		produtoRefactor.setPrecoUnitario(scan1.nextDouble());
		imprimir("Digite a quantidade de estoque do Produto: ");
		produtoRefactor.setQuantidade(scan1.nextInt());
		imprimirTraco();

		scan1.close();
		
		verificaNecessidadedeReporEstoque(produtoRefactor);
		
		desejaContinuar(produtoRefactor);

		return produtoRefactor;
	}

	public void verificaNecessidadedeReporEstoque(ProdutoRefatorado produtoRefactor) {

		Boolean precisaReporEstoque = produtoRefactor.getQuantidade() < QUANTIDADE_MINIMA_ESTOQUE;

		if (!precisaReporEstoque) {
			imprimiEPulaLinha("O estoque ainda está tranquilo com " + produtoRefactor.getQuantidade() + " Produtos");
			imprimirTraco();
		} else {
			imprimiEPulaLinha(
					"O estoque precisa ser reposto urgente só temos: " + produtoRefactor.getQuantidade() + " produtos em estoque");
			imprimirTraco();
		}

	}
	
	public void desejaContinuar(ProdutoRefatorado produtoRefatorado) {
		Scanner resp1 = new Scanner(System.in);
		char resposta = 's';
		do {
			System.out.println("Deseja realizar outra Operação ? [ s, n ]");
			resposta = resp1.nextLine().charAt(0);
			produtoRefatorado.imprimirTraco();
			
		} while (resposta == 's' || resposta == 'S');
		
		produtoRefatorado.encerraPrograma();
		
		resp1.close();
	}

	public void imprimirTraco() {
		imprimiEPulaLinha("----------------------------------------------------------------");

	}

	public void imprimir(String texto) {
		System.out.print(texto);
	}

	public void imprimiEPulaLinha(String texto) {
		System.out.println(texto);
	}

	public void encerraPrograma() {
		System.out.println("==============================================================");
		System.out.println("FIM do Programa !!");
		System.out.println("==============================================================");
	}

}
