package app;

import java.util.Scanner;
import entities.NegativeNumbers;

public class Ex01 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numéros deseja: ");
        int n = input.nextInt();
        NegativeNumbers[] vect = new NegativeNumbers[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Digite o %dº número: ", i);
            int number = input.nextInt();
            vect[i] = new NegativeNumbers(number);
        }

        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getNumber() < 0) {
                System.out.println(vect[i].getNumber());
            }
        }

        input.close();
    }
}
