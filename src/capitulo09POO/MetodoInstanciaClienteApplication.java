package capitulo09POO;

public class MetodoInstanciaClienteApplication {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.primeiroNome = "Jorge";
		cliente.sobreNome = "Ferraz";
		cliente.telefone = "1998126-3881";
		cliente.email = "jferraz@cpqd.com.br";
		
		System.out.println("Nome do cliente: "+ cliente.nomeCompleto() + ", DDD: " + cliente.obterDDD());
	}

}
