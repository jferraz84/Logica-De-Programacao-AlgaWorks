package capitulo08;

public class Recursividade {

	public static void main(String[] args) {
		
		String[] alunos = new String[] {"Jorge", "Aline", "Helo"};
		
		iterarNomes(alunos, 0);
		
	}
	
	static void iterarNomes(String[] alunos, Integer i) {
		System.out.println("Aluno: " + alunos[i]);
		
		if (++i < alunos.length) {
			iterarNomes(alunos, i);
		}
	}
	
//	static void imprimirNumero(Integer numero) {
//		System.out.println("Numero: " + numero);
//		
//		if (numero < 10) {
//			imprimirNumero(++numero);
//			
//		}
//		
//	}

}
