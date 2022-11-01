package app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entitites.Comment;
import entitites.Post;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that's");

        Post p1 = new Post(LocalDateTime.now(), "Traveling to New Zealand",
                "I'm going to visit this wonderful country!", 12);
        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        Post p2 = new Post(LocalDateTime.now(), "Good night guys",
                "See you tomorrow", 5);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println("\n\n" + p2);
        input.close();

    }
}
