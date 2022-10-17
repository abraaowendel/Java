package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangule;

public class Ex01 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Retangule retagule = new Retangule();

        System.out.print("Height: ");
        retagule.height = input.nextDouble();

        System.out.print("Width: ");
        retagule.width = input.nextDouble();

        System.out.printf("AREA: %.2f%n", retagule.Area());

        System.out.printf("PERIMETER: %.2f%n", retagule.Perimeter());

        System.out.printf("DIAGONAL: %.2f%n", retagule.Diagonal());

        input.close();

    }
}
