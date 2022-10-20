package app;

import java.util.Scanner;

import entities.Older;

public class Ex09 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar: ");
        int n = input.nextInt();

        Older[] vectName = new Older[n];
        Older[] vectAge = new Older[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nome: ");
            String name = input.next();

            System.out.print("Idade: ");
            int age = input.nextInt();

            vectName[i] = new Older(name);
            vectAge[i] = new Older(age);
        }

        String peopleOldName = vectName[0].getName();
        int peopleOldAge = vectAge[0].getAge();

        for (int i = 0; i < n; i++) {
            if (vectAge[i].getAge() > peopleOldAge) {
                peopleOldName = vectName[i].getName();
                peopleOldAge = vectAge[i].getAge();
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s com %s anos.%n", peopleOldName, peopleOldAge);
        input.close();
    }
}
