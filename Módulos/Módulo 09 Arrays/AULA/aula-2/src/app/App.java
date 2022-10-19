package app;

import java.util.Scanner;

import entities.Products;

public class App {
    public static void main(String[] args) throws Exception {

        Products[] vect = new Products[3];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Nome do Produto: ");
            String name = input.next();
            System.out.print("Preço do Produto: ");
            double price = input.nextDouble();
            vect[i] = new Products(name, price);
        }

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i].getPrice();
        }

        System.out.printf("Média de preços: R$%.2f", sum / vect.length);
        input.close();

    }
}
