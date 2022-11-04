package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.print("Quantos funcionários? ");

        int n = input.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.printf("%nDados do Funcionário #%d:%n", i);
            System.out.print("Terceirizado (Y/N): ");
            char outsourced = input.next().charAt(0);

            System.out.print("Nome: ");
            input.nextLine();
            String nome = input.nextLine();
            System.out.print("Horas trabalhadas: ");
            int horas = input.nextInt();
            System.out.print("Valor por hora: ");
            Double valorPorHora = input.nextDouble();

            if(outsourced == 'y' || outsourced == 'Y'){
                System.out.print("Cobrança adicional: ");
                double additionalCharge = input.nextDouble();
                list.add(new OutsourceEmployee(nome, horas, valorPorHora, additionalCharge));
            }
            else{
                list.add(new Employee(nome, horas, valorPorHora));
            }


        }

        System.out.println("PAGAMENTOS: ");
        for (Employee employee : list) {
            System.out.printf("%s - R$ %.2f%n", employee.getName(), employee.payment());
        }


        input.close();
    }

}
