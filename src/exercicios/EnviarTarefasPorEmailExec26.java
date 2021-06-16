package exercicios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.commons.mail.EmailException;

import capitulo11bibliotecas.CarteiroEmail;

public class EnviarTarefasPorEmailExec26 {

	public static void main(String[] args) throws IOException, EmailException {

		Scanner digite = new Scanner(System.in);

		ArrayList<String> tarefa = new ArrayList<String>();
		System.out.println("Tarefas da Semana: ");
		String[] diaSemana = new String[] { "Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado" };

		tarefa.add("Esse E-mail é pra validar meu programa com uso de Array na criação de uma lista de tarefas, junto com minha classe de enviar email, Abraços!");
		tarefa.add("Cursos da semana de Seg á Sab: ");

		for (int i = 0; i < diaSemana.length; i++) {
			System.out.print("Curso de " + diaSemana[i] + ": ");
			String curso = digite.nextLine();
			tarefa.add(curso);

		}
		
		String tarefas = "";
		
		for (int i = 0; i < tarefa.size(); i++) {
			tarefas += tarefa.get(i) + "\n";
			
		}
	
		System.out.print("Digite o e-mail para enviar a lista: ");
		String para = digite.next();
		
		CarteiroEmail.enviar("Minha lista de tarefas", tarefas, para);

		System.out.println("Fim ...!");


		digite.close();
		System.out.println("Programa Finalizado");

	}

}
