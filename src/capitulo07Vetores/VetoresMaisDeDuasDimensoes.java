package capitulo07Vetores;

public class VetoresMaisDeDuasDimensoes {

	public static void main(String[] args) {

		Double[] faturamentoJan = new Double[] { 1500.0, 2000.0, 1700.0 };
		Double[] faturamentoFev = new Double[] { 1200.0, 1000.0, 1900.0 };

		Double[][] faturamentoAnual = new Double[][] {faturamentoJan, faturamentoFev};

		Double[][][] faturamentoQuinquenal = new Double[][][] {faturamentoAnual};

		Double[][][][] faturamentoDaDecada = new Double[][][][] {faturamentoQuinquenal};
		
		
		for (int i = 0; i < faturamentoAnual.length; i++) {
			System.out.println("Mês: " + (i + 1));

			Double[] mes = faturamentoAnual[i];

			for (int j = 0; j < mes.length; j++) {
				Double dia = mes[j];
				System.out.println("Dia " + (j + 1) + ": " + dia);
			}
		}
	}

}
