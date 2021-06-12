package exercicios;

import java.util.Scanner;

public class PedidoApplicationExec23B {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		PedidoExec23A pedido = new PedidoExec23A();

		System.out.println("-------------------------------------------------------------------");
		System.out.println("======= Verificação de Quantidade e Valor final de Produtos =======");
		System.out.println("-------------------------------------------------------------------");

		pedido.recebeInformacoesDoPedido(scan);
		

		scan.close();
	}

}
