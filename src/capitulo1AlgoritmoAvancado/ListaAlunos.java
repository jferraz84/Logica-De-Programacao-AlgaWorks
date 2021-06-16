package capitulo1AlgoritmoAvancado;

public class ListaAlunos {

	static final int QUANTIDADE_LISTA = 5;

	Aluno[] lista = new Aluno[QUANTIDADE_LISTA];

	int tamanhoLista = 0;

	Aluno obter(int indice) {
		return lista[indice];

	}

	int tamanho() {
		return tamanhoLista;

	}

	void adicionar(Aluno aluno) {
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

	void remover(Aluno aluno) {

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

	void delete(int indice) {
		int indiceInicial = indice + 1;

		for (int i = indiceInicial; i < tamanhoLista; i++) {
			lista[i - 1] = lista[indiceInicial];
		}

		tamanhoLista--;
		lista[tamanhoLista] = null;

	}

}
