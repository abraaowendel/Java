package app;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Product> list = new ArrayList<>();

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Digite a quantidade produtos: ");
        int quantProducts = input.nextInt();

        for (int i = 1; i <= quantProducts; i++) {
            System.out.printf("\nDados do produto #%d%n", i);
            System.out.print("Nome do produto: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Preço do produto: ");
            Double price = input.nextDouble();
            System.out.print("Comum, Usado ou Importado? (C|U|I): ");
            char res = input.next().charAt(0);

            if (res == 'i' || res == 'I') {
                System.out.print("Taxa da Receita Federal:  ");
                double cf = input.nextDouble();
                list.add(new ImportedProduct(name, price, cf));
            } else if (res == 'u' || res == 'U') {
                System.out.print("Recondicionado em (DD/MM/YYYY): ");
                String date = input.next();
                list.add(new UsedProduct(name, price, formatter.parse(date)));
            } else {
                list.add(new Product(name, price));
            }
        }

        System.out.println("\nEtiquetas de Preços: \n");

        for (Product product : list) {
            System.out.println(product.priceTag());
        }

        input.close();

    }
}
