package app;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Individual;
import entities.TaxPayers;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de contribuintes: ");
        int n = input.nextInt();

        List<TaxPayers> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.printf("Dados do #%d Contribuinte%n", i);
            System.out.print("Pessoa fisica ou Pessoa juridica (F/J): ");
            char ch = input.next().charAt(0);
            System.out.print("Nome: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Rendimento anual: ");
            Double annualIncome = input.nextDouble();

            if (ch == 'F' || ch == 'f') {
                System.out.print("Gastos com saude: ");
                Double health = input.nextDouble();
                list.add(new Individual(name, annualIncome, health));
            } else {
                System.out.print("Número de funcionários: ");
                int numberEmployees = input.nextInt();
                list.add(new Company(name, annualIncome, numberEmployees));
            }
        }

        System.out.println("\nIMPOSTOS PAGOS: ");
        
        double sum = 0.0;

        for (TaxPayers taxPayers : list) {
            sum += taxPayers.total();
            System.out.printf("%s: R$%.2f%n", taxPayers.getName(), taxPayers.total());
        }

        System.out.printf("\nTOTAL DE IMPOSTOS: $%.2f%n", sum);

      
        input.close();
    }
}
