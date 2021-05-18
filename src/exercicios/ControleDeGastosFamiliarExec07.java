package exercicios;

import java.util.Scanner;

public class ControleDeGastosFamiliarExec07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Double gastoTotal = 0.0;
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("======= Controle de despesas dda familia Ferraz !!! =======");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Digite o mês atual !");
		System.out.print("R: ");
		String mesAtual = scan.nextLine();
		
		System.out.print("Digite o valor da conta de Energia Elétrica: R$");
		gastoTotal += scan.nextDouble();
		System.out.print("Digite o valor da conta de Água: R$");
		gastoTotal += scan.nextDouble();
		System.out.print("Digite o valor da conta de Telefone: R$");
		gastoTotal += scan.nextDouble();
		System.out.print("Digite o valor da conta de Escola filhas: R$");
		gastoTotal += scan.nextDouble();
		System.out.print("Digite o valor da conta de Cartão de Crédito: R$");
		gastoTotal += scan.nextDouble();
		System.out.print("Digite o valor dos Gastos de Supermercado: R$");
		gastoTotal += scan.nextDouble();
		
		  //FIZ ASSIM ANTES DE VER A CORREÇÃO
		//Double gastoTotal = contaEnerg += contaAgua += contaTelef += contaEscola += contaCartCred += contaSuperm;
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("O gasto total do mês de " + mesAtual +" é de R$ " + gastoTotal );
		System.out.println("--------------------------------------------------------------");
		System.out.println("FIM do Programa !!");
		System.out.println("--------------------------------------------------------------");
		
		
		scan.close();

	}

}
