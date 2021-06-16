package capitulo1AlgoritmoAvancado;

public class AlgoritmoAvancado {

	public static void main(String[] args) {
		
		ListaAlunos lista = new ListaAlunos();
		
		Aluno aluno1 = new Aluno();
		aluno1.nome = "Jorge";
		lista.adicionar(aluno1);
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Aline";
		lista.adicionar(null);
		
		Aluno aluno3 = new Aluno();
		aluno3.nome = "Helo";
		lista.adicionar(aluno3);
		
		Aluno aluno4 = new Aluno();
		aluno4.nome = "Heloa";
		lista.adicionar(aluno4);	

		for (int i = 0; i < lista.tamanho(); i++) {
			Aluno alun = lista.obter(i) ;
			if (alun != null) {
				System.out.println("Aluno: " + alun.nome);				
			} else {
				System.out.println("Aluno sem nome !!");
			}
		}
		
		System.out.println("--------------------");
		
		lista.remover(aluno2);
		
		for (int i = 0; i < lista.tamanho(); i++) {
			Aluno alun = lista.obter(i) ;
			
			if (alun != null) {
				System.out.println("Aluno: " + alun.nome);				
			} else {
				System.out.println("Aluno sem nome !!");
			}
		}
	}

}
