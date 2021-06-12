package exercicios;

import java.util.Scanner;

import capitulo09POO.ProdutoRefatorado;

public class NecessarioReporEstoqueRefatoradoExec22 {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ProdutoRefatorado produtoRefatorado = new ProdutoRefatorado();

		System.out.println("----------------------------------------------------------------");
		System.out.println("======= Verificação de Quantidade de produtos em Estoque =======");
		System.out.println("----------------------------------------------------------------");

				
			produtoRefatorado.recebeInformacoesDoProduto(scan);
						
			
		
		scan.close();

	}

}
