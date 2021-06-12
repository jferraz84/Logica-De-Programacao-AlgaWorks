package exercicios;

import java.util.Scanner;

public class PedidoExec23A {

	static final Double VALOR_TOTAL_PARA_DESCONTO = 50.0;

	Integer codigo;
	Double subTotal;
	Integer quantidade;
	Double desconto;
	Double total;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public PedidoExec23A recebeInformacoesDoPedido(Scanner scan) {
		Scanner scan1 = new Scanner(System.in);
		PedidoExec23A pedido = new PedidoExec23A();

		char resp = 's';

		do {
			imprimir("Digite o código do Produto: ");
			pedido.setCodigo(scan1.nextInt());
			imprimir("Digite a quantidade do Produto: ");
			pedido.setQuantidade(scan1.nextInt());
			imprimir("Digite valor unitário do Produto: ");
			pedido.setSubTotal(scan1.nextDouble());

			imprimirTraco();

			calculaDesconto(pedido);

			System.out.println("Deseja realizar outra Operação ? [ s, n ]");
			resp = scan1.next().charAt(0);
			pedido.imprimirTraco();

		} while (resp == 's' || resp == 'S');

		pedido.encerraPrograma();

		scan1.close();

		return pedido;
	}

	public void calculaDesconto(PedidoExec23A pedido) {
		Double valorDaCompra = pedido.getQuantidade() * pedido.getSubTotal();

		Boolean temDesconto = valorDaCompra > VALOR_TOTAL_PARA_DESCONTO;

		setTotal(valorDaCompra);
		Double valorDesc = 15.0;

		if (temDesconto) {
			Double valorFinalProduto = valorDaCompra - valorDesc;
			setTotal(valorFinalProduto);
			System.out.println("SubTotal: R$ " + valorDaCompra);
			System.out.println("O valor final da sua compra com o frete grátis e com Desconto será de: R$ " + valorFinalProduto);
			pedido.imprimirTraco();
		} else {
			System.out.println("O valor final da sua compra será de: R$ " + valorDaCompra);
			pedido.imprimirTraco();
		}

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
