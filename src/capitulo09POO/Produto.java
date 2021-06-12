package capitulo09POO;

public class Produto {
	

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

}
