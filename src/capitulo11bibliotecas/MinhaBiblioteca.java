package capitulo11bibliotecas;

import console.Interacao;

public class MinhaBiblioteca {

	public static void main(String[] args) {
		
		Interacao interacao = new Interacao();
		
		Integer numero = interacao.lerNumero("Digite um numero: ");
		interacao.imprimir("Numero: "+ numero);
		
		Double decimal = interacao.lerNDecimal("Digite um numero: ");
		interacao.imprimir("Decimal: "+ decimal);
		
		interacao.imprimirErro("Esta é a Mensagem de ERRO! ");
		
		interacao.fechar();
		
		
	}

}
