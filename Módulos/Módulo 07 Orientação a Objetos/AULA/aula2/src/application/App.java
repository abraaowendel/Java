package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Product product = new Product();
        System.out.println("------------------------");
        System.out.println("Enter Product data: ");
        System.out.println("-----------------------");

        System.out.print("Name: ");
        product.name = input.nextLine();

        System.out.print("Price: ");
        product.price = input.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = input.nextInt();

        System.out.println();
        System.out.print(product);
        System.out.println();

        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = input.nextInt();
        product.addProducts(quantity);

        System.out.print("Update data: ");
        System.out.print(product);
        System.out.println();

        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = input.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.print("Update data: ");
        System.out.print(product);
        System.out.println();

        input.close();

    }
}
