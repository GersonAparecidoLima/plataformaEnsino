package plataformaEnsino;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Lesson> lessons = new ArrayList<>();

        // Pergunta quantas aulas tem o curso
        System.out.print("Quantas aulas tem o curso? ");
        int numberOfLessons = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        // Loop para coletar os dados das aulas
        for (int i = 1; i <= numberOfLessons; i++) {
            System.out.println("Dados da " + i + "a aula:");
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char contentType = scanner.nextLine().charAt(0);

            // Se for vídeo
            if (contentType == 'c') {
                System.out.print("Título: ");
                String title = scanner.nextLine();
                System.out.print("URL do vídeo: ");
                String url = scanner.nextLine();
                System.out.print("Duração em segundos: ");
                int duration = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha

                // Adiciona a aula de vídeo na lista
                lessons.add(new Video(title, url, duration));

            } else if (contentType == 't') { // Se for tarefa
                System.out.print("Título: ");
                String title = scanner.nextLine();
                System.out.print("Descrição: ");
                String description = scanner.nextLine();
                System.out.print("Quantidade de questões: ");
                int questionCount = scanner.nextInt();
                scanner.nextLine(); // Consumir a nova linha

                // Adiciona a tarefa na lista
                lessons.add(new Task(title, description, questionCount));
            } else {
                System.out.println("Opção inválida! Tente novamente.");
                i--; // Para repetir a entrada
            }
        }

        // Calcula a duração total do curso
        int totalDuration = 0;
        for (Lesson lesson : lessons) {
            totalDuration += lesson.duration();
        }

        System.out.println("DURAÇÃO TOTAL DO CURSO = " + totalDuration + " segundos");
        scanner.close();
    }
}