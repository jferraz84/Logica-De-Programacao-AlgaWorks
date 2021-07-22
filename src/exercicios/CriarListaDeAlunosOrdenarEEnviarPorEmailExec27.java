package exercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.mail.EmailException;

import capitulo11bibliotecas.CarteiroEmail;
import capitulo12AlgoritmoAvancado.Aluno;
import capitulo12AlgoritmoAvancado.ListaAlunos;

public class CriarListaDeAlunosOrdenarEEnviarPorEmailExec27 {

	public static void main(String[] args) throws IOException, EmailException {
		
		CarteiroEmail email = new CarteiroEmail();
		
		Path arquivoAlunos = Paths.get("/home/jferraz/eclipse-workspace/ArquivosCursoLP/arquivoAlunosExec27.txt");
		
		List<String> nomes = Files.readAllLines(arquivoAlunos);
		
		ListaAlunos listaAlunos = new ListaAlunos();
		
		for (int i = 0; i < nomes.size(); i++) {
			String nome = nomes.get(i);
			
			Aluno aluno = new Aluno();
			aluno.setNome(nome);
			
			listaAlunos.adicionar(aluno);
		}
		
		listaAlunos.ordenar();
		
		String mensagem = "Os alunos são \n";
		
		for (int i = 0; i < listaAlunos.tamanho(); i++) {
			Aluno aluno = listaAlunos.obter(i);
			mensagem += (i + 1) + ". " + aluno.getNome() + "\n";
		}
		
		email.enviar("Lista de Alunos", mensagem, "aferraz@cpqd.com.br");
		
		System.out.println("Enviado !");
		
	}
	
	

}
