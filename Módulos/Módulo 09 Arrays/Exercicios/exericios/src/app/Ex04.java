package app;

import java.util.Scanner;

import entities.EvenNumbers;

import java.util.Locale;

public class Ex04 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int n = input.nextInt();

        EvenNumbers[] vect = new EvenNumbers[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            int number = input.nextInt();
            vect[i] = new EvenNumbers(number);
        }

        System.out.println("NUMEROS PARES: ");

        int quant = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumber() % 2 == 0) {
                System.out.print(vect[i].getNumber() + "  ");
                quant++;
            }
        }

        System.out.printf("%nQUANTIDADE DE PARES = %d%n", quant);

        input.close();
    }
}
