package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Ex02 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.Name = input.nextLine();

        System.out.print("Gross salary: ");
        employee.GrossSalary = input.nextDouble();

        System.out.print("Tax: ");
        employee.Tax = input.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n", employee.Name, employee.NetSalary());

        System.out.printf("Which percentage to increase salary: ");
        double percentage = input.nextDouble();
        System.out.printf("Update data: %s, $ %.2f%n", employee.Name, employee.IncreaseSalary(percentage));

        input.close();

    }
}
