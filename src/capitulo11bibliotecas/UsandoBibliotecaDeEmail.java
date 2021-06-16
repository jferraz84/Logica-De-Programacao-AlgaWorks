package capitulo11bibliotecas;

import org.apache.commons.mail.EmailException;

public class UsandoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		
		
		CarteiroEmail.enviar("Aula sobre o uso de bibliotecas de terceiros no Java", 
									"Se estiver vendo esse novo email é porque o teste de Refactor de ENVIO da minha aula envio funcionou", 
									"aferraz@cpqd.com.br");
		
		System.out.println("Fim ...!");
		
	}
}
