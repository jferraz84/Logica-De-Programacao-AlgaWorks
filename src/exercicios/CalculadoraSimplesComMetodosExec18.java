package exercicios;

import java.util.Scanner;

public class CalculadoraSimplesComMetodosExec18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		imprimirTraco();
		imprimir("Calculadora Simples com implemtação de métodos !!");
		imprimirTraco();

		char resposta = 's';

		do {

			Integer primValor = receberNumeroInteiroUsuario("Digite um nummero: ", scan);

			if (!valorDigitado(primValor)) {
				numeroInvalido();
			}

			imprimirTraco();
			Integer escolhaOperacao = receberNumeroInteiroUsuario(
					"Digite a Operação desejada [ 1-soma, 2-subtração, 3-multiplicação, 4-divisão ]: ", scan);
			imprimirTraco();

			if (!valorDigitadoParaOperacao(escolhaOperacao)) {
				numeroInvalido();
			}


			Integer segValor = receberNumeroInteiroUsuario("Digite mais um nummero: ", scan);

			if (!valorDigitado(segValor)) {
				numeroInvalido();
			}

			imprimirTraco();

			switch (escolhaOperacao) {

			case 1:
				somaValores(primValor, segValor);
				break;

			case 2:
				subtraiValores(primValor, segValor);
				break;

			case 3:
				multiplicaValores(primValor, segValor);
				break;

			case 4:
				divideValores(primValor, segValor);
				break;

			default:
				break;
			}
			
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

	static Integer somaValores(Integer primValor, Integer segValor) {
		Integer resultadoSoma = primValor + segValor;
		System.out.println("Resultado da soma: " + resultadoSoma);

		return resultadoSoma;
	}

	static Integer subtraiValores(Integer primValor, Integer segValor) {
		Integer resultadoSubtracao = primValor - segValor;
		System.out.println("Resultado  da subtracao: " + resultadoSubtracao);

		return resultadoSubtracao;
	}

	static Integer divideValores(Integer primValor, Integer segValor) {
		Integer resultadoDivisao = primValor / segValor;
		System.out.println("Resultado da divisão: " + resultadoDivisao);

		return resultadoDivisao;
	}

	static Integer multiplicaValores(Integer primValor, Integer segValor) {
		Integer resultadoMultiplicacao = primValor * segValor;
		System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);

		return resultadoMultiplicacao;
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
	
	static Boolean valorDigitadoParaOperacao(Integer operacaoigitado) {
		Boolean valido = operacaoigitado > 0 && operacaoigitado <= 4 ;
		return valido;

	}

}
