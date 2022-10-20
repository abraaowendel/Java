package app;

import java.util.Locale;
import java.util.Scanner;

import entities.HigherNumber;

public class Ex05 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = input.nextInt();

        HigherNumber[] vect = new HigherNumber[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            double number = input.nextDouble();
            vect[i] = new HigherNumber(number);
        }

        double higher = vect[0].getNumber();
        int pos = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumber() > higher) {
                higher = vect[i].getNumber();
                pos = i;
            }
        }

        System.out.printf("MAIOR VALOR: %.2f%n", higher);
        System.out.printf("POSIÇÃO DO MAIOR VALOR: %d%n", pos);

        input.close();
    }
}
