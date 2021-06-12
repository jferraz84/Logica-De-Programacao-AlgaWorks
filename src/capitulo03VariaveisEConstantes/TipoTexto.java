package capitulo03VariaveisEConstantes;

import java.util.Scanner;

public class TipoTexto {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual é o seu Primeiro nome ?");
		System.out.print("R: ");
		String nome = scan.nextLine();
		
		System.out.println("Qual é o seu Sobrenome nome ?");
		System.out.print("R: ");
		String sobreNome = scan.nextLine();
		
		
		System.out.println("Olá " + nome + " " + sobreNome + " seja bem vindo !!");
		
		scan.close();

	}

}
