package capitulo08;

public class RetornandoValores {

	public static void main(String[] args) {
		
		// 50 ---- 100%
		// x ----- 20%
		
		// 50 * 20 = x * 100
		// x = ( 50 * 20 ) / 100	
		
		Double[] premissaInicial = new Double[] {35.0, 100.0};	
		Double proporcao = 25.0;
		
		Double resultadoFinal = regraDeTres(premissaInicial, proporcao);
		
		System.out.println("Resultado: " + resultadoFinal);
		System.out.println("Prova real: "+ (resultadoFinal * 4));
		
	}
	
	static Double regraDeTres(Double[] premissa, Double proporcao) {
		Double resultado = (premissa[0] * proporcao) / premissa[1];
		
		return resultado;
	}

}
