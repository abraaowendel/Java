package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();
        System.out.println("-----------------------");

        System.out.print("[X] A: ");
        x.a = input.nextDouble();

        System.out.print("[X] B: ");
        x.b = input.nextDouble();

        System.out.print("[X] C: ");
        x.c = input.nextDouble();

        System.out.println("-----------------------");

        System.out.print("[Y] A: ");
        y.a = input.nextDouble();

        System.out.print("[Y] B: ");
        y.b = input.nextDouble();

        System.out.print("[Y] C: ");
        y.c = input.nextDouble();

        System.out.println("-----------------------");

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area X: %.2f%n", areaX);
        System.out.printf("Area Y: %.2f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Area X é maior.");
        } else {
            System.out.println("Area Y é maior.");
        }

        input.close();
    }

}
