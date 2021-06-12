package capitulo07Vetores;

import java.util.Scanner;

public class Vetores1Dimensao {

	public static void main(String[] args) {
//
//		String[] cardapioPizzas = new String[] { "Calabresa", "Margerita", "Queijo", "Presunto" };
//
//		System.out.println("Escolha o sabor de sua pizza:");
//
//		for (int i = 0; i < cardapioPizzas.length; i++) {
//
//			System.out.println("[" + i + "]: " + cardapioPizzas[i]);
//		}
//		
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("Digite o numero referente ao sabor escolhido");
//		System.out.print("R: ");
//		Integer saborEscolhido = scan.nextInt();
//		
//		System.out.println("Você escolheu o sabor: " + cardapioPizzas[saborEscolhido]);
//		
//		scan.close();

//		String[] cardapioPizzas = new String[] { "Calabresa", "Margerita", "Queijo", "Presunto" };
//
//		cardapioPizzas[3] = "Frango";
//
//		for (int i = 0; i < cardapioPizzas.length; i++) {
//			System.out.println(cardapioPizzas[i]);
//		}
		
		String[] cardapioPizzas = new String[4];
		
		cardapioPizzas[0] = "Calabresa";
		cardapioPizzas[1] = "Margerita";
		cardapioPizzas[2] = "Queijo";
		cardapioPizzas[3] = "Frango";
		
		for (int i = 0; i < cardapioPizzas.length; i++) {
			System.out.println(cardapioPizzas[i]);
		}
		
		
		

	}

}
