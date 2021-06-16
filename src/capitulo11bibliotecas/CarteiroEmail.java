package capitulo11bibliotecas;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class CarteiroEmail {

	public static void enviar(String assunto, String msg, String para) throws EmailException {
		
		Email email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator("jferrazjorge", "Hha170627"));
		email.setSSLOnConnect(true);
		email.setFrom("jferrazjorge@gmail.com");
		email.setSubject(assunto);
		email.setMsg(msg);
		email.addTo(para);
		email.send();
		
//		email.setFrom("jferrazjorge@gmail.com");
//		email.setSubject("Aula sobre o uso de bibliotecas de terceiros no Java");
//		email.setMsg("Se estiver vendo esse email é porque o teste de envio da minha aula envio funcionou");
//		email.addTo("aferraz@cpqd.com.br");
		
	}
}
