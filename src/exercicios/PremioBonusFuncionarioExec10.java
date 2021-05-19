package exercicios;

import java.util.Scanner;

public class PremioBonusFuncionarioExec10 {
	
	static final Double META_FATURAMENTO = 150.000;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("======= Verificação de Resultado de Faturamento Anual =======");
		System.out.println("-------------------------------------------------------------");
		
		System.out.print("Qual foi o faturamento real da Empresa no ano: R$ ");
		Double fatAnual = scan.nextDouble();
		System.out.print("Digite a media salarial do funcionario: R$ ");
		Double mediaSalarial = scan.nextDouble();
		System.out.println("==============================================================");
		
		Double oitentaPorCentaDaMeta = (META_FATURAMENTO * 80) / 100;
		
		Double oitentaPorCentoDaMediaSalarial = (mediaSalarial * 80) / 100;
		
		Boolean bonus = fatAnual >= META_FATURAMENTO;
		
		if (bonus) {
			System.out.println("Por atingirmos a meta de faturamento todos ganharam um bonus de 100% no valor"
		           			+ " de R$ " + mediaSalarial + " equivalente a sua media salarial");
		} else if (fatAnual >= oitentaPorCentaDaMeta) {
			System.out.println("O bonus esse ano sera de apenas R$ "+ oitentaPorCentoDaMediaSalarial +  " 80%"
					         + " da media salarial dos funcionarios");
		} else {
			System.out.println("Ficamos abaixo de 80% da nossa meta, então não teremos nenhum bonus ");
		}
		
		System.out.println("==============================================================");
		System.out.println("FIM do Programa !!");
		System.out.println("--------------------------------------------------------------");
		
		scan.close();

	}

}
