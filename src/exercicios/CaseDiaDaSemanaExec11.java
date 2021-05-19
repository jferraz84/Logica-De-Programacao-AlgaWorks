package exercicios;

import java.util.Scanner;

public class CaseDiaDaSemanaExec11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);


		System.out.print("Digite um numero [1 á 7] para saber qual dia da semana ele equivale: ");
		Integer diaSemana = scan.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.println("Hoje é Domingo");
			break;
		case 2:
			System.out.println("Hoje é Segunda Feira");
			break;
		case 3:
			System.out.println("Hoje é Terça Feira");
			break;
		case 4:
			System.out.println("Hoje é Quarta Feira");
			break;
		case 5:
			System.out.println("Hoje é Quinta Feira");
			break;
		case 6:
			System.out.println("Hoje é Sexta Feira");
			break;
		case 7:
			System.out.println("Hoje é Sábado");
			break;
		
		default:
			System.err.println("Digite um numero de mês válido !!");
			System.exit(1);
			break;
		}

		scan.close();

	}

}
