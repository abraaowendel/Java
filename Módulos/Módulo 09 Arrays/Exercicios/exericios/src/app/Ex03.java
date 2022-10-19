package app;

import java.util.Locale;
import java.util.Scanner;

import entities.AverageHeight;

public class Ex03 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner input = new Scanner(System.in);
        System.out.print("Quantas pessoas? ");
        int n = input.nextInt();

        AverageHeight[] vect = new AverageHeight[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Dados da %dª pessoa: ", i + 1);
            System.out.print("\nNome: ");
            String name = input.next();
            System.out.print("Idade: ");
            int age = input.nextInt();
            System.out.print("Altura: ");
            double height = input.nextDouble();
            vect[i] = new AverageHeight(name, height, age);
        }

        double sum = 0.0;
        double quant = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getHeight();
            if (vect[i].getAge() < 16) {
                quant++;
            }
        }

        System.out.printf("Altura média: %.2f%n", sum / vect.length);
        System.out.println("Pessoas com menos de 16 anos: " + quant * 100 / vect.length + "%\n");

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
            }
        }

        input.close();
    }
}
