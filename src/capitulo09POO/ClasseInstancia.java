package capitulo09POO;

public class ClasseInstancia {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.setNome("PS5");
		System.out.println("Produto 1:" + produto.getNome());
		
		Produto prod2 = new Produto();
		prod2.setNome("Carteira");
		
		System.out.println("Produto 2:" + prod2.getNome());

	}

}
