package capitulo05EstruturaDeDecisao;

public class EstruturaIF {

	public static void main(String[] args) {
		
		Double emprestimo = 4000.0;
		Double movimentacaMedia = 2000.0;
		
//		Boolean movimentaPeloMenosMetadaDoValor = (movimentacaMedia * 2) >= emprestimo;
		
		Boolean ContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
//		Boolean liberarEmprestimo = movimentaPeloMenosMetadaDoValor 
//								 && ContaTemTempoSuficienteDeAbertura
//								 && temNomeLimpo;
		
		if(((movimentacaMedia * 2) >= emprestimo)
				&& ContaTemTempoSuficienteDeAbertura && temNomeLimpo) {
			System.out.println("Emprestimo Aprovado para o cliente !");
		} else {
			System.out.println("Cliente sem limite de crédito para emprestimo!");
		}

	}

}
