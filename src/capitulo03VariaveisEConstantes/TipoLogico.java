package capitulo03VariaveisEConstantes;

public class TipoLogico {

	public static void main(String[] args) {

		Boolean variavelVerdadeira = true;
		System.out.println("Váriavel verdadeira: " + variavelVerdadeira);

		Boolean variavelFalsa = false;
		System.out.println("Váriavel falsa: " + variavelFalsa);

		System.out.println("------------------------------------------------------");

		Integer idade = 20;

		Boolean podeDirigir = idade >= 18;

		System.out.println("Pode dirigir ? ");
		
		if (podeDirigir) {
			System.out.println("Sim essa pessoa pode dirigir !");

		} else {
			System.out.println("Não, infelizmente ainda não pode dirigir");
		}

	}

}
