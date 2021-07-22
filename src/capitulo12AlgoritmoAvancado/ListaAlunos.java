package capitulo12AlgoritmoAvancado;

public class ListaAlunos {

	static final int QUANTIDADE_LISTA = 5;

	Aluno[] lista = new Aluno[QUANTIDADE_LISTA];

	int tamanhoLista = 0;

	public Aluno obter(int indice) {
		return lista[indice];

	}

	public int tamanho() {
		return tamanhoLista;

	}

	public void adicionar(Aluno aluno) {
		if (tamanhoLista == lista.length) {
			Aluno[] novaLista = new Aluno[QUANTIDADE_LISTA + lista.length];

			for (int i = 0; i < lista.length; i++) {
				novaLista[i] = lista[i];
			}

			lista = novaLista;
		}

		lista[tamanhoLista] = aluno;
		tamanhoLista++;
	}

	public void remover(Aluno aluno) {

		for (int i = 0; i < tamanhoLista; i++) {
			Aluno aln = lista[i];

			if (aln != null && aln.equals(aluno)) {
				delete(i);
				break;
			} else if (aln == null && aluno == null) {
				delete(i);
				break;
			}
		}
	}

	public void delete(int indice) {
		int indiceInicial = indice + 1;

		for (int i = indiceInicial; i < tamanhoLista; i++) {
			lista[i - 1] = lista[i];
		}

		tamanhoLista--;
		lista[tamanhoLista] = null;

	}

	public void ordenar() {
		
		System.out.println("INICIO ORDENAÇÃO  **************************");
		System.out.println("For ****************************************");
		for (int i = 1; i < tamanhoLista; i++) {
			Aluno alunoPosicaoBase = lista[i];
			System.out.println("Posição Base " + i + ": " + alunoPosicaoBase.getNome() );
			int indicePosicaoBase = i;
			
			while (indicePosicaoBase > 0) {
				System.out.println("Inicio WHILE ***********************");
				int indicePosicaoAnterior = indicePosicaoBase - 1;
				Aluno alunoPosicaoAnterior = lista[indicePosicaoAnterior];
				System.out.println("Posição anterior " + indicePosicaoAnterior + ": " + alunoPosicaoAnterior.getNome() );
				
				Boolean alunoPosicaoAnteriorVemDepoisDE = alunoPosicaoAnterior == null 
												|| alunoPosicaoAnterior.vemDepoisDe(alunoPosicaoBase);
				
				if (alunoPosicaoAnteriorVemDepoisDE) {
					System.out.println("Entrou no IF agora");
					lista[indicePosicaoBase] = lista[indicePosicaoAnterior];
					
					indicePosicaoBase--;
				} else {
					break;
				}
			}
			
			lista[indicePosicaoBase] = alunoPosicaoBase;
			System.out.println("Trocou a posição Base para = " + alunoPosicaoBase.getNome() );
		}
		System.out.println("******* Fim da Ordenação ********************");

	}

}
