package capitulo12AlgoritmoAvancado;

public class AlgoritmoAvancado {

	public static void main(String[] args) {
		
		ListaAlunos listaAlunos = new ListaAlunos();
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Jorge");
		listaAlunos.adicionar(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Helo");
		listaAlunos.adicionar(aluno2);
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Aline");
		listaAlunos.adicionar(aluno3);
		
		Aluno aluno4 = new Aluno();
		aluno4.setNome("Heloa");
		listaAlunos.adicionar(aluno4);
		
		Aluno aluno5 = new Aluno();
		aluno5.setNome("Ana Vitoria");
		listaAlunos.adicionar(aluno5);

		iterarAlunos(listaAlunos);
		
		listaAlunos.ordenar();
		
		iterarAlunos(listaAlunos);
		
		listaAlunos.remover(aluno2);
		
		iterarAlunos(listaAlunos);
		
	}
	
	static void iterarAlunos(ListaAlunos listaAlunos) {
		for (int i = 0; i < listaAlunos.tamanho(); i++) {
			Aluno alun = listaAlunos.obter(i) ;
			
			if (alun != null) {
				System.out.println("Aluno: " + alun.getNome());				
			} else {
				System.out.println("Aluno sem nome !!");
			}
		}
		
		System.out.println("--------------------");
	}

}
