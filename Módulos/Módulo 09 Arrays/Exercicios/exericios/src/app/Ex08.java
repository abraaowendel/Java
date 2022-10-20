package app;

import java.util.Scanner;

import entities.AverageEvenNumbers;

import java.util.Locale;

public class Ex08 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = input.nextInt();

        AverageEvenNumbers[] vect = new AverageEvenNumbers[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            int number = input.nextInt();
            vect[i] = new AverageEvenNumbers(number);
        }

        int sum = 0;
        int quant = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumber() % 2 == 0) {
                sum += vect[i].getNumber();
                quant++;
            }
        }

        if (quant > 0) {
            double media = sum / quant;
            System.out.printf("MÉDIA DOS PARES: %.2f%n", media);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }

        input.close();
    }
}
