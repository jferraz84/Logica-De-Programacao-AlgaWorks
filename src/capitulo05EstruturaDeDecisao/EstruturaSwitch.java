package capitulo05EstruturaDeDecisao;

import java.util.Scanner;

public class EstruturaSwitch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Double desconto = 0.0;

		System.out.print("Digite o mês [1 á 12] que deseja viajar e veja seu desconto: ");
		Integer mes = scan.nextInt();

		switch (mes) {
		case 1:
			desconto = 0.0;
			break;
		case 2:
			desconto = 0.0;
			break;
		case 3:
			desconto = 15.0;
			break;
		case 4:
			desconto = 30.0;
			break;
		case 5:
			desconto = 30.0;
			break;
		case 6:
			desconto = 10.0;
			break;
		case 7:
			desconto = 10.0;
			break;
		case 8:
			desconto = 10.0;
			break;
		case 9:
			desconto = 10.0;
			break;
		case 10:
			desconto = 20.0;
			break;
		case 11:
			desconto = 10.0;
			break;
		case 12:
			desconto = 0.0;
			break;

		default:
			System.err.println("Digite um numero de mês válido !!");
			System.exit(1);
			break;
		}
		
		System.out.println("Seu desconto será de: "+ desconto + "%");

		scan.close();

	}

}
