package app;

import java.io.File;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\text.txt");
        Scanner input = null;

        try {
            input = new Scanner(file);
            while (input.hasNextLine()) {
                System.out.println(input.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }finally{
            if(input != null){
                input.close();
            }
        }
    }
}
