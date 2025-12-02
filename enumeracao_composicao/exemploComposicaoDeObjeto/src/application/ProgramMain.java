package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramMain {
    public static void main(String[] args) throws ParseException {

        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        List<Post> objetos = new ArrayList<>(); //Armazenará os objetos criados

        int count = 0;
        while (count < 2) {
            System.out.println("Informe o Título:");
            String title = scan.nextLine();
            System.out.println("Informe a quantidade de Likes:");
            Integer likes = scan.nextInt();
            System.out.println("Insira o Conteúdo da Mensagem:");
            scan.nextLine();
            String content = scan.nextLine();
            System.out.println("\nData já inserida manualmente !\n");

            System.out.println("Insira o 1º Comentário:");
            String text = scan.nextLine();
            Comment comment01 = new Comment(text);

            System.out.println("Insira o 2º Comentário:");
            text = scan.nextLine();
            Comment comment02 = new Comment(text);

            Post post = new Post(title, likes, content, sdf.parse("21/06/2018 13:05:44"));
            post.addComment(comment01);
            post.addComment(comment02);

            objetos.add(post);
            count++;
        }
        scan.close();

        for (Post o : objetos) {
            System.out.println(o);
        }
    // Ps: Caso os dados for inseridos direto no código, criar os objetos 'postN°' e 'commentN°' manualmente, sem loop.

    }
}