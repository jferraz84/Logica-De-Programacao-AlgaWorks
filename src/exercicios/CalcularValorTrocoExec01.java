package exercicios;

import console.Interacao;

public class CalcularValorTrocoExec01 {

	public static void main(String[] args) {
		
		Interacao interacao = new Interacao();
		
		Double valorProduto = interacao.lerNDecimal("Digite o valor do Produto: R$ ");
		
		Double valorRecebido = interacao.lerNDecimal("Dinheiro recebido: R$ ");
		
		Double valorTroco = valorRecebido - valorProduto;
		
		interacao.imprimir("===============================");
		
		interacao.imprimir("Valor do troco é R$ " + valorTroco);
		
		interacao.fechar();
		
	}

}
