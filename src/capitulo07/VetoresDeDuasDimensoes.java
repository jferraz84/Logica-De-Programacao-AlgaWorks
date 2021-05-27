package capitulo07;

public class VetoresDeDuasDimensoes {

	public static void main(String[] args) {
		
		//Double faturamentoDoDia = 1000.0;
		
		Double[] faturamentoJan = new Double[] {1500.0, 2000.0, 1700.0};
		Double[] faturamentoFev = new Double[] {1200.0, 1000.0, 1900.0};
		Double[] faturamentoMar = new Double[] {1550.0, 2100.0, 1600.0};
		Double[] faturamentoAbr = new Double[] {1590.0, 2900.0, 2700.0};
		
		
		Double[][] faturamentoAnual = new Double[][] {faturamentoJan, faturamentoFev, faturamentoMar, faturamentoAbr};
//		
//		System.out.println("Faturamento do dia 1 de Janeiro: " + faturamentoAnual[0][0]);
//		System.out.println("Faturamento do dia 15 de Fever : " + faturamentoAnual[1][1]);
//		System.out.println("Faturamento do dia 28 de Março : " + faturamentoAnual[2][2]);
//		System.out.println("Faturamento do dia 12 de Abril : " + faturamentoAnual[3][1]);
		
		
		for (int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("Mês: " + (i + 1));
			
			Double[] mes = faturamentoAnual[i];
			
			for (int j = 0; j < mes.length; j++) {
				Double dia = mes[j];
				System.out.println("Dia " + (j + 1)+ ": " + dia);
			}
		}
		
	}

}
