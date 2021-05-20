package capitulo06;

public class IteracaoFor {

	public static void main(String[] args) {
		
//		for (int i = 1; i <= 5; i++) {
//			System.out.println("Imprimindo uma frase qualquer a "+i+"° vez");
//			
//		}
		
//		Double [] carrinhoDeCompras = new Double[] {50.0, 50.0, 50.0};
//		
//		Double total = 0.0;
//		
//		for (int i = 0; i < carrinhoDeCompras.length; i++) {
//			total += carrinhoDeCompras[i];
//		}
//		
//		System.out.println("Total: "+ total);
		
		
//		for (int i = 1; i < 10; i++) {
//			if (i == 5) {
//				System.out.println("Sistema paralizado na " +i+"° rodada");
//				break;
//			}
//			System.out.println("Iteração: " + i);
//		}
		
//		for (int i = 1; i < 10; i++) {
//			if (i == 5) {
//				System.out.println("Não vai mais parar na "+i+"° volta");
//				continue;
//			}
//			System.out.println("Iteração: " + i);
//		}
		
		Integer[] produtos = new Integer[] {100, 225, 300};
		
		for (int i = 0; i < produtos.length; i++) {
			Integer produto = produtos[i];
			System.out.println("Produto de codigo: " + produto);
			
			if (produto.equals(225)) {
				System.out.println("Produto selecionado na base de código: " + produto);
				break;
			}
			//System.out.println("Saindo do FOR porduto encontrado.");
		}
		

	}

}
