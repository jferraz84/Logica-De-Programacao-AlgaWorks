package capitulo03;

import java.util.Scanner;

public class Constantes {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// Transformando uma variavel em CONSTANTE
		final Integer idadeMinimaParaHabilitacao = 18;
		
		System.out.print("Qual a sua idade: ");
		Integer idade = scan.nextInt();

		Boolean podeDirigir = idade >= idadeMinimaParaHabilitacao;

		
		if (podeDirigir) {
			System.out.println("Sim essa pessoa pode dirigir !");

		} else {
			System.out.println("Não, infelizmente ainda não pode dirigir !");
		}
		
		scan.close();

	}

}
