package app;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("Digite dados do Cliente: ");

        System.out.print("Nome: ");
        String name = input.nextLine();

        System.out.print("E-mail: ");
        String email = input.next();

        System.out.print("Data de nascimento (DD/MM/YYYY): ");

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Client client = new Client(name, email, LocalDate.parse(input.next(), formatter1));

        System.out.println("\nInserir dados do pedido: ");
        System.out.print("Status: ");

        OrderStatus status = OrderStatus.valueOf(input.next());

        System.out.print("Quantos itens para este pedido: ");
        int quantityItems = input.nextInt();

        Order order = new Order(LocalDateTime.now(), status, client);

        for (int i = 1; i <= quantityItems; i++) {

            System.out.printf("\nDigite os dados do #%d produto:%n", i);
            System.out.print("Nome do produto: ");
            input.nextLine();
            String productName = input.nextLine();

            System.out.print("Preço do produto: ");
            Double productPrice = input.nextDouble();

            System.out.print("Quantidade: ");
            Integer quantity = input.nextInt();

            OrderItem ordemItem = new OrderItem(quantity, productPrice, new Product(productName, productPrice));
            order.addItem(ordemItem);
        }

        System.out.println("-------------------------------");
        System.out.println("\nRESUMO DO PEDIDO: \n");
        System.out.println(order);
        System.out.println("-------------------------------");

        input.close();

    }
}
