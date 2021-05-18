package exercicios;

import java.util.Scanner;

public class CalculoIMCExec02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o seu  peso: ");
		Double peso = scan.nextDouble();
		
		System.out.print("Digite sua altura: ");
		Double altura = scan.nextDouble();
		
		Double imc = peso / (altura * altura);
		
		System.out.println("Seu IMC é de: " + String.format("%1$,.2f", + imc));
		
		System.out.println("=============================");
		System.out.println("FIM !!!!");
		
		scan.close();

	}

}
