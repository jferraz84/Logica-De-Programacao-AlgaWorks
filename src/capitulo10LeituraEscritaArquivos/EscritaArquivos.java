package capitulo10LeituraEscritaArquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		ArrayList<String> linhas = new ArrayList<String>();
		System.out.println("Lista de quem vai para o jogo: ");
		linhas.add("Jogadores do próximo Jogo: ");

		for (int i = 0; i < 5; i++) {
			System.out.print("Jogador " + (i + 1) + " : ");
			String nome = scan.nextLine();
			linhas.add(nome);

		}

		Path arquivo = Paths.get("/home/jferraz/eclipse-workspace/ArquivosCursoLP/arquivoAula1.txt");

		Files.write(arquivo, linhas);

		scan.close();
		System.out.println("Arquivo salvo");

	}

}
