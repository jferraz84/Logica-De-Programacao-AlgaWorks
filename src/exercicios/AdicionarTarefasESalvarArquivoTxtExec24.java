package exercicios;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class AdicionarTarefasESalvarArquivoTxtExec24 {

	public static void main(String[] args) throws IOException {

		Scanner digite = new Scanner(System.in);

		ArrayList<String> tarefas = new ArrayList<String>();
		System.out.println("Tarefas da Semana: ");
		String[] diaSemana = new String[] { "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" };

		tarefas.add("Cursos da semana: ");

		for (int i = 0; i < diaSemana.length; i++) {
			System.out.print("Curso de " + diaSemana[i] + ": ");
			String curso = digite.nextLine();
			tarefas.add(curso);

		}

		Path arquivo = Paths.get("/home/jferraz/eclipse-workspace/ArquivosCursoLP/arquivoExec24.txt");

		Files.write(arquivo, tarefas);

		digite.close();
		System.out.println("Programa Finalizado");

	}

}
