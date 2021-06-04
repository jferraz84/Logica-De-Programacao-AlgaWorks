package exercicios;

import java.util.Scanner;

public class TabuadaComRecursividadeExec19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		imprimirTraco();
		imprimir("Calculadora Simples com implemtação de métodos !!");
		imprimirTraco();

		char resposta = 's';

		do {

			Integer multiplicando = receberNumeroInteiroUsuario("Deseja saber a tabuada de qual nummero: ", scan);

			if (!valorDigitado(multiplicando)) {
				numeroInvalido();
			}

			imprimirTabuada(multiplicando, 1);

			imprimirTraco();
			System.out.print("Deseja realizar outra Operação ? [ s, n ]");
			resposta = scan.next().charAt(0);
			imprimirTraco();

		} while (resposta == 's' || resposta == 'S');

		System.out.println("---------------------------------");
		System.out.println("|Calculadora Jorge Finalizada !!|");
		System.out.println("---------------------------------");

		scan.close();

	}

	private static void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
		System.out.println(multiplicando + " X " + multiplicador + " = " + (multiplicando * multiplicador));

		if (++multiplicador <= 10) {
			imprimirTabuada(multiplicando, multiplicador);
		}

	}

	static void imprimir(String texto) {
		System.out.println(texto);
	}

	static void imprimirTraco() {
		System.out.println("*************************************************************");
	}

	static void imprimiEContinuaNaMesmaLinha(String texto) {
		System.out.print(texto);
	}

	static Integer receberNumeroInteiroUsuario(String texto, Scanner scan) {
		imprimiEContinuaNaMesmaLinha(texto);
		Integer numero = scan.nextInt();

		return numero;
	}

	static void numeroInvalido() {
		System.err.println("NUmero Inválido !");
		System.exit(1);
	}

	static Boolean valorDigitado(Integer numDigitado) {
		Boolean valido = numDigitado > 0;
		return valido;

	}

}
