package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import app.Shape;
import entities.enums.Circle;
import entities.enums.Color;
import entities.enums.Retangule;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de formas: ");
        int x = input.nextInt();

        List<Shape> list = new ArrayList<>();

        for (int i = 1; i <= x; i++) {
            System.out.printf("Dados da #%d forma: %n", i);
            System.out.print("Retangulo ou Circulo (r/c): ");
            char res = input.next().charAt(0);
            System.out.print("COR (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(input.next());

            if (res == 'r' || res == 'R') {
                System.out.print("Largura: ");
                double width = input.nextDouble();
                System.out.print("Altura: ");
                double height = input.nextDouble();
                list.add(new Retangule(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = input.nextDouble();
                list.add(new Circle(color, radius));
            }
        }

        System.out.println("\nAREAS: ");
        for (Shape item : list) {
            System.out.println(String.format("%.2f", item.area()));
        }

        input.close(); 
    }
}
