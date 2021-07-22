package capitulo12AlgoritmoAvancado;

public class Aluno {
	
	private String nome;
	
	
	public boolean vemDepoisDe(Aluno aluno) {
		if (aluno == null) {
			return false;
		}
		
		return getNome().compareTo(aluno.getNome()) > 0;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

}
