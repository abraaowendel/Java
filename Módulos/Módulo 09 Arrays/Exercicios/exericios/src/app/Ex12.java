package app;

import java.util.Scanner;
import entities.Rooms;

public class Ex12 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Quantas quartos serão alugados? ");
        int rooms = input.nextInt();
        
        Rooms vectStudents[] = new Rooms[10];
        
        for (int i = 0; i < rooms; i++) {
            System.out.printf("%nAluguel #%d%n", i + 1);

            System.out.print("Nome: ");

            input.nextLine();
            String name = input.nextLine();

            System.out.print("Email: ");
            String email = input.next();

            System.out.print("Quarto: ");
            int nQuarto = input.nextInt();

            vectStudents[nQuarto] = new Rooms(name, email);
        }

        System.out.println("\nQuartos alugados: ");

        for (int i = 0; i < 10; i++) {
            if(vectStudents[i] != null){
                System.out.printf("%d: %s%n", i, vectStudents[i]);
            }
        }

        input.close();
    }
}
