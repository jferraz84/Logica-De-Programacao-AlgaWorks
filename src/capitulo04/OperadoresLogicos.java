package capitulo04;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		Boolean carrinhoMaiorQueCem = false;
		Boolean periodoPromocao = false;
		Boolean jaFezCompraNaLoja = true;
		Boolean pagamentoAVista = true;
		
//		Boolean aplicarDesconto = carrinhoMaiorQueCem && periodoPromocao;
//		
//		Boolean aplicarDesconto = carrinhoMaiorQueCem || periodoPromocao;
//		
//		Boolean aplicarDesconto = periodoPromocao || carrinhoMaiorQueCem || jaFezCompraNaLoja;
//		
//		Boolean aplicarDesconto = periodoPromocao && carrinhoMaiorQueCem || jaFezCompraNaLoja;
		
		Boolean aplicarDesconto = periodoPromocao && (carrinhoMaiorQueCem || jaFezCompraNaLoja) && pagamentoAVista;
		
		if (aplicarDesconto) {
			System.out.println("Sim! Aplique o desconto !");
		} else {
			System.out.println("Não aplique o desconto !");
		}

	}

}
