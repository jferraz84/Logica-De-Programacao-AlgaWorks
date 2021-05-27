package exercicios;

import java.util.Scanner;

public class CadastroDeTarefasExec14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] tarefas = new String[5];

		System.out.println("------------------------------------------------------------");
		System.out.println("=======  Programa para cadastrar as atividades diarias =====");
		System.out.println("------------------------------------------------------------");

		for (int i = 1; i < tarefas.length; i++) {
			System.out.print(i+"°: Tarefa =  ");
			tarefas[i] = scan.nextLine();
		}
		
		System.out.println("=====================================================================");
		System.out.println("As suas tarefas mais Importantes são: ");
		
		// ANTES DA CORREÇÃO
//		int i = 0;
//		
//		while (i < tarefas.length) {
//			String minhasTarefas = tarefas[i];
//			System.out.println(minhasTarefas);
//			i++;
//
//		}
		
		// DEPOIS DA CORREÇÃO
		for (int i = 1; i < tarefas.length; i++) {
			System.out.println(tarefas[i]);
		}
		
		System.out.println("=====================================================================");

		scan.close();

	}

}
