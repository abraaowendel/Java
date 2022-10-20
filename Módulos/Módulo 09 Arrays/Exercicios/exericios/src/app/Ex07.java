package app;

import java.util.Locale;
import java.util.Scanner;

import entities.BelowAverage;

public class Ex07 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = input.nextInt();

        BelowAverage[] vect = new BelowAverage[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            double number = input.nextDouble();
            vect[i] = new BelowAverage(number);
        }

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getNumber();
        }

        double media = sum / vect.length;
        System.out.printf("MÉDIA DO VETOR: %.2f%n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA: \n");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumber() < media) {
                System.out.println(vect[i].getNumber());
            }
        }

        input.close();
    }
}
