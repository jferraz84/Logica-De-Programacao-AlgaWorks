package capitulo09POO;

public class Encapsulamento {

	public static void main(String[] args) {
		
		// ENCAPSULANDO A CLASSE CLIENTE
		Cliente cliente = new Cliente();
		
		cliente.setPrimeiroNome("Jorge");
		cliente.setSobreNome("Ferraz");
		cliente.setTelefone("98126-3881");
		cliente.setEmail("jferraz@cpqd.com.br");
		//cliente.setNomeCompleto(cliente.getPrimeiroNome() + cliente.getSobreNome());
		
		System.out.println(cliente.toString());
		
		
	}

}
