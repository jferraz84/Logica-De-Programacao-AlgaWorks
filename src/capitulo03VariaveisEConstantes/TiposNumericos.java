package capitulo03VariaveisEConstantes;

import java.util.Scanner;

public class TiposNumericos {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);	
			
		System.out.print("Digite o numero para ter o seu quadrado: ");
		int numQuad = scan.nextInt();
		
		int resultado = numQuad * numQuad;
		
		System.out.println("O quadrado de " + numQuad + " é : " + resultado);
		
		
		scan.close();

	}

}
