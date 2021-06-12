package capitulo09POO;

public class Cliente {

	String primeiroNome;
	String sobreNome;
	String telefone;
	String email;

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cliente Primeiro Nome = " + primeiroNome + "\nsobreNome = " + sobreNome + "\nTelefone = " + telefone
				+ "\nEmail = " + email + "\nNome Completo = " + nomeCompleto();
	}

	String nomeCompleto() {
		String nomeCompleto = primeiroNome + " " + sobreNome;

		return nomeCompleto;
	}

	String obterDDD() {
		String ddd = telefone.substring(0, 2);
		return ddd;
	}

}
