package exercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LerArquivosDeTarefaCriadoExec25 {

	public static void main(String[] args) throws IOException {
		
		Path arquivo = Paths.get("/home/jferraz/eclipse-workspace/ArquivosCursoLP/arquivoExec24.txt");
		
		List<String> tarefas = Files.readAllLines(arquivo);

		for (int i = 1; i < tarefas.size(); i++) {
			String tarefa = tarefas.get(i);
			System.out.println("Curso n° " + i + ": " + tarefa);
		}
		
	}

}
