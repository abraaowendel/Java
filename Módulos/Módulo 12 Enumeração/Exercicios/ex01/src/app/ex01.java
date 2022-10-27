package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkLevel;

public class ex01 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Digite o nome do seu departamento: ");
        String departmentName = input.nextLine();

        System.out.println("\nDigite dados sobre seu trabalho: \n");

        System.out.print("Nome: ");
        String workName = input.nextLine();
        System.out.print("Nivel: ");
        String workLevel = input.nextLine();
        System.out.print("Salário base: ");
        Double workBaseSalary = input.nextDouble();

        Worker worker = new Worker(workName, WorkLevel.valueOf(workLevel), workBaseSalary,
                new Department(departmentName));

        System.out.print("Quantidade de contratos: ");
        int contracts = input.nextInt();

        for (int i = 1; i <= contracts; i++) {
            System.out.printf("Insira os dados do #%d contrato: %n", i);
            System.out.print("Data (DD/MM/YYYY): ");

            LocalDate contractDate = LocalDate.parse(input.next(), formatter);

            System.out.print("Valor por hora: R$ ");
            Double valuePerHour = input.nextDouble();

            System.out.print("Duração (horas): ");
            Integer duration = input.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, duration);
            worker.addContract(contract);
        }
        System.out.print("\n Insira o mês e o ano para calcular a renda (MM/yyyy): ");
        String monthAndYear = input.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 3));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.printf("Nome: %s%n", worker.getName());
        System.out.printf("Departamento: %s%n", worker.getDepartment().getName());
        System.out.printf("Renda de %d/%d: %.2f", month, year, worker.income(year, month));
        input.close();
    }
}
