package app;

import java.util.Locale;
import java.util.Scanner;

import entities.AverageSumList;

public class Ex02 {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos números você deseja: ");
        int n = input.nextInt();

        AverageSumList[] vect = new AverageSumList[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%dº número: ", i + 1);
            double number = input.nextDouble();
            vect[i] = new AverageSumList(number);
        }

        double sum = 0.0;
        System.out.print("VALORES = ");

        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i].getNumber() + "  ");
            sum += vect[i].getNumber();
        }

        System.out.printf("%nSOMA = %.2f%n", sum);
        System.out.printf("MÉDIA = %.2f%n", sum / vect.length);

        input.close();
    }
}
