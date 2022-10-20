package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Approved;

public class Ex10 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos alunos serao digitados: ");
        int n = input.nextInt();

        Approved[] vect = new Approved[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.printf("Nome do aluno %dº: ", i + 1);
            input.nextLine();
            String name = input.nextLine();

            System.out.print("1º Nota: ");
            double nota1 = input.nextDouble();

            System.out.print("2º Nota: ");
            double nota2 = input.nextDouble();

            vect[i] = new Approved(name, nota1, nota2);
        }
        System.out.println("ALUNOS APROVADO: ");
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getMedia() >= 6.0) {
                System.out.println(vect[i].getName());
            }
        }

        input.close();
    }
}
