package capitulo10LeituraEscritaArquivos;

import java.util.Scanner;

public class Interação {
	
	Scanner scan = new Scanner(System.in);
	
	public Integer lerNumero(String texto) {
		System.out.print("Digite um número");
		return scan.nextInt();
	}
	
	public Double lerNDecimal(String texto) {
		System.out.print("Digite um número");
		return scan.nextDouble();
	}
	
	public String lerLinha(String texto) {
		System.out.print("Digite um número");
		return scan.nextLine();
	}

	public void fechar() {
		scan.close();
	}
	
	public void imprimir(String texto) {
		System.out.println(texto);
	}
	
	public void imprimirErro(String texto) {
		System.err.println(texto);
	}
	
}
