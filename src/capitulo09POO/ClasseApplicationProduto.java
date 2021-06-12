package capitulo09POO;

public class ClasseApplicationProduto {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.nome = "PS5";
		produto.precoUnitario = 5000.00;
		produto.quantidade = 150;
		
		exibirQuantidadeEmEstoque(produto);
		
	}
	
	static void exibirQuantidadeEmEstoque(Produto produto){
//		System.out.println("Nome do produto: " + produto.nome);
//		System.out.println("Valor Unitário: " + produto.precoUnitario);
//		System.out.println("Quantidade em estoque: " + produto.quantidade);
		
		System.out.println(produto.toString());
	}

}
