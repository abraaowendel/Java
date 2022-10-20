package app;

import java.util.Locale;
import java.util.Scanner;

import entities.SumOfVectors;

public class Ex06 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = input.nextInt();

        SumOfVectors[] vectA = new SumOfVectors[n];
        SumOfVectors[] vectB = new SumOfVectors[n];
        SumOfVectors[] vectC = new SumOfVectors[n];

        System.out.println("DIGITE OS VALORES DO VETOR A: \n");
        for (int i = 0; i < vectA.length; i++) {
            System.out.print("Digite um número: ");
            double number = input.nextDouble();
            vectA[i] = new SumOfVectors(number);
        }

        System.out.println("\nDIGITE OS VALORES DO VETOR B: \n");
        for (int i = 0; i < vectB.length; i++) {
            System.out.print("Digite um número: ");
            double number = input.nextDouble();
            vectB[i] = new SumOfVectors(number);
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < vectC.length; i++) {
            vectC[i] = new SumOfVectors(vectA[i].getNumber() + vectB[i].getNumber());
            System.out.println(vectA[i].getNumber() + vectB[i].getNumber());
        }

        input.close();
    }
}
